package ch.microservicesviewer.microservicesviewerbackend.configuration.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Tests fuer die WebMwc-Komponenten
 */
@SpringBootTest
@AutoConfigureMockMvc
public class WebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testRequestToNotFoundWithValidOrigin() throws Exception {
        mockMvc.perform(get("/random").header("Origin", "http://localhost:4200")).andDo(print())
                .andExpect(status().isNotFound());
    }

    /**
     * Die Anfrage dient zum test, ob der Origin abgelaehnt wird, da es nicht erlaubt ist.
     *
     * @throws Exception Falls Fehler und so
     */
    @Test
    public void testRequestToNotFoundWithInvalidOrigin() throws Exception {
        mockMvc.perform(get("/random").header("Origin", "http://localhost:8100")).andDo(print())
                .andExpect(status().isForbidden());
    }

}
