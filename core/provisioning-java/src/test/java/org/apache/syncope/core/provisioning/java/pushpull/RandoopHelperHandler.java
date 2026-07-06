package org.apache.syncope.core.provisioning.java.pushpull;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.task.PullTask;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.identityconnectors.framework.common.objects.SyncDeltaType;
import org.identityconnectors.framework.common.objects.Uid;
import org.mockito.Mockito;

public class RandoopHelperHandler {

    public static DefaultRealmPullResultHandler getHelperHandlerRandoop() {
        DefaultRealmPullResultHandler handler = new DefaultRealmPullResultHandler();

        try {
            ProvisioningProfile profile = Mockito.mock(ProvisioningProfile.class);
            PullTask pullTask = Mockito.mock(PullTask.class);
            ExternalResource resource = Mockito.mock(ExternalResource.class);
            OrgUnit orgUnit = new OrgUnit();

            Mockito.when(profile.getTask()).thenReturn(pullTask);
            Mockito.when(pullTask.getResource()).thenReturn(resource);
            Mockito.when(resource.getOrgUnit()).thenReturn(orgUnit);
            Mockito.when(profile.getResults()).thenReturn(new ArrayList<>());

            Mockito.when(profile.isDryRun()).thenReturn(true);

            handler.setProfile(profile);

            InboundMatcher inboundMatcher = Mockito.mock(InboundMatcher.class);
            Mockito.when(inboundMatcher.match(Mockito.any(), Mockito.any())).thenReturn(new ArrayList<>());

            Field matcherField = DefaultRealmPullResultHandler.class.getDeclaredField("inboundMatcher");
            matcherField.setAccessible(true);
            matcherField.set(handler, inboundMatcher);

        } catch (Exception e) {
            System.out.println("Errore nell'Helper: " + e.getMessage());
        }

        return handler;
    }

    public static SyncDelta getHelperDeltaRandoop() {
        SyncDelta delta = Mockito.mock(SyncDelta.class);
        ConnectorObject obj = Mockito.mock(ConnectorObject.class);

        Mockito.when(delta.getDeltaType()).thenReturn(SyncDeltaType.CREATE);
        Mockito.when(delta.getUid()).thenReturn(new Uid("id-123"));
        Mockito.when(delta.getObject()).thenReturn(obj);

        Mockito.when(obj.getObjectClass()).thenReturn(new ObjectClass("Class"));
        Mockito.when(obj.getUid()).thenReturn(new Uid("id-123"));

        return delta;
    }
}
