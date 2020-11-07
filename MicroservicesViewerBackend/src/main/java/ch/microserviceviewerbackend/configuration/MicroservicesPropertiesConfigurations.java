package ch.microserviceviewerbackend.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.util.List;

@ConfigurationProperties(value = "microservices")
public class MicroservicesPropertiesConfigurations {

    private static final Logger LOGGER = LogManager.getLogger(MicroservicesPropertiesConfigurations.class);

    private List<String> uris;

    public List<String> getUris() {
        return uris;
    }

    public void setUris(List<String> uris) {
        this.uris = uris;
    }

    @PostConstruct
    public void init() {
        if(uris == null) {
            LOGGER.info("In the environment {}, there are no uris defined.", System.getProperty("spring.profiles.active"));
        } else {
            LOGGER.info("In the environment {}, there are {} uris defined.", System.getProperty("spring.profiles.active"), uris.size());
        }
    }

}
