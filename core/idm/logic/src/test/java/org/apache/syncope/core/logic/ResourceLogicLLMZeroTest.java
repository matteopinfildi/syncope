package org.apache.syncope.core.logic;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.*;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.IdMEntitlement;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.DuplicateException;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.Any;
import org.apache.syncope.core.persistence.api.entity.AnyType;
import org.apache.syncope.core.persistence.api.entity.AnyUtils;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.ConnInstance;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.apache.syncope.core.provisioning.java.utils.ConnObjectUtils;
import org.apache.syncope.core.provisioning.java.utils.MappingUtils;
import org.apache.syncope.core.spring.security.AuthContextUtils;
import org.apache.syncope.core.spring.security.DelegatedAdministrationException;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.OperationOptions;
import org.identityconnectors.framework.common.objects.SearchResult;
import org.identityconnectors.framework.common.objects.SyncToken;
import org.identityconnectors.framework.common.objects.filter.Filter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;
import org.apache.commons.lang3.tuple.Pair;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicLLMZeroTest {

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
    private MockedStatic<ConnObjectUtils> connObjectUtilsMock;
    private MockedStatic<MappingUtils> mappingUtilsMock;

    @Mock
    private ExternalResource mockResource;
    @Mock
    private ConnInstance mockConnInstance;
    @Mock
    private Realm mockRealm;
    @Mock
    private Connector mockConnector;
    @Mock
    private AnyType mockAnyType;
    @Mock
    private Provision mockProvision;
    @Mock
    private Mapping mockMapping;

    @Before
    public void setUp() {
        authContextUtilsMock = mockStatic(AuthContextUtils.class);
        realmUtilsMock = mockStatic(RealmUtils.class);
        connObjectUtilsMock = mockStatic(ConnObjectUtils.class);
        mappingUtilsMock = mockStatic(MappingUtils.class);

        // Security Context Default Mocks
        authContextUtilsMock.when(AuthContextUtils::getAuthorizations)
                .thenReturn(Map.of(
                        IdMEntitlement.RESOURCE_CREATE, Set.of("/"),
                        IdMEntitlement.RESOURCE_UPDATE, Set.of("/"),
                        IdMEntitlement.RESOURCE_DELETE, Set.of("/")
                ));
        realmUtilsMock.when(() -> RealmUtils.getEffective(anySet(), anyString()))
                .thenReturn(Set.of("/"));

        when(mockConnInstance.getAdminRealm()).thenReturn(mockRealm);
        when(mockRealm.getFullPath()).thenReturn("/");
        when(mockResource.getConnector()).thenReturn(mockConnInstance);
        when(mockResource.getKey()).thenReturn("resourceKey");
    }

    @After
    public void tearDown() {
        authContextUtilsMock.close();
        realmUtilsMock.close();
        connObjectUtilsMock.close();
        mappingUtilsMock.close();
    }

    @Test
    public void testCreateSuccess() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("newResource");
        resourceTO.setConnector("connectorKey");

        when(connInstanceDAO.authFind("connectorKey")).thenReturn(mockConnInstance);
        when(resourceDAO.authFind("newResource")).thenReturn(null);
        when(binder.create(resourceTO)).thenReturn(mockResource);
        when(resourceDAO.save(mockResource)).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.create(resourceTO);

        assertNotNull(result);
        assertEquals("newResource", result.getKey());
        verify(connectorManager, times(1)).registerConnector(mockResource);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreateMissingKey() {
        ResourceTO resourceTO = new ResourceTO();
        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreateMissingConnector() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("newResource");
        resourceTO.setConnector("invalidConnector");

        when(connInstanceDAO.authFind("invalidConnector")).thenReturn(null);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = DuplicateException.class)
    public void testCreateDuplicate() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("duplicateResource");
        resourceTO.setConnector("connectorKey");

        when(connInstanceDAO.authFind("connectorKey")).thenReturn(mockConnInstance);
        when(resourceDAO.authFind("duplicateResource")).thenReturn(mockResource);

        resourceLogic.create(resourceTO);
    }

    @Test(expected = DelegatedAdministrationException.class)
    public void testCreateUnauthorized() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("newResource");
        resourceTO.setConnector("connectorKey");

        when(connInstanceDAO.authFind("connectorKey")).thenReturn(mockConnInstance);
        realmUtilsMock.when(() -> RealmUtils.getEffective(anySet(), anyString()))
                .thenReturn(Collections.emptySet());

        resourceLogic.create(resourceTO);
    }

    @Test
    public void testUpdateSuccess() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("resourceKey");

        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        when(binder.update(mockResource, resourceTO)).thenReturn(mockResource);
        when(resourceDAO.save(mockResource)).thenReturn(mockResource);
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.update(resourceTO);

        assertNotNull(result);
        verify(resourceDAO, times(1)).save(mockResource);
    }

    @Test(expected = NotFoundException.class)
    public void testUpdateNotFound() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setKey("notFoundResource");

        when(resourceDAO.authFind("notFoundResource")).thenReturn(null);
        resourceLogic.update(resourceTO);
    }

    @Test
    public void testSetLatestSyncTokenRealmAnyType() {
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
        when(mockOrgUnit.getObjectClass()).thenReturn("__ACCOUNT__");

        SyncToken mockToken = new SyncToken("tokenValue");
        when(mockConnector.getLatestSyncToken(any(ObjectClass.class))).thenReturn(mockToken);
        connObjectUtilsMock.when(() -> ConnObjectUtils.toString(mockToken)).thenReturn("tokenValueStr");

        resourceLogic.setLatestSyncToken("resourceKey", SyncopeConstants.REALM_ANYTYPE);

        verify(mockOrgUnit, times(1)).setSyncToken("tokenValueStr");
        verify(resourceDAO, times(1)).save(mockResource);
    }

    @Test
    public void testSetLatestSyncTokenStandardAnyType() {
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);

        // Fix: Use doReturn per l'Optional e mock generics
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("anyTypeKey");
        when(mockAnyType.getKey()).thenReturn("anyTypeKey");

        doReturn(Optional.of(mockProvision)).when(mockResource).getProvisionByAnyType("anyTypeKey");
        when(mockProvision.getObjectClass()).thenReturn("__ACCOUNT__");

        SyncToken mockToken = new SyncToken("tokenValue");
        when(mockConnector.getLatestSyncToken(any(ObjectClass.class))).thenReturn(mockToken);
        connObjectUtilsMock.when(() -> ConnObjectUtils.toString(mockToken)).thenReturn("tokenValueStr");

        resourceLogic.setLatestSyncToken("resourceKey", "anyTypeKey");

        verify(mockProvision, times(1)).setSyncToken("tokenValueStr");
        verify(resourceDAO, times(1)).save(mockResource);
    }

    @Test
    public void testRemoveSyncTokenRealmAnyType() {
        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);

        resourceLogic.removeSyncToken("resourceKey", SyncopeConstants.REALM_ANYTYPE);

        verify(mockOrgUnit, times(1)).setSyncToken(null);
        verify(resourceDAO, times(1)).save(mockResource);
    }

    @Test
    public void testRemoveSyncTokenStandardAnyType() {
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);

        // Fix: Use doReturn
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("anyTypeKey");
        when(mockAnyType.getKey()).thenReturn("anyTypeKey");

        doReturn(Optional.of(mockProvision)).when(mockResource).getProvisionByAnyType("anyTypeKey");

        resourceLogic.removeSyncToken("resourceKey", "anyTypeKey");

        verify(mockProvision, times(1)).setSyncToken(null);
        verify(resourceDAO, times(1)).save(mockResource);
    }

    @Test
    public void testDeleteSuccess() {
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        ResourceTO resourceTO = new ResourceTO();
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        ResourceTO deleted = resourceLogic.delete("resourceKey");

        assertNotNull(deleted);
        verify(connectorManager, times(1)).unregisterConnector(mockResource);
        verify(resourceDAO, times(1)).deleteById("resourceKey");
    }

    @Test
    public void testReadSuccess() {
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        ResourceTO resourceTO = new ResourceTO();
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        ResourceTO result = resourceLogic.read("resourceKey");

        assertNotNull(result);
        verify(binder, times(1)).getResourceTO(mockResource);
    }

    @Test
    public void testList() {
        // Fix: Use doReturn per le List
        doReturn(List.of(mockResource)).when(resourceDAO).findAll();

        ResourceTO resourceTO = new ResourceTO();
        when(binder.getResourceTO(mockResource)).thenReturn(resourceTO);

        List<ResourceTO> results = resourceLogic.list();

        assertEquals(1, results.size());
        verify(binder, times(1)).getResourceTO(mockResource);
    }

    @Test
    public void testGetConnObjectKeyValue() {
        // Fix: Use doReturn
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("anyTypeKey");
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        when(mockAnyType.getKey()).thenReturn("anyTypeKey");
        doReturn(Optional.of(mockProvision)).when(mockResource).getProvisionByAnyType("anyTypeKey");
        when(mockProvision.getMapping()).thenReturn(mockMapping);

        AnyUtils mockAnyUtils = mock(AnyUtils.class);

        // Fix: Usiamo AnyDAO invece di AnyObjectDAO e doReturn
        AnyDAO mockAnyDAO = mock(AnyDAO.class);
        when(mockAnyType.getKind()).thenReturn(AnyTypeKind.USER);
        when(anyUtilsFactory.getInstance(AnyTypeKind.USER)).thenReturn(mockAnyUtils);

        doReturn(mockAnyDAO).when(mockAnyUtils).dao();

        Any mockAny = mock(Any.class);
        doReturn(mockAny).when(mockAnyDAO).authFind("anyKey");

        when(mappingManager.getConnObjectKeyValue(mockAny, mockResource, mockProvision))
                .thenReturn(Optional.of("connObjectKeyVal"));

        String result = resourceLogic.getConnObjectKeyValue("resourceKey", "anyTypeKey", "anyKey");
        assertEquals("connObjectKeyVal", result);
    }

    @Test
    public void testReadConnObjectByAnyKey() {
        // Fix: Use doReturn
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("anyTypeKey");
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        when(mockAnyType.getKey()).thenReturn("anyTypeKey");
        doReturn(Optional.of(mockProvision)).when(mockResource).getProvisionByAnyType("anyTypeKey");
        when(mockProvision.getMapping()).thenReturn(mockMapping);

        AnyUtils mockAnyUtils = mock(AnyUtils.class);

        // Fix: Usiamo AnyDAO invece di AnyObjectDAO e doReturn
        AnyDAO mockAnyDAO = mock(AnyDAO.class);
        when(mockAnyType.getKind()).thenReturn(AnyTypeKind.USER);
        when(anyUtilsFactory.getInstance(AnyTypeKind.USER)).thenReturn(mockAnyUtils);

        doReturn(mockAnyDAO).when(mockAnyUtils).dao();

        Any mockAny = mock(Any.class);
        doReturn(mockAny).when(mockAnyDAO).authFind("anyKey");

        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);

        ConnectorObject mockConnObj = mock(ConnectorObject.class);
        when(outboundMatcher.match(mockConnector, mockAny, mockResource, mockProvision, Optional.empty()))
                .thenReturn(List.of(mockConnObj));

        Set<Attribute> attributes = Set.of(mock(Attribute.class));
        when(mockConnObj.getAttributes()).thenReturn(attributes);

        ConnObject mockConnObjectTO = new ConnObject();
        connObjectUtilsMock.when(() -> ConnObjectUtils.getConnObjectTO(any(), eq(attributes)))
                .thenReturn(mockConnObjectTO);

        ConnObject result = resourceLogic.readConnObjectByAnyKey("resourceKey", "anyTypeKey", "anyKey");

        assertNotNull(result);
    }

    @Test
    public void testReadConnObjectByConnObjectKeyValue() {
        // Fix: Use doReturn
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("anyTypeKey");
        when(resourceDAO.authFind("resourceKey")).thenReturn(mockResource);
        when(mockAnyType.getKey()).thenReturn("anyTypeKey");
        doReturn(Optional.of(mockProvision)).when(mockResource).getProvisionByAnyType("anyTypeKey");
        when(mockProvision.getMapping()).thenReturn(mockMapping);

        Item mockItem = mock(Item.class);
        mappingUtilsMock.when(() -> MappingUtils.getConnObjectKeyItem(mockProvision))
                .thenReturn(Optional.of(mockItem));

        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);

        ConnectorObject mockConnObj = mock(ConnectorObject.class);
        when(outboundMatcher.matchByConnObjectKeyValue(mockConnector, mockItem, "keyValue", mockProvision, Optional.empty()))
                .thenReturn(Optional.of(mockConnObj));

        Set<Attribute> attributes = Set.of(mock(Attribute.class));
        when(mockConnObj.getAttributes()).thenReturn(attributes);

        ConnObject mockConnObjectTO = new ConnObject();
        connObjectUtilsMock.when(() -> ConnObjectUtils.getConnObjectTO(any(), eq(attributes)))
                .thenReturn(mockConnObjectTO);

        ConnObject result = resourceLogic.readConnObjectByConnObjectKeyValue("resourceKey", "anyTypeKey", "keyValue");

        assertNotNull(result);
    }

    @Test
    public void testSearchConnObjectsRealm() {
        OrgUnit mockOrgUnit = mock(OrgUnit.class);

        // Fix: Use doReturn
        doReturn(Optional.of(mockResource)).when(resourceDAO).findById("resourceKey");
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
        when(mockOrgUnit.getObjectClass()).thenReturn("__ACCOUNT__");
        when(mockOrgUnit.getItems()).thenReturn(Collections.emptyList());

        OperationOptions mockOptions = new OperationOptions(Collections.emptyMap());
        mappingUtilsMock.when(() -> MappingUtils.buildOperationOptions(any(), any()))
                .thenReturn(mockOptions);

        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);
        Filter mockFilter = mock(Filter.class);
        SearchResult mockSearchResult = mock(SearchResult.class);

        when(mockConnector.search(any(ObjectClass.class), eq(mockFilter), any(), eq(10), eq("cookie"), any(), eq(mockOptions)))
                .thenReturn(mockSearchResult);

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(
                mockFilter, Set.of("attr1"), "resourceKey", SyncopeConstants.REALM_ANYTYPE, 10, "cookie", Collections.emptyList());

        assertNotNull(result);
        assertEquals(mockSearchResult, result.getLeft());
        assertNotNull(result.getRight());
    }

    @Test
    public void testCheck() {
        ResourceTO resourceTO = new ResourceTO();
        resourceTO.setConnector("connKey");

        // Fix: Use doReturn
        doReturn(Optional.of(mockConnInstance)).when(connInstanceDAO).findById("connKey");

        ConnInstanceTO mockConnInstanceTO = new ConnInstanceTO();
        when(connInstanceDataBinder.getConnInstanceTO(mockConnInstance)).thenReturn(mockConnInstanceTO);
        when(connectorManager.buildConnInstanceOverride(eq(mockConnInstanceTO), any(), any()))
                .thenReturn(mockConnInstance);
        when(connectorManager.createConnector(mockConnInstance)).thenReturn(mockConnector);

        resourceLogic.check(resourceTO);

        verify(mockConnector, times(1)).test();
    }

    @Test
    public void testResolveReference() throws Exception {
        Method method = ResourceLogic.class.getDeclaredMethod("resolveReference", Method.class, Object[].class);
        method.setAccessible(true);

        // Fix: Use doReturn
        doReturn(Optional.of(mockResource)).when(resourceDAO).findById("resourceKey");

        ResourceTO expectedTO = new ResourceTO();
        expectedTO.setKey("resourceKey");
        when(binder.getResourceTO(mockResource)).thenReturn(expectedTO);

        Object[] args = new Object[] { "resourceKey" };
        ResourceTO result = (ResourceTO) method.invoke(resourceLogic, null, args);

        assertNotNull(result);
        assertEquals("resourceKey", result.getKey());
    }
}
