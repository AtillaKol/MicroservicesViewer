package ch.microserviceviewerbackend.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class BeanTest {


    @Autowired
    private RestTemplate restTemplate;

    /**
     * This error will occurs when trying to perform a request to a service which for example is not running.
     */
    @Test
    public void throwResourceAccessException() {
        assertThrows(ResourceAccessException.class, () -> {
            restTemplate.getForEntity("http://localhost:5000/IDontExist", String.class);
        });
    }
    
    @Test
    public void throwClientException() {
        assertThrows(HttpClientErrorException.class, () -> {
            restTemplate.getForEntity("http://localhost:8080/IDontExist", String.class);
        });
    }

}
