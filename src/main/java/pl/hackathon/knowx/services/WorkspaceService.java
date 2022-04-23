package pl.hackathon.knowx.services;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.dtos.WorkspaceDto;
import pl.hackathon.knowx.model.entities.Workspace;
import pl.hackathon.knowx.model.mappers.WorkspaceMapper;
import pl.hackathon.knowx.model.repositories.WorkspaceRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class WorkspaceService {
    private final WorkspaceRepository workspaceRepository;

    public Workspace createWorkspace(WorkspaceDto workspaceDto) {
        return workspaceRepository.save(WorkspaceMapper.INSTANCE.workspaceDtoToWorkspace(workspaceDto));
    }

    public Optional<Workspace> getWorkspace(Long id) {
        return workspaceRepository.findById(id);
    }

    public Optional<List<Workspace>> getAllWorkspaces(){
        return Optional.of(workspaceRepository.findAll());
    }

    public void deleteWorkspace(Long id) {
        workspaceRepository.deleteById(id);
    }
}
