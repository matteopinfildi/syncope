package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.mockito.Mockito;

public class RandoopHelperLogic {

    public static ResourceLogic getHelperResourceLogicRandoop() {
        ExternalResourceDAO resourceDAO = Mockito.mock(ExternalResourceDAO.class);
        AnyTypeDAO anyTypeDAO = Mockito.mock(AnyTypeDAO.class);
        ConnInstanceDAO connInstanceDAO = Mockito.mock(ConnInstanceDAO.class);
        ResourceDataBinder binder = Mockito.mock(ResourceDataBinder.class);
        ConnInstanceDataBinder connInstanceDataBinder = Mockito.mock(ConnInstanceDataBinder.class);
        OutboundMatcher outboundMatcher = Mockito.mock(OutboundMatcher.class);
        MappingManager mappingManager = Mockito.mock(MappingManager.class);
        ConnectorManager connectorManager = Mockito.mock(ConnectorManager.class);
        AnyUtilsFactory anyUtilsFactory = Mockito.mock(AnyUtilsFactory.class);

        return new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory);
    }

    public static ResourceTO getValidResourceTO() {
        ResourceTO to = new ResourceTO();
        to.setKey("Resource_DB");
        to.setConnector("Conn-123");
        return to;
    }
}
