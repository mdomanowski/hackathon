package pl.hackathon.knowx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
