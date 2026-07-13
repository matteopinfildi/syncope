package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.mockito.Mockito.*;

import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.ConnInstance;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.IntAttrNameParser;
import org.apache.syncope.core.provisioning.api.jexl.JexlTools;
import org.apache.syncope.core.provisioning.api.propagation.PropagationTaskExecutor;
import org.apache.syncope.core.provisioning.java.data.ResourceDataBinderImpl;
import org.junit.Test;

public class ResourceLogicITTest {

    @Test
    public void testRead_IT() {
        /*
         Obiettivo: verificare l'integrazione tra ResourceLogic e ResourceDataBinderImpl

         Oracolo: Il metodo read deve invocare correttamente il binder reale;
         l'oggetto ResourceTO di output deve contenere la chiave e il connettore corretti
        */

        AnyTypeDAO mockAnyTypeDAO = mock(AnyTypeDAO.class);
        ConnInstanceDAO mockConnInstanceDAO = mock(ConnInstanceDAO.class);
        PolicyDAO mockPolicyDAO = mock(PolicyDAO.class);
        AnyTypeClassDAO mockAnyTypeClassDAO = mock(AnyTypeClassDAO.class);
        ImplementationDAO mockImplementationDAO = mock(ImplementationDAO.class);
        PlainSchemaDAO mockPlainSchemaDAO = mock(PlainSchemaDAO.class);
        EntityFactory mockEntityFactory = mock(EntityFactory.class);
        IntAttrNameParser mockIntAttrNameParser = mock(IntAttrNameParser.class);
        PropagationTaskExecutor mockPropagationTaskExecutor = mock(PropagationTaskExecutor.class);
        JexlTools mockJexlTools = mock(JexlTools.class);

        ResourceDataBinderImpl realBinder = new ResourceDataBinderImpl(
                mockAnyTypeDAO,
                mockConnInstanceDAO,
                mockPolicyDAO,
                mockAnyTypeClassDAO,
                mockImplementationDAO,
                mockPlainSchemaDAO,
                mockEntityFactory,
                mockIntAttrNameParser,
                mockPropagationTaskExecutor,
                mockJexlTools
        );

        ExternalResourceDAO mockResourceDAO = mock(ExternalResourceDAO.class);

        ResourceLogic resourceLogic = new ResourceLogic(
                mockResourceDAO, null, null,
                realBinder,
                null, null, null, null, null
        );

        ExternalResource externalResource = mock(ExternalResource.class);
        when(externalResource.getKey()).thenReturn("Resource_DB");

        ConnInstance mockConnInstance = mock(ConnInstance.class);
        when(mockConnInstance.getKey()).thenReturn("Conn-123");
        when(externalResource.getConnector()).thenReturn(mockConnInstance);

        when(mockResourceDAO.authFind("Resource_DB")).thenReturn(externalResource);

        ResourceTO result = resourceLogic.read("Resource_DB");

        assertNotNull(result);
        assertEquals("Resource_DB", result.getKey());
        assertEquals("Conn-123", result.getConnector());
    }
}
