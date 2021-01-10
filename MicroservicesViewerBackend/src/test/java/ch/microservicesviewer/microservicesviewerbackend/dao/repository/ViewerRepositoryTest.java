package ch.microservicesviewer.microservicesviewerbackend.dao.repository;

import ch.microservicesviewer.microservicesviewerbackend.dao.model.ViewersDAOModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ViewerRepositoryTest {

    @Autowired
    private ViewerRepository viewerRepository;

    @Test
    public void testInsertViewer() {
        ViewersDAOModel viewersDAOModel = new ViewersDAOModel();
        viewersDAOModel.setViewerUsername("Kola");
        viewersDAOModel.setViewerEMail("kola@test.ch");
        viewersDAOModel.setViewerPassword("HalloMeinNameKo");
        viewersDAOModel.setViewerName("Kolali");
        viewersDAOModel.setViewerSurname("Atilla");
        viewerRepository.save(viewersDAOModel);
        ViewersDAOModel findById = viewerRepository.findByViewerId(1);
        assertNotNull(findById);
        assertEquals(findById.getViewerId(), 1);
        assertEquals(findById.getViewerUsername(), "Kola");
        assertEquals(findById.getViewerEMail(), "kola@test.ch");
        assertEquals(findById.getViewerPassword(), "HalloMeinNameKo");
        assertEquals(findById.getViewerName(), "Kolali");
        assertEquals(findById.getViewerSurname(), "Atilla");
    }
}
