package org.apache.syncope.core.logic;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.ConnObject;
import org.apache.syncope.common.lib.to.Mapping;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.identityconnectors.framework.common.objects.SearchResult;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicBBTest {

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

    // Metodo per creare un ConnInstance da passare ai test
    private ConnInstance createMockConnInstance() {
        ConnInstance mockConn = mock(ConnInstance.class);
        Realm mockRealm = mock(Realm.class);
        lenient().when(mockRealm.getFullPath()).thenReturn("/");
        lenient().when(mockConn.getAdminRealm()).thenReturn(mockRealm);
        return mockConn;
    }

    private void setupValidSystemStateForSearch() {
        AnyType mockAnyType = mock(AnyType.class);
        lenient().when(mockAnyType.getKey()).thenReturn("USER");
        lenient().doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("USER");

        ExternalResource mockResource = mock(ExternalResource.class);
        lenient().when(resourceDAO.authFind("Resource_DB")).thenReturn(mockResource);

        Provision mockProvision = mock(Provision.class);
        Mapping mockMapping = mock(Mapping.class);

        lenient().when(mockProvision.getMapping()).thenReturn(mockMapping);
        lenient().when(mockProvision.getObjectClass()).thenReturn("ACCOUNT");
        lenient().when(mockResource.getProvisionByAnyType("USER")).thenReturn(Optional.of(mockProvision));

        Connector mockConnector = mock(Connector.class);
        SearchResult mockSearchResult = mock(SearchResult.class);
        lenient().doReturn(mockSearchResult).when(mockConnector).search(any(), any(), any(), anyInt(), any(), any(), any());
        lenient().when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);
    }


    // create(ResourceTO)

    @Test
    public void testCreate_TC01() {
        /*
        TC01 - Creazione risorsa valida

        Category partition: ResourceTo valido, key valida e non presente nel DB, connettore esistente

        Oracolo: Il metodo crea la risorsa correttamente e restituisce l'oggetto creato
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("Resource_DB");
        resourceTO.setConnector("Conn-123");

        ConnInstance conn = createMockConnInstance();
        when(connInstanceDAO.authFind("Conn-123")).thenReturn(conn);
        when(resourceDAO.authFind("Resource_DB")).thenReturn(null);

        ExternalResource mockResource = mock(ExternalResource.class);
        when(binder.create(resourceTO)).thenReturn(mockResource);
        when(resourceDAO.save(any())).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.create(resourceTO);

        Assert.assertEquals("Resource_DB", result.getKey());
    }

    @Test(expected = NullPointerException.class)
    public void testCreate_TC02() {
        /*
        TC02 - Creazione con input null

        Category partition: ResourceTo nullo

        Oracolo: Il metodo solleva un NPE per gestire l'oggetto null
         */

        resourceLogic.create(null);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreate_TC03() {
        /*
        TC03 - Creazione con key vuota

        Category partition: ResourceTo valido, key vuota, connettore esistente

        Oracolo: Il metodo solleva un SyncopeClientException
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("");
        resourceTO.setConnector("Conn-123");

        ConnInstance conn = createMockConnInstance();
        lenient().when(connInstanceDAO.authFind("Conn-123")).thenReturn(conn);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreate_TC04() {
         /*
        TC04 - Creazione con key nulla

        Category partition: ResourceTo valido, key null, connettore esistente

        Oracolo: Il metodo solleva un SyncopeClientException
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey(null);
        resourceTO.setConnector("Conn-123");

        ConnInstance conn = createMockConnInstance();
        lenient().when(connInstanceDAO.authFind("Conn-123")).thenReturn(conn);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreate_TC05() {
        /*
        TC05 - Creazione con connettore inesistente

        Category partition: ResourceTo valido, key valida, connettore non trovato

        Oracolo: Il metodo solleva SyncopeClientException
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("Resource_DB");
        resourceTO.setConnector("Conn-FANTASMA");

        when(connInstanceDAO.authFind("Conn-FANTASMA")).thenReturn(null);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreate_TC06() {
        /*
        TC06 - Creazione con connettore null

        Category partition: ResourceTo valido, key valida, connettore null

        Oracolo: Il metodo solleva SyncopeClientException
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("Resource_DB");
        resourceTO.setConnector(null);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = DuplicateException.class)
    public void testCreate_TC07() {
        /*
        TC07 - Creazione risorsa duplicata

        Category partition: ResourceTo valido, key valida ma già esistente nel DB, connettore esistente

        Oracolo: Il metodo solleva DuplicateException
         */
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("Resource_DB_Duplicato");
        resourceTO.setConnector("Conn-123");

        ConnInstance conn = createMockConnInstance();
        when(connInstanceDAO.authFind("Conn-123")).thenReturn(conn);

        ExternalResource existingResource = mock(ExternalResource.class);
        when(resourceDAO.authFind("Resource_DB_Duplicato")).thenReturn(existingResource);

        resourceLogic.create(resourceTO);
    }

    // searchConnObjects( final Filter filter,
    //            final Set<String> moreAttrsToGet,
    //            final String key,
    //            final String anyTypeKey,
    //            final int size,
    //            final String pagedResultsCookie,
    //            final List<Sort.Order> sort)

    @Test
    public void testSearchConn_TC01() {
        /*
        TC01 - Ricerca valida

        Category partition: key valida, anyType esistente e mappato, size valida

        Oracolo: Ricerca riuscita, risultato non nullo
         */

        setupValidSystemStateForSearch();

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB", "USER", 10, null, Collections.emptyList());

        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getLeft());
        Assert.assertNotNull(result.getRight());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC02() {
         /*
        TC02 - Risorsa non trovata

        Category partition: key invalida, anyType esistente e mappato, size valida

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();
        when(resourceDAO.authFind("Resource_DB_Fantasma")).thenReturn(null);

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB_Fantasma", "USER", 10, null, Collections.emptyList());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC03() {
        /*
        TC03 - AnyType non mappato sulla risorsa

        Category partition: key valida, anyType esistente ma NON mappato, size valida

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();
        String anyTypeKey = "GROUP";

        AnyType mockGroupType = mock(AnyType.class);
        lenient().when(mockGroupType.getKey()).thenReturn(anyTypeKey);
        lenient().doReturn(Optional.of(mockGroupType)).when(anyTypeDAO).findById(anyTypeKey);

        ExternalResource mockResource = resourceDAO.authFind("Resource_DB");
        when(mockResource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.empty());

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB", anyTypeKey, 10, null, Collections.emptyList());
    }

    @Test
    public void testSearchConn_TC04() {
        /*
        TC04 - Size negativa

        Category partition: key valida, anyType esistente e mappato, size negativa

        Oracolo: Restituisce lista vuota senza errore
         */

        setupValidSystemStateForSearch();

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB", "USER", -1, null, Collections.emptyList());

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getRight().isEmpty());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC05() {
        /*
        TC05 - Key vuota

        Category partition: key vuota, anyType esistente e mappato, size valida

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();

        when(resourceDAO.authFind("")).thenReturn(null);

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "", "USER", 10, null, Collections.emptyList());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC06() {
        /*
        TC06 - Key null

        Category partition: key null, anyType esistente e mappato, size valida

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();

        resourceLogic.searchConnObjects(null, Collections.emptySet(), null, "USER", 10, null, Collections.emptyList());
    }

    @Test
    public void testSearchConn_TC07() {
        /*
        TC07 - Size pari a 0

        Category partition: key valida, anyType esistente e mappato, size pari a 0

        Oracolo: Ricerca riuscita
         */

        setupValidSystemStateForSearch();

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB", "USER", 0, null, Collections.emptyList());

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getRight().isEmpty());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC08() {
        /*
        TC08 - AnyTypeKey vuota

        Category partition: key valida, anyTypeKey stringa vuota, size valida

        Oracolo: NotFoundException
         */
        setupValidSystemStateForSearch();

        lenient().when(anyTypeDAO.findById("")).thenReturn(Optional.empty());

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB", "", 10, null, Collections.emptyList());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC09() {
        /*
        TC09 - AnyTypeKey nulla

        Category partition: key valida, anyTypeKey null, size valida

        Oracolo: NotFoundException
         */
        setupValidSystemStateForSearch();

        lenient().when(anyTypeDAO.findById(null)).thenReturn(Optional.empty());

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "Resource_DB", null, 10, null, Collections.emptyList());
    }
}
