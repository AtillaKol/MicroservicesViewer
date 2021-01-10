package ch.microservicesviewer.microservicesviewerbackend.configuration.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests fuer die Properties-Klassen
 */
@SpringBootTest
public class PropertiesTest {

    @Autowired
    private CorsProperties corsProperties;

    @Test
    public void testCorsAllowedOrigins() {
        String[] allowedOrigins = corsProperties.getAllowedOrigins();
        assertNotNull(allowedOrigins);
        assertEquals("http://localhost:4200", allowedOrigins[0]);
        assertEquals("https://localhost:4200", allowedOrigins[1]);
    }

    @Test
    public void testCorsAllowedMethods() {
        String[] allowedMethods = corsProperties.getAllowedMethods();
        assertNotNull(allowedMethods);
        assertEquals("GET", allowedMethods[0]);
        assertEquals("POST", allowedMethods[1]);
        assertEquals("PUT", allowedMethods[2]);
        assertEquals("DELETE", allowedMethods[3]);
    }

}
