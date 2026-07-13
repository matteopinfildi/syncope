package org.apache.syncope.core.provisioning.java.pushpull;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.PullMode;
import org.apache.syncope.common.lib.types.UnmatchingRule;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.data.RealmDataBinder;
import org.apache.syncope.core.provisioning.api.job.JobExecutionException;
import org.apache.syncope.core.provisioning.api.notification.NotificationManager;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.identityconnectors.framework.common.objects.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.Optional;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerCFTest {

    @Mock
    private RealmDAO realmDAO;
    @Mock
    private RealmDataBinder binder;
    @Mock
    private ConnObjectUtils connObjectUtils;
    @Mock
    private InboundMatcher inboundMatcher;
    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profile;
    @Mock
    private PullTask pullTask;
    @Mock
    private ExternalResource mockResource;
    @Mock
    private OrgUnit mockOrgUnit;
    @Mock
    private Realm destinationRealm;
    @Mock
    private NotificationManager notificationManager;
    @Mock
    private AuditManager auditManager;
    @Mock
    private Realm mockRealm;

    @InjectMocks
    private DefaultRealmPullResultHandler handler;

    @Before
    public void setUp() throws Exception {
        handler.setProfile(profile);

        FieldUtils.writeField(handler, "auditManager", auditManager, true);
        FieldUtils.writeField(handler, "notificationManager", notificationManager, true);

        lenient().when(profile.getTask()).thenReturn(pullTask);
        lenient().when(profile.getResults()).thenReturn(new ArrayList<>());
        lenient().when(pullTask.getDestinationRealm()).thenReturn(destinationRealm);

        lenient().when(destinationRealm.getFullPath()).thenReturn("/");
        lenient().when(destinationRealm.getKey()).thenReturn("key-dest");
        lenient().when(destinationRealm.getResources()).thenReturn(new ArrayList<>());

        lenient().doReturn(Optional.of(destinationRealm)).when(realmDAO).findById(anyString());

        lenient().when(binder.create(any(), any())).thenReturn(mockRealm);
        lenient().when(mockRealm.getKey()).thenReturn("key-Realm");
        lenient().when(mockRealm.getResources()).thenReturn(new ArrayList<>());

        lenient().when(pullTask.getResource()).thenReturn(mockResource);
        lenient().when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);

        lenient().when(mockOrgUnit.getObjectClass()).thenReturn("REALM");
    }

    private SyncDelta createMockDeltaWithPayload(SyncDeltaType type) {
        SyncDelta delta = mock(SyncDelta.class);
        lenient().when(delta.getDeltaType()).thenReturn(type);
        lenient().when(delta.getUid()).thenReturn(new Uid("id-123"));

        ConnectorObject obj = mock(ConnectorObject.class);
        lenient().when(obj.getUid()).thenReturn(new Uid("id-123"));
        lenient().when(obj.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);

        lenient().when(obj.getName()).thenReturn(new Name("nome-realm"));

        lenient().when(delta.getObject()).thenReturn(obj);
        return delta;
    }

    // handle

    @Test
    public void testHandle_TC05() {
        /*
        Oracolo: impostando l'OrgUnit nullo, il metodo deve terminare l'esecuzione restituendo false
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(mockResource.getOrgUnit()).thenReturn(null);

        boolean result = handler.handle(delta);
        assertFalse(result);
    }

    @Test
    public void testHandle_TC06() throws Exception {
        /*
        Oracolo: il flag stopRequested è impostato a true, il metodo deve terminare l'esecuzione restituendo false
        */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        FieldUtils.writeField(handler, "stopRequested", true, true);

        boolean result = handler.handle(delta);
        assertFalse(result);
    }

    @Test
    public void testHandle_TC07() {
        /*
        Oracolo: in modalità di pull INCREMENTAL, il metodo deve completare l'elaborazione con successo ritornando true
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        RealmTO mockRealmTO = mock(RealmTO.class);
        lenient().when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);

        boolean result = handler.handle(delta);
        assertTrue(result);
    }

    @Test
    public void testHandle_TC08() {
        /*
       Oracolo: con UnmatchingRule.IGNORE, il metodo deve ritornare true
       */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        lenient().when(pullTask.getUnmatchingRule()).thenReturn(UnmatchingRule.IGNORE);

        boolean result = handler.handle(delta);
        assertTrue(result);
    }


    // provision

    @Test
    public void testProvision_TC05() throws JobExecutionException {
        /*
        Oracolo: con isPerformCreate impostato a false, il metodo deve ritronare SUCCESS senza eseguire alcuna operazione
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(pullTask.isPerformCreate()).thenReturn(false);

        OpEvent.Outcome result = handler.provision(delta, mockOrgUnit);
        assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testProvision_TC06() throws JobExecutionException {
        /*
        Oracolo: con fullPath e parent del RealmTO null,
        l'handler deve calcolare il path basandosi sul parent del destinationRealm e aggiornare il RealmTO
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);
        RealmTO mockRealmTO = mock(RealmTO.class);

        when(pullTask.isPerformCreate()).thenReturn(true);
        when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);

        when(mockRealmTO.getFullPath()).thenReturn(null);
        when(mockRealmTO.getParent()).thenReturn(null);

        when(pullTask.getDestinationRealm()).thenReturn(destinationRealm);
        when(destinationRealm.getFullPath()).thenReturn("/root");

        when(profile.isDryRun()).thenReturn(true);

        OpEvent.Outcome result = handler.provision(delta, mockOrgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(mockRealmTO).setParent("/root");
    }

    @Test
    public void testProvision_TC07() throws JobExecutionException {
        /*
       Oracolo: in modalità Dry Run, il metodo deve ritornare SUCCESS
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(pullTask.isPerformCreate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true);

        RealmTO mockRealmTO = mock(RealmTO.class);
        when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);

        OpEvent.Outcome result = handler.provision(delta, mockOrgUnit);
        assertEquals(OpEvent.Outcome.SUCCESS, result);
    }
}