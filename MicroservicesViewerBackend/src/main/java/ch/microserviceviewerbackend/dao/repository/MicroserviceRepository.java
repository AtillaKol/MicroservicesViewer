package ch.microserviceviewerbackend.dao.repository;

import ch.microserviceviewerbackend.dao.daomodels.MicroserviceModelDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroserviceRepository extends JpaRepository<MicroserviceModelDAO, Integer> {
}
