package org.apache.syncope.core.logic;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.*;

import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.common.lib.types.ClientExceptionType;
import org.apache.syncope.common.lib.types.IdMEntitlement;
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
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.apache.syncope.core.spring.security.AuthContextUtils;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncToken;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

    @RunWith(MockitoJUnitRunner.class)
    public class ResourceLogicLLMGTTest {

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

        private MockedStatic<AuthContextUtils> authContextUtilsMockedStatic;
        private MockedStatic<RealmUtils> realmUtilsMockedStatic;
        private MockedStatic<SyncopeClientException> syncopeClientExceptionMockedStatic;

        private final String VALID_KEY = "testResource";
        private final String VALID_REALM = "/test/realm";

        @Before
        public void setUp() {
            // Setup static mocks for security contexts
            authContextUtilsMockedStatic = mockStatic(AuthContextUtils.class);
            authContextUtilsMockedStatic.when(AuthContextUtils::getAuthorizations)
                    .thenReturn(Map.of(IdMEntitlement.RESOURCE_CREATE, Set.of(VALID_REALM),
                            IdMEntitlement.RESOURCE_UPDATE, Set.of(VALID_REALM),
                            IdMEntitlement.RESOURCE_DELETE, Set.of(VALID_REALM)));

            realmUtilsMockedStatic = mockStatic(RealmUtils.class);
            realmUtilsMockedStatic.when(() -> RealmUtils.getEffective(anySet(), anyString()))
                    .thenReturn(Set.of(VALID_REALM));

            syncopeClientExceptionMockedStatic = mockStatic(SyncopeClientException.class);
        }

        @After
        public void tearDown() {
            authContextUtilsMockedStatic.close();
            realmUtilsMockedStatic.close();
            syncopeClientExceptionMockedStatic.close();
        }

        @Test
        public void testCreate_Success() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(VALID_KEY);
            resourceTO.setConnector("validConnector");

            ConnInstance connInstance = mock(ConnInstance.class);
            Realm realm = mock(Realm.class);
            when(realm.getFullPath()).thenReturn(VALID_REALM);
            when(connInstance.getAdminRealm()).thenReturn(realm);
            when(connInstanceDAO.authFind("validConnector")).thenReturn(connInstance);

            when(resourceDAO.authFind(VALID_KEY)).thenReturn(null); // No duplicate

            ExternalResource externalResource = mock(ExternalResource.class);
            when(binder.create(resourceTO)).thenReturn(externalResource);
            when(resourceDAO.save(externalResource)).thenReturn(externalResource);
            when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

            // Act
            ResourceTO result = resourceLogic.create(resourceTO);

            // Assert
            assertNotNull(result);
            assertEquals(VALID_KEY, result.getKey());
            verify(resourceDAO).save(externalResource);
            verify(connectorManager).registerConnector(externalResource);
        }

        @Test(expected = SyncopeClientException.class)
        public void testCreate_BlankKey_ThrowsException() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("   "); // Blank key

            SyncopeClientException exception = mock(SyncopeClientException.class);

