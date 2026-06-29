package org.apache.syncope.core.logic;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.ResourceTO;
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
    public class ResourceLogicLLMGTC3Test {

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

        private MockedStatic<AuthContextUtils> authContextUtilsMock;
        private MockedStatic<RealmUtils> realmUtilsMock;

        private ResourceTO resourceTO;
        private ExternalResource externalResource;
        private ConnInstance connInstance;
        private Realm realm;

        @Before
        public void setUp() {
            resourceTO = new ResourceTO();
            resourceTO.setKey("TestResource");
            resourceTO.setConnector("TestConnector");

            realm = mock(Realm.class);
            when(realm.getFullPath()).thenReturn("/");

            connInstance = mock(ConnInstance.class);
            when(connInstance.getAdminRealm()).thenReturn(realm);

            externalResource = mock(ExternalResource.class);
            when(externalResource.getKey()).thenReturn("TestResource");
            when(externalResource.getConnector()).thenReturn(connInstance);

            // Setup static mocks for security context
            authContextUtilsMock = mockStatic(AuthContextUtils.class);
            realmUtilsMock = mockStatic(RealmUtils.class);

            Map<String, Set<String>> authMap = Collections.singletonMap(IdMEntitlement.RESOURCE_CREATE, Set.of("/"));
            authContextUtilsMock.when(AuthContextUtils::getAuthorizations).thenReturn(authMap);
            realmUtilsMock.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Set.of("/"));
        }

        @After
        public void tearDown() {
            authContextUtilsMock.close();
            realmUtilsMock.close();
        }

        @Test(expected = SyncopeClientException.class)
        public void testCreateMissingKeyThrowsException() {
            resourceTO.setKey(null);
            resourceLogic.create(resourceTO);
        }

        @Test(expected = SyncopeClientException.class)
        public void testCreateInvalidConnectorThrowsException() {
            when(connInstanceDAO.authFind(resourceTO.getConnector())).thenReturn(null);
            resourceLogic.create(resourceTO);
        }

        @Test(expected = DuplicateException.class)
        public void testCreateDuplicateResourceThrowsException() {
            when(connInstanceDAO.authFind(resourceTO.getConnector())).thenReturn(connInstance);
            when(resourceDAO.authFind(resourceTO.getKey())).thenReturn(externalResource);

            resourceLogic.create(resourceTO);
        }

        @Test(expected = DelegatedAdministrationException.class)
        public void testCreateUnauthorizedThrowsException() {
            when(connInstanceDAO.authFind(resourceTO.getConnector())).thenReturn(connInstance);

            // Override mock to simulate lack of permissions
            realmUtilsMock.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Collections.emptySet());

            resourceLogic.create(resourceTO);
        }

        @Test
        public void testCreateSuccess() {
            when(connInstanceDAO.authFind(resourceTO.getConnector())).thenReturn(connInstance);
            when(resourceDAO.authFind(resourceTO.getKey())).thenReturn(null);
            when(binder.create(resourceTO)).thenReturn(externalResource);
            when(resourceDAO.save(externalResource)).thenReturn(externalResource);
            when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

            ResourceTO result = resourceLogic.create(resourceTO);

            assertNotNull(result);
            assertEquals("TestResource", result.getKey());
            verify(resourceDAO).save(externalResource);
            verify(connectorManager).registerConnector(externalResource);
        }

        @Test(expected = NotFoundException.class)
        public void testReadNotFoundThrowsException() {
            when(resourceDAO.authFind("NonExistent")).thenReturn(null);
            resourceLogic.read("NonExistent");
        }

        @Test
        public void testReadSuccess() {
            when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
            when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

            ResourceTO result = resourceLogic.read("TestResource");

            assertNotNull(result);
            assertEquals("TestResource", result.getKey());
        }

        @Test(expected = NotFoundException.class)
        public void testDeleteNotFoundThrowsException() {
            when(resourceDAO.authFind("NonExistent")).thenReturn(null);
            resourceLogic.delete("NonExistent");
        }

        @Test
        public void testDeleteSuccess() {
            when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
            when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

            ResourceTO result = resourceLogic.delete("TestResource");

            assertNotNull(result);
            assertEquals("TestResource", result.getKey());
            verify(connectorManager).unregisterConnector(externalResource);
            verify(resourceDAO).deleteById("TestResource");
        }
        @Test
        public void testUpdateSuccess() {
            // Setup dipendenze per un aggiornamento autorizzato e con risorsa esistente
            when(resourceDAO.authFind(resourceTO.getKey())).thenReturn(externalResource);
            when(binder.update(externalResource, resourceTO)).thenReturn(externalResource);
            when(resourceDAO.save(externalResource)).thenReturn(externalResource);
            when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

            ResourceTO result = resourceLogic.update(resourceTO);

            // Asserzioni
            assertNotNull(result);
            assertEquals("TestResource", result.getKey());

            // Verifica dei path previsti (il doSave() deve chiamare save e registerConnector)
            verify(resourceDAO).save(externalResource);
            verify(connectorManager).registerConnector(externalResource);
        }

        @Test(expected = NotFoundException.class)
        public void testUpdateNotFoundThrowsException() {
            // Setup classe di equivalenza: Risorsa non presente sul DB
            when(resourceDAO.authFind(resourceTO.getKey())).thenReturn(null);

            // Attesa eccezione
            resourceLogic.update(resourceTO);
        }

        @Test
        public void testListSuccess() {
            // Setup classe di equivalenza: Estrazione massiva
            doReturn(java.util.List.of(externalResource)).when(resourceDAO).findAll();
            when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

            java.util.List<ResourceTO> result = resourceLogic.list();

            // Asserzioni su dimensione e mappatura degli stream
            assertNotNull(result);
            assertEquals(1, result.size());
            assertEquals("TestResource", result.get(0).getKey());
            verify(resourceDAO).findAll();
        }
    }
