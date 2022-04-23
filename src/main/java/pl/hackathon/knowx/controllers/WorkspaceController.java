package pl.hackathon.knowx.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.dtos.WorkspaceDto;
import pl.hackathon.knowx.model.entities.Workspace;
import pl.hackathon.knowx.services.WorkspaceService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/workspace")
public class WorkspaceController {
    private final WorkspaceService workspaceService;

//    @PostMapping("/create")
//    public ResponseEntity<Workspace> createWorkspace(@RequestBody WorkspaceDto workspaceDtoDto) {
//        return ResponseEntity.ok(workspaceService.createWorkspace(workspaceDtoDto));
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Workspace> getWorkspace(@PathVariable Long id) {
        return workspaceService.getWorkspace(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Workspace>> getAllWorkspace() {
        return workspaceService.getAllWorkspaces().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
