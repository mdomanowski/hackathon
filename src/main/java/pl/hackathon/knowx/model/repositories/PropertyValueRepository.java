package pl.hackathon.knowx.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.entities.PropertyValue;

@Repository
public interface PropertyValueRepository extends JpaRepository<PropertyValue,Long> {
}
