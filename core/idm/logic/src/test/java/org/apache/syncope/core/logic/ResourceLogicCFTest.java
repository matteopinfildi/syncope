package org.apache.syncope.core.logic;


import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicCFTest {

    @Mock
    private ExternalResourceDAO resourceDAO;
    @Mock
    private AnyTypeDAO anyTypeDAO;
    @Mock
    private ConnInstanceDAO connInstanceDAO;
    @Mock
    private ResourceDataBinder binder;
    @Mock
    private ConnInstanceDataBinder connInstanceDataBinder;
    @Mock
    private OutboundMatcher outboundMatcher;
    @Mock
    private MappingManager mappingManager;
    @Mock
    private ConnectorManager connectorManager;
    @Mock
    private AnyUtilsFactory anyUtilsFactory;

    @InjectMocks
    private ResourceLogic resourceLogic;

   @Before
    public void setUp() {
        resourceLogic = new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory) {
            @Override
            protected void securityChecks(final Set<String> effectiveRealms, final String realm, final String key) {
                // controlli di sicurezza disabilitati
            }
        };
    }

    // searchConnObjects

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC010() {
        /*
        Oracolo: impostando l'OrgUnit nullo, deve essere lanciata una NotFoundException.
        */

        String realmAnyType = SyncopeConstants.REALM_ANYTYPE;
        ExternalResource mockResource = mock(ExternalResource.class);

        doReturn(Optional.of(mockResource)).when(resourceDAO).findById("Resource_DB");
        when(mockResource.getOrgUnit()).thenReturn(null);

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB", realmAnyType, 10, null, Collections.emptyList());
    }

    @Test
    public void testRead_TC01() {
        /*
         Oracolo: se la risorsa viene trovata, il metodo deve restituire l'oggetto ResourceTO.
         */

        ExternalResource mockResource = mock(ExternalResource.class);
        ResourceTO mockResourceTO = new ResourceTO();
        mockResourceTO.setKey("Resource_DB");

        when(resourceDAO.authFind("Resource_DB")).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);

        ResourceTO result = resourceLogic.read("Resource_DB");

        assertNotNull(result);
        assertEquals("Resource_DB", result.getKey());

        verify(resourceDAO).authFind("Resource_DB");
        verify(binder).getResourceTO(mockResource);
    }

    @Test(expected = NotFoundException.class)
    public void testRead_TC02() {
        /*
        Oracolo: se la risorsa non esiste, deve essere lanciata una NotFoundException
         */

        when(resourceDAO.authFind("Resource_FANTASMA")).thenReturn(null);

        resourceLogic.read("Resource_FANTASMA");
    }
}