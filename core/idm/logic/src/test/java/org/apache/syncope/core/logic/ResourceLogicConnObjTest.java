package org.apache.syncope.core.logic;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.syncope.common.lib.to.ConnObject;
import org.apache.syncope.common.lib.to.Mapping;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.identityconnectors.framework.common.objects.AttributeBuilder;
import org.identityconnectors.framework.common.objects.ConnectorObject;
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
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicConnObjTest {

    @Mock
    private ExternalResourceDAO resourceDAO;
    @Mock
    private AnyTypeDAO anyTypeDAO;
    @Mock
    private ConnectorManager connectorManager;
    @Mock
    private ExternalResource mockResource;
    @Mock
    private Connector mockConnector;
    @Mock
    private ConnectorObject mockConnectorObj;
    @Mock
    private AnyType mockAnyType;
    @Mock
    private Provision mockProvision;
    @Mock
    private Mapping mockMapping;
    @Mock
    private AnyUtilsFactory mockAnyUtilsFactory;
    @Mock
    private AnyUtils mockAnyUtils;
    @Mock
    private AnyDAO<?> mockAnyDAO;
    @Mock
    private Any mockAny;
    @Mock
    private OutboundMatcher mockOutboundMatcher;
    @Mock
    private MappingManager mappingManager;

    @InjectMocks
    private ResourceLogic resourceLogic;

    @Before
    public void setUp_Generic(){

        lenient().when(mockAnyType.getKey()).thenReturn("USER");
        lenient().when(mockAnyType.getKind()).thenReturn(AnyTypeKind.USER);
        lenient().doReturn(java.util.Optional.of(mockAnyType)).when(anyTypeDAO).findById("USER");


        when(resourceDAO.authFind("DB-HR")).thenReturn(mockResource);
        when(mockResource.getProvisionByAnyType("USER")).thenReturn(java.util.Optional.of(mockProvision));

        when(mockProvision.getMapping()).thenReturn(mockMapping);
        when(mockProvision.getObjectClass()).thenReturn("__ACCOUNT__");
        when(mockMapping.getItems()).thenReturn(java.util.Collections.emptyList());

        lenient().doReturn(mockAnyUtils).when(mockAnyUtilsFactory).getInstance(any(org.apache.syncope.common.lib.types.AnyTypeKind.class));
        lenient().doReturn(mockAnyDAO).when(mockAnyUtils).dao();
        lenient().doReturn(mockAny).when(mockAnyDAO).authFind("matteo.p");
    }

    @Before
    public void setUp_Search(){
        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);
    }

    @Before
    public void setUp_Read(){
        doReturn(java.util.Collections.singletonList(mockConnectorObj)).when(mockOutboundMatcher).match(any(), any(), any(), any(), any(java.util.Optional.class));

    }

    @Before
    public void setUp_Get(){
        lenient().doReturn(Optional.of("matteo.p@azienda.com")).when(mappingManager).getConnObjectKeyValue(mockAny, mockResource, mockProvision);
    }



    //capire se testare group e levare stringa vuota?
    @Test
    public void testSearchConn_TC01(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = 10;
        Filter filtroValido = FilterBuilder.equalTo(AttributeBuilder.build("username", "mario"));

        SearchResult expectedSearchResult = mock(SearchResult.class);
        doReturn(expectedSearchResult).when(mockConnector).search(any(), any(), any(), anyInt(), any(), any(), any());

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(filtroValido, java.util.Collections.emptySet(), key, anyTypeKey, size, null, null);

//        Assert.assertEquals(null, result.getLeft());  //COSI' FACENDO CONTROLLO CHE IL TEST è SCRITTO BENE
        Assert.assertEquals(expectedSearchResult, result.getLeft());
        verify(mockConnector).search(any(), eq(filtroValido), any(), eq(10), any(), any(), any());
    }


    @Test
    public void testSearchConn_TC02() {
        String key = "";
//        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = 10;

        try {
            resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, size, null, java.util.Collections.emptyList());
            Assert.fail("Il test doveva esplodere per via della stringa vuota");
        } catch(NotFoundException e){
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSearchConn_TC03(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = -1;

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, size, null, java.util.Collections.emptyList());
        Assert.assertNotNull("Il risultato non deve essere nullo", result);

//        verify(mockConnector).search(any(), any(), any(), eq(99), any(), any(), any()); //COSI' FACENDO CONTROLLO CHE SONO STATI SCRITTI BENE
        verify(mockConnector).search(any(), any(), any(), eq(-1), any(), any(), any());
    }

    @Test
    public void testSearchConn_TC04(){
        String key = "FANTASMA";
//        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = 10;

        try {
            resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, size, null, java.util.Collections.emptyList());
            Assert.fail("Il test doveva esplodere per via della stringa vuota");
        } catch(NotFoundException e){
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }


    @Test
    public void testSearchConn_TC05(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = 10;

        when(connectorManager.getConnector(any())).thenThrow(new RuntimeException("Connettore giù")); // commentando quest riga CONTROLLO CHE IL TEST è SCRITTO BENE

        try {
            resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, size, null, java.util.Collections.emptyList());
            Assert.fail("Il test doveva esplodere perché il connettore è giù");
        } catch (RuntimeException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSearchConn_TC06(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = 10;

        when(mockConnector.search(any(), any(), any(), anyInt(), any(), any(), any())).thenReturn(new SearchResult());

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, size, null, java.util.Collections.emptyList());

//        Assert.assertFalse(result.getRight().isEmpty()); COSI' FACENDO CONTROLLO CHE IL TEST è SCRITTO BENE
        Assert.assertTrue(result.getRight().isEmpty());

        verify(mockConnector).search(any(), any(), any(), eq(10), any(), any(), any());
    }

    @Test
    public void testSearchConn_TC07(){
        String key = "DB-HR";
        String anyTypeKey = "GROUP";
//        String anyTypeKey = "USER";
        int size = 10;

        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
        doReturn(anyTypeKey).when(mockAnyType).getKey();
        lenient().doReturn(AnyTypeKind.GROUP).when(mockAnyType).getKind();

        try {
            resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, size, null, java.util.Collections.emptyList());
            Assert.fail("Il test doveva esplodere per mancanza di Provision");
        } catch (NotFoundException e) {
            Assert.assertTrue("Errore inaspettato: " + e.getMessage(), e.getMessage().contains(key));
        }
    }

    @Test
    public void testSearchConn_TC08(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = 0;

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, size, null, java.util.Collections.emptyList());

        Assert.assertNotNull("Il risultato non deve essere nullo", result);
        Assert.assertTrue("La lista dei risultati deve essere vuota", result.getRight().isEmpty());

