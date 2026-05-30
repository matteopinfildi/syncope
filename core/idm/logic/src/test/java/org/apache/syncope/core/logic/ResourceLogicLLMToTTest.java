package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.DuplicateException;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicLLMToTTest {

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

    // Utilizziamo un'estensione per bypassare i metodi di sicurezza statici che richiederebbero PowerMock
    private ResourceLogic resourceLogic;

    @Before
    public void setUp() {
        resourceLogic = new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory) {
            @Override
            protected void securityChecks(final java.util.Set<String> effectiveRealms, final String realm, final String key) {
                // Bypass security checks for standard JUnit testing
            }
        };
    }

    // --- Metodo: create ---

    @Test(expected = SyncopeClientException.class)
    public void testCreateBlankKeyThrowsException() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("");
        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreateInvalidConnectorThrowsException() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("resource1");
        resourceTO.setConnector("invalidConn");

        when(connInstanceDAO.authFind("invalidConn")).thenReturn(null);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = DuplicateException.class)
    public void testCreateDuplicateResourceThrowsException() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("existingResource");
        resourceTO.setConnector("validConn");

        ConnInstance mockConn = mock(ConnInstance.class);
        when(connInstanceDAO.authFind("validConn")).thenReturn(mockConn);
        //when(mockConn.getAdminRealm()).thenReturn(mock(org.apache.syncope.core.persistence.api.entity.Realm.class)); // riga tolta perche dava errore
        Realm mockRealm = mock(Realm.class); // riga aggiunta per risolvere errore
        when(mockRealm.getFullPath()).thenReturn("/"); // riga aggiunta per risolvere errore
        when(mockConn.getAdminRealm()).thenReturn(mockRealm); // riga aggiunta per risolvere errore
        when(resourceDAO.authFind("existingResource")).thenReturn(mock(ExternalResource.class));

        resourceLogic.create(resourceTO);
    }

    // --- Metodo: update ---

    @Test(expected = NotFoundException.class)
    public void testUpdateResourceNotFound() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("missingResource");

        when(resourceDAO.authFind("missingResource")).thenReturn(null);

        resourceLogic.update(resourceTO);
    }

    @Test
    public void testUpdateSuccess() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("validResource");

        ExternalResource mockResource = mock(ExternalResource.class);
        ConnInstance mockConn = mock(ConnInstance.class);

        when(resourceDAO.authFind("validResource")).thenReturn(mockResource);
        when(mockResource.getConnector()).thenReturn(mockConn);
//        when(mockConn.getAdminRealm()).thenReturn(mock(org.apache.syncope.core.persistence.api.entity.Realm.class)); // dava errore
        Realm mockRealm = mock(Realm.class); // riga aggiunta per risolvere errore
        when(mockRealm.getFullPath()).thenReturn("/"); // riga aggiunta per risolvere errore
        when(mockConn.getAdminRealm()).thenReturn(mockRealm); // riga aggiunta per risolvere errore
        when(binder.update(mockResource, resourceTO)).thenReturn(mockResource);
        when(resourceDAO.save(mockResource)).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.update(resourceTO);
        assertEquals("validResource", result.getKey());
    }

    // --- Metodo: read ---

    @Test(expected = NotFoundException.class)
    public void testReadNotFound() {
        when(resourceDAO.authFind("missing")).thenReturn(null);
        resourceLogic.read("missing");
    }

    @Test
    public void testReadSuccess() {
        ExternalResource mockResource = mock(ExternalResource.class);
        ResourceTO mockResourceTO = new ResourceTO();
        mockResourceTO.setKey("found");

        when(resourceDAO.authFind("found")).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);

        ResourceTO result = resourceLogic.read("found");
        assertNotNull(result);
        assertEquals("found", result.getKey());
    }

    // --- Metodo: delete ---

    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() {
        when(resourceDAO.authFind("missing")).thenReturn(null);
        resourceLogic.delete("missing");
    }

    @Test
    public void testDeleteSuccess() {
        ExternalResource mockResource = mock(ExternalResource.class);
        ConnInstance mockConn = mock(ConnInstance.class);
        ResourceTO mockResourceTO = new ResourceTO();

        when(resourceDAO.authFind("toDelete")).thenReturn(mockResource);
        when(mockResource.getConnector()).thenReturn(mockConn);
//        when(mockConn.getAdminRealm()).thenReturn(mock(org.apache.syncope.core.persistence.api.entity.Realm.class)); // dava errore
        Realm mockRealm = mock(Realm.class); // riga aggiunta per risolvere errore
        when(mockRealm.getFullPath()).thenReturn("/"); // riga aggiunta per risolvere errore
        when(mockConn.getAdminRealm()).thenReturn(mockRealm); // riga aggiunta per risolvere errore
        when(mockResource.getKey()).thenReturn("toDelete");
        when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);
        doNothing().when(connectorManager).unregisterConnector(mockResource);

        ResourceTO result = resourceLogic.delete("toDelete");

        assertNotNull(result);
        verify(resourceDAO).deleteById("toDelete");
    }

    // --- Metodo: list ---

    @Test
    public void testListEmpty() {
        when(resourceDAO.findAll()).thenReturn(Collections.emptyList());
        List<ResourceTO> results = resourceLogic.list();
        assertTrue(results.isEmpty());
    }

    @Test
    public void testListSuccess() {
        ExternalResource mockResource = mock(ExternalResource.class);
        doReturn(Collections.singletonList(mockResource)).when(resourceDAO).findAll();
        when(binder.getResourceTO(mockResource)).thenReturn(new ResourceTO());

        List<ResourceTO> results = resourceLogic.list();
        assertEquals(1, results.size());
    }

    // --- Metodo: setLatestSyncToken ---

    @Test(expected = NotFoundException.class)
    public void testSetLatestSyncTokenResourceNotFound() {
        when(resourceDAO.authFind("missing")).thenReturn(null);
        resourceLogic.setLatestSyncToken("missing", "anyType");
    }

    @Test(expected = NotFoundException.class)
    public void testSetLatestSyncTokenAnyTypeNotFound() {
        ExternalResource mockResource = mock(ExternalResource.class);
        when(resourceDAO.authFind("res")).thenReturn(mockResource);
        when(anyTypeDAO.findById("missingType")).thenReturn(Optional.empty());

        resourceLogic.setLatestSyncToken("res", "missingType");
    }

    // --- Metodo: removeSyncToken ---

    @Test(expected = NotFoundException.class)
    public void testRemoveSyncTokenRealmProvisionNotEnabled() {
        ExternalResource mockResource = mock(ExternalResource.class);
        when(resourceDAO.authFind("res")).thenReturn(mockResource);
        when(mockResource.getOrgUnit()).thenReturn(null);

        resourceLogic.removeSyncToken("res", "REALM"); // "REALM" is SyncopeConstants.REALM_ANYTYPE in context
    }

    // --- Metodo: check ---

    @Test(expected = NotFoundException.class)
    public void testCheckConnInstanceNotFound() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setConnector("missingConn");
        when(connInstanceDAO.findById("missingConn")).thenReturn(Optional.empty());

        resourceLogic.check(resourceTO);
    }
}