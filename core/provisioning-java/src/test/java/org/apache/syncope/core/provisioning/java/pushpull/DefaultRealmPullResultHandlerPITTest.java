package org.apache.syncope.core.provisioning.java.pushpull;

import org.apache.syncope.common.lib.to.OrgUnit;
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
        TC09 - Gestione esito fallimentare

        Obiettivo: Uccidere il mutante alla Riga 110 (Replaced boolean return with true).

        Category Partition:
        A1 = Delta valido
        doHandle: ritorna FAILURE

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

        assertFalse("Il metodo deve ritornare false se l'esito di doHandle non è SUCCESS", result);
    }



    @Test
    public void testProvision_TC08() throws Exception {
        /*
        TC09 - Provisioning disabilitato

        Obiettivo: Uccidere il mutante alla Riga 197 (Rimossa chiamata a end).

        Category Partition:
        A1 = Delta valido
        D3 = isPerformCreate = false

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


}