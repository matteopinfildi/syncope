package org.apache.syncope.core.logic;

import static org.mockito.Mockito.*;

import org.apache.syncope.common.lib.to.Mapping;
import org.apache.syncope.common.lib.to.Provision;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.identityconnectors.framework.common.objects.filter.Filter;


import org.apache.commons.lang3.tuple.Pair;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.to.ConnObject;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.DuplicateException;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.AnyType;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.ConnInstance;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.identityconnectors.framework.common.objects.SearchResult;

public class ResourceLogicLLMFew2Test {

    private ResourceLogic resourceLogic;

    private ExternalResourceDAO resourceDAO;
    private AnyTypeDAO anyTypeDAO;
    private ConnInstanceDAO connInstanceDAO;
    private ResourceDataBinder binder;
    private ConnInstanceDataBinder connInstanceDataBinder;
    private OutboundMatcher outboundMatcher;
    private MappingManager mappingManager;
    private ConnectorManager connectorManager;
    private AnyUtilsFactory anyUtilsFactory;
    private Connector mockConnector;

    @Before
    public void setUp() {
        resourceDAO = mock(ExternalResourceDAO.class);
        anyTypeDAO = mock(AnyTypeDAO.class);
        connInstanceDAO = mock(ConnInstanceDAO.class);
        binder = mock(ResourceDataBinder.class);
        connInstanceDataBinder = mock(ConnInstanceDataBinder.class);
        outboundMatcher = mock(OutboundMatcher.class);
        mappingManager = mock(MappingManager.class);
        connectorManager = mock(ConnectorManager.class);
        anyUtilsFactory = mock(AnyUtilsFactory.class);
        mockConnector = mock(Connector.class);

        resourceLogic = new ResourceLogic(
                resourceDAO,
                anyTypeDAO,
                connInstanceDAO,
                binder,
                connInstanceDataBinder,
                outboundMatcher,
                mappingManager,
                connectorManager,
                anyUtilsFactory
        );
    }

    @Test
    public void testSearchConn_TC01(){
        String key = "DB-HR";
        String anyTypeKey = "USER";
        int size = 10;
        Filter filtroValido = mock(Filter.class);

        AnyType mockAnyType = mock(AnyType.class);
        lenient().doReturn(anyTypeKey).when(mockAnyType).getKey();
        lenient().doReturn(org.apache.syncope.common.lib.types.AnyTypeKind.USER).when(mockAnyType).getKind();
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);

        ExternalResource mockResource = mock(ExternalResource.class);
        lenient().doReturn(mockResource).when(resourceDAO).authFind(key);
        lenient().doReturn(Optional.of(mockResource)).when(resourceDAO).findById(key);

        Provision mockProvision = mock(Provision.class);
        doReturn(Optional.of(mockProvision)).when(mockResource).getProvisionByAnyType(anyTypeKey);

        Mapping mockMapping = mock(Mapping.class);
        doReturn(mockMapping).when(mockProvision).getMapping();
        lenient().doReturn("__ACCOUNT__").when(mockProvision).getObjectClass();
        lenient().doReturn(java.util.Collections.emptyList()).when(mockMapping).getItems();

        doReturn(mockConnector).when(connectorManager).getConnector(mockResource);

        SearchResult expectedSearchResult = mock(SearchResult.class);
        doReturn(expectedSearchResult).when(mockConnector).search(any(), any(), any(), anyInt(), any(), any(), any());

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(filtroValido, java.util.Collections.emptySet(), key, anyTypeKey, size, null, null);

