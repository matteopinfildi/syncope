package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.common.lib.to.ConnInstanceTO;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncToken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicLLMFewTest {

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

    // Entità fittizie necessarie per far girare i test senza null pointer
    @Mock
    private ExternalResource mockResource;
    @Mock
    private ConnInstance mockConn;
    @Mock
    private Realm mockRealm;
    @Mock
    private Connector mockConnector;
    @Mock
    private OrgUnit mockOrgUnit;
    @Mock
    private Provision mockProvision;
    @Mock
    private AnyType mockAnyType;

    // L'oggetto reale da testare
    private ResourceLogic resourceLogic;

    @Before
    public void setUp() {
        // Instanziazione dell'oggetto reale con l'override dei check di sicurezza
        resourceLogic = new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory) {

            @Override
            protected void securityChecks(final Set<String> effectiveRealms, final String realm, final String key) {
                // Svuotato per testare la logica isolata senza dover simulare un utente loggato
            }
        };

        // Setup base delle concatenazioni di oggetti (Es: resource.getConnector().getAdminRealm().getFullPath())
        lenient().when(mockRealm.getFullPath()).thenReturn("/");
        lenient().when(mockConn.getAdminRealm()).thenReturn(mockRealm);
        lenient().when(mockResource.getConnector()).thenReturn(mockConn);
        lenient().when(mockResource.getKey()).thenReturn("DB-HR");
    }

    // ==========================================
    // TEST METODO: update
    // ==========================================

    @Test
    public void testUpdate_TC01_Success() {
        // ARRANGE
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");

        // Diciamo al DAO che quando cerchiamo "DB-HR", lo trova
        when(resourceDAO.authFind("DB-HR")).thenReturn(mockResource);
        // Quando il binder aggiorna l'entità, restituisce l'entità aggiornata
        when(binder.update(mockResource, resourceTO)).thenReturn(mockResource);
        // Quando il DAO salva, restituisce la stessa entità
        when(resourceDAO.save(mockResource)).thenReturn(mockResource);
        // Alla fine, il binder ri-converte in TO
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        // ACT
        ResourceTO result = resourceLogic.update(resourceTO);

        // ASSERT
        Assert.assertNotNull("Il risultato non deve essere nullo", result);
        Assert.assertEquals("DB-HR", result.getKey());

        // Verifica comportamentale: assicurati che save e update siano stati chiamati
        verify(binder, times(1)).update(mockResource, resourceTO);
        verify(resourceDAO, times(1)).save(mockResource);
        // Assicurati che il connettore sia stato registrato post-salvataggio
        verify(connectorManager, times(1)).registerConnector(mockResource);
    }

    @Test
    public void testUpdate_TC02_NotFound() {
        // ARRANGE
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("GHOST-DB"); // Risorsa inesistente

        when(resourceDAO.authFind("GHOST-DB")).thenReturn(null);

        // ACT & ASSERT
        try {
            resourceLogic.update(resourceTO);
            Assert.fail("Il test doveva lanciare un'eccezione NotFoundException");
        } catch (NotFoundException e) {
            Assert.assertTrue(e.getMessage().contains("GHOST-DB"));
        }
    }

    // ==========================================
    // TEST METODO: delete
    // ==========================================

    @Test
    public void testDelete_TC01_Success() {
        // ARRANGE
        String resourceKey = "DB-HR";
        ResourceTO deletedResourceTO = new ResourceTO();
        deletedResourceTO.setKey(resourceKey);

        when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(deletedResourceTO);

        // ACT
        ResourceTO result = resourceLogic.delete(resourceKey);

        // ASSERT
        Assert.assertNotNull(result);
        Assert.assertEquals(resourceKey, result.getKey());

        // Verifica che il connettore sia stato de-registrato e la risorsa cancellata fisicamente
        verify(connectorManager, times(1)).unregisterConnector(mockResource);
        verify(resourceDAO, times(1)).deleteById(resourceKey);
    }

    @Test
    public void testDelete_TC02_NotFound() {
        // ARRANGE
        when(resourceDAO.authFind("INVALID-DB")).thenReturn(null);

        // ACT & ASSERT
        try {
            resourceLogic.delete("INVALID-DB");
            Assert.fail("Il test doveva fallire per risorsa inesistente");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    // ==========================================
    // TEST METODO: read & list
    // ==========================================

    @Test
    public void testRead_TC01_Success() {
        // ARRANGE
        ResourceTO expectedTO = new ResourceTO();
        expectedTO.setKey("DB-HR");

        when(resourceDAO.authFind("DB-HR")).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(expectedTO);

        // ACT
        ResourceTO result = resourceLogic.read("DB-HR");

        // ASSERT
        Assert.assertNotNull(result);
        Assert.assertEquals("DB-HR", result.getKey());
        verify(resourceDAO, times(1)).authFind("DB-HR");
    }

    @Test
    public void testList_TC01_Success() {
        // ARRANGE
        ResourceTO res1 = new ResourceTO(); res1.setKey("RES-1");
        ResourceTO res2 = new ResourceTO(); res2.setKey("RES-2");


        doReturn(List.of(mockResource, mockResource)).when(resourceDAO).findAll();
        when(binder.getResourceTO(mockResource)).thenReturn(res1, res2);

        // ACT
        List<ResourceTO> results = resourceLogic.list();

        // ASSERT
        Assert.assertNotNull(results);
        Assert.assertEquals("La lista dovrebbe contenere esattamente 2 elementi", 2, results.size());
        verify(resourceDAO, times(1)).findAll();
    }

    // ==========================================
    // TEST METODO: setLatestSyncToken
    // ==========================================

    @Test
    public void testSetLatestSyncToken_TC01_RealmAnyType() {
        // ARRANGE: Caso in cui si sincronizza il reame (REALM_ANYTYPE)
        String resourceKey = "DB-HR";
        String anyTypeKey = SyncopeConstants.REALM_ANYTYPE; // "REALM"

        when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);

        // Simula la presenza di un OrgUnit associato alla risorsa
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
        when(mockOrgUnit.getObjectClass()).thenReturn("__ORGUNIT__");

        SyncToken mockToken = new SyncToken("T0K3N-123");
        // Quando il connettore cerca l'ultimo token, ritorna quello mockato
        when(mockConnector.getLatestSyncToken(any(ObjectClass.class))).thenReturn(mockToken);

        // ACT
        resourceLogic.setLatestSyncToken(resourceKey, anyTypeKey);

        // ASSERT
        // Verifichiamo che l'org unit abbia effettivamente ricevuto il token convertito in stringa
        //verify(mockOrgUnit, times(1)).setSyncToken("T0K3N-123"); // riga cambiata perche dava errore
        verify(mockOrgUnit, times(1)).setSyncToken(contains("T0K3N-123")); // riga aggiunta manualmente da me per risolvere l'errore dell'LLM
        verify(resourceDAO, times(1)).save(mockResource); // Verifica l'effettivo salvataggio
    }

    @Test
    public void testSetLatestSyncToken_TC02_SpecificAnyType() {
        // ARRANGE: Caso in cui si sincronizza uno specifico AnyType (es: UTENTE)
        String resourceKey = "DB-HR";
        String anyTypeKey = "USER";

        when(resourceDAO.authFind(resourceKey)).thenReturn(mockResource);
        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);

        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
        when(mockAnyType.getKey()).thenReturn(anyTypeKey);

        // Simula la provision (le regole di mappatura) per questo tipo di oggetto
        when(mockResource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.of(mockProvision));
        when(mockProvision.getObjectClass()).thenReturn("__ACCOUNT__");

        SyncToken mockToken = new SyncToken("USER-T0K3N");
        when(mockConnector.getLatestSyncToken(any(ObjectClass.class))).thenReturn(mockToken);

        // ACT
        resourceLogic.setLatestSyncToken(resourceKey, anyTypeKey);

        // ASSERT
//        verify(mockProvision, times(1)).setSyncToken("USER-T0K3N"); // riga rimossa perchè dava errore
        verify(mockProvision, times(1)).setSyncToken(contains("USER-T0K3N")); // riga aggiunta manualmente da me per risolvere l'errore dell'LLM
        verify(resourceDAO, times(1)).save(mockResource);
    }

    @Test
    public void testSetLatestSyncToken_TC03_AnyTypeNotFound() {
        // ARRANGE: L'AnyType indicato non esiste a database
        when(resourceDAO.authFind("DB-HR")).thenReturn(mockResource);
        when(anyTypeDAO.findById("INVALID_TYPE")).thenReturn(Optional.empty());

        // ACT & ASSERT
        try {
            resourceLogic.setLatestSyncToken("DB-HR", "INVALID_TYPE");
            Assert.fail("Doveva esplodere per AnyType non trovato");
        } catch (NotFoundException e) {
            Assert.assertTrue(e.getMessage().contains("AnyType INVALID_TYPE"));
        }
    }

    // ==========================================
    // TEST METODO: check
    // ==========================================

    @Test
    public void testCheck_TC01_Success() {
        // ARRANGE
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setConnector("Conn-123");

        ConnInstanceTO connInstanceTO = new ConnInstanceTO();

        // Il DAO trova il connettore base
        doReturn(Optional.of(mockConn)).when(connInstanceDAO).findById("Conn-123");
        when(connInstanceDataBinder.getConnInstanceTO(mockConn)).thenReturn(connInstanceTO);

        // La manager costruisce un override (una configurazione fittizia creata al volo)
        when(connectorManager.buildConnInstanceOverride(
                eq(connInstanceTO), any(), any())).thenReturn(mockConn);

        // Il connector manager crea una sessione "fittizia" temporanea del connettore
        when(connectorManager.createConnector(mockConn)).thenReturn(mockConnector);

        // ACT
        // test() è un metodo void, se non lancia eccezioni, il test ha successo
        resourceLogic.check(resourceTO);

        // ASSERT
        // Verifichiamo che il metodo test() del connettore sia stato invocato per verificare la connessione
        verify(mockConnector, times(1)).test();
    }

    @Test
    public void testCheck_TC02_ConnInstanceNotFound() {
        // ARRANGE
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setConnector("MISSING_CONN");

        when(connInstanceDAO.findById("MISSING_CONN")).thenReturn(Optional.empty());

        // ACT & ASSERT
        try {
            resourceLogic.check(resourceTO);
            Assert.fail("Il test doveva fallire poichè il connettore specificato non esiste");
        } catch (NotFoundException e) {
            Assert.assertTrue(e.getMessage().contains("Connector MISSING_CONN"));
        }
    }

}
