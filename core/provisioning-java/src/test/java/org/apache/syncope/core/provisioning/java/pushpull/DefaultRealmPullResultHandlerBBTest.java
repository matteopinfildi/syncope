package org.apache.syncope.core.provisioning.java.pushpull;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.data.RealmDataBinder;
import org.apache.syncope.core.provisioning.api.job.JobExecutionException;
import org.apache.syncope.core.provisioning.api.propagation.PropagationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationTaskExecutor;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.apache.syncope.core.provisioning.api.notification.NotificationManager;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerBBTest {


    @Mock
    private RealmDAO realmDAO;
    @Mock
    private RealmSearchDAO realmSearchDAO;
    @Mock
    private AnySearchDAO searchDAO;
    @Mock
    private TaskDAO taskDAO;
    @Mock
    private CASSPClientAppDAO casSPClientAppDAO;
    @Mock
    private OIDCRPClientAppDAO oidcRPClientAppDAO;
    @Mock
    private SAML2SPClientAppDAO saml2SPClientAppDAO;
    @Mock
    private RealmDataBinder binder;
    @Mock
    private PropagationManager propagationManager;
    @Mock
    private PropagationTaskExecutor taskExecutor;
    @Mock
    private NotificationManager notificationManager;
    @Mock
    private AuditManager auditManager;
    @Mock
    private SecurityProperties securityProperties;
    @Mock
    private InboundMatcher inboundMatcher;
    @Mock
    private ConnObjectUtils connObjectUtils;
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


    @InjectMocks
    private DefaultRealmPullResultHandler handler;

    @Before
    public void setUp() {
        handler.setProfile(profile);

        lenient().when(profile.getTask()).thenReturn(pullTask);
        lenient().when(profile.getResults()).thenReturn(new ArrayList<>());

        lenient().when(pullTask.isPerformCreate()).thenReturn(true);
        lenient().when(pullTask.isPerformUpdate()).thenReturn(true);
        lenient().when(pullTask.isPerformDelete()).thenReturn(true);

        lenient().when(pullTask.getDestinationRealm()).thenReturn(destinationRealm);
        lenient().when(destinationRealm.getFullPath()).thenReturn("/");

        lenient().when(pullTask.getResource()).thenReturn(mockResource);
        lenient().when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);

    }


    // Metodo di supporto per creare un finto syncDelta da passare ai test
    private SyncDelta createMockDelta(SyncDeltaType type, boolean withPayload) {
        SyncDelta delta = mock(SyncDelta.class);
        lenient().when(delta.getDeltaType()).thenReturn(type);
        lenient().when(delta.getUid()).thenReturn(new Uid("id-123"));

        if (withPayload) {
            ConnectorObject obj = mock(ConnectorObject.class);
            lenient().when(obj.getUid()).thenReturn(new Uid("id-123"));
            lenient().when(delta.getObject()).thenReturn(obj);
        }
        return delta;
    }

    //  handle(SyncDelta)

    @Test
    public void testHandle_TC01() {
        /*
        TC01 - Processamento evento CREATE

        Category partition:
        A1 = Delta valido
        B1 = operazione CREATE
        C1 = Payload presente

        Oracolo: L'handler deve processare con successo l'evento.
         */

        SyncDelta delta = createMockDelta(SyncDeltaType.CREATE, true);

        boolean result = handler.handle(delta);

        Assert.assertTrue(result);
    }

    @Test
    public void testHandle_TC02() {
        /*
        TC02 - Processamento evento DELETE

        Category partition:
        A1 = Delta valido
        B2 = operazione DELETE
        C1 = Payload presente

        Oracolo: L'handler deve processare con successo l'evento di cancellazione.
         */

        SyncDelta delta = createMockDelta(SyncDeltaType.DELETE, true);

        Realm mockMatchedRealm = mock(Realm.class);
        lenient().when(inboundMatcher.match(any(), any())).thenReturn(Collections.singletonList(mockMatchedRealm));

        boolean result = handler.handle(delta);

        Assert.assertTrue(result);
    }

    @Test(expected = NullPointerException.class)
    public void testHandle_TC03() {
        /*
        TC03 - Update malformato

        Category partition:
        A1 = Delta valido
        B3 = operazione CREATE
        C2 = Payload null

        Oracolo: NullPointerException
         */

        SyncDelta delta = createMockDelta(SyncDeltaType.UPDATE, false);

        handler.handle(delta);
    }

    @Test(expected = NullPointerException.class)
    public void testHandle_TC04() {
        /*
        TC04 - Input nullo

        Category partition:
        A2 = Delta nullo

        Oracolo: L'handler lancia NullPointerException.
         */

        handler.handle(null);
    }

    // provision(SyncDelta, OrgUnit)

    @Test
    public void testProvision_TC01() throws JobExecutionException {
        /*
        TC01 - Provisioning valido

        Category partition:
        A1 = Delta valido
        B1 = OrgUnit valida
        C1 = Payload presente
        D1 = stato dipendenze SUCCESSO

        Oracolo: Esito non nullo.
         */

        SyncDelta delta = createMockDelta(SyncDeltaType.CREATE, true);

        RealmTO mockRealmTO = mock(RealmTO.class);
        lenient().when(mockRealmTO.getKey()).thenReturn("realmTO-key");
        lenient().when(mockRealmTO.getFullPath()).thenReturn("/path");
        lenient().when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);

        Realm savedRealm = mock(Realm.class);
        lenient().when(binder.create(any(), any())).thenReturn(savedRealm);
        lenient().when(realmDAO.save(any())).thenReturn(savedRealm);
        lenient().when(binder.getRealmTO(any(), anyBoolean())).thenReturn(mockRealmTO);

        OpEvent.Outcome result = handler.provision(delta, mockOrgUnit);
        Assert.assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testProvision_TC02() throws JobExecutionException {
        /*
        TC02 - Delta nullo in provision

        Category partition:
        A2 = Delta nullo
        B1 = OrgUnit valida

        Oracolo: NullPointerException.
         */

        handler.provision(null, mockOrgUnit);
    }

    @Test(expected = NullPointerException.class)
    public void testProvision_TC03() throws JobExecutionException {
        /*
        TC03 - OrgUnit nullo in provision

        Category partition:
        A1 = Delta valido
        B2 = OrgUnit nullo
        C1 = Payload presente
        D1 = stato dipendenze SUCCESSO

        Oracolo: NullPointerException.
         */

        SyncDelta delta = createMockDelta(SyncDeltaType.CREATE, true);
        handler.provision(delta, null);
    }

    @Test(expected = NullPointerException.class)
    public void testProvision_TC04() throws JobExecutionException {
        /*
        TC04 - Delta senza payload in provision

        Category partition:
        A1 = Delta valido
        B1 = OrgUnit valida
        C2 = Payload null
        D1 = stato dipendenze SUCCESSO

        Oracolo: NullPointerException.
         */

        SyncDelta invalidDelta = createMockDelta(SyncDeltaType.CREATE, false);
        handler.provision(invalidDelta, mockOrgUnit);
    }

    @Test(expected = RuntimeException.class)
    public void testProvision_TC05() throws JobExecutionException {
        /*
        TC05 - Errore infrastrutturale

        Category partition:
        A1 = Delta valido
        B1 = OrgUnit valida
        C1 = Payload presente
        D2 = stato dipendenze ECCEZIONE

        Oracolo: RuntimeException lanciata.
         */

        SyncDelta delta = createMockDelta(SyncDeltaType.CREATE, true);
        when(connObjectUtils.getRealmTO(any(), any())).thenThrow(new RuntimeException("DB Error"));

        handler.provision(delta, mockOrgUnit);
    }
}
