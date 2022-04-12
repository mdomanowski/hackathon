package pl.hackathon.knowx.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hackathon.knowx.model.Workspace;
import pl.hackathon.knowx.service.WorkspaceService;

@RestController
@RequestMapping(path = "workspace/")
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    @Autowired
    public WorkspaceController(WorkspaceService workspaceService) {
        this.workspaceService = workspaceService;
    }

    @GetMapping()
    public Workspace getAllWorkspaces(){
        return workspaceService.getWorkspace();
    }

}
