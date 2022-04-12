package pl.hackathon.knowx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.PropertyValue;

@Repository
public interface PropertyValueRepository extends JpaRepository<PropertyValue, Long> {
}
