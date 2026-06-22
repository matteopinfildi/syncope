package org.apache.syncope.core.provisioning.java.pushpull;

import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.PullMode;
import org.apache.syncope.common.lib.types.ResourceOperation;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.Uid;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerPITTest {

    @Mock
    private ProvisioningProfile<?, ?> profile;
    @Mock
    private InboundActions actionMock;
    @Mock
    private PullTask pullTask;
    @Mock
    private ConnObjectUtils connObjectUtils;

    @Spy
    @InjectMocks
    private DefaultRealmPullResultHandler handler;


    @Test
    public void testHandle_TC09() throws Exception {
        /*
        TC09 - Gestione esito fallimentare

        Obiettivo: Uccidere il mutante alla Riga 110 (Replaced boolean return with true)

        Category Partition:
        - SyncDelta: valido
        - doHandle: ritorna FAILURE

        Oracolo: Il metodo deve ritornare false se l'esito di doHandle non è SUCCESS.
         */

        SyncDelta mockSyncDelta = mock(SyncDelta.class);
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        ExternalResource mockResource = mock(ExternalResource.class);

        doReturn(pullTask).when(profile).getTask();
        when(pullTask.getResource()).thenReturn(mockResource);
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);

        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);
        doReturn(OpEvent.Outcome.FAILURE).when(handler).doHandle(any(), any());

        boolean result = handler.handle(mockSyncDelta);

        assertFalse("Il metodo deve ritornare false se l'outcome di doHandle non è SUCCESS", result);
    }



    @Test
    public void testProvision_TC09() throws Exception {
        /*
        TC09 - Provisioning disabilitato

        Obiettivo: Uccidere il mutante alla Riga 197 (Rimossa chiamata a end)

        Category Partition:
         - SyncDelta: valido
         - isPerformCreate: false

        Oracolo: Il metodo deve ritornare SUCCESS e deve aver chiamato end.
         */

        SyncDelta mockSyncDelta = mock(SyncDelta.class);
        OrgUnit mockOrgUnit = mock(OrgUnit.class);

        doReturn(pullTask).when(profile).getTask();
        when(pullTask.isPerformCreate()).thenReturn(false);

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome outcome = handler.provision(mockSyncDelta, mockOrgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(handler).end(any(), any(), any(), any(), any(), any());
    }


    @Test
    public void testProvision_TC10() throws Exception {
        /*
        TC10 - Costruzione ricorsiva path

        Obiettivo: Uccidere i mutanti alle Righe 212 (setFullPath) e 216-219.

        Category Partition:
         - RealmTO: fullPath nullo, parent presente
         - isDryRun: false

        Oracolo: Il fullPath deve essere ricostruito come "/padre/figlio" e il ProvisioningReport deve contenere lo stato SUCCESS e il nuovo path.
         */

        SyncDelta mockSyncDelta = mock(SyncDelta.class);
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        ConnectorObject mockConnObj = mock(ConnectorObject.class);

        doReturn(pullTask).when(profile).getTask();
        when(pullTask.isPerformCreate()).thenReturn(true);
        when(mockSyncDelta.getObject()).thenReturn(mockConnObj);

        RealmTO dummyRealm = new RealmTO();
        dummyRealm.setFullPath(null);
        dummyRealm.setParent("/padre");
        dummyRealm.setName("figlio");

        when(connObjectUtils.getRealmTO(mockConnObj, mockOrgUnit)).thenReturn(dummyRealm);
        when(profile.isDryRun()).thenReturn(false);
        doReturn(Collections.singletonList(actionMock)).when(profile).getActions();

        List<ProvisioningReport> results = new ArrayList<>();
        when(profile.getResults()).thenReturn(results);

        Uid mockUid = Mockito.mock(Uid.class);
        lenient().when(mockUid.getUidValue()).thenReturn("dummy-uid");
        lenient().when(mockSyncDelta.getUid()).thenReturn(mockUid);
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());

        handler.provision(mockSyncDelta, mockOrgUnit);

        assertEquals("/padre/figlio", dummyRealm.getFullPath());
        assertEquals(1, results.size());
        ProvisioningReport report = results.get(0);
        assertEquals(ResourceOperation.CREATE, report.getOperation());
        assertEquals(SyncopeConstants.REALM_ANYTYPE, report.getAnyType());
        assertEquals(ProvisioningReport.Status.SUCCESS, report.getStatus());
        assertEquals("/padre/figlio", report.getName());
    }


    @Test
    public void testProvision_TC11() throws Exception {
        /*
        TC11 - Verifica ciclo InboundActions

        Obiettivo: Uccidere il mutante alla Riga 233 (Removed call to beforeProvision)

        Category Partition:
         - SyncDelta: valido
         - InboundActions: configurate nel profilo

        Oracolo: L'azione mockata deve ricevere la chiamata beforeProvision con il RealmTO corretto.
         */

        SyncDelta mockSyncDelta = mock(SyncDelta.class);
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        ConnectorObject mockConnObj = mock(ConnectorObject.class);

        doReturn(pullTask).when(profile).getTask();
        when(pullTask.isPerformCreate()).thenReturn(true);

        when(mockSyncDelta.getObject()).thenReturn(mockConnObj);

        RealmTO dummyRealm = new RealmTO();
        dummyRealm.setParent("/parent");
        dummyRealm.setName("child");
        dummyRealm.setFullPath("/parent/child");

        Uid mockUid = Mockito.mock(Uid.class);
        lenient().when(mockUid.getUidValue()).thenReturn("dummy-uid");
        lenient().when(mockSyncDelta.getUid()).thenReturn(mockUid);

        when(connObjectUtils.getRealmTO(mockConnObj, mockOrgUnit)).thenReturn(dummyRealm);

        when(profile.isDryRun()).thenReturn(false);

        doReturn(Collections.singletonList(actionMock)).when(profile).getActions();
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());

        handler.provision(mockSyncDelta, mockOrgUnit);

        verify(actionMock).beforeProvision(any(), any(), any(RealmTO.class));
    }
}