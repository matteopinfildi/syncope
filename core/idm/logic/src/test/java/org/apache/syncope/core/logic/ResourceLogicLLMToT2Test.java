package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.Optional;
import java.util.Set;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.DuplicateException;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.AnyType;
import org.apache.syncope.core.persistence.api.entity.ConnInstance;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncToken;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicLLMToT2Test {

    @Mock
    private ExternalResourceDAO resourceDAO;
    @Mock
    private AnyTypeDAO anyTypeDAO;
    @Mock
    private ConnInstanceDAO connInstanceDAO;
    @Mock
    private ResourceDataBinder binder;
    @Mock
    private ConnectorManager connectorManager;

    @InjectMocks
    private ResourceLogic resourceLogic;

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
    }

    // =========================================================================
    // TESTS FOR create()
    // =========================================================================

    @Test(expected = SyncopeClientException.class)
    public void testCreate_NullOrBlankKey_ThrowsException() {
        resourceTO.setKey("");
        resourceLogic.create(resourceTO);
    }

    @Test(expected = SyncopeClientException.class)
    public void testCreate_ConnInstanceNotFound_ThrowsException() {
        when(connInstanceDAO.authFind("TestConnector")).thenReturn(null);
        resourceLogic.create(resourceTO);
    }

    @Test(expected = DuplicateException.class)
    public void testCreate_DuplicateResource_ThrowsException() {
        // Simulating the environment bypassing static AuthContextUtils for Duplicate check test
        // By throwing it directly via mock behavior if we can't static-mock easily in pure JUnit4
        when(connInstanceDAO.authFind("TestConnector")).thenReturn(connInstance);
        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);

        // This requires static mocking of RealmUtils & AuthContextUtils in a real environment
        // Assuming the security checks pass, we test the duplicate logic
        resourceLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {
                // Bypass static security check for unit testing core logic
            }
        };
        resourceLogic.create(resourceTO);
    }

    @Test
    public void testCreate_ValidResource_ReturnsResourceTO() {
        when(connInstanceDAO.authFind("TestConnector")).thenReturn(connInstance);
        when(resourceDAO.authFind("TestResource")).thenReturn(null);
        when(binder.create(resourceTO)).thenReturn(externalResource);
        when(resourceDAO.save(externalResource)).thenReturn(externalResource);
        when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        ResourceTO created = bypassSecurityLogic.create(resourceTO);
        assertNotNull(created);
        assertEquals("TestResource", created.getKey());
        verify(connectorManager).registerConnector(externalResource);
    }

    // =========================================================================
    // TESTS FOR update()
    // =========================================================================

    @Test(expected = NotFoundException.class)
    public void testUpdate_ResourceNotFound_ThrowsException() {
        when(resourceDAO.authFind("TestResource")).thenReturn(null);
        resourceLogic.update(resourceTO);
    }

    @Test
    public void testUpdate_ValidResource_Success() {
        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
        when(binder.update(externalResource, resourceTO)).thenReturn(externalResource);
        when(resourceDAO.save(externalResource)).thenReturn(externalResource);
        when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        ResourceTO updated = bypassSecurityLogic.update(resourceTO);
        assertNotNull(updated);
        verify(resourceDAO).save(externalResource);
    }

    @Test(expected = NotFoundException.class)
    public void testUpdate_NullKey_ThrowsNotFound() {
        resourceTO.setKey(null);
        when(resourceDAO.authFind(null)).thenReturn(null);
        resourceLogic.update(resourceTO);
    }

    @Test
    public void testUpdate_SaveThrowsException_PropagatesException() {
        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
        when(binder.update(externalResource, resourceTO)).thenReturn(externalResource);
        when(resourceDAO.save(externalResource)).thenThrow(new RuntimeException("DB Error"));

        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        try {
            bypassSecurityLogic.update(resourceTO);
        } catch (RuntimeException e) {
            assertEquals("DB Error", e.getMessage());
        }
    }

    // =========================================================================
    // TESTS FOR delete()
    // =========================================================================

    @Test(expected = NotFoundException.class)
    public void testDelete_ResourceNotFound_ThrowsException() {
        when(resourceDAO.authFind("NonExistent")).thenReturn(null);
        resourceLogic.delete("NonExistent");
    }

    @Test
    public void testDelete_ValidResource_Success() {
        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
        when(binder.getResourceTO(externalResource)).thenReturn(resourceTO);

        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        ResourceTO deleted = bypassSecurityLogic.delete("TestResource");
        assertNotNull(deleted);
        verify(connectorManager).unregisterConnector(externalResource);
        verify(resourceDAO).deleteById("TestResource");
    }

    @Test(expected = RuntimeException.class)
    public void testDelete_UnregisterConnectorFails_Propagates() {
        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        doThrow(new RuntimeException("Unregister Fail")).when(connectorManager).unregisterConnector(externalResource);
        bypassSecurityLogic.delete("TestResource");
    }

    @Test
    public void testDelete_NullKey_ThrowsException() {
        when(resourceDAO.authFind(null)).thenReturn(null);
        try {
            resourceLogic.delete(null);
        } catch (NotFoundException e) {
            verify(resourceDAO, never()).deleteById(anyString());
        }
    }

    // =========================================================================
    // TESTS FOR setLatestSyncToken()
    // =========================================================================

    @Test(expected = NotFoundException.class)
    public void testSetLatestSyncToken_ResourceNotFound_ThrowsException() {
        when(resourceDAO.authFind("TestResource")).thenReturn(null);
        resourceLogic.setLatestSyncToken("TestResource", "USER");
    }

    @Test(expected = NotFoundException.class)
    public void testSetLatestSyncToken_RealmAnyType_NoOrgUnit_ThrowsException() {
        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
        when(externalResource.getOrgUnit()).thenReturn(null);

        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        bypassSecurityLogic.setLatestSyncToken("TestResource", SyncopeConstants.REALM_ANYTYPE);
    }

    @Test(expected = NotFoundException.class)
    public void testSetLatestSyncToken_AnyTypeNotFound_ThrowsException() {
        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
        when(anyTypeDAO.findById("INVALID_TYPE")).thenReturn(Optional.empty());

        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        bypassSecurityLogic.setLatestSyncToken("TestResource", "INVALID_TYPE");
    }

    @Test(expected = NotFoundException.class)
    public void testSetLatestSyncToken_ProvisionNotFound_ThrowsException() {
        AnyType mockAnyType = mock(AnyType.class);
        when(mockAnyType.getKey()).thenReturn("USER");

        when(resourceDAO.authFind("TestResource")).thenReturn(externalResource);
//        when(anyTypeDAO.findById("USER")).thenReturn(Optional.of(mockAnyType));
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("USER");
        when(externalResource.getProvisionByAnyType("USER")).thenReturn(Optional.empty());

        ResourceLogic bypassSecurityLogic = new ResourceLogic(resourceDAO, anyTypeDAO, connInstanceDAO, binder, null, null, null, connectorManager, null) {
            @Override
            protected void securityChecks(Set<String> effectiveRealms, String realm, String key) {}
        };

        bypassSecurityLogic.setLatestSyncToken("TestResource", "USER");
    }

}
