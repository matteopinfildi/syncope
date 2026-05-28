package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.common.lib.types.TraceLevel;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicCRUDTest {

    // sono stati visti dalla classe, servono alla classe per funzionare
    // visto che non vogliamo accendere un database vero, creiamo queste marionette
    // di base sono "stupide": se le chiami, restituiscono null.
    @Mock
    private ExternalResourceDAO resourceDAO;
    @Mock
    private ExternalResource mockResource;
    @Mock
    private ExternalResource mockUpdatedResource;
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
    @Mock
    private Connector mockConnector;
    @Mock
    private Realm mockRealm;
    @Mock
    private ConnInstance mockConn; //GEMINI!!!

    private ResourceLogic resourceLogic; // questo è l'ogetto da testare e non c'è @Mock perchè deve essere "vero"

    @Before // viene eseguito in automatico prima di ogni singolo test
    public void setUp_Generic() {
        // instanziazione del vero oggetto
        resourceLogic = new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory) {

            @Override
            protected void securityChecks(final Set<String> effectiveRealms, final String realm, final String key) {
                // Svuotato per permettere l'esecuzione dello Unit Test isolato così da non fargli controllare se c'è un utente loggato
            }
        };

        // Setup globale del Reame e del Connettore
        // il mockRealm ritornerebbe null se non ci stesse questo comando
        // così facendo non ritorna null, che manderebbe il tutto in crash, ma ritorna una stringa "/"
        when(mockRealm.getFullPath()).thenReturn("/");
        // quando verrà chiamato quel metodo ritorna l'oggetto finto mockRealm
        when(mockConn.getAdminRealm()).thenReturn(mockRealm);

        // Configurazione delle risposte del DAO connettori
        lenient().when(connInstanceDAO.authFind("Conn-123")).thenReturn(mockConn);
        lenient().when(connInstanceDAO.authFind("Conn-456")).thenReturn(mockConn);
        lenient().when(mockResource.getConnector()).thenReturn(mockConn);
        lenient().when(resourceDAO.authFind("DB-HR")).thenReturn(mockResource);
    }


    @Before
    public void setUp_Check() {
        lenient().doReturn(Optional.of(mockConn)).when(connInstanceDAO).findById("Conn-123");
        lenient().when(connectorManager.createConnector(any())).thenReturn(mockConnector);
    }


    @Test
    public void testCreate_TC01() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB");
        resourceTO.setConnector("Conn-123");
        resourceTO.getProvisions().add(new Provision());
        resourceTO.setCreateTraceLevel(TraceLevel.ALL);

        ExternalResource mockResource = mock(ExternalResource.class);

        // Istruiamo il mock del binder su tutte le sue conversioni
        // Quando ti passano A restituisci B
        when(binder.create(resourceTO)).thenReturn(mockResource);
        // quando chiedono di salvare B restituisci B
        when(resourceDAO.save(mockResource)).thenReturn(mockResource);
        // FIX: Diciamo al binder cosa restituire alla fine del metodo create
        // Quando ti passano B restituisci A
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        // ACT
        // Chiamiamo finalmente il metodo vero di Syncope, passandogli l'oggetto perfetto
        ResourceTO result = resourceLogic.create(resourceTO);

        // ASSERT --> ci serve per verificare che result non sia null
        Assert.assertNotNull(result);
        // questo è un controllo comportamentale di Mockito. Non verifica una variabile, ma verifica un'azione
        // resourceDAO, times(1): Controlla la cronologia del finto database. Controlla che sia stato chiamato esattamente 1 volta.
        // .save(mockResource): Precisa quale metodo doveva essere chiamato.
        // dunque ci assicuriamo che ResourceLogic abbia effettivamente provato a salvare l'entità nel database.
        // Se ci fosse un bug in Syncope che salta il salvataggio, il test lo scoprirebbe qui.
        verify(resourceDAO, times(1)).save(mockResource);
