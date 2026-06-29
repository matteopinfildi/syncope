package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.types.ConflictResolutionAction;
import org.apache.syncope.common.lib.types.MatchingRule;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.PullMode;
import org.apache.syncope.common.lib.types.ResourceOperation;
import org.apache.syncope.common.lib.types.UnmatchingRule;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.data.RealmDataBinder;
import org.apache.syncope.core.provisioning.api.notification.NotificationManager;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMGTC4Test {

    @InjectMocks
    private DefaultRealmPullResultHandler handler;

    @Mock
    private InboundMatcher inboundMatcher;
    @Mock
    private AnySearchDAO searchDAO;
    @Mock
    private RealmDAO realmDAO;
    @Mock
    private RealmDataBinder binder;
    @Mock
    private NotificationManager notificationManager;
    @Mock
    private AuditManager auditManager;

    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profile;
    @Mock
    private PullTask pullTask;
    @Mock
    private ExternalResource resource;
    @Mock
    private OrgUnit orgUnit;

    private SyncDelta createDelta;
    private SyncDelta updateDelta;
    private SyncDelta deleteDelta;

    @Before
    public void setUp() {
        // Iniezione manuale dei campi ereditati o protetti
        ReflectionTestUtils.setField(handler, "profile", profile);
        ReflectionTestUtils.setField(handler, "realmDAO", realmDAO);
        ReflectionTestUtils.setField(handler, "binder", binder);
        ReflectionTestUtils.setField(handler, "notificationManager", notificationManager);
        ReflectionTestUtils.setField(handler, "auditManager", auditManager);

        // Configurazione di base del profilo e del task
        when(profile.getTask()).thenReturn(pullTask);
        when(pullTask.getResource()).thenReturn(resource);
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(profile.getResults()).thenReturn(new ArrayList<>());
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);
        when(profile.getActions()).thenReturn(Collections.emptyList());

        // Setup dei mock per ConnectorObject e SyncDelta
        ConnectorObject connObj = mock(ConnectorObject.class);
        when(connObj.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);
        when(connObj.getName()).thenReturn(new Name("TestRealm"));
        when(connObj.getUid()).thenReturn(new Uid("uid123"));

        createDelta = mock(SyncDelta.class);
        when(createDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(createDelta.getObject()).thenReturn(connObj);
        when(createDelta.getUid()).thenReturn(new Uid("uid123"));

        updateDelta = mock(SyncDelta.class);
        when(updateDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        when(updateDelta.getObject()).thenReturn(connObj);
        when(updateDelta.getUid()).thenReturn(new Uid("uid123"));

        deleteDelta = mock(SyncDelta.class);
        when(deleteDelta.getDeltaType()).thenReturn(SyncDeltaType.DELETE);
        when(deleteDelta.getObject()).thenReturn(connObj);
        when(deleteDelta.getUid()).thenReturn(new Uid("uid123"));
    }

    @Test
    public void handle_MissingOrgUnit_ReturnsFalseAndHandlesException() {
        when(resource.getOrgUnit()).thenReturn(null);

        boolean result = handler.handle(createDelta);

        assertFalse("Should return false when JobExecutionException is thrown due to missing OrgUnit", result);
    }

    @Test
    public void handle_MultipleMatchesConflictIgnore_ThrowsIgnoreExceptionAndReturnsTrue() {
        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);
        when(inboundMatcher.match(any(SyncDelta.class), eq(orgUnit))).thenReturn(List.of(realm1, realm2));
        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.IGNORE);

        boolean result = handler.handle(createDelta);

        assertTrue("Should return true, gracefully swallowing the IgnoreProvisionException", result);
        assertEquals(1, profile.getResults().size());
        assertEquals(ProvisioningReport.Status.IGNORE, profile.getResults().get(0).getStatus());
    }

    @Test
    public void processDelta_UnmatchingIgnore_ReturnsTrue() {
        // Bypassiamo doHandle per testare direttamente il flusso protetto dell'ignore
        when(profile.isDryRun()).thenReturn(false);

        OpEvent.Outcome result = handler.ignore(createDelta, false);

        assertEquals(OpEvent.Outcome.SUCCESS, result);
        assertEquals(1, profile.getResults().size());
        assertEquals(ProvisioningReport.Status.SUCCESS, profile.getResults().get(0).getStatus());
        assertEquals(ResourceOperation.NONE, profile.getResults().get(0).getOperation());
    }

    @Test
    public void processDelta_MatchingUpdate_DryRun_ReturnsTrueWithoutExecuting() {
        Realm matchedRealm = mock(Realm.class);
        when(matchedRealm.getKey()).thenReturn("realmKey1");
        when(matchedRealm.getFullPath()).thenReturn("/TestRealm");

        when(inboundMatcher.match(any(SyncDelta.class), eq(orgUnit))).thenReturn(List.of(matchedRealm));
        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UPDATE);
        when(pullTask.isPerformUpdate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true); // Attivazione DryRun

        boolean result = handler.handle(updateDelta);

        assertTrue(result);
        assertEquals(1, profile.getResults().size());
        assertEquals(ProvisioningReport.Status.SUCCESS, profile.getResults().get(0).getStatus());
        verify(binder, org.mockito.Mockito.never()).getRealmTO(any(Realm.class), anyBoolean());
    }

    @Test
    public void assign_NotConfigured_ReturnsSuccess() throws Exception {
        when(pullTask.isPerformCreate()).thenReturn(false);

        OpEvent.Outcome outcome = handler.assign(createDelta, orgUnit);

        assertEquals("Should return SUCCESS cleanly without proceeding", OpEvent.Outcome.SUCCESS, outcome);
        assertTrue("No results should be added because it skipped creation", profile.getResults().isEmpty());
    }

    @Test
    public void handle_MatchingUpdate_NotConfigured_ReturnsTrue() throws Exception {
        Realm matchedRealm = mock(Realm.class);
        when(inboundMatcher.match(any(SyncDelta.class), eq(orgUnit))).thenReturn(List.of(matchedRealm));
        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UPDATE);
        when(pullTask.isPerformUpdate()).thenReturn(false); // Update disabilitato

        boolean result = handler.handle(updateDelta);

        assertTrue("Execution should succeed without updating", result);
        assertTrue(profile.getResults().isEmpty());
    }



    @Test
    public void handle_MatchingDeprovision_NotConfigured_ReturnsTrue() throws Exception {
        Realm matchedRealm = mock(Realm.class);
        when(inboundMatcher.match(any(SyncDelta.class), eq(orgUnit))).thenReturn(List.of(matchedRealm));
        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.DEPROVISION);
        when(pullTask.isPerformUpdate()).thenReturn(false); // Il deprovision è bloccato dall'update flag

        boolean result = handler.handle(updateDelta);

        assertTrue(result);
        assertTrue(profile.getResults().isEmpty());
    }

    @Test
    public void handle_Delete_NotConfigured_ReturnsTrue() throws Exception {
        Realm matchedRealm = mock(Realm.class);
        when(inboundMatcher.match(any(SyncDelta.class), eq(orgUnit))).thenReturn(List.of(matchedRealm));
        when(pullTask.isPerformDelete()).thenReturn(false); // Delete disabilitato

        boolean result = handler.handle(deleteDelta);

        assertTrue(result);
        assertTrue(profile.getResults().isEmpty());
    }


}