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

    @Mock private RealmDAO realmDAO;
    @Mock private RealmDataBinder binder;
    @Mock private ConnObjectUtils connObjectUtils;
    @Mock private InboundMatcher inboundMatcher;

    @Mock private ProvisioningProfile<PullTask, InboundActions> profile;
    @Mock private PullTask pullTask;
    @Mock private ExternalResource mockResource;
    @Mock private OrgUnit mockOrgUnit;
    @Mock private Realm destinationRealm;
    @Mock private NotificationManager notificationManager;
    @Mock private AuditManager auditManager;
    @Mock private Realm mockRealm;

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
        lenient().when(destinationRealm.getKey()).thenReturn("finto-key-dest");
        lenient().when(destinationRealm.getResources()).thenReturn(new ArrayList<>());

        lenient().doReturn(Optional.of(destinationRealm)).when(realmDAO).findById(anyString());

        lenient().when(binder.create(any(), any())).thenReturn(mockRealm);
        lenient().when(mockRealm.getKey()).thenReturn("finto-key-mock");
        lenient().when(mockRealm.getResources()).thenReturn(new ArrayList<>());

        lenient().when(pullTask.getResource()).thenReturn(mockResource);
        lenient().when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);

        lenient().when(mockOrgUnit.getObjectClass()).thenReturn("__REALM__");
    }

    private SyncDelta createMockDeltaWithPayload(SyncDeltaType type) {
        SyncDelta delta = mock(SyncDelta.class);
        lenient().when(delta.getDeltaType()).thenReturn(type);
        lenient().when(delta.getUid()).thenReturn(new Uid("ext-id-123"));

        ConnectorObject obj = mock(ConnectorObject.class);
        lenient().when(obj.getUid()).thenReturn(new Uid("ext-id-123"));
        lenient().when(obj.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);

        lenient().when(obj.getName()).thenReturn(new Name("finto-nome-realm"));

        lenient().when(delta.getObject()).thenReturn(obj);
        return delta;
    }

    // handle

    @Test
    public void handle_TC05() {
        /*
        TC05 - Gestione OrgUnit mancante

        Category Partition:
         - SyncDelta: valido
         - OrgUnit: null

        Oracolo: JobExecutionException.
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(mockResource.getOrgUnit()).thenReturn(null);

        boolean result = handler.handle(delta);
        assertFalse("Il metodo deve restituire false quando viene catturata la JobExecutionException", result);
    }

    @Test
    public void handle_TC06() throws Exception {
        /*
        TC06 - Richiesta di interruzione

        Category Partition:
         - SyncDelta: valido
         - flag stopRequested = true

        Oracolo: Il metodo verifica lo stato di stopRequested e deve terminare immediatamente l'esecuzione restituendo false.
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        FieldUtils.writeField(handler, "stopRequested", true, true);

        boolean result = handler.handle(delta);
        assertFalse("Il metodo deve interrompersi e restituire false se è stato richiesto lo stop", result);
    }

    @Test
    public void handle_TC07() throws Exception {
        /*
        TC07 - Elaborazione INCREMENTAL avvenuta con successo

        Category Partition:
         - SyncDelta: valido
         - PullMode = INCREMENTAL

        Oracolo: Superati i check iniziali, il metodo deve tornare true poiché l'esito di doHandle è SUCCESS.
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        RealmTO mockRealmTO = mock(RealmTO.class);
        lenient().when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);

        boolean result = handler.handle(delta);
        assertTrue("Essendo in modalità INCREMENTAL e senza errori, il metodo deve restituire true", result);
    }

    @Test
    public void handle_TC08() {
        /*
        TC08 - Eccezione di business gestita

        Category Partition:
         - SyncDelta: valido
         - UnmatchingRule = IGNORE

        Oracolo: La delega a doHandle solleva una IgnoreProvisionException. Il blocco catch dedicato la intercetta, crea un report di tipo IGNORE e ritorna true.
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        lenient().when(pullTask.getUnmatchingRule()).thenReturn(UnmatchingRule.IGNORE);

        boolean result = handler.handle(delta);
        assertTrue("Il catch della IgnoreProvisionException deve restituire true", result);
    }


    // provision

    @Test
    public void provision_TC05() throws JobExecutionException {
        /*
        TC05 - Provisioning disabilitato

        Category Partition:
         - SyncDelta: valido
         - isPerformCreate = false

        Oracolo: Il metodo deve eseguire il return con successo.
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(pullTask.isPerformCreate()).thenReturn(false);

        OpEvent.Outcome result = handler.provision(delta, mockOrgUnit);
        assertEquals("Il metodo deve restituire SUCCESS", OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void provision_TC06() throws JobExecutionException {
        /*
        TC06 - Calcolo ricorsivo del path

        Category Partition:
         - RealmTO con fullPath e parent null

        Oracolo: L'handler deve calcolare il path partendo dal parent della destinationRealm e settare il fullPath correttamente.
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

        handler.provision(delta, mockOrgUnit);

        verify(mockRealmTO).setParent("/root");
    }

    @Test
    public void provision_TC07() throws JobExecutionException {
        /*
        TC07 - Dry Run

        Category Partition:
         - SyncDelta: valido
         - isDryRun = true

        Oracolo: Il metodo esegue la validazione ma non scrive, ritornando SUCCESS senza persistenza.
         */

        SyncDelta delta = createMockDeltaWithPayload(SyncDeltaType.CREATE);

        when(pullTask.isPerformCreate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true);

        RealmTO mockRealmTO = mock(RealmTO.class);
        when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);

        OpEvent.Outcome result = handler.provision(delta, mockOrgUnit);
        assertEquals("In modalità DryRun deve restituire SUCCESS", OpEvent.Outcome.SUCCESS, result);
    }


}