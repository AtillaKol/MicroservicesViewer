package ch.microserviceviewerbackend.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewerModelTest {

    private static String json;

    @BeforeAll
    public static void init() {
        json = "{\n" +
                "\"ViewerUsername\": \"MAK\",\n" +
                "\"ViewerPassword\": \"HalloWelt123:)\",\n" +
                "\"ViewerName\": \"Kolali\",\n" +
                "\"ViewerSurname\": \"Atilla\"" +
                "}";
    }

    @Test
    public void validateData() throws JsonProcessingException {
        ViewerModel atilla = new ObjectMapper().readValue(json, ViewerModel.class);
        assertEquals("MAK", atilla.getViewerUsername());
        assertEquals("HalloWelt123:)", atilla.getViewerPassword());
        assertEquals("Kolali", atilla.getViewerName());
        assertEquals("Atilla", atilla.getViewerSurname());
    }

}
