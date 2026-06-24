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
    public void testSearchConnObjects_TC11() {
        /*
     Obiettivo: Uccidere il mutante alla riga 378.

     Category Partition:
      A2 = Key invalida
      B4 = REALM_ANYTYPE

      Oracolo: NotFoundException
      */

        String anyTypeKey = SyncopeConstants.REALM_ANYTYPE;
        String key = "Resource_DB_Fantasma";

        when(resourceDAO.findById(key)).thenReturn(Optional.empty());

        logic.searchConnObjects(null, null, key, anyTypeKey, 0, null, null);
    }
}