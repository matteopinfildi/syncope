package org.apache.syncope.core.provisioning.java.pushpull;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.PullMode;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

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
        Obiettivo: Uccidere il mutante alla Riga 110

        Oracolo: con esito di doHandle = FAILURE, il metodo deve ritornare false
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

        assertFalse(result);
    }



    @Test
    public void testProvision_TC08() throws Exception {
        /*
        Obiettivo: Uccidere il mutante alla Riga 197

        Oracolo: con isPerformCreate = false, il metodo deve ritornare SUCCESS e INVOCARE CORRETTAMENTE IL METODO END
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
    public void testProvision_TC09() throws Exception {
        /*
        Obiettivo: Uccidere il mutante alla Riga 212

        Oracolo: il RealmTO deve ricostruire correttamente il fullPath concatenando "Padre/Figlio"
         */

        SyncDelta mockSyncDelta = mock(SyncDelta.class);
        OrgUnit mockOrgUnit = mock(OrgUnit.class);

        doReturn(pullTask).when(profile).getTask();
        when(pullTask.isPerformCreate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true);

        RealmTO realmTO = new RealmTO();
        realmTO.setParent("Padre");
        realmTO.setName("Figlio");

        when(connObjectUtils.getRealmTO(any(), eq(mockOrgUnit))).thenReturn(realmTO);

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        handler.provision(mockSyncDelta, mockOrgUnit);

        assertEquals("Padre/Figlio", realmTO.getFullPath());
    }
}