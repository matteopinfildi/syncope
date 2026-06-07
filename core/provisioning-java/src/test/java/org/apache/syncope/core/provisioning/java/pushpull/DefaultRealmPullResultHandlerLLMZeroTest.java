package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ProvisioningReport;
import org.apache.syncope.common.lib.to.RealmTO;
import org.apache.syncope.common.lib.types.AnyTypeKind;
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
import org.apache.syncope.core.provisioning.api.PropagationByResource;
import org.apache.syncope.core.provisioning.api.data.RealmDataBinder;
import org.apache.syncope.core.provisioning.api.job.JobExecutionException;
import org.apache.syncope.core.provisioning.api.propagation.PropagationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationTaskExecutor;
import org.apache.syncope.core.provisioning.api.pushpull.IgnoreProvisionException;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

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

    // Dipendenze ereditate da AbstractRealmResultHandler
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

    // Aggiunte le dipendenze gestionali per gli output di end()
    @Mock
    private org.apache.syncope.core.provisioning.api.notification.NotificationManager notificationManager;

    @Mock
    private org.apache.syncope.core.provisioning.api.AuditManager auditManager;

    @Mock
    private org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<PullTask, InboundActions> profile;

    @Mock
    private PullTask pullTask;

    @Mock
    private ExternalResource externalResource;

    @Mock
    private SyncDelta delta;

    @Mock
    private ConnectorObject connectorObject;

    @Mock
    private Realm destinationRealm;

    @Mock
    private Realm realmMock;

    @Before
    public void setUp() {
        // Mock contesto di sicurezza per AuthContextUtils (utilizzato in handler.end() nei LOG/audit)
        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken("admin", "password", Collections.emptyList()));

        // Setup di base del profilo
        when(profile.getTask()).thenReturn(pullTask);
        when(pullTask.getResource()).thenReturn(externalResource);
        when(profile.getResults()).thenReturn(new ArrayList<>());
        when(profile.getActions()).thenReturn(Collections.emptyList());

        // Setup base del delta
        when(delta.getObject()).thenReturn(connectorObject);
        when(connectorObject.getObjectClass()).thenReturn(org.identityconnectors.framework.common.objects.ObjectClass.ACCOUNT);
        when(delta.getUid()).thenReturn(new Uid("testUid"));
        when(connectorObject.getUid()).thenReturn(new Uid("testUid"));
        when(connectorObject.getName()).thenReturn(new Name("testName"));

        // Inject manuale del profile per AbstractResultHandler
        handler.setProfile(profile);
    }

    @Test
    public void testHandle_NoOrgUnit() {
        // Quando manca la OrgUnit, il metodo solleva JobExecutionException, la cattura e restituisce false.
        when(externalResource.getOrgUnit()).thenReturn(null);

        boolean result = handler.handle(delta);

        assertFalse(result);
    }

    @Test
    public void testHandle_Success() {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(externalResource.getOrgUnit()).thenReturn(orgUnit);

        // Setup per doHandle
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(inboundMatcher.match(any(SyncDelta.class), eq(orgUnit))).thenReturn(Collections.emptyList());
        lenient().when(pullTask.getUnmatchingRule()).thenReturn(UnmatchingRule.IGNORE);
        when(pullTask.getPullMode()).thenReturn(PullMode.INCREMENTAL);

        boolean result = handler.handle(delta);

        assertTrue(result);
    }

    @Test
    public void testHandle_IgnoreProvisionException() {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(externalResource.getOrgUnit()).thenReturn(orgUnit);

        when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        when(inboundMatcher.match(any(SyncDelta.class), eq(orgUnit)))
                .thenThrow(new IgnoreProvisionException("Ignorato di proposito"));

        boolean result = handler.handle(delta);

        assertTrue(result);
        assertEquals(1, profile.getResults().size()); // È stato aggiunto un report di IGNORE
    }

    @Test
    public void testAssign_NotPerformCreate() throws JobExecutionException {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(pullTask.isPerformCreate()).thenReturn(false);

        OpEvent.Outcome outcome = handler.assign(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(connObjectUtils, never()).getRealmTO(any(), any());
    }

    @Test
    public void testAssign_PerformCreate_DryRun() throws JobExecutionException {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(pullTask.isPerformCreate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(true);

        RealmTO realmTO = new RealmTO();
        realmTO.setName("testRealm");
        realmTO.setParent("/parent");
        when(connObjectUtils.getRealmTO(connectorObject, orgUnit)).thenReturn(realmTO);
        when(externalResource.getKey()).thenReturn("resourceKey");

        OpEvent.Outcome outcome = handler.assign(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(realmDAO, never()).save(any());
    }

    @Test
    public void testCreate_Success() throws JobExecutionException {
        RealmTO realmTO = new RealmTO();
        realmTO.setName("testRealm");
        realmTO.setFullPath("/parent/testRealm");
        realmTO.setKey("actualKey"); // Necessario per evitare NullPointerException in end()

        when(pullTask.getDestinationRealm()).thenReturn(destinationRealm);
        when(destinationRealm.getFullPath()).thenReturn("/parent");
        when(binder.create(destinationRealm, realmTO)).thenReturn(realmMock);
        when(realmDAO.save(realmMock)).thenReturn(realmMock);
        when(binder.getRealmTO(realmMock, true)).thenReturn(realmTO);
        when(realmMock.getResources()).thenReturn(Collections.emptyList());
        when(propagationManager.createTasks(any(), any(), any())).thenReturn(Collections.emptyList());

        ProvisioningReport resultReport = new ProvisioningReport();

        OpEvent.Outcome outcome = handler.create(realmTO, delta, UnmatchingRule.ASSIGN, resultReport);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(realmDAO, times(1)).save(any());
    }

    @Test
    public void testUpdate_NotPerformUpdate() throws JobExecutionException {
        when(pullTask.isPerformUpdate()).thenReturn(false);

        OpEvent.Outcome outcome = handler.update(delta, realmMock, false);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(binder, never()).update(any(), any());
    }

    @Test
    public void testDeprovision_Success() throws JobExecutionException {
        when(pullTask.isPerformUpdate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(false);
        when(realmMock.getKey()).thenReturn("realmKey");
        when(realmMock.getFullPath()).thenReturn("/realm");

        RealmTO beforeTO = new RealmTO();
        beforeTO.setKey("realmKey");
        beforeTO.setFullPath("/realm");

        when(binder.getRealmTO(realmMock, true)).thenReturn(beforeTO);
        when(externalResource.getKey()).thenReturn("resKey");
        when(realmDAO.save(realmMock)).thenReturn(realmMock);
        when(propagationManager.createTasks(any(), any(), any())).thenReturn(Collections.emptyList());

        OpEvent.Outcome outcome = handler.deprovision(delta, realmMock, true); // unlink = true

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(realmDAO, times(1)).save(realmMock);
    }

    @Test
    public void testDelete_NotPerformDelete() {
        when(pullTask.isPerformDelete()).thenReturn(false);

        OpEvent.Outcome outcome = handler.delete(delta, realmMock);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(realmDAO, never()).delete(any(Realm.class));
    }

    @Test
    public void testDelete_RealmContainsElements() {
        when(pullTask.isPerformDelete()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(false);
        when(realmMock.getKey()).thenReturn("realmKey");
        when(realmMock.getFullPath()).thenReturn("/realm");

        RealmTO beforeTO = new RealmTO();
        when(binder.getRealmTO(realmMock, true)).thenReturn(beforeTO);

        when(realmSearchDAO.findChildren(realmMock)).thenReturn(Collections.emptyList());

        // Simula il fallimento quando si trovano elementi agganciati al Realm (es. 1 Utente)
        when(searchDAO.count(any(), anyBoolean(), any(), any(), eq(AnyTypeKind.USER))).thenReturn(1L);
        when(realmDAO.getRoot()).thenReturn(realmMock);

        OpEvent.Outcome outcome = handler.delete(delta, realmMock);

        assertEquals(OpEvent.Outcome.FAILURE, outcome);
        verify(realmDAO, never()).delete(realmMock);
    }

    @Test
    public void testLink_Success() throws JobExecutionException {
        when(pullTask.isPerformUpdate()).thenReturn(true);
        when(profile.isDryRun()).thenReturn(false);
        when(realmMock.getKey()).thenReturn("realmKey");
        when(realmMock.getFullPath()).thenReturn("/realm");

        RealmTO beforeTO = new RealmTO();
        beforeTO.setKey("realmKey");
        beforeTO.setFullPath("/realm"); // Importante per non dare NPE in end() di update

        when(binder.getRealmTO(realmMock, true)).thenReturn(beforeTO);
        when(propagationManager.prepareAttrs(realmMock)).thenReturn(Collections.emptyList());
        when(binder.update(realmMock, beforeTO)).thenReturn(new PropagationByResource<>());
        when(realmDAO.save(realmMock)).thenReturn(realmMock);
        when(propagationManager.createTasks(any(), any(), any())).thenReturn(Collections.emptyList());
        when(propagationManager.setAttributeDeltas(any(), any())).thenReturn(Collections.emptyList());

        OpEvent.Outcome outcome = handler.link(delta, realmMock, false); // unlink = false

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        verify(realmMock, times(1)).add(any(ExternalResource.class));
    }

    @Test
    public void testDoHandle_MultipleMatches_ConflictResolution_LastMatch() throws JobExecutionException {
        OrgUnit orgUnit = mock(OrgUnit.class);
        when(delta.getDeltaType()).thenReturn(SyncDeltaType.UPDATE);

        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);
        List<Realm> matches = List.of(realm1, realm2);

        when(inboundMatcher.match(delta, orgUnit)).thenReturn(matches);
        when(profile.getConflictResolutionAction()).thenReturn(ConflictResolutionAction.LASTMATCH);
        when(pullTask.getMatchingRule()).thenReturn(MatchingRule.IGNORE);

        OpEvent.Outcome outcome = handler.doHandle(delta, orgUnit);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
    }

    @Test
    public void testIgnore() {
        OpEvent.Outcome outcome = handler.ignore(delta, true);

        assertEquals(OpEvent.Outcome.SUCCESS, outcome);
        assertEquals(1, profile.getResults().size());
        assertEquals(ProvisioningReport.Status.SUCCESS, profile.getResults().get(0).getStatus());
    }
}