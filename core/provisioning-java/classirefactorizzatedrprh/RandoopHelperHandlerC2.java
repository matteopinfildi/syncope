package org.apache.syncope.core.provisioning.java.pushpull;

import java.util.ArrayList;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.CASSPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.OIDCRPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.RealmSearchDAO;
import org.apache.syncope.core.persistence.api.dao.SAML2SPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.data.RealmDataBinder;
import org.apache.syncope.core.provisioning.api.notification.NotificationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationManager;
import org.apache.syncope.core.provisioning.api.propagation.PropagationTaskExecutor;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.mockito.Mockito;

    public class RandoopHelperHandler {

        public static DefaultRealmPullResultHandler getGodModeHandler() {
            DefaultRealmPullResultHandler handler = null;

            try {
                // 1. Mock di tutte le dipendenze richieste dal nuovo costruttore
                InboundMatcher inboundMatcher = Mockito.mock(InboundMatcher.class);
                ConnObjectUtils connObjectUtils = Mockito.mock(ConnObjectUtils.class);
                AnySearchDAO searchDAO = Mockito.mock(AnySearchDAO.class);
                TaskDAO taskDAO = Mockito.mock(TaskDAO.class);
                CASSPClientAppDAO casSPClientAppDAO = Mockito.mock(CASSPClientAppDAO.class);
                OIDCRPClientAppDAO oidcRPClientAppDAO = Mockito.mock(OIDCRPClientAppDAO.class);
                SAML2SPClientAppDAO saml2SPClientAppDAO = Mockito.mock(SAML2SPClientAppDAO.class);
                RealmDAO realmDAO = Mockito.mock(RealmDAO.class);
                RealmSearchDAO realmSearchDAO = Mockito.mock(RealmSearchDAO.class);
                RealmDataBinder binder = Mockito.mock(RealmDataBinder.class);
                PropagationManager propagationManager = Mockito.mock(PropagationManager.class);
                PropagationTaskExecutor taskExecutor = Mockito.mock(PropagationTaskExecutor.class);
                NotificationManager notificationManager = Mockito.mock(NotificationManager.class);
                AuditManager auditManager = Mockito.mock(AuditManager.class);
                SecurityProperties securityProperties = Mockito.mock(SecurityProperties.class);

                // 2. Inizializzazione dell'handler con il costruttore completo
                handler = new DefaultRealmPullResultHandler(
                        inboundMatcher,
                        connObjectUtils,
                        searchDAO,
                        taskDAO,
                        casSPClientAppDAO,
                        oidcRPClientAppDAO,
                        saml2SPClientAppDAO,
                        realmDAO,
                        realmSearchDAO,
                        binder,
                        propagationManager,
                        taskExecutor,
                        notificationManager,
                        auditManager,
                        securityProperties
                );

                // 3. Setup del Profile e dei Task
                ProvisioningProfile profile = Mockito.mock(ProvisioningProfile.class);
                PullTask pullTask = Mockito.mock(PullTask.class);
                ExternalResource resource = Mockito.mock(ExternalResource.class);
                OrgUnit orgUnit = new OrgUnit();

                Mockito.when(profile.getTask()).thenReturn(pullTask);
                Mockito.when(pullTask.getResource()).thenReturn(resource);
                Mockito.when(resource.getOrgUnit()).thenReturn(orgUnit);

                // Imposto ritorni vuoti per evitare NullPointerException nei cicli dell'handler
                Mockito.when(profile.getResults()).thenReturn(new ArrayList<>());
                Mockito.when(profile.getActions()).thenReturn(new ArrayList<>());
                Mockito.when(profile.isDryRun()).thenReturn(true);

                // 4. Iniezione del Profile (ereditato dalla superclasse AbstractRealmResultHandler)
                handler.setProfile(profile);

                // 5. Configurazione base dell'InboundMatcher
                Mockito.when(inboundMatcher.match(Mockito.any(), Mockito.any())).thenReturn(new ArrayList<>());

            } catch (Exception e) {
                System.out.println("Errore nell'Helper: " + e.getMessage());
            }

            return handler;
        }

        public static SyncDelta getGodModeDelta() {
            SyncDelta delta = Mockito.mock(SyncDelta.class);
            ConnectorObject obj = Mockito.mock(ConnectorObject.class);

            Mockito.when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
            Mockito.when(delta.getUid()).thenReturn(new Uid("ext-id-123"));
            Mockito.when(delta.getObject()).thenReturn(obj);

            Mockito.when(obj.getObjectClass()).thenReturn(new ObjectClass("testClass"));
            Mockito.when(obj.getUid()).thenReturn(new Uid("ext-id-123"));

            return delta;
        }
    }
