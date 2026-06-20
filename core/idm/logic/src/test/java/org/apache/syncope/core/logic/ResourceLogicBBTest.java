package org.apache.syncope.core.logic;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.ConnObject;
import org.apache.syncope.common.lib.to.Mapping;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.identityconnectors.framework.common.objects.AttributeBuilder;
import org.identityconnectors.framework.common.objects.SearchResult;
import org.identityconnectors.framework.common.objects.filter.Filter;
import org.identityconnectors.framework.common.objects.filter.FilterBuilder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
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

    @InjectMocks
    private ResourceLogic resourceLogic;


    @Before
    public void setUp() {
        // Inizializzazione manuale dell'oggetto per fare l'override e rimuovere i security checks
        resourceLogic = new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory) {
            @Override
            protected void securityChecks(final Set<String> effectiveRealms, final String realm, final String key) {
                // Bypass della sicurezza per i test unitari
            }
        };
    }

    // --- Metodi di Utility per configurare gli stati del sistema ---

    private ConnInstance createMockConnInstance() {
        ConnInstance mockConn = mock(ConnInstance.class);
        Realm mockRealm = mock(Realm.class);
        lenient().when(mockRealm.getFullPath()).thenReturn("/");
        lenient().when(mockConn.getAdminRealm()).thenReturn(mockRealm);
        return mockConn;
    }

    private void setupValidSystemStateForSearch() {
        // 1. AnyType esiste ("USER")
        AnyType mockAnyType = mock(AnyType.class);
        lenient().when(mockAnyType.getKey()).thenReturn("USER");
        lenient().doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("USER");

        // 2. Risorsa esiste ("DB-HR")
        ExternalResource mockResource = mock(ExternalResource.class);
        lenient().when(resourceDAO.authFind("DB-HR")).thenReturn(mockResource);

        // 3. Risorsa ha una Provision per l'AnyType ("USER")
        Provision mockProvision = mock(Provision.class);
        Mapping mockMapping = mock(Mapping.class);

        // Reintegriamo le tue istruzioni originali!
        lenient().when(mockProvision.getMapping()).thenReturn(mockMapping);
        lenient().when(mockMapping.getItems()).thenReturn(java.util.Collections.emptyList());
        lenient().when(mockProvision.getObjectClass()).thenReturn("__ACCOUNT__");
        lenient().when(mockResource.getProvisionByAnyType("USER")).thenReturn(Optional.of(mockProvision));

        // 4. Il ConnectorManager restituisce un connettore finto ma funzionante
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

        Category partition:
        A1 = ResourceTo con dati validi
        B1 = Connector esistente
        C1 = Risorsa non esistente (null)

        Oracolo: Il metodo crea la risorsa correttamente e restituisce l'oggetto creato
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB");
        resourceTO.setConnector("Conn-123");

        ConnInstance robustConn = createMockConnInstance();
        when(connInstanceDAO.authFind("Conn-123")).thenReturn(robustConn);
        when(resourceDAO.authFind("DB")).thenReturn(null);

        ExternalResource mockResource = mock(ExternalResource.class);
        when(binder.create(resourceTO)).thenReturn(mockResource);
        when(resourceDAO.save(any())).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.create(resourceTO);

        Assert.assertNotNull(result);
        Assert.assertEquals("DB", result.getKey());
    }

    @Test(expected = Exception.class) // capire se specificare l'eccezione
    public void testCreate_TC02() {
        /*
        TC02 - Creazione con input null

        Category partition:
        A2 = ResourceTo nullo

        Oracolo: Il metodo solleva un eccezione per gestire l'oggetto null
         */

        resourceLogic.create(null);
    }

    @Test(expected = Exception.class) // capire se specificare l'eccezione
    public void testCreate_TC03() {
        /*
        TC03 - Creazione con key vuota

        Category partition:
        A3 = ResourceTo con key vuota ""
        B1 = Connector esistente

        Oracolo: Il metodo solleva un eccezione per gestire la key vuota
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("");
        resourceTO.setConnector("Conn-123");

        ConnInstance robustConn = createMockConnInstance();
        lenient().when(connInstanceDAO.authFind("Conn-123")).thenReturn(robustConn);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = Exception.class)
    public void testCreate_TC04() {
         /*
        TC04 - Creazione con key nulla

        Category partition:
        A4 = ResourceTo con key nulla
        B1 = Connector esistente

        Oracolo: Il metodo solleva un eccezione per gestire la key null
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey(null);
        resourceTO.setConnector("Conn-123");

        ConnInstance robustConn = createMockConnInstance();
        lenient().when(connInstanceDAO.authFind("Conn-123")).thenReturn(robustConn);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreate_TC05() {
        /*
        TC05 - Creazione con connettore inesistente

        Category partition:
        A1 = ResourceTo valido
        B2 = Connettore non trovato

        Oracolo: Il metodo solleva SyncopeClientException.
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB");
        resourceTO.setConnector("Conn-FANTASMA");

        when(connInstanceDAO.authFind("Conn-FANTASMA")).thenReturn(null);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreate_TC06() {
        /*
        TC06 - Creazione con connettore null

        Category partition:
        A1 = ResourceTo valido
        B3 = Connettore null

        Oracolo: Il metodo solleva SyncopeClientException.
         */

        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-Test");
        resourceTO.setConnector(null);

        when(connInstanceDAO.authFind(null)).thenReturn(null);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = DuplicateException.class)
    public void testCreate_TC07() {
        /*
        TC07 - Creazione risorsa duplicata

        Category partition:
        A1 = ResourceTo valido
        C2 = Risorda esistente

        Oracolo: Il metodo solleva DuplicateException.
         */
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-Duplicato");
        resourceTO.setConnector("Conn-123");

        ConnInstance robustConn = createMockConnInstance();
        when(connInstanceDAO.authFind("Conn-123")).thenReturn(robustConn);

        ExternalResource existingResource = mock(ExternalResource.class);
        when(resourceDAO.authFind("DB-Duplicato")).thenReturn(existingResource);

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

        Category partition:
        A1 = Risorsa esistente
        B1 = AnyType esistente e mappato
        C1 = size valido

        Oracolo: Ricerca riuscita, risultato non nullo.
         */

        setupValidSystemStateForSearch();
        Filter filtro = FilterBuilder.equalTo(AttributeBuilder.build("username", "mario"));

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(filtro, Collections.emptySet(), "DB-HR", "USER", 10, null, Collections.emptyList());

        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getLeft());
        Assert.assertNotNull(result.getRight());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC02() {
         /*
        TC02 - Risorsa non trovata

        Category partition:
        A2 = Risorsa esistente

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();
        when(resourceDAO.authFind("FANTASMA")).thenReturn(null);

        resourceLogic.searchConnObjects(
                null, Collections.emptySet(), "FANTASMA", "USER", 10, null, Collections.emptyList());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC03() {
        /*
        TC03 - AnyType non mappato sulla risorsa

        Category partition:
        A1 = Risorsa esistente
        B2 = AnyType esistente ma NON mappato

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();
        String anyTypeKey = "GROUP";

        AnyType mockGroupType = mock(AnyType.class);
        lenient().when(mockGroupType.getKey()).thenReturn(anyTypeKey);
        lenient().doReturn(Optional.of(mockGroupType)).when(anyTypeDAO).findById(anyTypeKey);

        ExternalResource mockResource = resourceDAO.authFind("DB-HR");
        when(mockResource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.empty());

        resourceLogic.searchConnObjects(
                null, Collections.emptySet(), "DB-HR", anyTypeKey, 10, null, Collections.emptyList());
    }

    @Test
    public void testSearchConn_TC04() {
        /*
        TC04 - Pagina dimensione negativa

        Category partition:
        A1 = Risorsa esistente
        B1 = AnyType esistente e mappato
        C2 = size negativo

        Oracolo: Restituisce lista vuota senza errore.
         */

        setupValidSystemStateForSearch();

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(
                null, Collections.emptySet(), "DB-HR", "USER", -1, null, Collections.emptyList());

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getRight().isEmpty());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC05() {
        /*
        TC05 - Nome risorsa vuoto

        Category partition:
        A3 = Risorsa con nome vuoto ("")

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();

        when(resourceDAO.authFind("")).thenReturn(null);

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "", "USER", 10, null, Collections.emptyList());
    }

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC06() {
        /*
        TC06 - Nome risorsa nullo

        Category partition:
        A4 = Risorsa con nome nullo

        Oracolo: NotFoundException
         */

        setupValidSystemStateForSearch();

        resourceLogic.searchConnObjects(
                null, Collections.emptySet(), null, "USER", 10, null, Collections.emptyList());
    }

    @Test
    public void testSearchConn_TC07() {
        /*
        TC07 - Size della pagina a 0

        Category partition:
        A1 = Risorsa esistente
        B1 = AnyType esistente e mappato
        C3 = size pari a 0

        Oracolo: Ricerca riuscita.
         */

        setupValidSystemStateForSearch();

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(
                null, Collections.emptySet(), "DB-HR", "USER", 0, null, Collections.emptyList());

        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getRight());
    }
}
