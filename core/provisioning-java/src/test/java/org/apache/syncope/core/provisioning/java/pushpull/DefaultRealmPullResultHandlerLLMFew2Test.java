package org.apache.syncope.core.provisioning.java.pushpull;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.AnyTypeKind;
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
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.job.JobExecutionException;
import org.apache.syncope.core.provisioning.api.propagation.PropagationException;
import org.apache.syncope.core.provisioning.api.propagation.PropagationManager;
import org.apache.syncope.core.provisioning.api.pushpull.IgnoreProvisionException;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
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
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMFew2Test {

    @Spy
    private DefaultRealmPullResultHandler handler = new DefaultRealmPullResultHandler();

    // NOTA 1: Usare @Mock semplice, MAI Deep Stubs.
    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profile;
    @Mock
    private PullTask pullTask;
    @Mock
    private ExternalResource resource;
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
    private InboundMatcher inboundMatcher;
    @Mock
    private ConnObjectUtils connObjectUtils;
    @Mock
    private PropagationManager propagationManager;
    @Mock
    private SyncDelta mockDelta;
    @Mock
    private ConnectorObject mockConnObject;

    @Mock
    private org.apache.syncope.core.provisioning.api.data.RealmDataBinder binder;

    private List<ProvisioningReport> profileResults;

    @Before
    public void setUp() {
        // NOTA 2: Iniezione dipendenze tramite ReflectionTestUtils
        handler.setProfile(profile);
        ReflectionTestUtils.setField(handler, "realmDAO", realmDAO);
        ReflectionTestUtils.setField(handler, "realmSearchDAO", realmSearchDAO);
        ReflectionTestUtils.setField(handler, "searchDAO", searchDAO);
        ReflectionTestUtils.setField(handler, "taskDAO", taskDAO);
        ReflectionTestUtils.setField(handler, "casSPClientAppDAO", casSPClientAppDAO);
        ReflectionTestUtils.setField(handler, "oidcRPClientAppDAO", oidcRPClientAppDAO);
        ReflectionTestUtils.setField(handler, "saml2SPClientAppDAO", saml2SPClientAppDAO);
        ReflectionTestUtils.setField(handler, "inboundMatcher", inboundMatcher);
        ReflectionTestUtils.setField(handler, "connObjectUtils", connObjectUtils);
        ReflectionTestUtils.setField(handler, "propagationManager", propagationManager);
        ReflectionTestUtils.setField(handler, "binder", binder);

        profileResults = new ArrayList<>();

        // Setup base comuni
        BDDMockito.lenient().doReturn(pullTask).when(profile).getTask();
        BDDMockito.lenient().doReturn(resource).when(pullTask).getResource();
        BDDMockito.lenient().doReturn(profileResults).when(profile).getResults();

        // Setup base per SyncDelta e ConnectorObject (previene NPE sui metodi getUid().getUidValue())
        Uid mockUid = new Uid("testUid");
        BDDMockito.lenient().doReturn(mockConnObject).when(mockDelta).getObject();
        BDDMockito.lenient().doReturn(mockUid).when(mockConnObject).getUid();
        BDDMockito.lenient().doReturn(mockUid).when(mockDelta).getUid();
        BDDMockito.lenient().doReturn(new ObjectClass("testClass")).when(mockConnObject).getObjectClass();
        BDDMockito.lenient().doReturn(new Name("testName")).when(mockConnObject).getName();
    }

    // =======================================================================
    // TEST DEL METODO: handle()
    // =======================================================================

    @Test
    public void testHandle_NoOrgUnit_ReturnsFalse() {
        // GIVEN: Nessuna OrgUnit trovata
        given(resource.getOrgUnit()).willReturn(null);

        // WHEN
        boolean result = handler.handle(mockDelta);

        // THEN: L'eccezione JobExecutionException viene intercettata e loggata internamente, ritornando false.
        Assert.assertFalse(result);
    }

    @Test
    public void testHandle_Success_NotIncremental() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        given(resource.getOrgUnit()).willReturn(mockOrgUnit);
        given(pullTask.getPullMode()).willReturn(PullMode.FULL_RECONCILIATION);

        BDDMockito.doReturn(OpEvent.Outcome.SUCCESS).when(handler).doHandle(mockDelta, mockOrgUnit);

        // WHEN
        boolean result = handler.handle(mockDelta);

        // THEN
        Assert.assertTrue(result);
        then(handler).should(times(1)).doHandle(mockDelta, mockOrgUnit);
    }

    @Test
    public void testHandle_IgnoreProvisionException_Handled() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        given(resource.getOrgUnit()).willReturn(mockOrgUnit);

        BDDMockito.doThrow(new IgnoreProvisionException("Test")).when(handler).doHandle(mockDelta, mockOrgUnit);

        // WHEN
        boolean result = handler.handle(mockDelta);

        // THEN
        Assert.assertTrue(result);
        Assert.assertEquals(1, profileResults.size());
        Assert.assertEquals(ProvisioningReport.Status.IGNORE, profileResults.get(0).getStatus());
    }

    // =======================================================================
    // TEST DEL METODO: assign()
    // =======================================================================

    @Test
    public void testAssign_NoPerformCreate() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        given(pullTask.isPerformCreate()).willReturn(false);

        BDDMockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.assign(mockDelta, mockOrgUnit);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        then(handler).should(times(1)).end(eq(Optional.empty()), eq(UnmatchingRule.toOp(UnmatchingRule.ASSIGN)), eq(OpEvent.Outcome.SUCCESS), eq(null), eq(null), eq(mockDelta));
    }

    @Test
    public void testAssign_DryRun() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        RealmTO mockRealmTO = mock(RealmTO.class);

        given(pullTask.isPerformCreate()).willReturn(true);
        given(connObjectUtils.getRealmTO(mockConnObject, mockOrgUnit)).willReturn(mockRealmTO);
        given(mockRealmTO.getFullPath()).willReturn("/parent/child");

        BDDMockito.doReturn(new ArrayList<>()).when(mockRealmTO).getResources();
        given(profile.isDryRun()).willReturn(true);

        BDDMockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.assign(mockDelta, mockOrgUnit);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        Assert.assertEquals(0, profileResults.size());
    }

    @Test
    public void testAssign_Success() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        RealmTO mockRealmTO = mock(RealmTO.class);

        given(pullTask.isPerformCreate()).willReturn(true);
        given(connObjectUtils.getRealmTO(mockConnObject, mockOrgUnit)).willReturn(mockRealmTO);
        given(mockRealmTO.getFullPath()).willReturn("/parent/child");
        BDDMockito.doReturn(new ArrayList<>()).when(mockRealmTO).getResources();
        given(profile.isDryRun()).willReturn(false);
        BDDMockito.doReturn(new ArrayList<>()).when(profile).getActions();

        BDDMockito.doReturn(OpEvent.Outcome.SUCCESS).when(handler).create(any(RealmTO.class), eq(mockDelta), eq(UnmatchingRule.ASSIGN), any(ProvisioningReport.class));

        // WHEN
        OpEvent.Outcome result = handler.assign(mockDelta, mockOrgUnit);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        then(handler).should(times(1)).create(any(RealmTO.class), eq(mockDelta), eq(UnmatchingRule.ASSIGN), any(ProvisioningReport.class));
    }

    // =======================================================================
    // TEST DEL METODO: update()
    // =======================================================================

    @Test
    public void testUpdate_NoPerformUpdate() throws Exception {
        // GIVEN
        Realm mockRealm = mock(Realm.class);
        given(pullTask.isPerformUpdate()).willReturn(false);

        BDDMockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.update(mockDelta, mockRealm, false);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testUpdate_DryRun() throws Exception {
        // GIVEN
        Realm mockRealm = mock(Realm.class);
        given(mockRealm.getKey()).willReturn("realmKey");
        given(mockRealm.getFullPath()).willReturn("/realm");

        given(pullTask.isPerformUpdate()).willReturn(true);
        given(profile.isDryRun()).willReturn(true);

        // WHEN
        OpEvent.Outcome result = handler.update(mockDelta, mockRealm, false);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        Assert.assertEquals(1, profileResults.size());
        Assert.assertEquals("realmKey", profileResults.get(0).getKey());
    }

    @Test
    public void testUpdate_PropagationException() throws Exception {
        // GIVEN
        Realm mockRealm = mock(Realm.class);
        given(mockRealm.getKey()).willReturn("realmKey");
        given(mockRealm.getFullPath()).willReturn("/realm");

        given(pullTask.isPerformUpdate()).willReturn(true);
        given(profile.isDryRun()).willReturn(false);

        BDDMockito.doThrow(mock(PropagationException.class)).when(propagationManager).prepareAttrs(mockRealm);
        BDDMockito.lenient().doReturn(mock(RealmTO.class)).when(binder).getRealmTO(mockRealm, true);
        BDDMockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.update(mockDelta, mockRealm, false);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
    }

    // =======================================================================
    // TEST DEL METODO: delete()
    // =======================================================================

    @Test
    public void testDelete_NoPerformDelete() throws Exception {
        // GIVEN
        Realm mockRealm = mock(Realm.class);
        given(pullTask.isPerformDelete()).willReturn(false);
        BDDMockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.delete(mockDelta, mockRealm);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test
    public void testDelete_RealmContainsElements_Failure() throws Exception {
        // GIVEN
        Realm mockRealm = mock(Realm.class);
        given(mockRealm.getKey()).willReturn("realmKey");
        given(mockRealm.getFullPath()).willReturn("/realm");

        given(pullTask.isPerformDelete()).willReturn(true);
        given(profile.isDryRun()).willReturn(false);

        BDDMockito.doReturn(List.of(mock(Realm.class))).when(realmSearchDAO).findChildren(mockRealm);
        BDDMockito.lenient().doReturn(mock(RealmTO.class)).when(binder).getRealmTO(mockRealm, true);
        BDDMockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.delete(mockDelta, mockRealm);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
        Assert.assertEquals(1, profileResults.size());
        Assert.assertEquals(ProvisioningReport.Status.FAILURE, profileResults.get(0).getStatus());
    }

    @Test
    public void testDelete_DryRun() throws Exception {
        // GIVEN
        Realm mockRealm = mock(Realm.class);
        given(mockRealm.getKey()).willReturn("realmKey");
        given(mockRealm.getFullPath()).willReturn("/realm");

        given(pullTask.isPerformDelete()).willReturn(true);
        given(profile.isDryRun()).willReturn(true);
        BDDMockito.lenient().doReturn(mock(RealmTO.class)).when(binder).getRealmTO(mockRealm, true);
        BDDMockito.lenient().doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.delete(mockDelta, mockRealm);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.FAILURE, result);
        Assert.assertEquals(1, profileResults.size());
    }

    // =======================================================================
    // TEST DEL METODO: ignore()
    // =======================================================================

    @Test
    public void testIgnore_DryRun() {
        // GIVEN
        given(profile.isDryRun()).willReturn(true);

        // WHEN
        OpEvent.Outcome result = handler.ignore(mockDelta, true);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        Assert.assertEquals(1, profileResults.size());
        Assert.assertNull(profileResults.get(0).getKey());
    }

    @Test
    public void testIgnore_NotDryRun_Matching() {
        // GIVEN
        given(profile.isDryRun()).willReturn(false);
        BDDMockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

        // WHEN
        OpEvent.Outcome result = handler.ignore(mockDelta, true);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        Assert.assertEquals(1, profileResults.size());
        then(handler).should(times(1)).end(eq(Optional.empty()), eq(MatchingRule.toOp(MatchingRule.IGNORE)), eq(OpEvent.Outcome.SUCCESS), eq(null), eq(null), eq(mockDelta));
    }

    // =======================================================================
    // TEST DEL METODO: doHandle()
    // =======================================================================

    @Test
    public void testDoHandle_NoMatch() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        given(profile.getActions()).willReturn(new ArrayList<>());

        BDDMockito.<List<Realm>>doReturn(new ArrayList<>()).when(inboundMatcher).match(mockDelta, mockOrgUnit);

        // WHEN
        OpEvent.Outcome result = handler.doHandle(mockDelta, mockOrgUnit);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
    }

    @Test(expected = IgnoreProvisionException.class)
    public void testDoHandle_Conflict_IgnoreAction() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        given(profile.getActions()).willReturn(new ArrayList<>());

        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);

        BDDMockito.<List<Realm>>doReturn(List.of(realm1, realm2)).when(inboundMatcher).match(mockDelta, mockOrgUnit);
        given(profile.getConflictResolutionAction()).willReturn(org.apache.syncope.common.lib.types.ConflictResolutionAction.IGNORE);

        // WHEN
        handler.doHandle(mockDelta, mockOrgUnit);
    }

    @Test
    public void testDoHandle_Conflict_LastMatch() throws Exception {
        // GIVEN
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        given(profile.getActions()).willReturn(new ArrayList<>());

        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);

        BDDMockito.<List<Realm>>doReturn(List.of(realm1, realm2)).when(inboundMatcher).match(mockDelta, mockOrgUnit);
        given(profile.getConflictResolutionAction()).willReturn(org.apache.syncope.common.lib.types.ConflictResolutionAction.LASTMATCH);
        given(mockDelta.getDeltaType()).willReturn(SyncDeltaType.DELETE);

        BDDMockito.doReturn(OpEvent.Outcome.SUCCESS).when(handler).delete(mockDelta, realm2);

        // WHEN
        OpEvent.Outcome result = handler.doHandle(mockDelta, mockOrgUnit);

        // THEN
        Assert.assertEquals(OpEvent.Outcome.SUCCESS, result);
        then(handler).should(times(1)).delete(mockDelta, realm2);
    }
}