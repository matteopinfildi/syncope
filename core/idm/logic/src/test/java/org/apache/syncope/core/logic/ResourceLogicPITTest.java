package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO;
import org.apache.syncope.core.persistence.api.dao.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class ResourceLogicPITTest {

    @Mock
    private ExternalResourceDAO resourceDAO;

    @InjectMocks
    private ResourceLogic logic;

    @Test(expected = NotFoundException.class)
    public void testSearchConnObjects_RealmAnyType_ResourceNotFound() {
        /*
     Obiettivo: Uccidere il mutante NO_COVERAGE (Riga 378).

     Category Partition:
      - anyTypeKey = REALM_ANYTYPE.
      - resourceKey: non nullo e non vuoto ("risorsa-fantasma").
      - Ricerca della risorsa su DB fallita.

      Oracolo:il metodo deve lanciare una NotFoundException interrompendo l'esecuzione.
      */

        String anyTypeKey = SyncopeConstants.REALM_ANYTYPE;
        String key = "risorsa-fantasma";

        when(resourceDAO.findById(key)).thenReturn(Optional.empty());

        logic.searchConnObjects(null, null, key, anyTypeKey, 0, null, null);
    }
}