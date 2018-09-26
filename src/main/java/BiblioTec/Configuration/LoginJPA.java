package BiblioTec.Configuration;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mateus
 */

public final class LoginJPA extends Object
        implements Serializable {

    private static final String NOME_UNIDADE_PERSISTENCIA = "ExemploJPA";

    private transient EntityManagerFactory entityManagerFactory = null;

    public final EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            Map propertiesMap = new HashMap();
            propertiesMap.put(PersistenceUnitProperties.CACHE_SHARED_DEFAULT, "false");
            entityManagerFactory = Persistence.createEntityManagerFactory(NOME_UNIDADE_PERSISTENCIA, propertiesMap);
        }
        return entityManagerFactory;
    }

    public final void closeEntityManagerFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
            entityManagerFactory = null;
        }
    }



}

