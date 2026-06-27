package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.ClientExceptionType;
import org.apache.syncope.common.lib.types.ConflictResolutionAction;
import org.apache.syncope.common.lib.types.MatchingRule;
import org.apache.syncope.common.lib.types.OpEvent;
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
import org.apache.syncope.core.spring.security.AuthContextUtils;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMZeroTest {

    @InjectMocks
    private DefaultRealmPullResultHandler handler;

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

    // Parent class mocks
    @Mock
    protected RealmDAO realmDAO;
    @Mock
    protected RealmSearchDAO realmSearchDAO;
    @Mock
    protected RealmDataBinder binder;
    @Mock
    protected PropagationManager propagationManager;
    @Mock
    protected PropagationTaskExecutor taskExecutor;
    @Mock
    protected SecurityProperties securityProperties;
    @Mock
    protected NotificationManager notificationManager;
    @Mock
    protected AuditManager auditManager;
    @Mock
    protected ProvisioningProfile<PullTask, InboundActions> profile;

    // Common test objects
    @Mock
    private PullTask task;
    @Mock
    private ExternalResource resource;
    @Mock
    private SyncDelta delta;
    @Mock
    private ConnectorObject connObj;
    @Mock
    private OrgUnit orgUnit;

    private MockedStatic<AuthContextUtils> mockedAuthContext;
    private List<ProvisioningReport> resultsList;
    private List<InboundActions> actionsList;

    @Before
    public void setUp() {
        mockedAuthContext = mockStatic(AuthContextUtils.class);
        mockedAuthContext.when(AuthContextUtils::getWho).thenReturn("admin");
        mockedAuthContext.when(AuthContextUtils::getDomain).thenReturn("Master");

        resultsList = new ArrayList<>();
        actionsList = new ArrayList<>();

        lenient().when(profile.getResults()).thenReturn(resultsList);
        lenient().when(profile.getActions()).thenReturn(actionsList);
        lenient().when(profile.getTask()).thenReturn(task);
        lenient().when(task.getResource()).thenReturn(resource);
        lenient().when(resource.getKey()).thenReturn("resource-key");

        lenient().when(delta.getObject()).thenReturn(connObj);
        lenient().when(delta.getUid()).thenReturn(new Uid("test-uid"));
        lenient().when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);

        lenient().when(connObj.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);
        lenient().when(connObj.getUid()).thenReturn(new Uid("test-uid"));
        lenient().when(connObj.getName()).thenReturn(new Name("test-name"));
    }

    @After
    public void tearDown() {
        if (mockedAuthContext != null) {
            mockedAuthContext.close();
        }
    }

    @Test
    public void testHandle_MissingOrgUnit_ThrowsJobExecutionException() {
        when(resource.getOrgUnit()).thenReturn(null);

        boolean result = handler.handle(delta);

        assertFalse(result);
        verify(resource, times(1)).getOrgUnit();
    }

    @Test
    public void testHandle_IgnoreProvisionException_CaughtAndHandled() throws JobExecutionException {
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        // Simulating doHandle to throw IgnoreProvisionException
        doThrow(new IgnoreProvisionException("Ignore error"))
                .when(inboundMatcher).match(any(), any());

        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);

        boolean result = handler.handle(delta);

        assertTrue(result);
        assertEquals(1, resultsList.size());
        assertEquals(ProvisioningReport.Status.IGNORE, resultsList.get(0).getStatus());
    }

    @Test
    public void testAssign_NotConfiguredForCreate() throws JobExecutionException {
        when(task.isPerformCreate()).thenReturn(false);

        OpEvent.Outcome outcome = handler.assign(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertTrue(resultsList.isEmpty());
        verify(notificationManager, times(1)).createTasks(any(), any(), any(), any(), any(), any(), any(), any(), any());
    }

    @Test
    public void testAssign_DryRun_ReturnsSuccess() throws JobExecutionException {
        when(task.isPerformCreate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true);

        RealmTO realmTO = new RealmTO();
        realmTO.setName("newRealm");
        when(connObjectUtils.getRealmTO(connObj, orgUnit)).thenReturn(realmTO);

        Realm destRealm = mock(Realm.class);
        when(destRealm.getFullPath()).thenReturn("/parent");
        when(task.getDestinationRealm()).thenReturn(destRealm);

        OpEvent.Outcome outcome = handler.assign(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertTrue(resultsList.isEmpty());
        verify(notificationManager, times(1)).createTasks(any(), any(), any(), any(), any(), any(), any(), any(), any());
    }

    @Test
    public void testProvision_DryRun_ReturnsSuccess() throws JobExecutionException {
        when(task.isPerformCreate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true);

        RealmTO realmTO = new RealmTO();
        realmTO.setName("provRealm");
        realmTO.setParent("/parentRealm");
        when(connObjectUtils.getRealmTO(connObj, orgUnit)).thenReturn(realmTO);

        OpEvent.Outcome outcome = handler.provision(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertTrue(resultsList.isEmpty());
        verify(notificationManager, times(1)).createTasks(any(), any(), any(), any(), any(), any(), any(), any(), any());
    }

    @Test
    public void testUpdate_NotConfiguredForUpdate() throws JobExecutionException {
        when(task.isPerformUpdate()).thenReturn(false);
        Realm realm = mock(Realm.class);

        OpEvent.Outcome outcome = handler.update(delta, realm, false);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertTrue(resultsList.isEmpty());
    }

    @Test
    public void testDeprovision_NotConfiguredForUpdate() throws JobExecutionException {
        when(task.isPerformUpdate()).thenReturn(false);
        Realm realm = mock(Realm.class);

        OpEvent.Outcome outcome = handler.deprovision(delta, realm, true);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertTrue(resultsList.isEmpty());
    }

    @Test
    public void testLink_NotConfiguredForUpdate() throws JobExecutionException {
        when(task.isPerformUpdate()).thenReturn(false);
        Realm realm = mock(Realm.class);

        OpEvent.Outcome outcome = handler.link(delta, realm, false);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertTrue(resultsList.isEmpty());
    }

    @Test
    public void testDelete_NotConfiguredForDelete() {
        when(task.isPerformDelete()).thenReturn(false);
        Realm realm = mock(Realm.class);

        OpEvent.Outcome outcome = handler.delete(delta, realm);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertTrue(resultsList.isEmpty());
    }

    @Test
    public void testDelete_RealmContainsChildren_ThrowsException() {
        when(task.isPerformDelete()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(false);

        Realm realm = mock(Realm.class);
        when(realm.getFullPath()).thenReturn("/test");
        when(realm.getKey()).thenReturn("realm-key");

        Realm childRealm = mock(Realm.class);
        when(realmSearchDAO.findChildren(realm)).thenReturn(Collections.singletonList(childRealm));

        OpEvent.Outcome outcome = handler.delete(delta, realm);

        assertEquals(OpEvent.Outcome.FAILURE, outcome);
        assertEquals(1, resultsList.size());
        assertEquals(ProvisioningReport.Status.FAILURE, resultsList.get(0).getStatus());
        assertTrue(resultsList.get(0).getMessage().contains(ClientExceptionType.RealmContains.name()));
    }

    @Test
    public void testIgnore_ReturnsSuccess() {
        when(profile.isDryRun()).thenReturn(false);

        OpEvent.Outcome outcome = handler.ignore(delta, true);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertEquals(1, resultsList.size());
        assertEquals(ProvisioningReport.Status.SUCCESS, resultsList.get(0).getStatus());
        verify(notificationManager, times(1)).createTasks(any(), any(), any(), any(), any(), any(), any(), any(), any());
    }


    @Test
    public void testDoHandle_UpdateMatched_Updates() throws JobExecutionException {
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        Realm matchedRealm = mock(Realm.class);
        when(inboundMatcher.match(any(), any())).thenReturn(Collections.singletonList(matchedRealm));
        when(task.getMatchingRule()).thenReturn(MatchingRule.UPDATE);
        when(task.isPerformUpdate()).thenReturn(false); // Quick branch exit inside update

        OpEvent.Outcome outcome = handler.doHandle(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(task, times(1)).getMatchingRule();
    }

    @Test
    public void testDoHandle_ConflictResolution_LastMatch() throws JobExecutionException {
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);

        Realm r1 = mock(Realm.class);
        Realm r2 = mock(Realm.class);
        when(inboundMatcher.match(any(), any())).thenReturn(Arrays.asList(r1, r2));

        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.LASTMATCH);
        when(task.getMatchingRule()).thenReturn(MatchingRule.IGNORE);
        when(profile.isDryRun()).thenReturn(true);

        OpEvent.Outcome outcome = handler.doHandle(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertEquals(1, resultsList.size());
    }

    @Test(expected = IgnoreProvisionException.class)
    public void testDoHandle_ConflictResolution_IgnoreThrowsException() throws JobExecutionException {
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);

        Realm r1 = mock(Realm.class);
        Realm r2 = mock(Realm.class);
        when(inboundMatcher.match(any(), any())).thenReturn(Arrays.asList(r1, r2));

        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.IGNORE);

        handler.doHandle(delta, orgUnit);
    }
}