//        verify(resourceDAO, times(2)).save(mockResource); COSI' FACENDO CONTROLLO CHE SONO STATI SCRITTI BENE
    }

    @Test
    public void testCreate_TC02() {
        ResourceTO resourceTO = null;

        try{
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per risorsa nulla");
        } catch(NullPointerException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreate_TC03() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey(""); // l'errore sta qua, stiamo passando una stringa vuota --> verrà lanciata un eccezione
//        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-123");

        try{
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per key vuota");
        } catch(SyncopeClientException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreate_TC04() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey(null); // l'errore sta qua, stiamo passando una stringa nulla --> verrà lanciata un eccezione
//        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-123");

        try{
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per key nulla");
        } catch(SyncopeClientException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreate_TC05() {
        // ARRANGE: Input con caratteri speciali non ammessi
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("Risorsa / Spazi!"); // il problema sta in questa stringa che ha dei caratteri non ammessi, SYNCOPE NON HA ALCUN IF PER BLOCCARLA
        resourceTO.setConnector("Conn-123");

        ExternalResource mockResource = mock(ExternalResource.class);

        // Istruiamo il mock del binder a lanciare un'eccezione, dato che SYNCOPE non ha alcun controllo per bloccare queste stringhe
        // ma si aspetta che sia il DB a bloccarlo
        // per questo scriviamo .thenThrow per dire al mock di lanciare un eccezione, così da
        // simulare esattamente quello che succederebbe nell'ambiente di produzione reale, testando la robustezza dell'intera catena.
        when(binder.create(resourceTO)).thenReturn(mockResource);
        when(resourceDAO.save(mockResource)).thenThrow(new IllegalArgumentException("Invalid key pattern"));

        try{
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per key invalida");
        } catch(IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreate_TC06() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-Test");
        resourceTO.setConnector("Conn-FANTASMA"); // ID del connettore inventato
//        resourceTO.setConnector("Conn-123");

        try{
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per ID del connettore invalido");
        } catch(SyncopeClientException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreate_TC07() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-Test");
        resourceTO.setConnector(null); // ID del connettore nullo --> verrà lanciata un'eccezione
//        resourceTO.setConnector("Conn-123");

        try{
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per ID del connettore nullo");
        } catch(SyncopeClientException e) {
            Assert.assertTrue(true);
        }
    }

    @Test // questo è il caso "boundary" (limite)
    public void testCreate_TC08() {
        // in provision ci sta una lista vuota e con regole di tracciamento .NONE
        // dunque caso in cui Magari sta solo configurando l'infrastruttura iniziale e non sa ancora quali regole di mappatura (provisions) usare.
        // In più, non vuole generare log inutili e mette il tracciamento a zero (TraceLevel.NONE)
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("LDAP-New");
        resourceTO.setConnector("Conn-456");
        resourceTO.setCreateTraceLevel(TraceLevel.NONE);

        ExternalResource mockResource = mock(ExternalResource.class);

        // stessa cosa fatta nel test TC01
        when(binder.create(resourceTO)).thenReturn(mockResource);
        when(resourceDAO.save(mockResource)).thenReturn(mockResource);
        // FIX: Diciamo al binder cosa restituire alla fine del metodo create
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        // ACT
        ResourceTO result = resourceLogic.create(resourceTO);

        // ASSERT --> ci serve per verificare che result non sia null
        Assert.assertNotNull(result);
        // questo è un controllo comportamentale di Mockito. Non verifica una variabile, ma verifica un'azione
        // resourceDAO, times(1): Controlla la cronologia del finto database. Controlla che sia stato chiamato esattamente 1 volta.
        // .save(mockResource): Precisa quale metodo doveva essere chiamato.
        // dunque ci assicuriamo che ResourceLogic abbia effettivamente provato a salvare l'entità nel database.
        // Se ci fosse un bug in Syncope che salta il salvataggio, il test lo scoprirebbe qui.
        verify(resourceDAO, times(1)).save(mockResource);
    }

    @Test
    public void testCreate_TC09() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-123");

        lenient().when(binder.create(resourceTO)).thenReturn(mockResource);
        lenient().when(resourceDAO.save(mockResource)).thenThrow(new IllegalArgumentException("Violazione di unicità: La risorsa esiste già"));

        try {
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per violazione di chiave duplicata");
        } catch (DuplicateException e) {
            System.out.println("Errore catturato: " + e.getMessage());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC01_HappyPath(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
//        resourceTO.setKey("FANTSASMA");
        resourceTO.setConnector("Conn-123");


        when(binder.update(mockResource, resourceTO)).thenReturn(mockUpdatedResource);
        when(resourceDAO.save(mockUpdatedResource)).thenReturn(mockUpdatedResource);
        when(binder.getResourceTO(mockUpdatedResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.update(resourceTO);
        Assert.assertNotNull(result);
        verify(resourceDAO, times(1)).save(mockUpdatedResource);
    }


    @Test
    public void testUpdate_TC02(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("FANTASMA");
//        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-123");

        try{
            resourceLogic.update(resourceTO);
            Assert.fail("Il test doveva esplodere per key invalida");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC03(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector(null);

        when(binder.update(mockResource, resourceTO)).thenThrow(new IllegalArgumentException("Connettore Nullo"));

        try{
            resourceLogic.update(resourceTO);
            Assert.fail("Il test doveva esplodere per ID connettore nullo");
        } catch(IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC04(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-FANTASMA");

        when(binder.update(mockResource, resourceTO)).thenThrow(new IllegalArgumentException("Connettore Inesistente"));

        try{
            resourceLogic.update(resourceTO);
            Assert.fail("Il test doveva esplodere per ID connettore invalido");
        } catch(IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC05(){
        ResourceTO resourceTO = null;

        try{
            resourceLogic.update(resourceTO);
            Assert.fail("Il test doveva esplodere per risorsa nulla");
        } catch (NullPointerException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testUpdate_TC06(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-456");
        resourceTO.setCreateTraceLevel(TraceLevel.NONE);


        when(binder.update(mockResource, resourceTO)).thenReturn(mockUpdatedResource);
        when(resourceDAO.save(mockUpdatedResource)).thenReturn(mockUpdatedResource);
        when(binder.getResourceTO(mockUpdatedResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.update(resourceTO);
        Assert.assertNotNull(result);
        verify(resourceDAO, times(1)).save(mockUpdatedResource);
    }

    @Test
    public void testDelete_TC01(){
        String key = "DB-HR";

        ResourceTO expectedDeletedTO = new ResourceTO();
        expectedDeletedTO.setKey(key);

        when(binder.getResourceTO(mockResource)).thenReturn(expectedDeletedTO);

        ResourceTO result = resourceLogic.delete(key);

        Assert.assertNotNull(result);
        Assert.assertEquals(key, result.getKey());
        verify(resourceDAO, times(1)).deleteById(key);
//        verify(resourceDAO, times(1)).deleteById("Invalid_Key"); COSI' FACENDO CONTROLLO CHE SONO STATI SCRITTI BENE
    }

    @Test
    public void testDelete_TC02(){
        String key = "FANTASMA";
//        String key = "DB-HR";

        try{
            resourceLogic.delete(key);
            Assert.fail("Il test doveva esplodere per stringa invalida");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testDelete_TC03(){
        String key = "DB-HR";

        ResourceTO expectedDeletedTO = new ResourceTO();
        expectedDeletedTO.setKey(key);

        when(binder.getResourceTO(mockResource)).thenReturn(expectedDeletedTO);
        doThrow(new IllegalArgumentException("Risorsa in uso")).when(resourceDAO).deleteById(key);

        try{
            resourceLogic.delete(key);
            Assert.fail("Il test doveva esplodere perchè la risorsa è in uso");
        } catch(IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testDelete_TC04(){
        String key = "";
//        String key = "DB-HR";

        try{
            resourceLogic.delete(key);
            Assert.fail("Il test doveva esplodere per key vuota");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }

    }

    @Test
    public void testDelete_TC05(){
        String key = null;
//        String key = "DB-HR";

        try{
            resourceLogic.delete(key);
            Assert.fail("Il test doveva esplodere per key nulla");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRead_TC01(){
        String key = "DB-HR";

        ResourceTO expectedReadedTO = new ResourceTO();
        expectedReadedTO.setKey(key);


        when(binder.getResourceTO(mockResource)).thenReturn(expectedReadedTO); // commentando questa riga CONTROLLO CHE SONO STATI SCRITTI BENE

        ResourceTO result = resourceLogic.read(key);

        Assert.assertNotNull(result);
        Assert.assertEquals(key, result.getKey());
        verify(resourceDAO, times(1)).authFind(key);
    }

    @Test
    public void testRead_TC02(){
        String key = "FANTASMA";
//        String key = "DB-HR";

        try{
            resourceLogic.read(key);
            Assert.fail("Il test doveva esplodere per stringa invalida");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRead_TC03(){
        String key = "";
//        String key = "DB-HR";

        try{
            resourceLogic.read(key);
            Assert.fail("Il test doveva esplodere per stringa vuota");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRead_TC04(){
        String key = null;
//        String key = "DB-HR";

        try{
            resourceLogic.read(key);
            Assert.fail("Il test doveva esplodere per stringa nulla");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCheck_TC01(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-123");

        doNothing().when(mockConnector).test();
        resourceLogic.check(resourceTO);
        verify(mockConnector, times(1)).test();
    }

    @Test
    public void testCheck_TC02(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-123");

        doThrow(new RuntimeException("Timeout Connection")).when(mockConnector).test();

        try {
            resourceLogic.check(resourceTO);
            Assert.fail("Il test doveva simulare il crash di rete");
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCheck_TC03(){
        ResourceTO resourceTO = null;

        try {
            resourceLogic.check(resourceTO);
            Assert.fail("Il test doveva esplodere per input nullo");
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCheck_TC04(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-FANTASMA");
//        resourceTO.setConnector("Conn-123");

        try {
            resourceLogic.check(resourceTO);
            Assert.fail("Il test doveva esplodere per via di ID connettore invalido");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

}