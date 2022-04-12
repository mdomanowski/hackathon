package pl.hackathon.knowx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.PropertyNameValue;

@Repository
public interface PropertyNameValueRepository extends JpaRepository<PropertyNameValue, Long> {
}
