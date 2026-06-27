package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;
import java.util.List;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.types.ConflictResolutionAction;
import org.apache.syncope.common.lib.types.MatchingRule;
import org.apache.syncope.common.lib.types.PullMode;
import org.apache.syncope.common.lib.types.UnmatchingRule;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
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
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

    @RunWith(MockitoJUnitRunner.class)
    public class DefaultRealmPullResultHandlerLLMGTTest {

        // Utilizziamo @Spy in combinazione con @InjectMocks per poter fare lo stubbing
        // parziale di metodi interni (come end()) senza far esplodere la superclasse.
        @InjectMocks
        @Spy
        private DefaultRealmPullResultHandler handler;

        @Mock
        private InboundMatcher inboundMatcher;

        @Mock
        private ProvisioningProfile<PullTask, InboundActions> profile;

        @Mock
        private PullTask pullTask;

        @Mock
        private ExternalResource externalResource;

        @Mock
        private SyncDelta syncDelta;

        @Mock
        private ConnectorObject connectorObject;

        @Mock
        private OrgUnit orgUnit;

        private List<ProvisioningReport> resultsList;

        @Before
        public void setUp() {
            ReflectionTestUtils.setField(handler, "profile", profile);

            // Disinneschiamo il metodo end() ereditato dalla superclasse.
            // Questo evita NullPointerException sui manager (audit/notification) non mockati
            // quando testiamo i rami interni come update(), deprovision(), ecc.
            doNothing().when(handler).end(any(), any(), any(), any(), any(), any());

            // Basic Profile and Task Mocking
            when(profile.getTask()).thenReturn(pullTask);
            when(pullTask.getResource()).thenReturn(externalResource);
            when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

            // Mock Connector Object components
            Uid uid = new Uid("test-uid");
            Name name = new Name("test-name");
            when(syncDelta.getUid()).thenReturn(uid);
            when(syncDelta.getObject()).thenReturn(connectorObject);
            when(connectorObject.getObjectClass()).thenReturn(ObjectClass.ACCOUNT);

            org.mockito.Mockito.lenient().when(connectorObject.getName()).thenReturn(name);
            org.mockito.Mockito.lenient().when(connectorObject.getUid()).thenReturn(uid);

            resultsList = new ArrayList<>();
            org.mockito.Mockito.lenient().when(profile.getResults()).thenReturn(resultsList);
        }

        // =======================================================================
        // TEST ORIGINALI (Fase 1)
        // =======================================================================

        @Test
        public void testHandle_MissingOrgUnit_ThrowsJobExecutionException_ReturnsFalse() {
            when(externalResource.getOrgUnit()).thenReturn(null);
            boolean result = handler.handle(syncDelta);
            assertFalse("Handler should return false when OrgUnit is missing", result);
        }

        @Test
        public void testHandle_SuccessIncremental_ReturnsTrue() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(new ArrayList<>());

            boolean result = handler.handle(syncDelta);
            assertTrue("Handler should return true on SUCCESS in INCREMENTAL mode", result);
        }

        @Test
        public void testHandle_SuccessNonIncremental_ReturnsTrue() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(pullTask.getPullMode()).thenReturn(PullMode.FULL_RECONCILIATION);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(new ArrayList<>());

            boolean result = handler.handle(syncDelta);
            assertTrue("Handler should return true regardless of outcome when not INCREMENTAL", result);
        }

        @Test
        public void testHandle_ThrowsIgnoreProvisionException_ReturnsTrue() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);

            //aggiunto queste righe
            Uid testUid = new Uid("test-uid");
            when(connectorObject.getUid()).thenReturn(testUid);

            List<Realm> conflictingRealms = new ArrayList<>();
            conflictingRealms.add(mock(Realm.class));
            conflictingRealms.add(mock(Realm.class));

            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(conflictingRealms);
            when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.IGNORE);

            boolean result = handler.handle(syncDelta);

            assertTrue("Handler should return true when ignoring provision", result);
            assertFalse("ProvisioningReport should be added to profile results", resultsList.isEmpty());
        }

        @Test
        public void testHandle_StopRequested_ReturnsFalse() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(new ArrayList<>());

            ReflectionTestUtils.setField(handler, "stopRequested", true);
            boolean result = handler.handle(syncDelta);
            assertFalse("Handler should return false when stop is requested", result);
        }

        // =======================================================================
        // NUOVI TEST AGGIUNTIVI (Fase 2)
        // =======================================================================

        @Test
        public void testHandle_MultipleMatches_ConflictResolutionLastMatch() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);

            List<Realm> realms = new ArrayList<>();
            realms.add(mock(Realm.class));
            realms.add(mock(Realm.class)); // The LAST match

            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(realms);
            when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.LASTMATCH);
            // Indirizziamo verso l'ignore per evitare setup di update profondi
            when(pullTask.getMatchingRule()).thenReturn(MatchingRule.IGNORE);

            boolean result = handler.handle(syncDelta);

            assertTrue("Handler should resolve conflict using LASTMATCH and process rule", result);
        }

        @Test
        public void testHandle_MatchingRuleUpdate_NotPerformUpdate() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);

            List<Realm> realms = List.of(mock(Realm.class));
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(realms);
            when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UPDATE);

            // Disabilitiamo il flag per testare solo il routing logico dello switch senza toccare il DB
            when(pullTask.isPerformUpdate()).thenReturn(false);

            boolean result = handler.handle(syncDelta);
            assertTrue("Handler should route to update and return true when skipping execution", result);
        }

        @Test
        public void testHandle_MatchingRuleDeprovision_NotPerformUpdate() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);

            List<Realm> realms = List.of(mock(Realm.class));
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(realms);
            when(pullTask.getMatchingRule()).thenReturn(MatchingRule.DEPROVISION);

            when(pullTask.isPerformUpdate()).thenReturn(false);

            boolean result = handler.handle(syncDelta);
            assertTrue("Handler should route to deprovision and return true", result);
        }

        @Test
        public void testHandle_MatchingRuleUnlink_NotPerformUpdate() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);

            List<Realm> realms = List.of(mock(Realm.class));
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(realms);
            when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UNLINK);

            when(pullTask.isPerformUpdate()).thenReturn(false);

            boolean result = handler.handle(syncDelta);
            assertTrue("Handler should route to unlink and return true", result);
        }

        @Test
        public void testHandle_DeltaTypeDelete_NotPerformDelete() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.DELETE);

            // Delete scatta a prescindere dal Matcher nello switch case finale
            List<Realm> realms = List.of(mock(Realm.class));
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(realms);

            when(pullTask.isPerformDelete()).thenReturn(false);

            boolean result = handler.handle(syncDelta);
            assertTrue("Handler should route to delete and return true when skipping execution", result);
        }

        @Test
        public void testHandle_UnmatchingRule_DeadCodeDemonstration() {
            when(externalResource.getOrgUnit()).thenReturn(orgUnit);
            when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);

            // Nessun match trovato
            when(inboundMatcher.match(any(SyncDelta.class), any(OrgUnit.class))).thenReturn(new ArrayList<>());

            org.mockito.Mockito.lenient().when(pullTask.getUnmatchingRule()).thenReturn(UnmatchingRule.PROVISION);

            boolean result = handler.handle(syncDelta);

            // Il test passa perché ritorna early (true) mascherando il fatto che PROVISION è ignorato.
            assertTrue("Handler returns true early due to the 'Nothing to do' block, bypassing the switch", result);
        }
    }