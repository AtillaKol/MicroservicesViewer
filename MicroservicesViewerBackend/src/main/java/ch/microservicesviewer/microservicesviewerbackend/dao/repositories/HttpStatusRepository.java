package ch.microservicesviewer.microservicesviewerbackend.dao.repositories;

import ch.microservicesviewer.microservicesviewerbackend.dao.model.HttpStatusDAOModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository des DAO HttpStatus
 */
public interface HttpStatusRepository extends JpaRepository<HttpStatusDAOModel, Integer> {

    List<HttpStatusDAOModel> findAll();

}
