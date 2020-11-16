package ch.microserviceviewerbackend.dao.repository;

import ch.microserviceviewerbackend.dao.daomodels.ViewerModelDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends JpaRepository<ViewerModelDAO, String> {
}
