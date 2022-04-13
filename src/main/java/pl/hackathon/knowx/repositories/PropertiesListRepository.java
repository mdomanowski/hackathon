package pl.hackathon.knowx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.PropertiesList;

@Repository
public interface PropertiesListRepository extends JpaRepository<PropertiesList, Long> {
}
