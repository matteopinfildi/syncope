package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.common.lib.types.TraceLevel;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.java.data.ResourceDataBinderImpl;
import org.apache.syncope.core.provisioning.api.IntAttrNameParser;
import org.apache.syncope.core.provisioning.api.propagation.PropagationTaskExecutor;
import org.apache.syncope.core.provisioning.api.jexl.JexlTools;

import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicIT {

    private ResourceLogic resourceLogic;
    private ResourceDataBinderImpl resourceDataBinder;

    @Mock
    private ExternalResourceDAO mockResourceDAO;
    @Mock
    private ConnInstanceDataBinder mockConnInstanceDataBinder;
    @Mock
    private OutboundMatcher mockOutboundMatcher;
    @Mock
    private MappingManager mockMappingManager;
    @Mock
    private ConnectorManager mockConnectorManager;
    @Mock
    private AnyUtilsFactory mockAnyUtilsFactory;
    @Mock
    private AnyTypeDAO mockAnyTypeDAO;
    @Mock
    private ConnInstanceDAO mockConnInstanceDAO;
    @Mock
    private PolicyDAO mockPolicyDAO;
    @Mock
    private AnyTypeClassDAO mockAnyTypeClassDAO;
    @Mock
    private ImplementationDAO mockImplementationDAO;
    @Mock
    private PlainSchemaDAO mockPlainSchemaDAO;
    @Mock
    private EntityFactory mockEntityFactory;
    @Mock
    private IntAttrNameParser mockIntAttrNameParser;
    @Mock
    private PropagationTaskExecutor mockPropagationTaskExecutor;
    @Mock
    private JexlTools mockJexlTools;
    @Mock
    private ConnInstance mockConn;
    @Mock
    private Realm mockRealm;
    @Mock
    private ExternalResource mockExternalResource;

    private ResourceTO baseResourceTO;
    private String storedResourceKey;
    private List<Provision> storedProvisions;

    @Before
    public void setUp() {
        resourceDataBinder = new ResourceDataBinderImpl(
                mockAnyTypeDAO,
                mockConnInstanceDAO,
                mockPolicyDAO,
                mockAnyTypeClassDAO,
                mockImplementationDAO,
                mockPlainSchemaDAO,
                mockEntityFactory,
                mockIntAttrNameParser,
                mockPropagationTaskExecutor,
                mockJexlTools
        );

        resourceLogic = new ResourceLogic(
                mockResourceDAO, mockAnyTypeDAO, mockConnInstanceDAO, resourceDataBinder,
                mockConnInstanceDataBinder, mockOutboundMatcher, mockMappingManager,
                mockConnectorManager, mockAnyUtilsFactory) {
            @Override
            protected void securityChecks(final Set<String> effectiveRealms, final String realm, final String key) {
                // Bypass dei controlli di sicurezza per l'ambiente di test
            }
        };

        when(mockRealm.getFullPath()).thenReturn("/");
        when(mockConn.getAdminRealm()).thenReturn(mockRealm);
        lenient().when(mockConnInstanceDAO.authFind("Conn-123")).thenReturn(mockConn);
        baseResourceTO = new ResourceTO();
        baseResourceTO.setConnector("Conn-123");
        lenient().doReturn(Optional.of(mockConn)).when(mockConnInstanceDAO).findById("Conn-123");

        storedProvisions = new ArrayList<>();
        // 1. Diciamo alla EntityFactory di NON restituire null, ma il nostro mock
        lenient().when(mockEntityFactory.newEntity(ExternalResource.class)).thenReturn(mockExternalResource);
        // 2. Diamo memoria al mock! Quando il Binder fa setKey(), salviamo la stringa.
        // Quando fa getKey(), gliela restituiamo.
        doAnswer(invocation -> {
            storedResourceKey = invocation.getArgument(0);
            return null;
        }).when(mockExternalResource).setKey(anyString());
        lenient().when(mockExternalResource.getKey()).thenAnswer(invocation -> storedResourceKey);
        // 3. Il Binder cercherà di aggiungere elementi alla lista delle Provision,
        // quindi gli restituiamo una vera ArrayList invece di null.
        lenient().when(mockExternalResource.getProvisions()).thenReturn(storedProvisions);
        // 4. Simuliamo la presenza del connettore
        lenient().when(mockExternalResource.getConnector()).thenReturn(mockConn);
    }

    private void setUp_Create() {
        lenient().when(mockResourceDAO.save(any(ExternalResource.class))).thenAnswer(invocation -> invocation.getArgument(0));
    }

    private void setUp_Update() {
        lenient().when(mockResourceDAO.authFind(anyString())).thenAnswer(invocation -> {
            String searchedKey = invocation.getArgument(0);
            storedResourceKey = searchedKey;
            return mockExternalResource;
        });

        lenient().when(mockResourceDAO.findById(anyString())).thenAnswer(invocation -> {
            String searchedKey = invocation.getArgument(0);
            storedResourceKey = searchedKey;
            return Optional.of(mockExternalResource);
        });

        lenient().when(mockResourceDAO.save(any(ExternalResource.class))).thenReturn(mockExternalResource);
    }

    private void setup_Read() {
        lenient().when(mockResourceDAO.authFind(anyString())).thenAnswer(invocation -> {
            storedResourceKey = invocation.getArgument(0);
            return mockExternalResource;
        });
    }

    private void setup_Delete() {
        setup_Read();
        lenient().doNothing().when(mockResourceDAO).deleteById(anyString());
    }

    @Test
    public void testCreateIntegration_TC01() {
        setUp_Create();
        baseResourceTO.setKey("DB-HR");
        baseResourceTO.getProvisions().add(new Provision());
        baseResourceTO.setCreateTraceLevel(TraceLevel.ALL);

        ResourceTO result = resourceLogic.create(baseResourceTO);

        Assert.assertNotNull(result);
        Assert.assertEquals("DB-HR", result.getKey());
        verify(mockResourceDAO, times(1)).save(any(ExternalResource.class));
    }

    @Test
    public void testCreateIntegration_TC02() {
        setUp_Create();
        baseResourceTO.setKey("DB-NULL");

        ResourceTO result = resourceLogic.create(baseResourceTO);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getProvisions().isEmpty());
        verify(mockResourceDAO, times(1)).save(any(ExternalResource.class));
    }

    @Test
    public void testCreateIntegration_TC03() {
        setUp_Create();
        baseResourceTO.setKey("DB-DUPLICATE");

        when(mockResourceDAO.save(any(ExternalResource.class)))
                .thenThrow(new IllegalArgumentException("Violazione unicità: chiave duplicata"));

        try {
            resourceLogic.create(baseResourceTO);
            Assert.fail("Il test doveva esplodere per via della violazione di unicità");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreateIntegration_TC04() {
        setUp_Create();
        baseResourceTO.setKey("DB-INV");
        baseResourceTO.setConnector(null);

        try {
            resourceLogic.create(baseResourceTO);
            Assert.fail("Il test doveva esplodere per input invalido prima di raggiungere il DAO");
        } catch (Exception e) {
            Assert.assertTrue(true);
            verify(mockResourceDAO, never()).save(any());
        }
    }

    @Test
    public void testUpdateIntegration_TC01() {
        setUp_Update();
        String key = "DB-HR";
        baseResourceTO.setKey(key);
        baseResourceTO.setCreateTraceLevel(TraceLevel.FAILURES);

        ResourceTO result = resourceLogic.update(baseResourceTO);

        Assert.assertNotNull(result);
        verify(mockResourceDAO, times(1)).authFind(key);
        verify(mockResourceDAO, times(1)).save(any(ExternalResource.class));
    }

    @Test
    public void testUpdateIntegration_TC02() {
        setUp_Update();
        String key = "DB-FANTASMA";
        baseResourceTO.setKey(key);

        when(mockResourceDAO.authFind(key)).thenThrow(new NotFoundException("Risorsa non trovata: " + key));

        try {
            resourceLogic.update(baseResourceTO);
            Assert.fail("Il test doveva esplodere perché la risorsa non esiste");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
            verify(mockResourceDAO, never()).save(any());
        }
    }

    @Test
    public void testUpdateIntegration_TC03() {
        setUp_Update();
        String key = "DB-HR";
        baseResourceTO.setKey(key);

        Provision provisionInvalida = new Provision();
        provisionInvalida.setAnyType("TIPO-FANTASMA");
        baseResourceTO.getProvisions().add(provisionInvalida);

        lenient().when(mockAnyTypeDAO.findById(anyString())).thenReturn(Optional.empty());

        ResourceTO result = resourceLogic.update(baseResourceTO);

        Assert.assertNotNull(result);
        verify(mockResourceDAO, times(1)).save(any(ExternalResource.class));
        verify(mockAnyTypeDAO, times(1)).findById("TIPO-FANTASMA");
    }

    @Test
    public void testReadIntegration_TC01(){
        setup_Read();
        String key = "DB-HR";
        ResourceTO result = resourceLogic.read(key);

        Assert.assertNotNull(result);
        Assert.assertEquals(key, result.getKey());
        verify(mockResourceDAO, times(1)).authFind(key);

    }

    @Test
    public void testReadIntegration_TC02(){
        setup_Read();
        String key = "DB-FANTASMA";
        baseResourceTO.setKey(key);

        when(mockResourceDAO.authFind(key)).thenThrow(new NotFoundException("Risorsa non trovata: " + key));

        try {
            resourceLogic.read(key);
            Assert.fail("Il test doveva esplodere perché la risorsa non esiste");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadIntegration_TC03(){
        setup_Read();
        try {
            resourceLogic.read(null);
            Assert.fail("Il test doveva esplodere per via dell'input nullo");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
            verify(mockResourceDAO, times(1)).authFind(null);
        }
    }

    @Test
    public void testDeleteIntegration_TC01(){
        setup_Delete();
        String key = "DB-HR";
        ResourceTO result = resourceLogic.delete(key);

        Assert.assertNotNull(result);
        Assert.assertEquals(key, result.getKey());
        verify(mockResourceDAO, times(1)).authFind(key);
        verify(mockResourceDAO, times(1)).deleteById(key);

    }

    @Test
    public void testDeleteIntegration_TC02(){
        setup_Delete();
        String key = "DB-FANTASMA";
        baseResourceTO.setKey(key);

        when(mockResourceDAO.authFind(key)).thenThrow(new NotFoundException("Risorsa non trovata: " + key));

        try {
            resourceLogic.delete(key);
            Assert.fail("Il test doveva esplodere perché la risorsa non esiste");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
            verify(mockResourceDAO, never()).deleteById(anyString());
        }
    }
}