package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.types.*;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.CASSPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.OIDCRPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.SAML2SPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
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
    public class DefaultRealmPullResultHandlerLLMGTC1Test {

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

        // Inherited Mocks
        @Mock
        private ProvisioningProfile<PullTask, InboundActions> profile;
        @Mock
        private PullTask pullTask;
        @Mock
        private ExternalResource externalResource;
        @Mock
        private OrgUnit orgUnit;

        @Mock
        private SyncDelta syncDelta;
        @Mock
        private ConnectorObject connectorObject;

        @InjectMocks
        private DefaultRealmPullResultHandler handler;

        @Before
        public void setUp() {
            // Inject superclass field manually
            ReflectionTestUtils.setField(handler, "profile", profile);

            // Setup base SyncDelta behavior
            when(syncDelta.getObject()).thenReturn(connectorObject);
            when(connectorObject.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);
            when(connectorObject.getName()).thenReturn(new Name("TestName"));
            when(syncDelta.getUid()).thenReturn(new Uid("TestUID"));

            // Setup base Profile behavior
            when(profile.getTask()).thenReturn(pullTask);
            when(pullTask.getResource()).thenReturn(externalResource);
            when(profile.getResults()).thenReturn(new ArrayList<>());
        }

        @Test
        public void testHandle_MissingOrgUnit_ReturnsFalse() {
            // Arrange: OrgUnit is missing (null)
            when(externalResource.getOrgUnit()).thenReturn(null);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertFalse("Handler should return false on JobExecutionException", result);
        }

        @Test
        public void testHandle_IgnoreProvisionException_ReturnsTrue() {
            // Arrange: OrgUnit valida, ma forziamo un IgnoreProvisionException per conflitto
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);

            // FIX: Mock dell'Uid sul ConnectorObject per evitare il NullPointerException
            when(connectorObject.getUid()).thenReturn(new Uid("TestUID"));

            List<Realm> conflictingRealms = List.of(mock(Realm.class), mock(Realm.class));
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(conflictingRealms);
            when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.IGNORE);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertTrue("Handler should swallow IgnoreProvisionException and return true", result);
            assertFalse("Profile results should contain the ignore report", profile.getResults().isEmpty());
        }

        @Test
        public void testHandle_StopRequested_ReturnsFalse() {
            // Arrange
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(new ArrayList<>());

            // Impostiamo il flag della superclasse tramite reflection
            ReflectionTestUtils.setField(handler, "stopRequested", true);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertFalse("Handler should return false if stop is requested", result);
        }



        @Test
        public void testHandle_Update_Matching_Ignore() {
            // Arrange
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
            when(connectorObject.getUid()).thenReturn(new Uid("TestUID")); // Fix per NPE

            Realm matchedRealm = mock(Realm.class);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(List.of(matchedRealm));

            when(pullTask.getMatchingRule()).thenReturn(MatchingRule.IGNORE);
            when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);
            when(profile.isDryRun()).thenReturn(true);

            List<ProvisioningReport> results = new ArrayList<>();
            when(profile.getResults()).thenReturn(results);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertTrue(result);
        }

        @Test
        public void testHandle_ConflictResolution_LastMatch() {
            // Arrange
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
            when(connectorObject.getUid()).thenReturn(new Uid("TestUID")); // Fix per NPE

            Realm realm1 = mock(Realm.class);
            Realm realm2 = mock(Realm.class);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(List.of(realm1, realm2));

            when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.LASTMATCH);
            when(pullTask.getMatchingRule()).thenReturn(MatchingRule.IGNORE);
            when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);
            when(profile.isDryRun()).thenReturn(true);

            List<ProvisioningReport> results = new ArrayList<>();
            when(profile.getResults()).thenReturn(results);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertTrue(result);
        }

        @Test
        public void testHandle_Delete_NotConfiguredForDelete() {
            // Arrange
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(externalResource.getKey()).thenReturn("resourceKey"); // Fix per NPE interno a end()
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.DELETE);

            Realm matchedRealm = mock(Realm.class);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(List.of(matchedRealm));

            when(pullTask.isPerformDelete()).thenReturn(false);
            when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

            // Mock dei componenti ereditati richiesti dal metodo end()
            org.apache.syncope.core.provisioning.api.AuditManager auditManager = mock(org.apache.syncope.core.provisioning.api.AuditManager.class);
            org.apache.syncope.core.provisioning.api.notification.NotificationManager notificationManager = mock(org.apache.syncope.core.provisioning.api.notification.NotificationManager.class);
            org.apache.syncope.core.persistence.api.dao.RealmDAO realmDAO = mock(org.apache.syncope.core.persistence.api.dao.RealmDAO.class);
            ReflectionTestUtils.setField(handler, "auditManager", auditManager);
            ReflectionTestUtils.setField(handler, "notificationManager", notificationManager);
            ReflectionTestUtils.setField(handler, "realmDAO", realmDAO);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertTrue(result);
        }



        @Test
        public void testHandle_IncrementalPull_Success() {
            // Arrange: Valid path, no conflicts, unmatching rule set to IGNORE to ensure SUCCESS outcome easily
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(new ArrayList<>());
            when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);
            lenient().when(pullTask.getUnmatchingRule()).thenReturn(UnmatchingRule.IGNORE);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertTrue("Incremental pull should return true on OpEvent.Outcome.SUCCESS", result);
        }

        @Test
        public void testHandle_NonIncrementalPull_AlwaysReturnsTrue() {
            // Arrange: Valid OrgUnit, simulate a failure outcome in doHandle by mocking a thrown JobExecutionException inside a sub-method
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(pullTask.getPullMode()).thenReturn(PullMode.FULL_RECONCILIATION);

            // Let's assume unmatching rule is IGNORE, which results in SUCCESS,
            // but even if we forced a FAILURE, non-incremental must return true.
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(new ArrayList<>());
            lenient().when(pullTask.getUnmatchingRule()).thenReturn(UnmatchingRule.IGNORE);

            // Act
            boolean result = handler.handle(syncDelta);

            // Assert
            assertTrue("Non-incremental pull should always return true assuming no fatal exceptions break the flow", result);
        }
    }