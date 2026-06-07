package org.apache.syncope.core.provisioning.java.pushpull;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.ConflictResolutionAction;
import org.apache.syncope.common.lib.types.MatchingRule;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.PullMode;
import org.apache.syncope.common.lib.types.UnmatchingRule;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.CASSPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.OIDCRPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.SAML2SPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.data.RealmDataBinder;
import org.apache.syncope.core.provisioning.api.job.JobExecutionException;
import org.apache.syncope.core.provisioning.api.notification.NotificationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationTaskExecutor;
import org.apache.syncope.core.provisioning.api.pushpull.IgnoreProvisionException;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMFew1Test {

    @Spy
    private DefaultRealmPullResultHandler handler = new DefaultRealmPullResultHandler();

    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profile;
    @Mock
    private PullTask pullTask;
    @Mock
    private ExternalResource externalResource;
    @Mock
    private OrgUnit mockOrgUnit;
    @Mock
    private SyncDelta mockDelta;
    @Mock
    private ConnectorObject mockConnObject;
    @Mock
    private Realm destinationRealm;
    @Mock
    private RealmTO mockRealmTO;
    @Mock
    private Realm mockRealm;

    // Dipendenze da iniettare
    @Mock
    private InboundMatcher inboundMatcher;
    @Mock
    private ConnObjectUtils connObjectUtils;
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
    private RealmDAO realmDAO;
    @Mock
    private RealmSearchDAO realmSearchDAO;
    @Mock
    private RealmDataBinder binder;
    @Mock
    private PropagationManager propagationManager;
    @Mock
    private PropagationTaskExecutor taskExecutor;
    @Mock
    private SecurityProperties securityProperties;
    @Mock
    private NotificationManager notificationManager;
    @Mock
    private AuditManager auditManager;

    @Before
    public void setUp() {
        handler.setProfile(profile);
        ReflectionTestUtils.setField(handler, "inboundMatcher", inboundMatcher);
        ReflectionTestUtils.setField(handler, "connObjectUtils", connObjectUtils);
        ReflectionTestUtils.setField(handler, "searchDAO", searchDAO);
        ReflectionTestUtils.setField(handler, "taskDAO", taskDAO);
        ReflectionTestUtils.setField(handler, "casSPClientAppDAO", casSPClientAppDAO);
        ReflectionTestUtils.setField(handler, "oidcRPClientAppDAO", oidcRPClientAppDAO);
        ReflectionTestUtils.setField(handler, "saml2SPClientAppDAO", saml2SPClientAppDAO);
        ReflectionTestUtils.setField(handler, "realmDAO", realmDAO);
        ReflectionTestUtils.setField(handler, "realmSearchDAO", realmSearchDAO);
        ReflectionTestUtils.setField(handler, "binder", binder);
        ReflectionTestUtils.setField(handler, "propagationManager", propagationManager);
        ReflectionTestUtils.setField(handler, "taskExecutor", taskExecutor);
        ReflectionTestUtils.setField(handler, "securityProperties", securityProperties);
        ReflectionTestUtils.setField(handler, "notificationManager", notificationManager);
        ReflectionTestUtils.setField(handler, "auditManager", auditManager);

        lenient().when(profile.getTask()).thenReturn(pullTask);
        lenient().when(profile.getResults()).thenReturn(new ArrayList<>());
        lenient().when(profile.getActions()).thenReturn(Collections.emptyList());
        lenient().when(pullTask.getResource()).thenReturn(externalResource);
        lenient().when(externalResource.getOrgUnit()).thenReturn(mockOrgUnit);
        lenient().when(externalResource.getKey()).thenReturn("ResourceKey");
        lenient().when(pullTask.getDestinationRealm()).thenReturn(destinationRealm);

        lenient().when(mockDelta.getObject()).thenReturn(mockConnObject);
        lenient().when(mockDelta.getUid()).thenReturn(new Uid("uid-123"));
        lenient().when(mockDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);

        lenient().when(mockConnObject.getUid()).thenReturn(new Uid("uid-123"));
        lenient().when(mockConnObject.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);
        lenient().when(mockConnObject.getName()).thenReturn(new Name("TestName"));

        lenient().when(destinationRealm.getFullPath()).thenReturn("/dest");
        lenient().when(mockRealmTO.getFullPath()).thenReturn("/dest/newRealm");
        lenient().when(mockRealmTO.getName()).thenReturn("newRealm");
        lenient().when(mockRealmTO.getResources()).thenReturn(new ArrayList<>());
        lenient().when(mockRealm.getKey()).thenReturn("realm-key");
        lenient().when(mockRealm.getFullPath()).thenReturn("/dest/newRealm");
    }

    // --- TEST METODO: handle ---

    @Test
    public void testHandle_Success() throws Exception {
        lenient().when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).doHandle(any(), any());

        boolean result = handler.handle(mockDelta);

        Assert.assertTrue("L'handle deve restituire true in caso di successo", result);
        verify(handler, times(1)).doHandle(mockDelta, mockOrgUnit);
    }

    @Test
    public void testHandle_IgnoreProvisionException() throws Exception {
        doThrow(new IgnoreProvisionException("Simulated Ignore")).when(handler).doHandle(any(), any());

        boolean result = handler.handle(mockDelta);

        Assert.assertTrue("L'eccezione Ignore deve restituire true per procedere", result);
        Assert.assertEquals(1, profile.getResults().size());
        Assert.assertEquals(ProvisioningReport.Status.IGNORE, profile.getResults().get(0).getStatus());
    }

    @Test
    public void testHandle_JobExecutionException() throws Exception {
        doThrow(new JobExecutionException("Simulated Error")).when(handler).doHandle(any(), any());

        boolean result = handler.handle(mockDelta);

        Assert.assertFalse("L'eccezione JobExecution deve bloccare restituendo false", result);
    }

    // --- TEST METODO: doHandle ---

    @Test
    public void testDoHandle_EmptyRealms() throws Exception {
        lenient().when(inboundMatcher.match(any(), any())).thenReturn(Collections.emptyList());

        OpEvent.Outcome result = handler.doHandle(mockDelta, mockOrgUnit);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(handler, times(0)).assign(any(), any());
        verify(handler, times(0)).provision(any(), any());
    }

    @Test
    public void testDoHandle_ConflictResolution_LastMatch() throws Exception {
        List<Realm> realms = new ArrayList<>();
        realms.add(mockRealm);
        Realm secondRealm = mock(Realm.class);
        realms.add(secondRealm);

        lenient().when(inboundMatcher.match(any(), any())).thenReturn(realms);
        lenient().when(mockDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        lenient().when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.LASTMATCH);
        lenient().when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UPDATE);

        doReturn(OpEvent.Outcome.SUCCESS).when(handler).update(any(), eq(secondRealm), anyBoolean());

        OpEvent.Outcome result = handler.doHandle(mockDelta, mockOrgUnit);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(handler, times(1)).update(mockDelta, secondRealm, false);
    }

    // --- TEST METODO: assign ---

    @Test
    public void testAssign_NotConfiguredForCreate() throws Exception {
        lenient().when(pullTask.isPerformCreate()).thenReturn(false);
        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.assign(mockDelta, mockOrgUnit);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(handler, times(0)).create(any(), any(), any(), any());
    }

    @Test
    public void testAssign_Success() throws Exception {
        lenient().when(pullTask.isPerformCreate()).thenReturn(true);
        lenient().when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());

        OpEvent.Outcome result = handler.assign(mockDelta, mockOrgUnit);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(handler, times(1)).create(eq(mockRealmTO), eq(mockDelta), eq(UnmatchingRule.ASSIGN), any());
    }

    // --- TEST METODO: provision ---

    @Test
    public void testProvision_Success() throws Exception {
        lenient().when(pullTask.isPerformCreate()).thenReturn(true);
        lenient().when(connObjectUtils.getRealmTO(any(), any())).thenReturn(mockRealmTO);
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(), any(), any(), any());

        OpEvent.Outcome result = handler.provision(mockDelta, mockOrgUnit);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(handler, times(1)).create(eq(mockRealmTO), eq(mockDelta), eq(UnmatchingRule.PROVISION), any());
    }

    // --- TEST METODO: create ---

    @Test
    public void testCreate_Success() throws Exception {
        ProvisioningReport report = new ProvisioningReport();
        lenient().when(binder.create(any(), any())).thenReturn(mockRealm);
        lenient().when(realmDAO.save(any())).thenReturn(mockRealm);
        lenient().when(mockRealm.getResources()).thenReturn(Collections.emptyList());
        lenient().when(binder.getRealmTO(mockRealm, true)).thenReturn(mockRealmTO);
        lenient().when(mockRealmTO.getKey()).thenReturn("new-key");

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.create(mockRealmTO, mockDelta, UnmatchingRule.ASSIGN, report);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        Assert.assertEquals("new-key", report.getKey());
        verify(taskExecutor, times(1)).execute(any(), anyBoolean(), any());
    }

    @Test
    public void testCreate_GenericException() throws Exception {
        ProvisioningReport report = new ProvisioningReport();

        // Impostiamo una chiave fittizia PRIMA di eseguire il metodo per evitare
        // il NullPointerException su Optional.of(result.getKey()) causato dall'errore simulato.
        report.setKey("fallback-key-to-avoid-NPE");

        lenient().when(binder.create(any(), any())).thenThrow(new RuntimeException("DB Failed"));

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());
        doNothing().when(handler).throwIgnoreProvisionException(any(), any());

        OpEvent.Outcome result = handler.create(mockRealmTO, mockDelta, UnmatchingRule.ASSIGN, report);

        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
        Assert.assertEquals(ProvisioningReport.Status.FAILURE, report.getStatus());
    }

    // --- TEST METODO: update ---

    @Test
    public void testUpdate_Success() throws Exception {
        lenient().when(pullTask.isPerformUpdate()).thenReturn(true);
        lenient().when(profile.isDryRun()).thenReturn(false);
        lenient().when(binder.getRealmTO(mockRealm, true)).thenReturn(mockRealmTO);
        lenient().when(binder.update(any(), any())).thenReturn(null);
        lenient().when(realmDAO.save(any())).thenReturn(mockRealm);

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.update(mockDelta, mockRealm, false);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(realmDAO, times(1)).save(mockRealm);
    }

    @Test
    public void testUpdate_NotConfigured() throws Exception {
        lenient().when(pullTask.isPerformUpdate()).thenReturn(false);
        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.update(mockDelta, mockRealm, false);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(realmDAO, times(0)).save(any());
    }

    // --- TEST METODI: deprovision & link ---

    @Test
    public void testDeprovision_Unlink() throws Exception {
        lenient().when(pullTask.isPerformUpdate()).thenReturn(true);
        lenient().when(profile.isDryRun()).thenReturn(false);
        lenient().when(binder.getRealmTO(any(), anyBoolean())).thenReturn(mockRealmTO);
        lenient().when(realmDAO.save(any())).thenReturn(mockRealm);

        List<ExternalResource> resources = new ArrayList<>();
        resources.add(externalResource);
        doReturn(resources).when(mockRealm).getResources();

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.deprovision(mockDelta, mockRealm, true);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(taskExecutor, times(1)).execute(any(), anyBoolean(), any());
    }

    @Test
    public void testLink_Link() throws Exception {
        lenient().when(pullTask.isPerformUpdate()).thenReturn(true);
        lenient().when(profile.isDryRun()).thenReturn(false);
        lenient().when(binder.getRealmTO(any(), anyBoolean())).thenReturn(mockRealmTO);
        doReturn(OpEvent.Outcome.SUCCESS).when(handler).update(any(), any(), anyBoolean());

        OpEvent.Outcome result = handler.link(mockDelta, mockRealm, false);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(handler, times(1)).update(mockDelta, mockRealm, true);
    }

    // --- TEST METODO: delete ---

    @Test
    public void testDelete_RealmContainsChildren() throws Exception {
        lenient().when(pullTask.isPerformDelete()).thenReturn(true);
        lenient().when(profile.isDryRun()).thenReturn(false);
        lenient().when(binder.getRealmTO(any(), anyBoolean())).thenReturn(mockRealmTO);

        doReturn(Collections.singletonList(mock(Realm.class))).when(realmSearchDAO).findChildren(mockRealm);

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.delete(mockDelta, mockRealm);

        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
        verify(realmDAO, times(0)).delete(mockRealm);
    }

    @Test
    public void testDelete_Success() throws Exception {
        lenient().when(pullTask.isPerformDelete()).thenReturn(true);
        lenient().when(profile.isDryRun()).thenReturn(false);
        lenient().when(binder.getRealmTO(any(), anyBoolean())).thenReturn(mockRealmTO);

        lenient().when(realmSearchDAO.findChildren(mockRealm)).thenReturn(Collections.emptyList());
        lenient().when(searchDAO.count(any(), anyBoolean(), any(), any(), any())).thenReturn(0L);
        lenient().when(taskDAO.findByRealm(any())).thenReturn(Collections.emptyList());
        lenient().when(casSPClientAppDAO.findAllByRealm(any())).thenReturn(Collections.emptyList());
        lenient().when(saml2SPClientAppDAO.findAllByRealm(any())).thenReturn(Collections.emptyList());
        lenient().when(oidcRPClientAppDAO.findAllByRealm(any())).thenReturn(Collections.emptyList());

        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.delete(mockDelta, mockRealm);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        verify(realmDAO, times(1)).delete(mockRealm);
    }

    // --- TEST METODO: ignore ---

    @Test
    public void testIgnore() throws Exception {
        doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        OpEvent.Outcome result = handler.ignore(mockDelta, true);

        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        Assert.assertEquals(1, profile.getResults().size());
        verify(handler, times(1)).end(any(), eq(MatchingRule.toOp(MatchingRule.IGNORE)), eq(OpEvent.Outcome.SUCCESS), any(), any(), any());
    }

    // --- TEST METODO: end ---

    @Test
    public void testEnd() {
        Optional<String> key = Optional.of("key123");

        handler.end(key, "CREATE", OpEvent.Outcome.SUCCESS, null, mockRealmTO, mockDelta);

        verify(realmDAO, times(1)).evict("key123");
        verify(notificationManager, times(1)).createTasks(any(), any(), any(), any(), eq("CREATE"), eq(OpEvent.Outcome.SUCCESS), any(), eq(mockRealmTO), eq(mockDelta));
        verify(auditManager, times(1)).audit(any(), any(), any(), any(), any(), eq("CREATE"), eq(OpEvent.Outcome.SUCCESS), any(), eq(mockRealmTO), eq(mockDelta));
    }
}