package org.apache.syncope.core.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.syncope.common.lib.to.ResourceTO;
import org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.entity.ConnInstance;
import org.apache.syncope.core.persistence.api.entity.ExternalResource;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.provisioning.api.ConnectorManager;
import org.apache.syncope.core.provisioning.api.data.ResourceDataBinder;
import org.apache.syncope.core.spring.security.AuthContextUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicITTest {

    @Mock
    private ExternalResourceDAO resourceDAO;
    @Mock
    private ResourceDataBinder binder;
    @Mock
    private ConnInstanceDAO connInstanceDAO;
    @Mock
    private ConnectorManager connectorManager;

    @InjectMocks
    private ResourceLogic resourceLogic;

    /*
     Integration test top-down con boundary mockato.

     Componente reale sotto test: ResourceLogic.

     Componenti mockati: ExternalResourceDAO, ResourceDataBinder, ConnInstanceDAO, ConnectorManager.

      Oggetto reale osservato come risultato: ResourceTO.

      La comunicazione verificata è:
      - ResourceLogic -> Binder (Create)
      - ResourceLogic -> ResourceDAO (Save)
      - ResourceLogic -> ConnectorManager (Register)

      Il risultato verificato tramite assert è: corretto popolamento del DTO di output e integrità del flusso.
     */

    @Test
    public void create_IT() {
        /*
         Category Partition:
         A1 = ResourceTO con dati validi
         B1 = Connettore esistente e autorizzato
         C1 = Auth valido

          Oracolo:
          Il risultato deve essere non nullo,
          il ResourceTO restituito deve contenere la chiave corretta,
          il flusso deve invocare correttamente binder, dao e connectorManager nel giusto ordine.
         */

        Map<String, Set<String>> mockAuths = mock(Map.class);
        doReturn(Collections.singleton("/")).when(mockAuths).get(any());

        try (MockedStatic<AuthContextUtils> authUtils = mockStatic(AuthContextUtils.class)) {
            authUtils.when(AuthContextUtils::getAuthorizations).thenReturn(mockAuths);
            authUtils.when(AuthContextUtils::getUsername).thenReturn("admin");

            String resourceKey = "NewResource";
            String connectorKey = "MyConnector";

            ResourceTO inputTO = new ResourceTO();
            inputTO.setKey(resourceKey);
            inputTO.setConnector(connectorKey);

            ResourceTO expectedTO = new ResourceTO();
            expectedTO.setKey(resourceKey);

            ExternalResource mockEntity = mock(ExternalResource.class);
            ConnInstance mockConnInstance = mock(ConnInstance.class);
            Realm mockRealm = mock(Realm.class);

            doReturn(mockRealm).when(mockConnInstance).getAdminRealm();
            doReturn("/").when(mockRealm).getFullPath();
            lenient().doReturn(Optional.of(mockConnInstance)).when(connInstanceDAO).findById(anyString());
            doReturn(mockConnInstance).when(connInstanceDAO).authFind(anyString());

            doReturn(mockEntity).when(binder).create(any(ResourceTO.class));
            doReturn(mockEntity).when(resourceDAO).save(any(ExternalResource.class));
            doReturn(expectedTO).when(binder).getResourceTO(any(ExternalResource.class));

            ResourceTO result = resourceLogic.create(inputTO);

            assertNotNull("Il ResourceTO restituito non deve essere nullo", result);
            assertEquals("La chiave della risorsa creata deve coincidere con l'input", resourceKey, result.getKey());

            verify(binder).create(inputTO);
            verify(resourceDAO).save(mockEntity);
            verify(connectorManager).registerConnector(mockEntity);
            verify(binder).getResourceTO(mockEntity);
        }
    }
}

