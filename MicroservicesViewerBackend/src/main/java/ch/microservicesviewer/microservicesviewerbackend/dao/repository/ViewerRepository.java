package ch.microservicesviewer.microservicesviewerbackend.dao.repository;

import ch.microservicesviewer.microservicesviewerbackend.dao.model.ViewersDAOModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewerRepository extends JpaRepository<ViewersDAOModel, Integer> {

    @Override
    List<ViewersDAOModel> findAll();

    ViewersDAOModel findByViewerId(Integer viewerId);

    @Override
    <S extends ViewersDAOModel> S save(S viewer);

}
