package BiblioTec.Configuration.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class ApplicationConstants implements Values {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationConstants.class);
    private Properties properties;


}
