package ch.microserviceviewerbackend.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MicroserviceModelTest {

    private static String json;

    @BeforeAll
    public static void init() {
        json = "{\n" +
                "\"MicroserviceURI\": \"http://localhost:1010/random\",\n" +
                "\"ViewerUsername\": \"MAK\""+
                "}";
    }

    @Test
    public void validateData() throws JsonProcessingException {
        MicroserviceModel random = new ObjectMapper().readValue(json, MicroserviceModel.class);
        assertEquals("http://localhost:1010/random", random.getMicroserviceURI());
        assertEquals("MAK", random.getViewerUsername());
    }

}
