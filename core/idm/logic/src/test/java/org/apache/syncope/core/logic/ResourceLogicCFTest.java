package org.apache.syncope.core.logic;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.ConnObject;
import org.apache.syncope.common.lib.to.OrgUnit;
import org.apache.syncope.core.persistence.api.dao.*;
import org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder;
import org.apache.syncope.core.provisioning.api.MappingManager;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.ResultsHandler;
import org.identityconnectors.framework.common.objects.SearchResult;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicCFTest {

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
        resourceLogic = new ResourceLogic(
                resourceDAO, anyTypeDAO, connInstanceDAO, binder,
                connInstanceDataBinder, outboundMatcher, mappingManager,
                connectorManager, anyUtilsFactory) {
            @Override
            protected void securityChecks(final Set<String> effectiveRealms, final String realm, final String key) {
                // Bypass della sicurezza per i test unitari di Control-Flow
            }
        };
    }

    // searchConnObjects

    @Test(expected = NotFoundException.class)
    public void testSearchConn_TC08() {
        /*
        Category partition:
        - RealmType = REALM_ANYTYPE
        - OrgUnit = null


         Oracolo: Il flusso deve essere interrotto per assenza di regole di provisioning --> NotFoundException
         */

        String realmAnyType = SyncopeConstants.REALM_ANYTYPE;
        ExternalResource mockResource = mock(ExternalResource.class);

        doReturn(Optional.of(mockResource)).when(resourceDAO).findById("DB-HR");
        when(mockResource.getOrgUnit()).thenReturn(null);

        resourceLogic.searchConnObjects(null, Collections.emptySet(), "DB-HR", realmAnyType, 10, null, Collections.emptyList());
    }

    @Test
    public void testSearchConn_TC09() {
        /*
         Category partition:
        - RealmType = REALM_ANYTYPE
        - OrgUnit = presente e valida
        - Connector Search = Simulazione callback riuscita

        Oracolo: Il blocco anonimo interno deve essere eseguito correttamente,popolando la lista di ritorno.
        */

        String realmAnyType = SyncopeConstants.REALM_ANYTYPE;
        ExternalResource mockResource = mock(ExternalResource.class);
        doReturn(Optional.of(mockResource)).when(resourceDAO).findById("DB-HR");

        OrgUnit mockOrgUnit = mock(OrgUnit.class);
        when(mockResource.getOrgUnit()).thenReturn(mockOrgUnit);
        when(mockOrgUnit.getObjectClass()).thenReturn("__REALM__");
        when(mockOrgUnit.getItems()).thenReturn(Collections.emptyList());

        Connector mockConnector = mock(Connector.class);
        when(connectorManager.getConnector(mockResource)).thenReturn(mockConnector);

        doAnswer(invocation -> {
            ResultsHandler handler = invocation.getArgument(2);
            ConnectorObject mockConnObj = mock(ConnectorObject.class);
            when(mockConnObj.getAttributes()).thenReturn(Collections.emptySet());

            handler.handle(mockConnObj);
            return null;
        }).when(mockConnector).search(any(), any(), any(), anyInt(), any(), any(), any());

        Pair<SearchResult, List<ConnObject>> result = resourceLogic.searchConnObjects(
                null, Collections.emptySet(), "DB-HR", realmAnyType, 10, null, Collections.emptyList());

        assertNotNull("La pair restituita, che contiene SearchResult e una lista di ConnObjects non deve essere nulla", result);
        assertEquals("L'handler avrebbe dovuto aggiungere 1 elemento all'elenco", 1, result.getRight().size());
    }
}