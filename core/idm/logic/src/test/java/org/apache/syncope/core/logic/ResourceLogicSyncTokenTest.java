package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.common.lib.to.Provision;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.apache.syncope.core.persistence.api.entity.*;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.SyncToken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicSyncTokenTest {

    private ResourceLogic resourceLogic;
    @Mock
    private ExternalResourceDAO resourceDAO;
    @Mock
    private ConnectorManager connectorManager;
    @Mock
    private ExternalResource mockResource;
    @Mock
    private Provision mockProvision;
    @Mock
    private Connector mockConnector;
    @Mock
    private SyncToken mockToken;
    @Mock
    private AnyTypeDAO anyTypeDAO;
    @Mock
    private AnyType mockAnyType;
    @Mock
    private Realm mockRealm;
    @Mock
    private ConnInstance mockConn;
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
    private AnyUtilsFactory anyUtilsFactory;

    @Before
    public void setUp_Generic() {

        resourceLogic = new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory) {

            @Override
            protected void securityChecks(final Set<String> effectiveRealms, final String realm, final String key) {
                // Svuotato per permettere l'esecuzione dello Unit Test isolato
            }
        };

        when(resourceDAO.authFind("DB-HR")).thenReturn(mockResource);
        when(mockAnyType.getKey()).thenReturn("USER");
        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById("USER");
        when(mockResource.getProvisionByAnyType("USER")).thenReturn(Optional.of(mockProvision));
        when(mockProvision.getObjectClass()).thenReturn("__ACCOUNT__");
        when(mockResource.getConnector()).thenReturn(mockConn);
        when(mockConn.getAdminRealm()).thenReturn(mockRealm);
        lenient().when(mockRealm.getFullPath()).thenReturn("/");
    }

    @Before
    public void setUp_SetToken(){
        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);
        lenient().when(mockResource.getProvisions()).thenReturn(List.of(mockProvision));
    }

    @Test
    public void testSetToken_TC01(){
        String key = "DB-HR";
        String anyTypeKey = "USER";

        when(mockConnector.getLatestSyncToken(any(ObjectClass.class))).thenReturn(mockToken);

        resourceLogic.setLatestSyncToken(key, anyTypeKey);

        verify(mockProvision).setSyncToken(anyString());
        verify(resourceDAO).save(mockResource);
    }

    @Test
    public void testSetToken_TC02(){
        String key = "FANTASMA";
//        String key = "DB-HR";
        String anyTypeKey = "USER";


        try {
            resourceLogic.setLatestSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per risorsa inesistente");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSetToken_TC03(){
        String key = null;
//        String key = "DB-HR";
        String anyTypeKey = "USER";

        try {
            resourceLogic.setLatestSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per risorsa inesistente");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSetToken_TC04() {
        String key = "DB-HR";
        String anyTypeKey = "GROUP";
//       String anyTypeKey = "USER";

        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
        doReturn(anyTypeKey).when(mockAnyType).getKey();

        try {
            resourceLogic.setLatestSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per mancanza di Provision");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }


    @Test
    public void testSetToken_TC05(){
        String key = "DB-HR";
        String anyTypeKey = "USER";

        when(mockConnector.getLatestSyncToken(any(ObjectClass.class))).thenThrow(new RuntimeException("Timeout Connection"));

        try {
            resourceLogic.setLatestSyncToken(key, anyTypeKey);

            Assert.fail("Il test doveva simulare il crash di rete!");
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSetToken_TC06() {
        String key = "DB-HR";
        String anyTypeKey = null;

        doReturn(Optional.empty()).when(anyTypeDAO).findById(anyTypeKey);

        try {
            resourceLogic.setLatestSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere perchè Syncope non è supportato l'aggiornamento con AnyType nullo");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testSetToken_TC07() {
        String key = "DB-HR";
        String anyTypeKey = "REALM";

        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
        lenient().when(mockOrgUnit.getObjectClass()).thenReturn("__REALM__");
        lenient().doReturn(Optional.empty()).when(anyTypeDAO).findById(anyTypeKey);
        when(mockConnector.getLatestSyncToken(any(ObjectClass.class))).thenReturn(mockToken);

        resourceLogic.setLatestSyncToken(key, anyTypeKey);

        verify(mockOrgUnit).setSyncToken(any());
        verify(resourceDAO).save(mockResource);
    }

    @Test
    public void testRemoveToken_TC01(){
        String key = "DB-HR";
        String anyTypeKey = "USER";

        resourceLogic.removeSyncToken(key, anyTypeKey);

        verify(mockProvision).setSyncToken(null);
        verify(resourceDAO).save(mockResource);
    }

    @Test
    public void testRemoveToken_TC02(){
        String key = "FANTASMA";
//        String key = "DB-HR";
        String anyTypeKey = "USER";


        try {
            resourceLogic.removeSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per risorsa inesistente");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRemoveToken_TC03(){
        String key = null;
//        String key = "DB-HR";
        String anyTypeKey = "USER";

        try {
            resourceLogic.removeSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per risorsa inesistente");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRemoveToken_TC04(){
        String key = "DB-HR";
        String anyTypeKey = "GROUP";
//       String anyTypeKey = "USER";


        doReturn(Optional.of(mockAnyType)).when(anyTypeDAO).findById(anyTypeKey);
        doReturn(anyTypeKey).when(mockAnyType).getKey();
        lenient().doReturn(AnyTypeKind.GROUP).when(mockAnyType).getKind();

        try {
            resourceLogic.removeSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere per mancanza di Provision");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRemoveToken_TC05(){
        String key = "DB-HR";
        String anyTypeKey = "USER";

        lenient().when(mockProvision.getSyncToken()).thenReturn(null);

        resourceLogic.removeSyncToken(key, anyTypeKey);

        verify(mockProvision).setSyncToken(null);
        verify(resourceDAO).save(mockResource);
    }

    @Test
    public void testRemoveToken_TC06() {
        String key = "DB-HR";
        String anyTypeKey = null;

        doReturn(Optional.empty()).when(anyTypeDAO).findById(anyTypeKey);

        try {
            resourceLogic.removeSyncToken(key, anyTypeKey);
            Assert.fail("Il test doveva esplodere: Syncope non supporta l'input nullo qui");
        } catch (NotFoundException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRemoveToken_TC07() {
        String key = "DB-HR";
        String anyTypeKey = "REALM";

        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
        lenient().doReturn(Optional.empty()).when(anyTypeDAO).findById(anyTypeKey);

        resourceLogic.removeSyncToken(key, anyTypeKey);

        verify(mockOrgUnit).setSyncToken(null);
        verify(resourceDAO).save(mockResource);
    }

}
