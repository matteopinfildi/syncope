package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.Mapping;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.common.lib.types.ClientExceptionType;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.DuplicateException;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.AnyType;
import org.apache.syncope.core.persistence.api.entity.AnyUtils;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.ConnInstance;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.apache.syncope.core.spring.security.AuthContextUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

    public class ResourceLogicLLMGTC1Test {

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
            MockitoAnnotations.openMocks(this);
        }

        // --- READ TESTS ---

        @Test
        public void testRead_Success() {
            String resourceKey = "testResource";
            ExternalResource mockResource = mock(ExternalResource.class);
            ResourceTO mockResourceTO = new ResourceTO();
            mockResourceTO.setKey(resourceKey);

            when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);

            ResourceTO result = resourceLogic.read(resourceKey);

            assertNotNull(result);
            assertEquals(resourceKey, result.getKey());
            verify(resourceDAO).authFind(resourceKey);
        }

        @Test(expected = NotFoundException.class)
        public void testRead_NotFound_ThrowsException() {
            String resourceKey = "nonExistentResource";
            when(resourceDAO.authFind(resourceKey)).thenReturn(null);

            resourceLogic.read(resourceKey);
        }

        // --- CREATE TESTS ---

        @Test
        public void testCreate_MissingKey_ThrowsException() {
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("   "); // Blank key

            try {
                resourceLogic.create(resourceTO);
            } catch (SyncopeClientException e) {
                assertEquals(ClientExceptionType.RequiredValuesMissing, e.getType());
            }
        }

        @Test(expected = DuplicateException.class)
        public void testCreate_DuplicateResource_ThrowsException() {
            String resourceKey = "existingResource";
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(resourceKey);
            resourceTO.setConnector("connKey");

            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockRealm.getFullPath()).thenReturn("/");

            when(connInstanceDAO.authFind("connKey")).thenReturn(mockConnInstance);
            when(resourceDAO.authFind(resourceKey)).thenReturn(mock(ExternalResource.class));

            try (MockedStatic<AuthContextUtils> authCtxMock = Mockito.mockStatic(AuthContextUtils.class);
                 MockedStatic<RealmUtils> realmUtilsMock = Mockito.mockStatic(RealmUtils.class)) {

                authCtxMock.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
                realmUtilsMock.when(() -> RealmUtils.getEffective(any(), anyString()))
                        .thenReturn(Set.of("/"));

                resourceLogic.create(resourceTO);
            }
        }

        @Test
        public void testCreate_Success() {
            String resourceKey = "newResource";
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(resourceKey);
            resourceTO.setConnector("connKey");

            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            ExternalResource mockResource = mock(ExternalResource.class);

            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockRealm.getFullPath()).thenReturn("/");

            when(connInstanceDAO.authFind("connKey")).thenReturn(mockConnInstance);
            when(resourceDAO.authFind(resourceKey)).thenReturn(null);
            when(binder.create(resourceTO)).thenReturn(mockResource);
            when(resourceDAO.save(mockResource)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

            try (MockedStatic<AuthContextUtils> authCtxMock = Mockito.mockStatic(AuthContextUtils.class);
                 MockedStatic<RealmUtils> realmUtilsMock = Mockito.mockStatic(RealmUtils.class)) {

                authCtxMock.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
                realmUtilsMock.when(() -> RealmUtils.getEffective(any(), anyString()))
                        .thenReturn(Set.of("/"));

                ResourceTO result = resourceLogic.create(resourceTO);

                assertNotNull(result);
                assertEquals(resourceKey, result.getKey());
                verify(resourceDAO).save(mockResource);
                verify(connectorManager).registerConnector(mockResource);
            }
        }

        // --- UPDATE TESTS ---

        @Test
        public void testUpdate_Success() {
            String resourceKey = "existingResource";
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(resourceKey);

            ExternalResource mockResource = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);

            when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
            when(mockResource.getConnector()).thenReturn(mockConnInstance);
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockRealm.getFullPath()).thenReturn("/");
            when(mockResource.getKey()).thenReturn(resourceKey);

            when(binder.update(mockResource, resourceTO)).thenReturn(mockResource);
            when(resourceDAO.save(mockResource)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

            try (MockedStatic<AuthContextUtils> authCtxMock = Mockito.mockStatic(AuthContextUtils.class);
                 MockedStatic<RealmUtils> realmUtilsMock = Mockito.mockStatic(RealmUtils.class)) {

                authCtxMock.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
                realmUtilsMock.when(() -> RealmUtils.getEffective(any(), anyString()))
                        .thenReturn(Set.of("/"));

                ResourceTO result = resourceLogic.update(resourceTO);

                assertNotNull(result);
                assertEquals(resourceKey, result.getKey());
                verify(resourceDAO).save(mockResource);
            }
        }

        @Test(expected = NotFoundException.class)
        public void testUpdate_NotFound_ThrowsException() {
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("missingResource");

            when(resourceDAO.authFind("missingResource")).thenReturn(null);

            resourceLogic.update(resourceTO);
        }

        // --- DELETE TESTS ---

        @Test
        public void testDelete_Success() {
            String resourceKey = "resourceToDelete";
            ExternalResource mockResource = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            ResourceTO mockResourceTO = new ResourceTO();
            mockResourceTO.setKey(resourceKey);

            when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
            when(mockResource.getConnector()).thenReturn(mockConnInstance);
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockRealm.getFullPath()).thenReturn("/");
            when(mockResource.getKey()).thenReturn(resourceKey);
            when(binder.getResourceTO(mockResource)).thenReturn(mockResourceTO);

            try (MockedStatic<AuthContextUtils> authCtxMock = Mockito.mockStatic(AuthContextUtils.class);
                 MockedStatic<RealmUtils> realmUtilsMock = Mockito.mockStatic(RealmUtils.class)) {

                authCtxMock.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
                realmUtilsMock.when(() -> RealmUtils.getEffective(any(), anyString()))
                        .thenReturn(Set.of("/"));

                ResourceTO result = resourceLogic.delete(resourceKey);

                assertNotNull(result);
                assertEquals(resourceKey, result.getKey());

                verify(connectorManager).unregisterConnector(mockResource);
                verify(resourceDAO).deleteById(resourceKey);
            }
        }

        @Test(expected = NotFoundException.class)
        public void testDelete_NotFound_ThrowsException() {
            String resourceKey = "nonExistentResource";
            when(resourceDAO.authFind(resourceKey)).thenReturn(null);

            resourceLogic.delete(resourceKey);
        }

        // --- LIST TESTS ---

        @Test
        public void testList_Success() {
            ExternalResource mockResource1 = mock(ExternalResource.class);
            ExternalResource mockResource2 = mock(ExternalResource.class);

            ResourceTO mockTO1 = new ResourceTO();
            mockTO1.setKey("res1");
            ResourceTO mockTO2 = new ResourceTO();
            mockTO2.setKey("res2");

            doReturn(List.of(mockResource1, mockResource2)).when(resourceDAO).findAll();
            when(binder.getResourceTO(mockResource1)).thenReturn(mockTO1);
            when(binder.getResourceTO(mockResource2)).thenReturn(mockTO2);

            List<ResourceTO> results = resourceLogic.list();

            assertNotNull(results);
            assertEquals(2, results.size());
            assertTrue(results.contains(mockTO1));
            assertTrue(results.contains(mockTO2));
        }

        // --- CHECK TESTS ---

        @Test
        public void testCheck_Success() {
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setConnector("connKey");

            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Connector mockConnector = mock(Connector.class);

            doReturn(Optional.of(mockConnInstance)).when(connInstanceDAO).findById("connKey");
            when(connectorManager.buildConnInstanceOverride(any(), any(), any())).thenReturn(mockConnInstance);
            when(connectorManager.createConnector(mockConnInstance)).thenReturn(mockConnector);

            resourceLogic.check(resourceTO);

            verify(connectorManager).createConnector(mockConnInstance);
            verify(mockConnector).test();
        }

        // --- READ CONN OBJECT TESTS ---

        @Test(expected = NotFoundException.class)
        public void testReadConnObjectByAnyKey_AnyNotFound_ThrowsException() {
            String resourceKey = "resKey";
            String anyTypeKey = "USER";
            String anyKey = "invalidUserId";

            AnyType mockAnyType = mock(AnyType.class);
            doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
            when(mockAnyType.getKey()).thenReturn(anyTypeKey);
            when(mockAnyType.getKind()).thenReturn(org.apache.syncope.common.lib.types.AnyTypeKind.USER);

            ExternalResource mockResource = mock(ExternalResource.class);
            when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);

            Provision mockProvision =
                    mock(Provision.class);
            when(mockResource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.of(mockProvision));
            when(mockProvision.getMapping()).thenReturn(mock(Mapping.class));

            AnyUtils mockAnyUtils = mock(AnyUtils.class);
            AnyDAO mockAnyDAO = mock(AnyDAO.class);

            when(anyUtilsFactory.getInstance(any(org.apache.syncope.common.lib.types.AnyTypeKind.class)))
                    .thenReturn(mockAnyUtils);
            when(mockAnyUtils.dao()).thenReturn(mockAnyDAO);
            when(mockAnyDAO.authFind(anyKey)).thenReturn(null);

            resourceLogic.readConnObjectByAnyKey(resourceKey, anyTypeKey, anyKey);
        }
    }
