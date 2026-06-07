package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.PullMode;
import org.apache.syncope.common.lib.types.ResourceOperation;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.pushpull.IgnoreProvisionException;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMToT1Test {

    @Spy
    @InjectMocks
    private DefaultRealmPullResultHandler handler;

    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profile;

    @Mock
    private PullTask pullTask;

    @Mock
    private ExternalResource resource;

    @Mock
    private OrgUnit orgUnit;

    @Mock
    private SyncDelta delta;

    @Mock
    private ConnectorObject connectorObject;

    private List<ProvisioningReport> resultsList;

    @Before
    public void setUp() {
        // Setup di base necessario per tutti i test per superare i controlli iniziali
        handler.profile = profile; // Inject field manuale essendo ereditato da AbstractRealmResultHandler

        when(profile.getTask()).thenReturn(pullTask);
        when(pullTask.getResource()).thenReturn(resource);

        when(delta.getObject()).thenReturn(connectorObject);
        when(connectorObject.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);

        resultsList = new ArrayList<>();
        when(profile.getResults()).thenReturn(resultsList);
    }

    // ==========================================
    // STEP II: CASO DI TEST BASE (Alice)
    // ==========================================

    @Test
    public void testHandle_Success() throws Exception {
        // Arrange
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        // Mock parziale di doHandle essendo un metodo protected chiamato internamente
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).doHandle(delta, orgUnit);

        // Act
        boolean result = handler.handle(delta);

        // Assert
        assertTrue("Con un'elaborazione senza errori e PullMode.INCREMENTAL, deve ritornare true", result);
    }

    // ==========================================
    // STEP IV: EDGE CASES & ECCEZIONI (Charlie & Alice)
    // ==========================================

    @Test
    public void testHandle_NoOrgUnit_ThrowsJobExecutionException_Caught() {
        // Arrange (Charlie)
        // Simuliamo l'assenza dell'OrgUnit (ritorna null)
        when(resource.getOrgUnit()).thenReturn(null);
        // Non occorre mockare getPullMode o doHandle perché fallirà prima

        // Act
        boolean result = handler.handle(delta);

        // Assert
        assertFalse("Se l'OrgUnit manca, cattura la JobExecutionException e ritorna false", result);
    }

    @Test
    public void testHandle_IgnoreProvisionException() throws Exception {
        // Arrange (Charlie)
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        Name mockName = mock(Name.class);
        when(mockName.getNameValue()).thenReturn("TestRealm");
        when(connectorObject.getName()).thenReturn(mockName);

        // Forziamo il lancio dell'eccezione da parte di doHandle
        IgnoreProvisionException exception = new IgnoreProvisionException("Test Ignore");
        doThrow(exception).when(handler).doHandle(delta, orgUnit);

        // Act
        boolean result = handler.handle(delta);

        // Assert
        assertTrue("Se viene lanciata una IgnoreProvisionException, deve ritornare true (ignora e continua)", result);
        assertEquals("Deve essere stato aggiunto esattamente un report", 1, resultsList.size());

        ProvisioningReport report = resultsList.get(0);
        assertEquals("Lo stato del report deve essere IGNORE", ProvisioningReport.Status.IGNORE, report.getStatus());
        assertEquals("L'operazione deve essere NONE", ResourceOperation.NONE, report.getOperation());
        assertEquals("L'AnyType deve essere quello per i REALM", SyncopeConstants.REALM_ANYTYPE, report.getAnyType());
        assertEquals("Il nome nel report deve coincidere col delta", "TestRealm", report.getName());
    }

    @Test
    public void testHandle_StopRequested() throws Exception {
        // Arrange (Alice)
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).doHandle(delta, orgUnit);

        // Simuliamo l'interruzione impostando il flag ereditato
        handler.stopRequested = true;

        // Act
        boolean result = handler.handle(delta);

        // Assert
        assertFalse("Se stopRequested è true, deve interrompersi e ritornare false", result);
    }

    @Test
    public void testHandle_NotIncrementalMode() throws Exception {
        // Arrange (Alice)
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        // doHandle fallisce, che normalmente porterebbe a un return false in modalità incrementale
        doReturn(OpEvent.Outcome.FAILURE).when(handler).doHandle(delta, orgUnit);

        // Impostiamo un PullMode diverso da INCREMENTAL
        when(pullTask.getPullMode()).thenReturn(PullMode.FULL_RECONCILIATION);

        // Act
        boolean result = handler.handle(delta);

        // Assert
        assertTrue("Se PullMode non è INCREMENTAL, deve ritornare true nonostante il fallimento interno", result);
    }
}
