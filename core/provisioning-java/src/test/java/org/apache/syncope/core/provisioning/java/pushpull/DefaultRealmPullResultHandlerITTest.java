package org.apache.syncope.core.provisioning.java.pushpull;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.api.pushpull.InboundActions;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.common.lib.types.UnmatchingRule;

import org.identityconnectors.framework.common.objects.ConnectorObject;
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

@RunWith(MockitoJUnitRunner.class)
public class DefaultRealmPullResultHandlerITTest {

    @Mock private RealmDAO realmDAO;
    @Mock private ProvisioningProfile<PullTask, InboundActions> profile;
    @Mock private PullTask pullTask;
    @Mock private ExternalResource resource;
    @Mock private OrgUnit orgUnitEntity;
    @Mock private InboundMatcher inboundMatcher;

    @InjectMocks
    private DefaultRealmPullResultHandler handler;

    @Before
    public void setUp() {
        /*
         Integration test top-down con boundary mockato.

         Componente reale sotto test: DefaultRealmPullResultHandler.

         Componenti mockati: RealmDAO, ProvisioningProfile, PullTask, ExternalResource, OrgUnit, InboundMatcher.

         La comunicazione verificata è:
         - Handler -> Profile (per leggere la configurazione del Task).
         - Handler -> InboundMatcher (per la ricerca di corrispondenze remote).

         Il risultato verificato tramite assert è:
         - Corretto completamento del ciclo di gestione e verifica dell'interazione con il matcher.
         */

        doReturn(pullTask).when(profile).getTask();
        doReturn(resource).when(pullTask).getResource();
        doReturn(orgUnitEntity).when(resource).getOrgUnit();

        lenient().doReturn(UnmatchingRule.PROVISION).when(pullTask).getUnmatchingRule();

        handler.setProfile(profile);
    }

    @Test
    public void handle_IT() throws Exception {
        /*
         Category Partition:
         - A1: Delta di tipo CREATE.
         - B1: InboundMatcher (nessun match trovato).
         - C1: Task UnmatchingRule (PROVISION).

         Oracolo:
         L'handler deve completare il ciclo di orchestrazione ritornando 'true'
         e deve aver invocato il matcher per verificare l'esistenza del realm.
         */

        SyncDelta mockDelta = mock(SyncDelta.class);
        doReturn(SyncDeltaType.CREATE).when(mockDelta).getDeltaType();
        doReturn(new Uid("RemoteRealm123")).when(mockDelta).getUid();

        ConnectorObject mockConnectorObj = mock(ConnectorObject.class);
        ObjectClass mockObjectClass = mock(ObjectClass.class);
        doReturn(mockObjectClass).when(mockConnectorObj).getObjectClass();
        doReturn(mockConnectorObj).when(mockDelta).getObject();

        doReturn(new ArrayList<>()).when(inboundMatcher).match(any(), any());

        boolean result = handler.handle(mockDelta);

        assertTrue("La gestione del delta deve terminare con successo", result);

        verify(inboundMatcher).match(any(), any());
    }
}