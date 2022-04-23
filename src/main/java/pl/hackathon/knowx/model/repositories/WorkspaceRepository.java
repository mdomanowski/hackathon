package pl.hackathon.knowx.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hackathon.knowx.model.entities.Workspace;

@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace,Long> {
}
