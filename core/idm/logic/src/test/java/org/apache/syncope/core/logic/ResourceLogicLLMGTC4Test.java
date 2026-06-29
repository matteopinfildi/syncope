package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.ConnInstance;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.apache.syncope.core.spring.security.AuthContextUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

    @RunWith(MockitoJUnitRunner.class)
    public class ResourceLogicLLMGTC4Test {

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

        private MockedStatic<AuthContextUtils> mockedAuthContextUtils;
        private MockedStatic<RealmUtils> mockedRealmUtils;

        @Before
        public void setUp() {
            // Mock static Spring Security context utilized by checkAuth()
            mockedAuthContextUtils = mockStatic(AuthContextUtils.class);
            mockedAuthContextUtils.when(AuthContextUtils::getAuthorizations)
                    .thenReturn(Map.of("RESOURCE_CREATE", Set.of("/"), "RESOURCE_DELETE", Set.of("/")));

            mockedRealmUtils = mockStatic(RealmUtils.class);
            mockedRealmUtils.when(() -> RealmUtils.getEffective(any(), anyString()))
                    .thenReturn(Set.of("/"));
        }

        @After
        public void tearDown() {
            mockedAuthContextUtils.close();
            mockedRealmUtils.close();
        }

        @Test(expected = SyncopeClientException.class)
        public void testCreate_MissingKey_ThrowsException() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(null); // Explicitly blank/null key

            // Act
            resourceLogic.create(resourceTO);

            // Assert: Expected SyncopeClientException
        }

        @Test(expected = SyncopeClientException.class)
        public void testCreate_InvalidConnector_ThrowsException() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("ValidKey");
            resourceTO.setConnector("InvalidConnRef");

            when(connInstanceDAO.authFind("InvalidConnRef")).thenReturn(null);

            // Act
            resourceLogic.create(resourceTO);

            // Assert: Expected SyncopeClientException for InvalidExternalResource
        }

        @Test
        public void testRead_ValidKey_ReturnsResourceTO() {
            // Arrange
            String resourceKey = "TestResource";
            ExternalResource mockResource = mock(ExternalResource.class);
            ResourceTO mockResourceTO = new ResourceTO();
            mockResourceTO.setKey(resourceKey);

            when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);

            // Act
            ResourceTO result = resourceLogic.read(resourceKey);

            // Assert
            assertNotNull(result);
            assertEquals(resourceKey, result.getKey());
            verify(resourceDAO).authFind(resourceKey);
            verify(binder).getResourceTO(mockResource);
        }

        @Test(expected = NotFoundException.class)
        public void testRead_InvalidKey_ThrowsNotFoundException() {
            // Arrange
            String invalidKey = "NonExistentResource";
            when(resourceDAO.authFind(invalidKey)).thenReturn(null);

            // Act
            resourceLogic.read(invalidKey);

            // Assert: Expected NotFoundException
        }

        @Test
        public void testDelete_ValidKey_Success() {
            // Arrange
            String resourceKey = "ResourceToDelete";
            ExternalResource mockResource = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            ResourceTO mockResourceTO = new ResourceTO();
            mockResourceTO.setKey(resourceKey);

            when(mockRealm.getFullPath()).thenReturn("/");
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockResource.getConnector()).thenReturn(mockConnInstance);
            when(mockResource.getKey()).thenReturn(resourceKey);

            when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);
            doNothing().when(connectorManager).unregisterConnector(mockResource);
            doNothing().when(resourceDAO).deleteById(resourceKey);

            // Act
            ResourceTO result = resourceLogic.delete(resourceKey);

            // Assert
            assertNotNull(result);
            assertEquals(resourceKey, result.getKey());
            verify(connectorManager).unregisterConnector(mockResource);
            verify(resourceDAO).deleteById(resourceKey);
        }
        @Test
        public void testCreate_ValidResource_Success() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("NewResource");
            resourceTO.setConnector("Conn123");

            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);

            // Setup per i controlli di sicurezza (checkAuth)
            when(mockRealm.getFullPath()).thenReturn("/");
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);

            when(connInstanceDAO.authFind("Conn123")).thenReturn(mockConnInstance);
            when(resourceDAO.authFind("NewResource")).thenReturn(null); // Nessun duplicato presente

            ExternalResource mockResource = mock(ExternalResource.class);
            when(binder.create(resourceTO)).thenReturn(mockResource);
            when(resourceDAO.save(mockResource)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

            // Act
            ResourceTO result = resourceLogic.create(resourceTO);

            // Assert
            assertNotNull(result);
            assertEquals("NewResource", result.getKey());
            // doSave() invoca anche il registerConnector
            verify(connectorManager).registerConnector(mockResource);
        }

        @Test
        public void testUpdate_ValidResource_Success() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("ExistingResource");

            ExternalResource mockResource = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);

            // Setup mock resource e security
            when(mockRealm.getFullPath()).thenReturn("/");
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockResource.getConnector()).thenReturn(mockConnInstance);
            when(mockResource.getKey()).thenReturn("ExistingResource");

            when(resourceDAO.authFind("ExistingResource")).thenReturn(mockResource);
            when(binder.update(mockResource, resourceTO)).thenReturn(mockResource);
            when(resourceDAO.save(mockResource)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

            // Act
            ResourceTO result = resourceLogic.update(resourceTO);

            // Assert
            assertNotNull(result);
            assertEquals("ExistingResource", result.getKey());
            verify(connectorManager).registerConnector(mockResource);
        }

        @Test(expected = NotFoundException.class)
        public void testUpdate_InvalidKey_ThrowsNotFoundException() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("InvalidKey");

            when(resourceDAO.authFind("InvalidKey")).thenReturn(null);

            // Act
            resourceLogic.update(resourceTO);

            // Assert: Expected NotFoundException
        }

        @Test(expected = NotFoundException.class)
        public void testDelete_InvalidKey_ThrowsNotFoundException() {
            // Arrange
            String invalidKey = "InvalidKey";
            when(resourceDAO.authFind(invalidKey)).thenReturn(null);

            // Act
            resourceLogic.delete(invalidKey);

            // Assert: Expected NotFoundException
        }

        @Test
        public void testList_ReturnsListOfResources() {
            // Arrange
            ExternalResource mockResource = mock(ExternalResource.class);
            ResourceTO mockResourceTO = new ResourceTO();
            mockResourceTO.setKey("Resource1");

            doReturn(Collections.singletonList(mockResource)).when(resourceDAO).findAll();
            when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);

            // Act
            List<ResourceTO> results = resourceLogic.list();

            // Assert
            assertNotNull(results);
            assertEquals(1, results.size());
            assertEquals("Resource1", results.get(0).getKey());
            verify(resourceDAO).findAll();
        }

        @Test(expected = NotFoundException.class)
        public void testSetLatestSyncToken_InvalidResourceKey_ThrowsNotFoundException() {
            // Arrange
            String invalidResourceKey = "MissingResource";
            String anyTypeKey = "AnyType";

            when(resourceDAO.authFind(invalidResourceKey)).thenReturn(null);

            // Act
            resourceLogic.setLatestSyncToken(invalidResourceKey, anyTypeKey);

            // Assert: Expected NotFoundException
        }
    }
