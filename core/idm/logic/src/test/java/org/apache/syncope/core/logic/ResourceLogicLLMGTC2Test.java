package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.DuplicateException;
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
import org.apache.syncope.core.spring.security.DelegatedAdministrationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

    @RunWith(MockitoJUnitRunner.class)
    public class ResourceLogicLLMGTC2Test {

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

        private MockedStatic<AuthContextUtils> mockedAuthContext;
        private MockedStatic<RealmUtils> mockedRealmUtils;

        @Before
        public void setUp() {
            // Mock static security context utility calls
            mockedAuthContext = mockStatic(AuthContextUtils.class);
            mockedAuthContext.when(AuthContextUtils::getAuthorizations)
                    .thenReturn(Map.of("RESOURCE_CREATE", Set.of("/"),
                            "RESOURCE_READ", Set.of("/"),
                            "RESOURCE_DELETE", Set.of("/")));

            mockedRealmUtils = mockStatic(RealmUtils.class);
            mockedRealmUtils.when(() -> RealmUtils.getEffective(any(), anyString()))
                    .thenReturn(Set.of("/"));
        }

        @After
        public void tearDown() {
            mockedAuthContext.close();
            mockedRealmUtils.close();
        }

        @Test
        public void testCreateSuccess() {
            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey("TestResource");
            inputTO.setConnector("TestConnector");

            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            when(mockRealm.getFullPath()).thenReturn("/");
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);

            ExternalResource mockResource = mock(ExternalResource.class);

            when(connInstanceDAO.authFind("TestConnector")).thenReturn(mockConnInstance);
            when(resourceDAO.authFind("TestResource")).thenReturn(null); // No duplicate
            when(binder.create(inputTO)).thenReturn(mockResource);
            when(resourceDAO.save(mockResource)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(inputTO);

            ResourceTO result = resourceLogic.create(inputTO);

            assertNotNull(result);
            assertEquals("TestResource", result.getKey());
            verify(connectorManager).registerConnector(mockResource);
            verify(resourceDAO).save(mockResource);
        }

        @Test
        public void testCreateFailsWhenKeyIsBlank() {
            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey("   "); // Blank key

            SyncopeClientException exception = assertThrows(SyncopeClientException.class, () -> {
                resourceLogic.create(inputTO);
            });

            assertEquals("RequiredValuesMissing", exception.getType().name());
            verify(connInstanceDAO, never()).authFind(anyString());
        }

        @Test
        public void testCreateFailsOnInvalidConnector() {
            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey("TestResource");
            inputTO.setConnector("InvalidConnector");

            when(connInstanceDAO.authFind("InvalidConnector")).thenReturn(null);

            SyncopeClientException exception = assertThrows(SyncopeClientException.class, () -> {
                resourceLogic.create(inputTO);
            });

            assertEquals("InvalidExternalResource", exception.getType().name());
        }

        @Test
        public void testCreateFailsOnDuplicateResource() {
            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey("ExistingResource");
            inputTO.setConnector("TestConnector");

            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            when(mockRealm.getFullPath()).thenReturn("/");
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);

            when(connInstanceDAO.authFind("TestConnector")).thenReturn(mockConnInstance);
            // Simulate duplicate
            when(resourceDAO.authFind("ExistingResource")).thenReturn(mock(ExternalResource.class));

            assertThrows(DuplicateException.class, () -> {
                resourceLogic.create(inputTO);
            });
        }

        @Test
        public void testReadSuccess() {
            ExternalResource mockResource = mock(ExternalResource.class);
            ResourceTO mockTO = new ResourceTO();
            mockTO.setKey("TestResource");

            when(resourceDAO.authFind("TestResource")).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(mockTO);

            ResourceTO result = resourceLogic.read("TestResource");

            assertNotNull(result);
            assertEquals("TestResource", result.getKey());
        }

        @Test
        public void testReadThrowsNotFound() {
            when(resourceDAO.authFind("MissingResource")).thenReturn(null);

            assertThrows(NotFoundException.class, () -> {
                resourceLogic.read("MissingResource");
            });
        }

        @Test
        public void testDeleteSuccess() {
            ExternalResource mockResource = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            ResourceTO mockTO = new ResourceTO();
            mockTO.setKey("TestResource");

            when(mockResource.getKey()).thenReturn("TestResource");
            when(mockResource.getConnector()).thenReturn(mockConnInstance);
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockRealm.getFullPath()).thenReturn("/");

            when(resourceDAO.authFind("TestResource")).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(mockTO);

            ResourceTO result = resourceLogic.delete("TestResource");

            assertNotNull(result);
            assertEquals("TestResource", result.getKey());
            verify(connectorManager).unregisterConnector(mockResource);
            verify(resourceDAO).deleteById("TestResource");
        }

        @Test
        public void testSecurityChecksThrowsDelegatedAdministrationException() {
            // Explicitly override the MockedStatic for this test to return an empty set
            mockedRealmUtils.when(() -> RealmUtils.getEffective(any(), anyString()))
                    .thenReturn(Collections.emptySet());

            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey("TestResource");
            inputTO.setConnector("TestConnector");

            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            when(mockRealm.getFullPath()).thenReturn("/unauthorized");
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);

            when(connInstanceDAO.authFind("TestConnector")).thenReturn(mockConnInstance);

            assertThrows(DelegatedAdministrationException.class, () -> {
                resourceLogic.create(inputTO);
            });
        }

        @Test
        public void testUpdateSuccess() {
            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey("ExistingResource");

            ExternalResource mockResource = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);

            when(mockResource.getKey()).thenReturn("ExistingResource");
            when(mockResource.getConnector()).thenReturn(mockConnInstance);
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockRealm.getFullPath()).thenReturn("/");

            when(resourceDAO.authFind("ExistingResource")).thenReturn(mockResource);
            when(binder.update(mockResource, inputTO)).thenReturn(mockResource);
            when(resourceDAO.save(mockResource)).thenReturn(mockResource);
            when(binder.getResourceTO(mockResource)).thenReturn(inputTO);

            ResourceTO result = resourceLogic.update(inputTO);

            assertNotNull(result);
            assertEquals("ExistingResource", result.getKey());
            verify(resourceDAO).save(mockResource);
        }

        @Test
        public void testUpdateThrowsNotFound() {
            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey("MissingResource");

            when(resourceDAO.authFind("MissingResource")).thenReturn(null);

            NotFoundException exception = assertThrows(NotFoundException.class, () -> {
                resourceLogic.update(inputTO);
            });

            assertEquals("Resource 'MissingResource'", exception.getMessage());
        }

        @Test
        public void testSetLatestSyncTokenForRealm() {
            String resourceKey = "TestResource";
            String anyTypeKey = org.apache.syncope.common.lib.SyncopeConstants.REALM_ANYTYPE;

            ExternalResource mockResource = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);
            OrgUnit mockOrgUnit = mock(OrgUnit.class);
            org.apache.syncope.core.provisioning.api.Connector mockConnector =
                    mock(org.apache.syncope.core.provisioning.api.Connector.class);
            org.identityconnectors.framework.common.objects.SyncToken mockToken =
                    new org.identityconnectors.framework.common.objects.SyncToken("mockToken123");

            when(mockResource.getKey()).thenReturn(resourceKey);
            when(mockResource.getConnector()).thenReturn(mockConnInstance);
            when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
            when(mockOrgUnit.getObjectClass()).thenReturn("__REALM__");
            when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
            when(mockRealm.getFullPath()).thenReturn("/");

            when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
            when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);
            when(mockConnector.getLatestSyncToken(any(org.identityconnectors.framework.common.objects.ObjectClass.class)))
                    .thenReturn(mockToken);

            resourceLogic.setLatestSyncToken(resourceKey, anyTypeKey);

            // CORREZIONE: Aggiornato per riflettere la serializzazione JSON applicata da ConnObjectUtils.toString()
            verify(mockOrgUnit).setSyncToken("{\"type\":\"String\",\"value\":\"mockToken123\"}");
            verify(resourceDAO).save(mockResource);
        }

        @Test
        public void testList() {
            ExternalResource resource1 = mock(ExternalResource.class);
            ExternalResource resource2 = mock(ExternalResource.class);

            ResourceTO to1 = new ResourceTO();
            to1.setKey("Res1");
            ResourceTO to2 = new ResourceTO();
            to2.setKey("Res2");

            doReturn(List.of(resource1, resource2)).when(resourceDAO).findAll();

            when(binder.getResourceTO(resource1)).thenReturn(to1);
            when(binder.getResourceTO(resource2)).thenReturn(to2);

            java.util.List<ResourceTO> result = resourceLogic.list();

            assertNotNull(result);
            assertEquals(2, result.size());
            assertEquals("Res1", result.get(0).getKey());
            assertEquals("Res2", result.get(1).getKey());
        }
    }
