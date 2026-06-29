package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.ConflictResolutionAction;
import org.apache.syncope.common.lib.types.MatchingRule;
import org.apache.syncope.common.lib.types.UnmatchingRule;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.CASSPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.OIDCRPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.SAML2SPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.data.RealmDataBinder;
import org.apache.syncope.core.provisioning.api.notification.NotificationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationTaskExecutor;
import org.apache.syncope.core.provisioning.api.pushpull.IgnoreProvisionException;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerLLMGTC2Test {

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
    private NotificationManager notificationManager;
    @Mock
    private AuditManager auditManager;
    @Mock
    private SecurityProperties securityProperties;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private SyncDelta syncDelta;

    @Mock
    private ProvisioningProfile profile;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private PullTask pullTask;

    // Utilizziamo un'istanza reale invece di un mock per monitorare in modo sicuro lo stato interno
    private List<ProvisioningReport> resultsList;

    @InjectMocks
    private DefaultRealmPullResultHandler handler;

    @Before
    public void setUp() {
        ReflectionTestUtils.setField(handler, "profile", profile);
        doReturn(pullTask).when(profile).getTask();

        resultsList = new ArrayList<>();
        when(profile.getResults()).thenReturn(resultsList);
        when(profile.getActions()).thenReturn(Collections.emptyList());

        // Comportamento standard per chiamate concatenate nei metodi di logging/audit
        when(pullTask.getResource().getKey()).thenReturn("mockResourceKey");
    }

// =========================================================================================
// TEST CORRETTI ED ESISTENTI
// =========================================================================================

    @Test
    public void testHandle_MissingOrgUnitThrowsJobExecutionException() {
        when(pullTask.getResource().getOrgUnit()).thenReturn(null);
        when(syncDelta.getObject().getObjectClass().toString()).thenReturn("__ACCOUNT__");

        boolean result = handler.handle(syncDelta);

        assertFalse("Handler should return false when JobExecutionException occurs", result);
    }

    @Test
    public void testHandle_IgnoreProvisionException() {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(pullTask.getResource().getOrgUnit()).thenReturn(orgUnit);
        when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(syncDelta.getObject().getName().getNameValue()).thenReturn("IgnoredRealm");

        when(inboundMatcher.match(any(), any())).thenThrow(new IgnoreProvisionException("Simulated Ignore"));

        boolean result = handler.handle(syncDelta);

        assertTrue("Handler should return true when ignoring a provision exception", result);
        // Validiamo la lista reale
        assertEquals(1, resultsList.size());
        assertEquals(ProvisioningReport.Status.IGNORE, resultsList.get(0).getStatus());
    }

    @Test
    public void testDoHandle_MultipleMatches_LastMatchConflictResolution() throws Exception {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.LASTMATCH);

        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);
        when(inboundMatcher.match(any(), any())).thenReturn(List.of(realm1, realm2));

        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UPDATE);
        when(pullTask.isPerformUpdate()).thenReturn(false);

        handler.doHandle(syncDelta, orgUnit);

        // Verifica che la risoluzione LASTMATCH e la rotta di UPDATE siano state eseguite
        verify(pullTask).isPerformUpdate();
    }

// =========================================================================================
// NUOVI TEST E TEST CORRETTI DAI PRECEDENTI ERRORI
// =========================================================================================

    @Test
    public void testProvision_DryRun() throws Exception {
        OrgUnit orgUnit = mock(OrgUnit.class);

        // Chiamata diretta per bypassare l'early-return bug in doHandle (if realms.isEmpty() -> return)
        when(pullTask.isPerformCreate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true);

        RealmTO realmTO = new RealmTO();
        realmTO.setName("DryRunRealm");
        realmTO.setParent("/parent");
        when(connObjectUtils.getRealmTO(any(), any())).thenReturn(realmTO);

        handler.provision(syncDelta, orgUnit);

        // Essendo un dry run, la logica di provision salta il salvataggio in DB e NON inserisce i risultati nella lista
        assertTrue("Results list should be empty during a dry run in provision", resultsList.isEmpty());
        verify(realmDAO, never()).save(any());
    }

    @Test
    public void testAssign_NotConfigured() throws Exception {
        OrgUnit orgUnit = mock(OrgUnit.class);

        when(pullTask.isPerformCreate()).thenReturn(false);

        handler.assign(syncDelta, orgUnit);

        // Se create non è configurato, salta la logica d'inserimento e non salva report
        assertTrue(resultsList.isEmpty());
        verify(connObjectUtils, never()).getRealmTO(any(), any());
    }

    @Test(expected = IgnoreProvisionException.class)
    public void testDoHandle_MultipleMatches_IgnoreConflictResolution() throws Exception {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        when(syncDelta.getObject().getUid()).thenReturn(new Uid("conflict-uid"));

        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.IGNORE);

        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);
        when(inboundMatcher.match(any(), any())).thenReturn(List.of(realm1, realm2));

        // Questa chiamata solleverà esplicitamente l'eccezione come configurato da ConflictResolutionAction.IGNORE
        handler.doHandle(syncDelta, orgUnit);
    }

    @Test
    public void testDeprovision_Unlink() throws Exception {
        OrgUnit orgUnit = mock(OrgUnit.class);
        Realm realm = mock(Realm.class);

        // FONDAMENTALE: Restituisce un id simulato per prevenire NPE su Optional.of(null)
        when(realm.getKey()).thenReturn("mockRealmKey");
        when(realm.getFullPath()).thenReturn("/targetRealm");

        when(syncDelta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);
        when(inboundMatcher.match(any(), any())).thenReturn(List.of(realm));

        // UNASSIGN mappa su deprovision con unlink = true
        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.UNASSIGN);
        when(pullTask.isPerformUpdate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(false);

        RealmTO realmTO = new RealmTO();
        when(binder.getRealmTO(any(), eq(true))).thenReturn(realmTO);
        when(realmDAO.save(any())).thenReturn(realm);

        handler.doHandle(syncDelta, orgUnit);

        verify(propagationManager).createTasks(any(), any(), any());
        verify(taskExecutor).execute(any(), anyBoolean(), any());
        assertEquals(1, resultsList.size());
    }

    @Test
    public void testPerformDelete_Success() {
        Realm realm = mock(Realm.class);

        // FONDAMENTALE: Previene l'NPE nella chiusura del report
        when(realm.getKey()).thenReturn("mockRealmKey");
        when(realm.getFullPath()).thenReturn("/targetRealm");

        when(pullTask.isPerformDelete()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(false);

        // Configura un realm vuoto per oltrepassare le regole di integrità
        when(realmSearchDAO.findChildren(realm)).thenReturn(Collections.emptyList());
        when(searchDAO.count(any(), anyBoolean(), any(), any(), any())).thenReturn(0L);
        when(taskDAO.findByRealm(realm)).thenReturn(Collections.emptyList());
        when(casSPClientAppDAO.findAllByRealm(realm)).thenReturn(Collections.emptyList());
        when(saml2SPClientAppDAO.findAllByRealm(realm)).thenReturn(Collections.emptyList());
        when(oidcRPClientAppDAO.findAllByRealm(realm)).thenReturn(Collections.emptyList());

        handler.delete(syncDelta, realm);

        verify(propagationManager).createTasks(any(), any(), any());
        verify(realmDAO).delete(realm);

        assertEquals(1, resultsList.size());
        assertEquals(ProvisioningReport.Status.SUCCESS, resultsList.get(0).getStatus());
    }
}