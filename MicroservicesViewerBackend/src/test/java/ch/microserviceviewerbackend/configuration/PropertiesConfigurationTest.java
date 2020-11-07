package ch.microserviceviewerbackend.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PropertiesConfigurationTest {

    @Autowired
    private MicroservicesPropertiesConfigurations microservicesPropertiesConfigurations;

    @Test
    public void microservicePropertiesValuesTest() {
        List<String> uris = microservicesPropertiesConfigurations.getUris();
        assertNotNull(uris);
        assertEquals("http://localhost:8800/actuator/health", uris.get(0));
        assertEquals("http://localhost:8500/actuator/health", uris.get(1));
    }

}
