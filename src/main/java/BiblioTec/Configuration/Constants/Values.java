package BiblioTec.Configuration.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public interface Values {
    static final Logger log = LoggerFactory.getLogger(Values.class);

    /**
     * @return diretório para armazenar aquivos de log
     */
    default String getLogDir() {
        return System.getProperty("user.home").concat("/gumgafiles/logs");
    }

    /**
     * @return diretório para armazenar templates como email
     */

    default String getTemplatesFolder() {
        return System.getProperty("user.home").concat("/gumgafiles/templates");
    }

    default Properties getCustomFileProperties() {
        Properties toReturn = new Properties();
        try {
            InputStream input = new FileInputStream(System.getProperty("user.home") + "/integraFiles/" + getCustomPropertiesFileName());
            toReturn.load(input);
        } catch (IOException e) {
            log.info("Utilizando properties padrão");
        }
        return toReturn;
    }

    /**
     * @return arquivo de configuração da applicação
     */
    default String getCustomPropertiesFileName() {
        return "integra.properties";
    }
}
