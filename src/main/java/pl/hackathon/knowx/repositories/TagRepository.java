package pl.hackathon.knowx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
