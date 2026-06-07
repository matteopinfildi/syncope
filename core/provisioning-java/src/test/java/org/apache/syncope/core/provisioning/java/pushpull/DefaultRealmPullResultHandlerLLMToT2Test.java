package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.PullMode;
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
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMToT2Test {

    private DefaultRealmPullResultHandler handlerSpy;

    @Mock
    private PullTask profileTaskMock;

    @Mock
    private ExternalResource externalResourceMock;

    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profileMock;

    @Mock
    private SyncDelta deltaMock;

    @Mock
    private ConnectorObject connectorObjectMock;

    @Mock
    private OrgUnit orgUnitMock;

    @Before
    public void setUp() {
        // Inizializziamo la classe da testare avvolgendola in uno spy
        handlerSpy = spy(new DefaultRealmPullResultHandler());

        // Cablaggio manuale per evitare il ClassCastException dei Deep Stubs sui Generics
        when(profileMock.getTask()).thenReturn(profileTaskMock);
        when(profileTaskMock.getResource()).thenReturn(externalResourceMock);

        // Iniettiamo il profileMock nell'handler
        ReflectionTestUtils.setField(handlerSpy, "profile", profileMock);

        // Cablaggio del Delta e del ConnectorObject
        when(deltaMock.getObject()).thenReturn(connectorObjectMock);
        when(connectorObjectMock.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);
        when(connectorObjectMock.getName()).thenReturn(new Name("TestName"));

        // Reset del flag di stop
        ReflectionTestUtils.setField(handlerSpy, "stopRequested", false);
    }

    @Test
    public void testHandle_OrgUnitMissing_ThrowsExceptionAndReturnsFalse() throws Exception {
        // Setup: L'OrgUnit ritornata dalla risorsa è null
        when(externalResourceMock.getOrgUnit()).thenReturn(null);

        // Action
        boolean result = handlerSpy.handle(deltaMock);

        // Assert: Viene sollevata JobExecutionException e loggata, il metodo deve ritornare false
        assertFalse("L'handler dovrebbe ritornare false se l'OrgUnit e' mancante", result);
    }

    @Test
    public void testHandle_SuccessIncremental_ReturnsTrue() throws Exception {
        // Setup
        when(externalResourceMock.getOrgUnit()).thenReturn(orgUnitMock);
        when(profileTaskMock.getPullMode()).thenReturn(PullMode.INCREMENTAL);
        doReturn(OpEvent.Outcome.SUCCESS).when(handlerSpy).doHandle(any(SyncDelta.class), any(OrgUnit.class));

        // Action
        boolean result = handlerSpy.handle(deltaMock);

        // Assert
        assertTrue("L'handler dovrebbe ritornare true su SUCCESS durante un pull INCREMENTAL", result);
    }

    @Test
    public void testHandle_StopRequested_ReturnsFalse() throws Exception {
        // Setup
        when(externalResourceMock.getOrgUnit()).thenReturn(orgUnitMock);
        doReturn(OpEvent.Outcome.SUCCESS).when(handlerSpy).doHandle(any(SyncDelta.class), any(OrgUnit.class));
        ReflectionTestUtils.setField(handlerSpy, "stopRequested", true);

        // Action
        boolean result = handlerSpy.handle(deltaMock);

        // Assert
        assertFalse("L'handler dovrebbe ritornare false se e' stato richiesto lo stop", result);
    }

    @Test
    public void testHandle_NotIncremental_ReturnsTrueRegardlessOfOutcome() throws Exception {
        // Setup
        when(externalResourceMock.getOrgUnit()).thenReturn(orgUnitMock);
        when(profileTaskMock.getPullMode()).thenReturn(PullMode.FULL_RECONCILIATION);
        doReturn(OpEvent.Outcome.FAILURE).when(handlerSpy).doHandle(any(SyncDelta.class), any(OrgUnit.class));

        // Action
        boolean result = handlerSpy.handle(deltaMock);

        // Assert
        assertTrue("L'handler dovrebbe ritornare true per modalita' non incrementali indipendentemente dal fallimento", result);
    }

    @Test
    public void testHandle_IgnoreProvisionException_ReturnsTrueAndAddsReport() throws Exception {
        // Setup
        when(externalResourceMock.getOrgUnit()).thenReturn(orgUnitMock);
        when(profileMock.getResults()).thenReturn(new ArrayList<>());

        doThrow(new IgnoreProvisionException("Ignorato di proposito per il test"))
                .when(handlerSpy).doHandle(any(SyncDelta.class), any(OrgUnit.class));

        // Action
        boolean result = handlerSpy.handle(deltaMock);

        // Assert
        assertTrue("L'handler dovrebbe ritornare true se doHandle lancia IgnoreProvisionException", result);
        assertFalse("I risultati del profilo dovrebbero contenere il report di errore", profileMock.getResults().isEmpty());

        ProvisioningReport report = profileMock.getResults().get(0);
        assertTrue("Lo status del report dovrebbe essere IGNORE", report.getStatus() == ProvisioningReport.Status.IGNORE);
        assertTrue("Il nome del report dovrebbe combaciare con quello del delta", report.getName().equals("TestName"));
    }
}