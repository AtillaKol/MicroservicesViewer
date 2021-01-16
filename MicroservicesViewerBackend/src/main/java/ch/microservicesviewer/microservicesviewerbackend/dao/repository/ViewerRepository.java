package ch.microservicesviewer.microservicesviewerbackend.dao.repository;

import ch.microservicesviewer.microservicesviewerbackend.dao.model.ViewersDAOModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ViewerRepository extends JpaRepository<ViewersDAOModel, Integer> {

    @Override
    List<ViewersDAOModel> findAll();

    Optional<ViewersDAOModel> findByViewerId(Integer viewerId);

    Optional<ViewersDAOModel> findByViewerUsername(String username);

    @Override
    <S extends ViewersDAOModel> S save(S viewer);

    void deleteByViewerUsername(String username);

}
