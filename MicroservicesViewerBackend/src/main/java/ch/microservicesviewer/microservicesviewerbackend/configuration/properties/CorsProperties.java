package ch.microservicesviewer.microservicesviewerbackend.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Bildet die Properties, welche unter cors gelegen ist.
 */
@ConfigurationProperties(value = "microserviceviewerbackend.cors")
@Configuration
public class CorsProperties {

    private String[] allowedOrigins;
    private String[] allowedMethods;

    public String[] getAllowedOrigins() {
        return allowedOrigins;
    }

    public void setAllowedOrigins(String[] allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public String[] getAllowedMethods() {
        return allowedMethods;
    }

    public void setAllowedMethods(String[] allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

}
