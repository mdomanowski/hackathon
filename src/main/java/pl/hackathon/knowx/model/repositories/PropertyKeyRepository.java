package pl.hackathon.knowx.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.entities.PropertyKey;

@Repository
public interface PropertyKeyRepository extends JpaRepository<PropertyKey, Long> {
}
