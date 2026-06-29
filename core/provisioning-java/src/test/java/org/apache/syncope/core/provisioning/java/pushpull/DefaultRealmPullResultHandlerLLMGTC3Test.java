package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
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
import org.apache.syncope.core.provisioning.api.job.JobExecutionException;
import org.apache.syncope.core.provisioning.api.pushpull.IgnoreProvisionException;
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

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMGTC3Test {

    @Spy
    @InjectMocks
    private DefaultRealmPullResultHandler handler;

    @Mock
    private ProvisioningProfile<PullTask, InboundActions> profile;

    @Mock
    private PullTask pullTask;

    @Mock
    private ExternalResource resource;

    @Mock
    private OrgUnit orgUnit;

    @Mock
    private SyncDelta delta;

    @Mock
    private ConnectorObject connObject;

    @Mock
    private Uid uid;

    @Mock
    private ObjectClass objectClass;

    @Mock
    private InboundMatcher inboundMatcher;

    private List<ProvisioningReport> results;

    @Before
    public void setUp() throws Exception {
        // Inject superclass 'profile' field via reflection
        Field profileField = AbstractRealmResultHandler.class.getDeclaredField("profile");
        profileField.setAccessible(true);
        profileField.set(handler, profile);

        results = new ArrayList<>();

        when(delta.getUid()).thenReturn(uid);
        when(delta.getObject()).thenReturn(connObject);
        when(connObject.getObjectClass()).thenReturn(objectClass);
        when(connObject.getUid()).thenReturn(uid);
        when(uid.getUidValue()).thenReturn("testUid");

        when(profile.getTask()).thenReturn(pullTask);
        when(pullTask.getResource()).thenReturn(resource);
        when(profile.getResults()).thenReturn(results);
        when(profile.getActions()).thenReturn(Collections.emptyList());

        // FIX: Facciamo stubbing del metodo end() per bypassare le NPE causate
        // dalle dipendenze non mockate della superclasse (realmDAO, auditManager, ecc.)
        org.mockito.Mockito.doNothing().when(handler).end(any(), any(), any(), any(), any(), any());
    }


    @Test
    public void testHandleNoOrgUnitThrowsJobExecutionException() {
        when(resource.getOrgUnit()).thenReturn(null);

        boolean result = handler.handle(delta);

        assertFalse("Handler should return false when JobExecutionException is thrown due to missing OrgUnit", result);
    }

    @Test
    public void testHandleIgnoreProvisionExceptionReturnsTrue() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);

        Name name = new Name("ignoredRealmName");
        when(connObject.getName()).thenReturn(name);

        when(inboundMatcher.match(any(), any())).thenThrow(new IgnoreProvisionException("Intentionally ignored by test"));

        boolean result = handler.handle(delta);

        assertTrue("Handler should return true when IgnoreProvisionException is gracefully caught", result);
        assertEquals("One provisioning report should be generated", 1, results.size());
        assertEquals("The generated report status should be set to IGNORE",
                ProvisioningReport.Status.IGNORE, results.get(0).getStatus());
    }

    @Test
    public void testHandleSuccessfulIncrementalPull() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        when(inboundMatcher.match(any(), any())).thenReturn(Collections.emptyList());

        boolean result = handler.handle(delta);

        assertTrue("Handler should return true on a successful incremental pull", result);
    }

    @Test
    public void testHandleSuccessfulNonIncrementalPull() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(pullTask.getPullMode()).thenReturn(PullMode.FULL_RECONCILIATION);

        when(inboundMatcher.match(any(), any())).thenReturn(Collections.emptyList());

        boolean result = handler.handle(delta);

        assertTrue("Handler should always return true on non-incremental pulls regardless of strict outcome matching", result);
    }

    @Test
    public void testHandleStopRequestedReturnsFalse() throws Exception {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(inboundMatcher.match(any(), any())).thenReturn(Collections.emptyList());

        Field stopRequestedField = AbstractRealmResultHandler.class.getDeclaredField("stopRequested");
        stopRequestedField.setAccessible(true);
        stopRequestedField.set(handler, true);

        boolean result = handler.handle(delta);

        assertFalse("Handler should abort and return false if stop was requested mid-execution", result);
    }

    // --- NUOVI TEST AGGIUNTIVI ---

    @Test
    public void testDoHandleConflictResolutionIgnoreThrowsException() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        Name name = new Name("conflictRealmName");
        when(connObject.getName()).thenReturn(name);

        // Simula corrispondenze multiple
        List<Realm> realms = List.of(mock(Realm.class), mock(Realm.class));
        when(inboundMatcher.match(any(), any())).thenReturn(realms);
        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.IGNORE);

        // handle() deve catturare la IgnoreProvisionException sollevata dallo switch di ConflictResolution
        boolean result = handler.handle(delta);

        assertTrue("Handler should return true and report IGNORE on conflict resolution", result);
        assertEquals(ProvisioningReport.Status.IGNORE, results.get(0).getStatus());
    }


    @Test
    public void testProcessDeltaTypeCreateAssign() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        when(inboundMatcher.match(any(), any())).thenReturn(Collections.emptyList());
        lenient().when(pullTask.getUnmatchingRule()).thenReturn(UnmatchingRule.ASSIGN);

        // Disabilitare "PerformCreate" attiva l'uscita anticipata nel metodo assign() garantendo un Outcome.SUCCESS pulito
        lenient().when(pullTask.isPerformCreate()).thenReturn(false);

        boolean result = handler.handle(delta);

        assertTrue("Handler should return true when processing ASSIGN rule successfully", result);
    }

    @Test
    public void testDoHandleConflictResolutionLastMatch() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);
        List<Realm> realms = List.of(realm1, realm2);

        when(inboundMatcher.match(any(), any())).thenReturn(realms);
        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.LASTMATCH);

        // Configura il task per eseguire l'azione veloce di "IGNORE" in modo da completare l'elaborazione con successo
        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.IGNORE);

        boolean result = handler.handle(delta);

        assertTrue("Handler should resolve conflict with LASTMATCH and complete processing", result);
    }

    @Test
    public void testProcessDeltaTypeUpdateUnassign() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        Realm realm = mock(Realm.class);
        when(inboundMatcher.match(any(), any())).thenReturn(List.of(realm));
        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UNASSIGN);

        // Disabilitare "PerformUpdate" attiva l'uscita anticipata nel metodo deprovision()
        when(pullTask.isPerformUpdate()).thenReturn(false);

        boolean result = handler.handle(delta);

        assertTrue("Handler should return true when processing UNASSIGN rule successfully", result);
    }

    @Test
    public void testProcessDeltaTypeDelete() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.DELETE);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        Realm realm = mock(Realm.class);
        when(inboundMatcher.match(any(), any())).thenReturn(List.of(realm));

        // Disabilitare "PerformDelete" attiva l'uscita anticipata nel metodo delete()
        when(pullTask.isPerformDelete()).thenReturn(false);

        boolean result = handler.handle(delta);

        assertTrue("Handler should return true when processing DELETE cleanly", result);
    }

    // FIX: Rimpiazza testHandleCatchesGenericJobExecutionException con questo
    // per testare il catch(IllegalStateException) all'interno di processDeltaType
    @Test
    public void testProcessDeltaTypeCatchesIllegalStateException() {
        when(resource.getOrgUnit()).thenReturn(orgUnit);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        when(inboundMatcher.match(any(), any())).thenReturn(Collections.emptyList());

        // Forza un'eccezione runtime catturata dallo switch in processDeltaType
        lenient().when(pullTask.getUnmatchingRule()).thenThrow(new IllegalStateException("Simulated state error"));

        boolean result = handler.handle(delta);

        // Il catch in processDeltaType logga il warning e restituisce l'Outcome di default (SUCCESS = true)
        assertTrue("Handler should catch IllegalStateException, log warning, and return true", result);
    }

}