//            when(exception.getElements()).thenReturn(new java.util.ArrayList<>()); // errore risolto con la riga sotto
            when(exception.getElements()).thenReturn(new HashSet<>());

            syncopeClientExceptionMockedStatic.when(() -> SyncopeClientException.build(ClientExceptionType.RequiredValuesMissing))
                    .thenReturn(exception);

            // Act
            resourceLogic.create(resourceTO);
        }

        @Test(expected = DuplicateException.class)
        public void testCreate_DuplicateResource_ThrowsException() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(VALID_KEY);
            resourceTO.setConnector("validConnector");

            ConnInstance connInstance = mock(ConnInstance.class);
            Realm realm = mock(Realm.class);
            when(realm.getFullPath()).thenReturn(VALID_REALM);
            when(connInstance.getAdminRealm()).thenReturn(realm);
            when(connInstanceDAO.authFind("validConnector")).thenReturn(connInstance);

            // Simulate duplicate existing in DB
            ExternalResource existingResource = mock(ExternalResource.class);
            when(resourceDAO.authFind(VALID_KEY)).thenReturn(existingResource);

            // Act
            resourceLogic.create(resourceTO);
        }

        @Test
        public void testRead_Success() {
            // Arrange
            ExternalResource resource = mock(ExternalResource.class);
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(VALID_KEY);

            when(resourceDAO.authFind(VALID_KEY)).thenReturn(resource);
            when(binder.getResourceTO(resource)).thenReturn(resourceTO);

            // Act
            ResourceTO result = resourceLogic.read(VALID_KEY);

            // Assert
            assertNotNull(result);
            assertEquals(VALID_KEY, result.getKey());
        }

        @Test(expected = NotFoundException.class)
        public void testRead_NotFound_ThrowsException() {
            // Arrange
            when(resourceDAO.authFind(VALID_KEY)).thenReturn(null);

            // Act
            resourceLogic.read(VALID_KEY);
        }

        @Test
        public void testDelete_Success() {
            // Arrange
            ExternalResource resource = mock(ExternalResource.class);
            ConnInstance connInstance = mock(ConnInstance.class);
            Realm realm = mock(Realm.class);

            when(realm.getFullPath()).thenReturn(VALID_REALM);
            when(connInstance.getAdminRealm()).thenReturn(realm);
            when(resource.getConnector()).thenReturn(connInstance);
            when(resource.getKey()).thenReturn(VALID_KEY);
            when(resourceDAO.authFind(VALID_KEY)).thenReturn(resource);

            ResourceTO deletedTO = new ResourceTO();
            deletedTO.setKey(VALID_KEY);
            when(binder.getResourceTO(resource)).thenReturn(deletedTO);

            // Act
            ResourceTO result = resourceLogic.delete(VALID_KEY);

            // Assert
            assertNotNull(result);
            assertEquals(VALID_KEY, result.getKey());
            verify(connectorManager).unregisterConnector(resource);
            verify(resourceDAO).deleteById(VALID_KEY);
        }

        @Test
        public void testSetLatestSyncToken_RealmAnyType_Success() {
            // Arrange
            ExternalResource resource = mock(ExternalResource.class);
            ConnInstance connInstance = mock(ConnInstance.class);
            Realm realm = mock(Realm.class);
            OrgUnit orgUnit = mock(OrgUnit.class);
            Connector connector = mock(Connector.class);
            SyncToken token = mock(SyncToken.class);

            when(realm.getFullPath()).thenReturn(VALID_REALM);
            when(connInstance.getAdminRealm()).thenReturn(realm);
            when(resource.getConnector()).thenReturn(connInstance);
            when(resource.getKey()).thenReturn(VALID_KEY);
            when(resource.getOrgUnit()).thenReturn(orgUnit);

            when(resourceDAO.authFind(VALID_KEY)).thenReturn(resource);
            when(connectorManager.getConnector(resource)).thenReturn(connector);
            when(orgUnit.getObjectClass()).thenReturn("realmClass");
            when(connector.getLatestSyncToken(any(ObjectClass.class))).thenReturn(token);

            // Act
            resourceLogic.setLatestSyncToken(VALID_KEY, SyncopeConstants.REALM_ANYTYPE);

            // Assert
            verify(orgUnit).setSyncToken(anyString());
            verify(resourceDAO).save(resource); // via doSave
        }

        @Test(expected = NotFoundException.class)
        public void testSetLatestSyncToken_RealmAnyType_NoOrgUnit_ThrowsException() {
            // Arrange
            ExternalResource resource = mock(ExternalResource.class);
            Connector connector = mock(Connector.class);

            when(resourceDAO.authFind(VALID_KEY)).thenReturn(resource);
            when(connectorManager.getConnector(resource)).thenReturn(connector);
            when(resource.getOrgUnit()).thenReturn(null); // Missing OrgUnit

            // Act
            resourceLogic.setLatestSyncToken(VALID_KEY, SyncopeConstants.REALM_ANYTYPE);
        }

        @Test
        public void testUpdate_Success() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey(VALID_KEY);

            ExternalResource resource = mock(ExternalResource.class);
            ConnInstance connInstance = mock(ConnInstance.class);
            Realm realm = mock(Realm.class);

            when(realm.getFullPath()).thenReturn(VALID_REALM);
            when(connInstance.getAdminRealm()).thenReturn(realm);
            when(resource.getConnector()).thenReturn(connInstance);
            when(resourceDAO.authFind(VALID_KEY)).thenReturn(resource);
            when(binder.update(eq(resource), any())).thenReturn(resource);
            when(binder.getResourceTO(resource)).thenReturn(resourceTO);
            when(resourceDAO.save(resource)).thenReturn(resource);

            // Act
            ResourceTO result = resourceLogic.update(resourceTO);

            // Assert
            assertNotNull(result);
            verify(resourceDAO).save(resource);
        }

        @Test(expected = NotFoundException.class)
        public void testUpdate_NotFound_ThrowsException() {
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setKey("nonExistent");
            when(resourceDAO.authFind("nonExistent")).thenReturn(null);

            resourceLogic.update(resourceTO);
        }

        @Test
        public void testRemoveSyncToken_Realm_Success() {
            // Arrange
            ExternalResource resource = mock(ExternalResource.class);
            ConnInstance connInstance = mock(ConnInstance.class);
            Realm realm = mock(Realm.class);
            OrgUnit orgUnit = mock(OrgUnit.class);

            when(realm.getFullPath()).thenReturn(VALID_REALM);
            when(connInstance.getAdminRealm()).thenReturn(realm);
            when(resource.getConnector()).thenReturn(connInstance);
            when(resourceDAO.authFind(VALID_KEY)).thenReturn(resource);
            when(resource.getOrgUnit()).thenReturn(orgUnit);

            // Act
            resourceLogic.removeSyncToken(VALID_KEY, SyncopeConstants.REALM_ANYTYPE);

            // Assert
            verify(orgUnit).setSyncToken(null);
            verify(resourceDAO).save(resource);
        }

        @Test
        public void testList_Success() {
            // Arrange
            ExternalResource resource = mock(ExternalResource.class);
            // ho aggiunto queste due righe
            List<ExternalResource> list = new ArrayList<>();
            list.add(resource);

            doReturn(list).when(resourceDAO).findAll();
            when(binder.getResourceTO(resource)).thenReturn(new ResourceTO());

            // Act
            java.util.List<ResourceTO> results = resourceLogic.list();

            // Assert
            assertEquals(1, results.size());
            verify(resourceDAO).findAll();
        }

        @Test
        public void testCheck_Success() {
            // Arrange
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setConnector("connKey");
            ConnInstance connInstance = mock(ConnInstance.class);
            Connector connector = mock(Connector.class);

            doReturn(Optional.of(connInstance)).when(connInstanceDAO).findById("connKey");

            // ho aggiunto questo
            when(connectorManager.buildConnInstanceOverride(any(), any(), any()))
                    .thenReturn(connInstance);

            when(connectorManager.createConnector(any(ConnInstance.class)))
                    .thenReturn(connector);

            // Act
            resourceLogic.check(resourceTO);

            // Assert
            verify(connector).test();
        }



        @Test(expected = NotFoundException.class)
        public void testCheck_ConnectorNotFound_ThrowsException() {
            ResourceTO resourceTO = new ResourceTO();
            resourceTO.setConnector("missing");
            when(connInstanceDAO.findById("missing")).thenReturn(Optional.empty());

            resourceLogic.check(resourceTO);
        }
    }
