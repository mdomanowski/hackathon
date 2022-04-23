package pl.hackathon.knowx.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.entities.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Long> {
}
