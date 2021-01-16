package ch.microservicesviewer.microservicesviewerbackend.dao.repository;

import ch.microservicesviewer.microservicesviewerbackend.dao.model.ViewersDAOModel;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ViewerRepositoryTest {

    @Autowired
    private ViewerRepository viewerRepository;

    @Test
    @Order(1)
    public void testInsertData() {
        ViewersDAOModel viewersDAOModel = new ViewersDAOModel();
        viewersDAOModel.setViewerUsername("Kola");
        viewersDAOModel.setViewerEMail("kola@test.ch");
        viewersDAOModel.setViewerPassword("HalloMeinNameKo");
        viewersDAOModel.setViewerName("Kolali");
        viewersDAOModel.setViewerSurname("Atilla");
        ViewersDAOModel res = viewerRepository.save(viewersDAOModel);
        assertNotNull(res);
    }

    @Test
    @Order(2)
    public void testFindById() {
        Optional<ViewersDAOModel> kola = viewerRepository.findByViewerId(1);
        assertTrue(kola.isPresent());
        assertEquals(1, kola.get().getViewerId());
        assertEquals("Kola", kola.get().getViewerUsername());
        assertEquals("kola@test.ch", kola.get().getViewerEMail());
        assertEquals("HalloMeinNameKo", kola.get().getViewerPassword());
        assertEquals("Kolali", kola.get().getViewerName());
        assertEquals("Atilla", kola.get().getViewerSurname());
    }

    @Test
    @Order(3)
    public void testFindByUsername() {
        Optional<ViewersDAOModel> kola = viewerRepository.findByViewerUsername("Kola");
        assertTrue(kola.isPresent());
        assertEquals(1, kola.get().getViewerId());
        assertEquals("Kola", kola.get().getViewerUsername());
        assertEquals("kola@test.ch", kola.get().getViewerEMail());
        assertEquals("HalloMeinNameKo", kola.get().getViewerPassword());
        assertEquals("Kolali", kola.get().getViewerName());
        assertEquals("Atilla", kola.get().getViewerSurname());
    }
}