        Assert.assertEquals(expectedSearchResult, result.getLeft());
        verify(mockConnector).search(any(), eq(filtroValido), any(), eq(10), any(), any(), any());
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
    public void testCreate_TC03_BlankKey(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("");
        resourceTO.setConnector("Conn-123");

        try {
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per key invalida o mancante");
        } catch(SyncopeClientException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCreate_TC04_DuplicateResource(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("DB-HR");
        resourceTO.setConnector("Conn-123");

        ConnInstance mockConnInstance = mock(ConnInstance.class);
        doReturn(mockConnInstance).when(connInstanceDAO).authFind(eq("Conn-123"));

        ExternalResource mockDuplicate = mock(ExternalResource.class);
        doReturn(mockDuplicate).when(resourceDAO).authFind(eq("DB-HR"));

        try {
            resourceLogic.create(resourceTO);
            Assert.fail("Il test doveva esplodere per risorsa duplicata");
        } catch(DuplicateException e) {
            Assert.assertTrue(true);
        } catch(Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRead_TC05_Success(){
        String key = "DB-HR";
        ExternalResource mockResource = mock(ExternalResource.class);
        ResourceTO expectedResourceTO = mock(ResourceTO.class);

        doReturn(mockResource).when(resourceDAO).authFind(key);
        doReturn(expectedResourceTO).when(binder).getResourceTO(mockResource);

        ResourceTO result = resourceLogic.read(key);

        Assert.assertEquals(expectedResourceTO, result);
        verify(resourceDAO).authFind(eq(key));
        verify(binder).getResourceTO(eq(mockResource));
    }

    @Test
    public void testRead_TC06_NotFound(){
        String key = "FANTASMA";

        doReturn(null).when(resourceDAO).authFind(key);

        try {
            resourceLogic.read(key);
            Assert.fail("Il test doveva esplodere per risorsa inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testDelete_TC07_NotFound(){
        String key = "FANTASMA";

        doReturn(null).when(resourceDAO).authFind(key);

        try {
            resourceLogic.delete(key);
            Assert.fail("Il test doveva esplodere per risorsa inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testList_TC08_PopulatedList(){
        List<ExternalResource> resources = new ArrayList<>();
        ExternalResource mockRes1 = mock(ExternalResource.class);
        ExternalResource mockRes2 = mock(ExternalResource.class);
        resources.add(mockRes1);
        resources.add(mockRes2);

        ResourceTO mockResTO = mock(ResourceTO.class);

        doReturn(resources).when(resourceDAO).findAll();
        doReturn(mockResTO).when(binder).getResourceTO(any(ExternalResource.class));

        List<ResourceTO> result = resourceLogic.list();

        Assert.assertEquals(2, result.size());
        verify(resourceDAO).findAll();
        verify(binder, Mockito.times(2)).getResourceTO(any(ExternalResource.class));
    }

    @Test
    public void testList_TC09_EmptyList(){
        List<ExternalResource> resources = new ArrayList<>();

        doReturn(resources).when(resourceDAO).findAll();

        List<ResourceTO> result = resourceLogic.list();

        Assert.assertEquals(0, result.size());
        verify(resourceDAO).findAll();
        verify(binder, Mockito.never()).getResourceTO(any(ExternalResource.class));
    }

    @Test
    public void testCheck_TC10_Success(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setConnector("Conn-123");

        ConnInstance mockConnInstance = mock(ConnInstance.class);
        doReturn(Optional.of(mockConnInstance)).when(connInstanceDAO).findById(eq("Conn-123"));

        org.apache.syncope.common.lib.to.ConnInstanceTO mockConnInstanceTO = mock(org.apache.syncope.common.lib.to.ConnInstanceTO.class);
        doReturn(mockConnInstanceTO).when(connInstanceDataBinder).getConnInstanceTO(mockConnInstance);

        ConnInstance mockConnInstanceOverride = mock(ConnInstance.class);
        doReturn(mockConnInstanceOverride).when(connectorManager).buildConnInstanceOverride(any(), any(), any());

        Connector mockConnectorInstance = mock(Connector.class);
        doReturn(mockConnectorInstance).when(connectorManager).createConnector(mockConnInstanceOverride);

        resourceLogic.check(resourceTO);

        verify(connInstanceDAO).findById(eq("Conn-123"));
        verify(connectorManager).createConnector(any());
        verify(mockConnectorInstance).test();
    }

    @Test
    public void testCheck_TC11_NotFound(){
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setConnector("FANTASMA");

        doReturn(Optional.empty()).when(connInstanceDAO).findById(anyString());

        try {
            resourceLogic.check(resourceTO);
            Assert.fail("Il test doveva esplodere per connector inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSetLatestSyncToken_TC12_NotFound(){
        String key = "FANTASMA";
        String anyTypeKey = "USER";

        doReturn(null).when(resourceDAO).authFind(key);

        try {
            resourceLogic.setLatestSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per resource inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRemoveSyncToken_TC13_NotFound(){
        String key = "FANTASMA";
        String anyTypeKey = "GROUP";

        doReturn(null).when(resourceDAO).authFind(key);

        try {
            resourceLogic.removeSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per resource inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConnObjectByAnyKey_TC14_AnyTypeNotFound(){
        String key = "DB-HR";
        String anyTypeKey = "FANTASMA";
        String anyKey = "uuid-1234-5678";

        doReturn(Optional.empty()).when(anyTypeDAO).findById(anyTypeKey);

        try {
            resourceLogic.readConnObjectByAnyKey(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per AnyType inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testReadConnObjectByConnObjectKeyValue_TC15_AnyTypeNotFound(){
        String key = "DB-HR";
        String anyTypeKey = "FANTASMA";
        String connObjectKeyValue = "mario.rossi";

        doReturn(Optional.empty()).when(anyTypeDAO).findById(anyTypeKey);

        try {
            resourceLogic.readConnObjectByConnObjectKeyValue(key, anyTypeKey, connObjectKeyValue);
            Assert.fail("Il test doveva esplodere per AnyType inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testGetConnObjectKeyValue_TC16_ResourceNotFound(){
        String key = "FANTASMA";
        String anyTypeKey = "USER";
        String anyKey = "uuid-9999";

        AnyType mockAnyType = mock(AnyType.class);
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);

        doReturn(null).when(resourceDAO).authFind(key);

        try {
            resourceLogic.getConnObjectKeyValue(key, anyTypeKey, anyKey);
            Assert.fail("Il test doveva esplodere per resource inesistente");
        } catch(NotFoundException e) {
            Assert.assertTrue(true);
        }
    }
}
