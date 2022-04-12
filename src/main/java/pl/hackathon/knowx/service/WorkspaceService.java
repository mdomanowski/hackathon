package pl.hackathon.knowx.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.Workspace;

@Service
@Getter
public class WorkspaceService {

    private Workspace workspace;

    public WorkspaceService(Workspace workspace) {
        this.workspace = new Workspace();
    }

}