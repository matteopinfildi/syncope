package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.*;
import org.apache.syncope.common.lib.types.AnyTypeKind;
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
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.OperationOptions;
import org.identityconnectors.framework.common.objects.SearchResult;
import org.identityconnectors.framework.common.objects.filter.Filter;
import org.identityconnectors.framework.spi.SearchResultsHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class)
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
    private ResourceLogic logic;

    @Test(expected = DelegatedAdministrationException.class)
    public void testSecurityChecksUnauthorized() {
        Set<String> effectiveRealms = new HashSet<>(Arrays.asList("/a", "/b"));
        logic.securityChecks(effectiveRealms, "/c", "key1");
    }

    @Test
    public void testSecurityChecksAuthorized() {
        Set<String> effectiveRealms = new HashSet<>(Arrays.asList("/a", "/b"));
        logic.securityChecks(effectiveRealms, "/a/c", "key1");
    }

    @Test
    public void testDoSave() {
        ExternalResource resource = mock(ExternalResource.class);
        when(resourceDAO.save(resource)).thenReturn(resource);

        ExternalResource result = logic.doSave(resource);

        assertEquals(resource, result);
        verify(connectorManager).registerConnector(resource);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreateBlankKey() {
        ResourceTO to = new ResourceTO();
        logic.create(to);
    }

    @Test(expected = DuplicateException.class)
    public void testCreateDuplicate() {
        ResourceTO to = new ResourceTO();
        to.setKey("resKey");
        to.setConnector("connKey");

        ConnInstance connInstance = mock(ConnInstance.class, Answers.RETURNS_DEEP_STUBS);
        when(connInstance.getAdminRealm().getFullPath()).thenReturn("/");
        when(connInstanceDAO.authFind("connKey")).thenReturn(connInstance);
        when(resourceDAO.authFind("resKey")).thenReturn(mock(ExternalResource.class));

        try (MockedStatic<AuthContextUtils> authUtils = mockStatic(AuthContextUtils.class);
             MockedStatic<RealmUtils> realmUtils = mockStatic(RealmUtils.class)) {

            authUtils.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
            realmUtils.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Collections.singleton("/"));

            logic.create(to);
        }
    }

    @Test
    public void testCreateSuccess() {
        ResourceTO to = new ResourceTO();
        to.setKey("resKey");
        to.setConnector("connKey");

        ConnInstance connInstance = mock(ConnInstance.class, Answers.RETURNS_DEEP_STUBS);
        when(connInstance.getAdminRealm().getFullPath()).thenReturn("/");
        when(connInstanceDAO.authFind("connKey")).thenReturn(connInstance);
        when(resourceDAO.authFind("resKey")).thenReturn(null);

        ExternalResource resource = mock(ExternalResource.class);
        when(binder.create(to)).thenReturn(resource);
        when(resourceDAO.save(resource)).thenReturn(resource);
        when(binder.getResourceTO(resource)).thenReturn(to);

        try (MockedStatic<AuthContextUtils> authUtils = mockStatic(AuthContextUtils.class);
             MockedStatic<RealmUtils> realmUtils = mockStatic(RealmUtils.class)) {

            authUtils.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
            realmUtils.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Collections.singleton("/"));

            ResourceTO result = logic.create(to);
            assertNotNull(result);
            assertEquals("resKey", result.getKey());
        }
    }

    @Test
    public void testUpdateSuccess() {
        ResourceTO to = new ResourceTO();
        to.setKey("res1");

        ExternalResource res = mock(ExternalResource.class, Answers.RETURNS_DEEP_STUBS);
        when(res.getConnector().getAdminRealm().getFullPath()).thenReturn("/");
        when(res.getKey()).thenReturn("res1");
        when(resourceDAO.authFind("res1")).thenReturn(res);

        try (MockedStatic<AuthContextUtils> authUtils = mockStatic(AuthContextUtils.class);
             MockedStatic<RealmUtils> realmUtils = mockStatic(RealmUtils.class)) {

            authUtils.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
            realmUtils.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Collections.singleton("/"));

            when(binder.update(res, to)).thenReturn(res);
            when(resourceDAO.save(res)).thenReturn(res);
            when(binder.getResourceTO(res)).thenReturn(to);

            ResourceTO result = logic.update(to);
            assertEquals(to, result);
        }
    }

    @Test
    public void testSetLatestSyncToken_AnyType() {
        String key = "resKey";
        String anyTypeKey = "anyTypeKey";

        ExternalResource resource = mock(ExternalResource.class, Answers.RETURNS_DEEP_STUBS);
        when(resourceDAO.authFind(key)).thenReturn(resource);
        when(resource.getConnector().getAdminRealm().getFullPath()).thenReturn("/");

        Connector connector = mock(Connector.class);
        when(connectorManager.getConnector(resource)).thenReturn(connector);

        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn(anyTypeKey);
        doReturn(Optional.of(anyType)).when(anyTypeDAO).findById(anyTypeKey);

        Provision provision = mock(Provision.class, Answers.RETURNS_DEEP_STUBS);
        when(provision.getObjectClass()).thenReturn("__ACCOUNT__");
        when(resource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.of(provision));

        try (MockedStatic<ConnObjectUtils> connUtils = mockStatic(ConnObjectUtils.class);
             MockedStatic<AuthContextUtils> authUtils = mockStatic(AuthContextUtils.class);
             MockedStatic<RealmUtils> realmUtils = mockStatic(RealmUtils.class)) {

            connUtils.when(() -> ConnObjectUtils.toString(any())).thenReturn("token123");
            authUtils.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
            realmUtils.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Collections.singleton("/"));

            logic.setLatestSyncToken(key, anyTypeKey);

            verify(provision).setSyncToken("token123");
            verify(resourceDAO).save(resource);
        }
    }

    @Test
    public void testRemoveSyncToken_Realm() {
        String key = "resKey";
        String anyTypeKey = SyncopeConstants.REALM_ANYTYPE;
        ExternalResource resource = mock(ExternalResource.class, Answers.RETURNS_DEEP_STUBS);
        OrgUnit orgUnit = mock(OrgUnit.class);

        when(resourceDAO.authFind(key)).thenReturn(resource);
        when(resource.getConnector().getAdminRealm().getFullPath()).thenReturn("/");
        when(resource.getOrgUnit()).thenReturn(orgUnit);

        try (MockedStatic<AuthContextUtils> authUtils = mockStatic(AuthContextUtils.class);
             MockedStatic<RealmUtils> realmUtils = mockStatic(RealmUtils.class)) {
            authUtils.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
            realmUtils.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Collections.singleton("/"));

            logic.removeSyncToken(key, anyTypeKey);

            verify(orgUnit).setSyncToken(null);
            verify(resourceDAO).save(resource);
        }
    }

    @Test
    public void testDelete() {
        String key = "resKey";
        ExternalResource resource = mock(ExternalResource.class, Answers.RETURNS_DEEP_STUBS);
        when(resourceDAO.authFind(key)).thenReturn(resource);
        when(resource.getConnector().getAdminRealm().getFullPath()).thenReturn("/");

        ResourceTO to = new ResourceTO();
        when(binder.getResourceTO(resource)).thenReturn(to);

        try (MockedStatic<AuthContextUtils> authUtils = mockStatic(AuthContextUtils.class);
             MockedStatic<RealmUtils> realmUtils = mockStatic(RealmUtils.class)) {

            authUtils.when(AuthContextUtils::getAuthorizations).thenReturn(Collections.emptyMap());
            realmUtils.when(() -> RealmUtils.getEffective(any(), anyString())).thenReturn(Collections.singleton("/"));

            ResourceTO result = logic.delete(key);

            verify(connectorManager).unregisterConnector(resource);
            verify(resourceDAO).deleteById(key);
            assertEquals(to, result);
        }
    }

    @Test
    public void testRead() {
        ExternalResource resource = mock(ExternalResource.class);
        when(resourceDAO.authFind("resKey")).thenReturn(resource);
        ResourceTO to = new ResourceTO();
        when(binder.getResourceTO(resource)).thenReturn(to);

        ResourceTO result = logic.read("resKey");
        assertEquals(to, result);
    }

    @Test
    public void testList() {
        ExternalResource resource = mock(ExternalResource.class);
        doReturn(Collections.singletonList(resource)).when(resourceDAO).findAll();
        ResourceTO to = new ResourceTO();
        when(binder.getResourceTO(resource)).thenReturn(to);

        List<ResourceTO> result = logic.list();
        assertEquals(1, result.size());
        assertEquals(to, result.get(0));
    }

    @Test(expected = NotFoundException.class)
    public void testGetProvisioningInfo_NoMapping() {
        String anyTypeKey = "USER";
        String resourceKey = "res1";

        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn(anyTypeKey);
        doReturn(Optional.of(anyType)).when(anyTypeDAO).findById(anyTypeKey);

        ExternalResource resource = mock(ExternalResource.class);
        when(resourceDAO.authFind(resourceKey)).thenReturn(resource);

        Provision provision = mock(Provision.class);
        when(provision.getMapping()).thenReturn(null);
        when(resource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.of(provision));

        logic.getConnObjectKeyValue(resourceKey, anyTypeKey, "any1");
    }

    @Test
    public void testGetConnObjectKeyValue() {
        String anyTypeKey = "USER";
        String resourceKey = "res1";
        String anyKey = "any1";

        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn(anyTypeKey);
        when(anyType.getKind()).thenReturn(AnyTypeKind.USER);
        doReturn(Optional.of(anyType)).when(anyTypeDAO).findById(anyTypeKey);

        ExternalResource resource = mock(ExternalResource.class);
        when(resourceDAO.authFind(resourceKey)).thenReturn(resource);

        Provision provision = mock(Provision.class, Answers.RETURNS_DEEP_STUBS);
        when(provision.getMapping()).thenReturn(mock(org.apache.syncope.common.lib.to.Mapping.class));
        when(resource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.of(provision));

        AnyUtils anyUtils = mock(AnyUtils.class, Answers.RETURNS_DEEP_STUBS);
        doReturn(anyUtils).when(anyUtilsFactory).getInstance(any(AnyTypeKind.class));
        Any any = mock(Any.class);
        when(anyUtils.dao().authFind(anyKey)).thenReturn(any);

        when(mappingManager.getConnObjectKeyValue(any, resource, provision)).thenReturn(Optional.of("connObjVal"));

        String result = logic.getConnObjectKeyValue(resourceKey, anyTypeKey, anyKey);
        assertEquals("connObjVal", result);
    }

    @Test
    public void testReadConnObjectByAnyKey() {
        String anyTypeKey = "USER";
        String resourceKey = "res1";
        String anyKey = "any1";

        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn(anyTypeKey);
        when(anyType.getKind()).thenReturn(AnyTypeKind.USER);
        doReturn(Optional.of(anyType)).when(anyTypeDAO).findById(anyTypeKey);

        ExternalResource resource = mock(ExternalResource.class);
        when(resourceDAO.authFind(resourceKey)).thenReturn(resource);

        Provision provision = mock(Provision.class, Answers.RETURNS_DEEP_STUBS);
        when(provision.getMapping()).thenReturn(mock(org.apache.syncope.common.lib.to.Mapping.class));
        when(resource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.of(provision));

        AnyUtils anyUtils = mock(AnyUtils.class, Answers.RETURNS_DEEP_STUBS);
        doReturn(anyUtils).when(anyUtilsFactory).getInstance(any(AnyTypeKind.class));
        Any any = mock(Any.class);
        when(anyUtils.dao().authFind(anyKey)).thenReturn(any);

        ConnectorObject connObj = mock(ConnectorObject.class);
        List<ConnectorObject> connObjs = Collections.singletonList(connObj);

        when(outboundMatcher.match(any(), eq(any), eq(resource), eq(provision), any())).thenReturn(connObjs);

        try (MockedStatic<ConnObjectUtils> connUtils = mockStatic(ConnObjectUtils.class)) {
            ConnObject connObjTO = mock(ConnObject.class);
            connUtils.when(() -> ConnObjectUtils.getConnObjectTO(any(), any())).thenReturn(connObjTO);

            ConnObject result = logic.readConnObjectByAnyKey(resourceKey, anyTypeKey, anyKey);
            assertEquals(connObjTO, result);
        }
    }

    @Test
    public void testReadConnObjectByConnObjectKeyValue() {
        String anyTypeKey = "USER";
        String resourceKey = "res1";
        String connObjectKeyValue = "connVal";

        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn(anyTypeKey);
        doReturn(Optional.of(anyType)).when(anyTypeDAO).findById(anyTypeKey);

        ExternalResource resource = mock(ExternalResource.class);
        when(resourceDAO.authFind(resourceKey)).thenReturn(resource);

        Provision provision = mock(Provision.class, Answers.RETURNS_DEEP_STUBS);
        when(provision.getMapping()).thenReturn(mock(org.apache.syncope.common.lib.to.Mapping.class));
        when(resource.getProvisionByAnyType(anyTypeKey)).thenReturn(Optional.of(provision));

        try (MockedStatic<MappingUtils> mapUtils = mockStatic(MappingUtils.class);
             MockedStatic<ConnObjectUtils> connUtils = mockStatic(ConnObjectUtils.class)) {

            Item item = mock(Item.class);
            mapUtils.when(() -> MappingUtils.getConnObjectKeyItem(provision)).thenReturn(Optional.of(item));

            ConnectorObject connObj = mock(ConnectorObject.class);
            when(outboundMatcher.matchByConnObjectKeyValue(any(), eq(item), eq(connObjectKeyValue), eq(provision), any()))
                    .thenReturn(Optional.of(connObj));

            ConnObject connObjTO = mock(ConnObject.class);
            connUtils.when(() -> ConnObjectUtils.getConnObjectTO(any(), any())).thenReturn(connObjTO);

            ConnObject result = logic.readConnObjectByConnObjectKeyValue(resourceKey, anyTypeKey, connObjectKeyValue);
            assertEquals(connObjTO, result);
        }
    }

    @Test
    public void testSearchConnObjects_Realm() {
        String key = "resKey";
        String anyTypeKey = SyncopeConstants.REALM_ANYTYPE;

        ExternalResource resource = mock(ExternalResource.class, Answers.RETURNS_DEEP_STUBS);
        doReturn(Optional.of(resource)).when(resourceDAO).findById(key);
        when(resource.getOrgUnit().getObjectClass()).thenReturn("__ACCOUNT__");
        when(resource.getOrgUnit().getItems().stream()).thenReturn(Stream.empty());

        Connector connector = mock(Connector.class);
        when(connectorManager.getConnector(resource)).thenReturn(connector);

        SearchResult sr = mock(SearchResult.class);
        when(connector.search(any(), any(), any(), anyInt(), any(), any(), any())).thenAnswer(inv -> {
            SearchResultsHandler handler = inv.getArgument(2);
            ConnectorObject connObj = mock(ConnectorObject.class);
            handler.handle(connObj);
            handler.handleResult(sr);
            return sr;
        });

        try (MockedStatic<MappingUtils> mapUtils = mockStatic(MappingUtils.class);
             MockedStatic<ConnObjectUtils> connUtils = mockStatic(ConnObjectUtils.class)) {

            mapUtils.when(() -> MappingUtils.buildOperationOptions(any(), any())).thenReturn(mock(OperationOptions.class));
            ConnObject connObjTO = mock(ConnObject.class);
            connUtils.when(() -> ConnObjectUtils.getConnObjectTO(any(), any())).thenReturn(connObjTO);

            Pair<SearchResult, List<ConnObject>> result = logic.searchConnObjects(
                    mock(Filter.class), new HashSet<>(), key, anyTypeKey, 10, null, new ArrayList<>());

            assertNotNull(result);
            assertEquals(sr, result.getLeft());
            assertEquals(1, result.getRight().size());
        }
    }

    @Test
    public void testCheck() {
        ResourceTO to = new ResourceTO();
        to.setConnector("conn1");

        ConnInstance conn = mock(ConnInstance.class);
        doReturn(Optional.of(conn)).when(connInstanceDAO).findById("conn1");

        org.apache.syncope.common.lib.to.ConnInstanceTO connTO = new org.apache.syncope.common.lib.to.ConnInstanceTO();
        when(connInstanceDataBinder.getConnInstanceTO(conn)).thenReturn(connTO);

        when(connectorManager.buildConnInstanceOverride(any(), any(), any())).thenReturn(conn);
        Connector connector = mock(Connector.class);
        when(connectorManager.createConnector(any())).thenReturn(connector);

        logic.check(to);

        verify(connector).test();
    }

    @Test
    public void testResolveReference() throws Exception {
        ExternalResource resource = mock(ExternalResource.class);
        doReturn(Optional.of(resource)).when(resourceDAO).findById("key1");
        ResourceTO to = new ResourceTO();
        when(binder.getResourceTO(resource)).thenReturn(to);

        ResourceTO result = logic.resolveReference(null, "key1");
        assertEquals(to, result);
    }

    @Test(expected = Exception.class)
    public void testResolveReferenceUnresolved() throws Exception {
        logic.resolveReference(null, new Object());
    }
}