package org.apache.syncope.core.provisioning.java.pushpull;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.CASSPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.OIDCRPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.SAML2SPClientAppDAO;
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.mockito.Mockito;

public class RandoopHelperHandler {

    public static DefaultRealmPullResultHandler getHelperHandlerRandoop() {
        // 1. Mock delle dipendenze del costruttore
        InboundMatcher inboundMatcher = Mockito.mock(InboundMatcher.class);
        ConnObjectUtils connObjectUtils = Mockito.mock(ConnObjectUtils.class);
        AnySearchDAO searchDAO = Mockito.mock(AnySearchDAO.class);
        TaskDAO taskDAO = Mockito.mock(TaskDAO.class);
        CASSPClientAppDAO casSPClientAppDAO = Mockito.mock(CASSPClientAppDAO.class);
        OIDCRPClientAppDAO oidcRPClientAppDAO = Mockito.mock(OIDCRPClientAppDAO.class);
        SAML2SPClientAppDAO saml2SPClientAppDAO = Mockito.mock(SAML2SPClientAppDAO.class);

        // 2. Inizializzazione dell'handler
        DefaultRealmPullResultHandler handler = new DefaultRealmPullResultHandler(
                inboundMatcher,
                connObjectUtils,
                searchDAO,
                taskDAO,
                casSPClientAppDAO,
                oidcRPClientAppDAO,
                saml2SPClientAppDAO
        );

        try {
            // 3. Mock del comportamento di base richiesto da handle()
            ProvisioningProfile profile = Mockito.mock(ProvisioningProfile.class);
            PullTask pullTask = Mockito.mock(PullTask.class);
            ExternalResource resource = Mockito.mock(ExternalResource.class);
            OrgUnit orgUnit = new OrgUnit();

            Mockito.when(profile.getTask()).thenReturn(pullTask);
            Mockito.when(pullTask.getResource()).thenReturn(resource);
            Mockito.when(resource.getOrgUnit()).thenReturn(orgUnit);
            Mockito.when(profile.getResults()).thenReturn(new ArrayList<>());
            Mockito.when(profile.isDryRun()).thenReturn(true);

            // Fondamentale: evita NPE nel foreach (for (InboundActions action : profile.getActions()))
            Mockito.when(profile.getActions()).thenReturn(new ArrayList<>());

            // Mock per InboundMatcher
            Mockito.when(inboundMatcher.match(Mockito.any(), Mockito.any())).thenReturn(new ArrayList<>());

            // 4. Iniezione del profile nella superclasse (AbstractRealmResultHandler)
            // Se esiste il metodo setter pubblico, puoi usare handler.setProfile(profile);
            // In caso contrario, usiamo la reflection ricorsiva per sicurezza:
            setField(handler, "profile", profile);

            // Opzionale: mock di altri manager ereditati per evitare NPE in flussi complessi
            // setField(handler, "realmDAO", Mockito.mock(RealmDAO.class));
            // setField(handler, "propagationManager", Mockito.mock(PropagationManager.class));

        } catch (Exception e) {
            System.out.println("Errore nell'Helper: " + e.getMessage());
        }

        return handler;
    }

    public static SyncDelta getHelperDeltaRandoop() {
        SyncDelta delta = Mockito.mock(SyncDelta.class);
        ConnectorObject obj = Mockito.mock(ConnectorObject.class);

        Mockito.when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        Mockito.when(delta.getUid()).thenReturn(new Uid("-id-123"));
        Mockito.when(delta.getObject()).thenReturn(obj);

        Mockito.when(obj.getObjectClass()).thenReturn(new ObjectClass("Class"));
        Mockito.when(obj.getUid()).thenReturn(new Uid("id-123"));

        // Aggiunto per evitare NPE nel blocco catch (IgnoreProvisionException) su obj.getName().getNameValue()
        Name mockName = Mockito.mock(Name.class);
        Mockito.when(mockName.getNameValue()).thenReturn("Name");
        Mockito.when(obj.getName()).thenReturn(mockName);

        return delta;
    }

    /**
     * Utility method per iniettare campi tramite reflection anche nelle superclassi.
     */
    private static void setField(Object target, String fieldName, Object value) {
        Class<?> clazz = target.getClass();
        while (clazz != null) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(target, value);
                return;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass(); // Risale la gerarchia se il campo non è in questa classe
            } catch (Exception e) {
                break;
            }
        }
    }
}
