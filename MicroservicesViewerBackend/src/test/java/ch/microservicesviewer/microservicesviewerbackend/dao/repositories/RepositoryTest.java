package ch.microservicesviewer.microservicesviewerbackend.dao.repositories;

import ch.microservicesviewer.microservicesviewerbackend.dao.model.HttpStatusDAOModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Testet die verschiedenen Repositories Klassen.
 */
@SpringBootTest
public class RepositoryTest {

    @Autowired
    private HttpStatusRepository httpStatusRepository;

    @Test
    public void testHttpStatusFindAll() {
        HttpStatusDAOModel httpStatus = httpStatusRepository.findAll().get(0);
        assertNotNull(httpStatus);
        assertEquals(100, httpStatus.getStatusCode());
        assertEquals("Continue", httpStatus.getStatusMessage());
    }

}