//        verify(mockConnector).search(any(), any(), any(), eq(99), any(), any(), any()); //COSI' FACENDO CONTROLLO CHE SONO STATI SCRITTI BENE
        verify(mockConnector).search(any(), any(), any(), eq(0), any(), any(), any());
    }

    @Test
    public void testSearchConn_TC09() {
        String key = "DB-HR";
        String anyTypeKey = "REALM";

        doReturn(java.util.Optional.of(mockResource)).when(resourceDAO).findById(key);
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
        lenient().when(mockOrgUnit.getObjectClass()).thenReturn("__REALM__");

        lenient().doReturn(Optional.empty()).when(anyTypeDAO).findById(anyTypeKey);

        SearchResult expectedSearchResult = mock(SearchResult.class);
        doReturn(expectedSearchResult).when(mockConnector).search(any(), any(), any(), anyInt(), any(), any(), any());

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(null, java.util.Collections.emptySet(), key, anyTypeKey, 10, null, null);

        Assert.assertNotNull(result);
        verify(mockConnector).search(any(), any(), any(), eq(10), any(), any(), any());
    }


    @Test
    public void testReadConn_TC01() {
        String key = "DB-HR";
//        String key = "FANTASMA";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        ConnObject result = resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);

        Assert.assertNotNull(result);
        verify(mockOutboundMatcher, times(1)).match(any(), any(), any(), any(), any(java.util.Optional.class));
    }


    @Test
    public void testReadConn_TC02(){
//        String key = "DB-HR";
        String key = "FANTASMA";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        try {
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per via della stringa invalida");
        } catch(NotFoundException e){
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConn_TC03(){
        String key = "DB-HR";
        String anyTypeKey = "GROUP";
//        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
        doReturn(anyTypeKey).when(mockAnyType).getKey();
        lenient().doReturn(AnyTypeKind.GROUP).when(mockAnyType).getKind();

        try {
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per mancanza di Provision");
        } catch (NotFoundException e) {
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConn_TC04(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "ciao";
//        String anyKey = "matteo.p";

        try{
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere perchè l'utente non esiste");
        } catch(NotFoundException e){
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);

        }
    }

    // forse ridondante con stringa invalida???
    @Test
    public void testReadConn_TC05(){
        String key = "";
//        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        try {
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per via della stringa vuota");
        } catch(NotFoundException e){
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConn_TC06(){
        String key = null;
//        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        try {
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per via della stringa nulla");
        } catch(Exception e){
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConn_TC07(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        doThrow(new RuntimeException("Timeout connection to external DB")).when(mockOutboundMatcher).match(any(), any(), any(), any(), any(java.util.Optional.class));

        try {

            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere perché il connettore è giù");
        } catch (RuntimeException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConn_TC08_NoMatchFound() {
        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        // Simuliamo il caso in cui il matcher NON trova nulla (lista vuota)
        doReturn(java.util.Collections.emptyList()).when(mockOutboundMatcher)
                .match(any(), any(), any(), any(), any(java.util.Optional.class));

        // Ora ci aspettiamo che il metodo lanci una NotFoundException
        try {
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere: nessun oggetto trovato per questo match!");
        } catch (NotFoundException e) {
            // Se arriviamo qui, il test è passato!
            System.out.println("Eccezione correttamente gestita: " + e.getMessage());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConn_TC09_Realm() {
        String key = "DB-HR";
        String anyTypeKey = "REALM";
        String anyKey = "matteo.p";

        // 1. MOCK DELLA PROVISION E DEL MAPPING
        Provision mockRealmProvision = mock(Provision.class);
        Mapping mockMapping = mock(Mapping.class); // <-- AGGIUNTA
        when(mockRealmProvision.getMapping()).thenReturn(mockMapping); // <-- AGGIUNTA

        // 2. ISTRUIAMO IL MOCK DELLA RISORSA
        when(mockResource.getProvisionByAnyType(anyTypeKey)).thenReturn(java.util.Optional.of(mockRealmProvision));

        // 3. CORREZIONE DAO
        doReturn(java.util.Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
        lenient().when(mockAnyType.getKey()).thenReturn("REALM");

        // 4. MOCK DELL'ORGUNIT (necessario per la logica dei Realm)
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        lenient().when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);

        // 5. Simula il match per il realm
        doReturn(java.util.Collections.singletonList(mockConnectorObj)).when(mockOutboundMatcher)
                .match(any(), any(), any(), any(), any(java.util.Optional.class));

        // Esecuzione
        ConnObject result = resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);

        Assert.assertNotNull(result);
        verify(mockOutboundMatcher).match(any(), any(), any(), any(), any(java.util.Optional.class));
    }


    @Test
    public void testReadConn_TC10_NoMapping() {
        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        // Forziamo il mapping a null per questa risorsa
        when(mockProvision.getMapping()).thenReturn(null);

        try {
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Doveva fallire per mancanza di mapping");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }


    @Test
    public void testGetConn_TC01() {
        String key = "DB-HR";
//    String key = "FANTASMA";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";
        String expectedRemoteKey = "matteo.p@azienda.com";

        String result = resourceLogic.getConnObjectKeyValue(key, anyTypeKey, anyKey);

        Assert.assertNotNull("Il risultato non deve essere nullo", result);
        Assert.assertEquals("La chiave generata non è quella attesa", expectedRemoteKey, result);

        verify(mappingManager, times(1)).getConnObjectKeyValue(mockAny, mockResource, mockProvision);
    }

    @Test
    public void testGetConn_TC02(){
        String key = "FANTASMA";
//      String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        try {
            resourceLogic.getConnObjectKeyValue(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per risorsa inesistente");
        } catch (NotFoundException e) {
            Assert.assertTrue("Errore inaspettato: " + e.getMessage(), e.getMessage().contains(key));
        }
    }


    @Test
    public void testGetConn_TC03(){
        String key = "DB-HR";
        String anyTypeKey = "GROUP";
//        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
        doReturn(anyTypeKey).when(mockAnyType).getKey();
        lenient().doReturn(AnyTypeKind.GROUP).when(mockAnyType).getKind();

        try {
            resourceLogic.getConnObjectKeyValue(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per mancanza di Provision");
        } catch (NotFoundException e) {
            Assert.assertTrue("Errore inaspettato: " + e.getMessage(), e.getMessage().contains(key));
        }
    }

    @Test
    public void testGetConn_TC04(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "ciao";
//        String anyKey = "matteo.p";

        try {
            resourceLogic.getConnObjectKeyValue(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere perché l'utente non esiste");
        } catch (NotFoundException e) {
            Assert.assertTrue("Errore inaspettato: " + e.getMessage(), e.getMessage().contains(anyKey));
        }
    }

    @Test
    public void testGetConn_TC05(){
        String key = null;
//        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        try {
            resourceLogic.getConnObjectKeyValue(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per via della stringa nulla");
        } catch (Exception e) {
            System.out.println("Eccezione catturata correttamente per input null: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }
    @Test
    public void testGetConn_TC06() {
        String key = "DB-HR";
        String anyTypeKey = "USER";
        String anyKey = "matteo.p";

        doReturn(Optional.empty()).when(mappingManager).getConnObjectKeyValue(mockAny, mockResource, mockProvision); // da commentare per validare il test
//        doReturn(Optional.of("VALORE_SBAGLIATO")).when(mappingManager).getConnObjectKeyValue(mockAny, mockResource, mockProvision); // serve a validare il test

        try {
            String result = resourceLogic.getConnObjectKeyValue(key, anyTypeKey, anyKey);
            Assert.assertNull("Il mapping è fallito.", result);
        } catch (Exception e) {
            System.out.println("Il mapping fallito ha generato un'eccezione: " + e.getClass().getSimpleName());
            Assert.assertTrue(true);
        }
    }
}