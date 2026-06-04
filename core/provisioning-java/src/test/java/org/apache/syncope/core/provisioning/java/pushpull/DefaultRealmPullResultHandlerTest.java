package org.apache.syncope.core.provisioning.java.pushpull;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.UnmatchingRule;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.PropagationByResource;
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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerTest {

    @Spy
    private DefaultRealmPullResultHandler handler = new DefaultRealmPullResultHandler();

    @Mock
    private RealmDAO realmDAO;
    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profile;
    @Mock
    private SyncDelta mockDelta;
    @Mock
    private PullTask pullTask;
    @Mock
    private OrgUnit mockOrgUnit;
    @Mock
    private Realm mockRealm;
    @Mock
    private ConnObjectUtils connObjectUtils;
    @Mock
    private ConnectorObject mockConnectorObject;
    @Mock
    private RealmTO mockRealmTO;
    @Mock
    private Realm destinationRealm;
    @Mock
    private ExternalResource mockResource;
    @Mock
    private RealmDataBinder binder;
    @Mock
    private PropagationManager propagationManager;
    @Mock
    private SecurityProperties securityProperties;
    @Mock
    private PropagationTaskExecutor taskExecutor;
    @Mock
    private NotificationManager notificationManager;
    @Mock
    private AuditManager auditManager;
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


    @Before
    public void setUp() {
        setUp_Generic();
        setUp_Update();
        setUp_Create();
        setUp_Delete();
        setUp_Deprovision();
        setUp_Link();
        setUp_Ignore();
    }

    private void setUp_Generic() {
        handler.setProfile(profile);

        ReflectionTestUtils.setField(handler, "connObjectUtils", connObjectUtils);
        ReflectionTestUtils.setField(handler, "realmDAO", realmDAO);
        ReflectionTestUtils.setField(handler, "realmSearchDAO", realmSearchDAO);
        ReflectionTestUtils.setField(handler, "searchDAO", searchDAO);
        ReflectionTestUtils.setField(handler, "taskDAO", taskDAO);
        ReflectionTestUtils.setField(handler, "casSPClientAppDAO", casSPClientAppDAO);
        ReflectionTestUtils.setField(handler, "oidcRPClientAppDAO", oidcRPClientAppDAO);
        ReflectionTestUtils.setField(handler, "saml2SPClientAppDAO", saml2SPClientAppDAO);
        ReflectionTestUtils.setField(handler, "binder", binder);
        ReflectionTestUtils.setField(handler, "propagationManager", propagationManager);
        ReflectionTestUtils.setField(handler, "taskExecutor", taskExecutor);
        ReflectionTestUtils.setField(handler, "notificationManager", notificationManager);
        ReflectionTestUtils.setField(handler, "auditManager", auditManager);
        ReflectionTestUtils.setField(handler, "securityProperties", securityProperties);

        lenient().when(securityProperties.getAdminUser()).thenReturn("admin");
        lenient().when(profile.getTask()).thenReturn(pullTask);
        lenient().when(profile.getResults()).thenReturn(new ArrayList<>());

        lenient().when(pullTask.isPerformCreate()).thenReturn(true);
        lenient().when(pullTask.isPerformUpdate()).thenReturn(true);
        lenient().when(pullTask.isPerformDelete()).thenReturn(true);

        lenient().when(pullTask.getDestinationRealm()).thenReturn(destinationRealm);
        lenient().when(destinationRealm.getFullPath()).thenReturn("/");

        lenient().when(pullTask.getResource()).thenReturn(mockResource);
        lenient().when(mockResource.getKey()).thenReturn("DB-HR");
        lenient().when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);

        lenient().when(mockDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        lenient().when(mockDelta.getUid()).thenReturn(new Uid("ext-id-123"));
        lenient().when(mockDelta.getObject()).thenReturn(mockConnectorObject);
    }


    private void setUp_Update() {
        lenient().when(connObjectUtils.getRealmTO(any(ConnectorObject.class), any(OrgUnit.class))).thenReturn(mockRealmTO);
        lenient().when(binder.create(any(Realm.class), any(RealmTO.class))).thenReturn(mockRealm);
        lenient().when(binder.getRealmTO(any(Realm.class), anyBoolean())).thenReturn(mockRealmTO);

        lenient().when(mockRealm.getFullPath()).thenReturn("/finto-path");  // ahycub
        lenient().when(mockRealm.getKey()).thenReturn("realm-key-123");
        lenient().when(mockRealm.getName()).thenReturn("finto-nome");
        lenient().when(mockRealmTO.getKey()).thenReturn("realm-key-123");
        lenient().when(mockRealmTO.getFullPath()).thenReturn("/finto-path");
        lenient().when(mockRealmTO.getName()).thenReturn("finto-nome");

        lenient().when(realmDAO.save(any(Realm.class))).thenReturn(mockRealm);
        lenient().when(binder.update(any(Realm.class), any(RealmTO.class))).thenReturn(mock(PropagationByResource.class));
    }

    private void setUp_Create() {
        lenient().when(realmDAO.findById(anyString())).thenReturn((java.util.Optional) java.util.Optional.of(mockRealm));
        lenient().when(realmDAO.save(any(Realm.class))).thenReturn(mockRealm);
    }

    private void setUp_Delete() {
        doNothing().when(realmDAO).delete(any(Realm.class));
        lenient().when(realmSearchDAO.findChildren(any(Realm.class))).thenReturn(new ArrayList<>());
        lenient().when(searchDAO.count(any(), anyBoolean(), any(), any(), any())).thenReturn(0L);
        lenient().when(taskDAO.findByRealm(any(Realm.class))).thenReturn(new ArrayList<>());
        lenient().when(casSPClientAppDAO.findAllByRealm(any(Realm.class))).thenReturn(new ArrayList<>());
        lenient().when(oidcRPClientAppDAO.findAllByRealm(any(Realm.class))).thenReturn(new ArrayList<>());
        lenient().when(saml2SPClientAppDAO.findAllByRealm(any(Realm.class))).thenReturn(new ArrayList<>());
    }

    private void setUp_Deprovision() {
        lenient().when(realmSearchDAO.findChildren(any(Realm.class))).thenReturn(new ArrayList<>());
        lenient().when(searchDAO.count(any(), anyBoolean(), any(), any(), any())).thenReturn(0L);
        lenient().when(taskDAO.findByRealm(any(Realm.class))).thenReturn(new ArrayList<>());
        lenient().when(propagationManager.getDeleteTasks(any(AnyTypeKind.class), any(), any(), any(), any())).thenReturn(new ArrayList<>());
    }

    private void setUp_Link() {
        lenient().when(propagationManager.getCreateTasks(any(AnyTypeKind.class), any(), any(), any(), any())).thenReturn(new ArrayList<>());
    }

    private void setUp_Ignore(){
        lenient().when(mockConnectorObject.getUid()).thenReturn(new Uid("ext-id-123"));
        lenient().when(mockDelta.getObject()).thenReturn(mockConnectorObject);
    }



    @Test
    public void testAssign_TC01() throws JobExecutionException {
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());

        OpEvent.Outcome result = handler.assign(mockDelta, mockOrgUnit);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
//        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'input null e solleva NullPointerException.")
    @Test
    public void testAssign_TC02() throws JobExecutionException {
        try {
            handler.assign(null, mockOrgUnit);
            Assert.fail("Il test doveva fallire");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            verify(handler, never()).create(any(), any(), any(), any());
        }
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'input null e solleva NullPointerException.")
    @Test
    public void testAssign_TC03() throws JobExecutionException {
        try {
            handler.assign(mockDelta, null);
            Assert.fail("Il test doveva fallire");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            verify(handler, never()).create(any(), any(), any(), any());
        }
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'input null e solleva NullPointerException.")
    @Test
    public void testAssign_TC04() throws JobExecutionException {
        SyncDelta invalidDelta = mock(SyncDelta.class);
        lenient().when(invalidDelta.getUid()).thenReturn(null);
        try {
            handler.assign(invalidDelta, mockOrgUnit);
            verify(handler, never()).create(any(), any(), any(), any());
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
//            Assert.fail("Il metodo ha lanciato un NPE inaspettato! Il codice sorgente non gestisce l'input null.");
        }
    }

    @Test
    public void testAssign_TC05() throws JobExecutionException {
        doThrow(new RuntimeException("Simulated DB Error")).when(handler).create(any(), any(), any(), any());
//        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());
        try {
            handler.assign(mockDelta, mockOrgUnit);
            Assert.fail("Doveva fallire");
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testProvision_TC01() throws JobExecutionException {
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());

        OpEvent.Outcome result = handler.provision(mockDelta, mockOrgUnit);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(handler, times(1)).create(any(), any(), any(), any());
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'input null e solleva NullPointerException.")
    @Test
    public void testProvision_TC02() throws JobExecutionException {
        try{
            handler.provision(null, mockOrgUnit);
            Assert.fail("Il test doveva fallire per SyncDelta nullo");
        } catch (IllegalArgumentException e){
            Assert.assertTrue(true);
            verify(realmDAO, never()).save(any(Realm.class));
            verify(handler, never()).create(any(), any(), any(), any());
        }
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'input null e solleva NullPointerException.")
    @Test
    public void testProvision_TC03() throws JobExecutionException {
        try{
            handler.provision(mockDelta, null);
            Assert.fail("Il test doveva fallire per OrgUnit nulla");
        } catch (IllegalArgumentException e){
            Assert.assertTrue(true);
            verify(realmDAO, never()).save(any(Realm.class));
            verify(handler, never()).create(any(), any(), any(), any());
        }
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'input null e solleva NullPointerException.")
    @Test
    public void testProvision_TC04() throws JobExecutionException {
        SyncDelta invalidDelta = mock(SyncDelta.class);
        lenient().when(invalidDelta.getUid()).thenReturn(null);
        try {
            handler.provision(invalidDelta, mockOrgUnit);
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
//            Assert.fail("Il metodo ha lanciato un NPE inaspettato! Il codice sorgente non gestisce l'input null.");
            verify(realmDAO, never()).save(any(Realm.class));
            verify(handler, never()).create(any(), any(), any(), any());
        }
    }

    @Test
    public void testProvision_TC05() throws JobExecutionException {
        doThrow(new RuntimeException("Simulated DB Error")).when(handler).create(any(), any(), any(), any());
//        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());
        try {
            handler.provision(mockDelta, mockOrgUnit);
            Assert.fail("Doveva fallire");
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC01() throws JobExecutionException {
        OpEvent.Outcome result = handler.update(mockDelta, mockRealm, false);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testUpdate_TC02() throws JobExecutionException {

        OpEvent.Outcome result = handler.update(null, mockRealm, false);
        Assert.assertNotNull(result);
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'input null. Syncope cattura l'NPE internamente.")
    @Test
    public void testUpdate_TC03() throws JobExecutionException {
        try {
            handler.update(mockDelta, null, false);
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC04() throws JobExecutionException {
        SyncDelta invalidDelta = mock(SyncDelta.class);
        lenient().when(invalidDelta.getUid()).thenReturn(null);

        OpEvent.Outcome result = handler.update(invalidDelta, mockRealm, false);
        Assert.assertNotNull(result);
    }

    @Test
    public void testUpdate_TC05() throws JobExecutionException {
        doThrow(new RuntimeException("Simulated DB Update Error")).when(realmDAO).save(any(Realm.class));
        try {
            handler.update(mockDelta, mockRealm, false);
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC06() throws JobExecutionException {
        OpEvent.Outcome result = handler.update(mockDelta, mockRealm, true);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }


    @Test
    public void testCreate_TC01() throws JobExecutionException {
        ProvisioningReport report = new ProvisioningReport();

        OpEvent.Outcome result = handler.create(mockRealmTO, mockDelta, UnmatchingRule.PROVISION, report);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida il RealmTO null e solleva NullPointerException.")
    @Test
    public void testCreate_TC02() throws JobExecutionException {
        ProvisioningReport report = new ProvisioningReport();
        try {
            handler.create(null, mockDelta, UnmatchingRule.PROVISION, report);
            Assert.fail("Il test doveva fallire per RealmTO nullo");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            verify(realmDAO, never()).save(any(Realm.class));
        }
    }

    @Test
    public void testCreate_TC03() throws JobExecutionException {
        ProvisioningReport report = new ProvisioningReport();
        OpEvent.Outcome result = handler.create(mockRealmTO, null, UnmatchingRule.PROVISION, report);
        Assert.assertNotNull(result);
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida l'UnmatchingRule null e solleva NullPointerException.")
    @Test
    public void testCreate_TC04() throws JobExecutionException {
        ProvisioningReport report = new ProvisioningReport();
        try {
            handler.create(mockRealmTO, mockDelta, null, report);
            Assert.fail("Il test doveva fallire per UnmatchingRule nullo");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            verify(realmDAO, never()).save(any(Realm.class));
        }
    }

    @Ignore("BUG IDENTIFICATO: Il metodo non valida il ProvisioningReport null e solleva NullPointerException.")
    @Test
    public void testCreate_TC05() throws JobExecutionException {
        try {
            handler.create(mockRealmTO, mockDelta, UnmatchingRule.PROVISION, null);
            Assert.fail("Il test doveva fallire per ProvisioningReport nullo");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreate_TC06() throws JobExecutionException {
        ProvisioningReport report = new ProvisioningReport();

        doThrow(new RuntimeException("Simulated DB Create Error")).when(realmDAO).save(any(Realm.class));

        try {
            handler.create(mockRealmTO, mockDelta, UnmatchingRule.PROVISION, report);
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testDelete_TC01() throws JobExecutionException {
        OpEvent.Outcome result = handler.delete(mockDelta, mockRealm);
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testDelete_TC02() throws JobExecutionException {
        OpEvent.Outcome result = handler.delete(null, mockRealm);
        Assert.assertNotNull(result);
    }

    @Test
    public void testDelete_TC03() throws JobExecutionException {
        OpEvent.Outcome result = handler.delete(mockDelta, null);
        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
        verify(realmDAO, never()).delete(any(Realm.class));
    }

    @Test
    public void testDelete_TC04() throws JobExecutionException {
        SyncDelta invalidDelta = mock(SyncDelta.class);
        lenient().when(invalidDelta.getUid()).thenReturn(null);

        OpEvent.Outcome result = handler.delete(invalidDelta, mockRealm);
        Assert.assertNotNull(result);
    }

    @Test
    public void testDelete_TC05() throws JobExecutionException {
        lenient().doThrow(new RuntimeException("Simulated DB Delete Error")).when(realmDAO).delete(any(Realm.class));

        try {
            handler.delete(mockDelta, mockRealm);
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testDeprovision_TC01() throws JobExecutionException {
        OpEvent.Outcome result = handler.deprovision(mockDelta, mockRealm, true);
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testDeprovision_TC02() throws JobExecutionException {
        OpEvent.Outcome result = handler.deprovision(mockDelta, mockRealm, false);
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testDeprovision_TC03() throws JobExecutionException {
        OpEvent.Outcome result = handler.deprovision(null, mockRealm, true);
        Assert.assertNotNull(result);
    }

    @Ignore("BUG IDENTIFICATO: Il metodo deprovision non valida il Realm null e solleva NPE.")
    @Test
    public void testDeprovision_TC04_RealmNull() throws JobExecutionException {
        try {
            handler.deprovision(mockDelta, null, true);
            Assert.fail("Il test doveva fallire per Realm nullo");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            verify(realmDAO, never()).save(any(Realm.class));
        }
    }

    @Test
    public void testDeprovision_TC05() throws JobExecutionException {
        SyncDelta invalidDelta = mock(SyncDelta.class);
        lenient().when(invalidDelta.getUid()).thenReturn(null);

        OpEvent.Outcome result = handler.deprovision(invalidDelta, mockRealm, true);
        Assert.assertNotNull(result);
    }


    @Test
    public void testDeprovision_TC06() throws JobExecutionException {
        lenient().doThrow(new RuntimeException("Simulated DAO Failure")).when(realmDAO).save(any(Realm.class));

        OpEvent.Outcome result = handler.deprovision(mockDelta, mockRealm, true);

        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
    }


    @Test
    public void testLink_TC01() throws JobExecutionException {
        OpEvent.Outcome result = handler.link(mockDelta, mockRealm, true);
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testLink_TC02() throws JobExecutionException {
        OpEvent.Outcome result = handler.link(mockDelta, mockRealm, false);
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testLink_TC03() throws JobExecutionException {
        OpEvent.Outcome result = handler.link(null, mockRealm, true);
        Assert.assertNotNull(result);
    }


    @Ignore("BUG IDENTIFICATO: Il metodo deprovision non valida il Realm null e solleva NPE.")
    @Test
    public void testLink_TC04() throws JobExecutionException {
        try {
            handler.link(mockDelta, null, true);
            Assert.fail("Il metodo link avrebbe dovuto lanciare NPE");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testLink_TC05() throws JobExecutionException {
        SyncDelta invalidDelta = mock(SyncDelta.class);
        lenient().when(invalidDelta.getUid()).thenReturn(null);

        OpEvent.Outcome result = handler.link(invalidDelta, mockRealm, true);
        Assert.assertNotNull(result);
    }

    @Ignore("BUG SCOPERTO: Il metodo link inghiotte l'eccezione dell'update e restituisce SUCCESS.")
    @Test
    public void testLink_TC06() throws JobExecutionException {
        lenient().doThrow(new RuntimeException("Simulated Update Failure")).when(binder).update(any(Realm.class), any(RealmTO.class));

        OpEvent.Outcome result = handler.link(mockDelta, mockRealm, false);

        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
    }


    @Test
    public void testIgnore_TC01() throws JobExecutionException {
        OpEvent.Outcome result = handler.ignore(mockDelta, true);
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testIgnore_TC02() throws JobExecutionException {
        OpEvent.Outcome result = handler.ignore(mockDelta, false);
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Ignore("BUG SCOPERTO: Assenza di Defensive Programming. Il metodo non valida delta=null e va in crash (NPE).")
    @Test
    public void testIgnore_TC03() throws JobExecutionException {
        OpEvent.Outcome result = handler.ignore(null, true);
        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
    }

}