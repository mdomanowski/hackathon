package pl.hackathon.knowx.controllers;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.dtos.WorkspaceDto;
import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.model.PropertyValue;
import pl.hackathon.knowx.model.User;
import pl.hackathon.knowx.model.Workspace;
import pl.hackathon.knowx.service.WorkspaceService;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(path = "workspace/")
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    @Autowired
    public WorkspaceController(WorkspaceService workspaceService) {
        this.workspaceService = workspaceService;
    }


    @PostMapping("/create")
    public ResponseEntity<Workspace> createPropertiesList(@RequestBody WorkspaceDto workspaceDto) {

        Workspace workspace = workspaceService.createWorkspace(workspaceDto.getWorkspaceName(),
                workspaceDto.getDescription(), workspaceDto.getProperties());

        return ResponseEntity.ok(workspace);
    }

    /**
     * return tagService.getTag(id).map(ResponseEntity::ok)
     * .orElse(ResponseEntity.notFound().build());
     */

    @GetMapping("/get/{id}")
    public ResponseEntity<Workspace> getWorkspace(@PathVariable Long id) {
        return workspaceService.getWorkspaceById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/createMock")
    public ResponseEntity<Workspace> createMock(){
        Workspace workspace = new Workspace();
        workspace.setWorkspaceName("workspaceName");
        workspace.setDescription("descr");
        User user = new User("owner");
        workspace.setWorkspaceOwner(user);

        PropertiesList propertiesList = new PropertiesList();
        propertiesList.setName("prop name");

        PropertyValue propVal = new PropertyValue();
        propVal.setName("val1");
        PropertyValue propVal2 = new PropertyValue();
        propVal.setName("val2");

        Set<PropertyValue> pvs = new HashSet<>();
        pvs.add(propVal);
        pvs.add(propVal2);

        propertiesList.setPropertyValues(pvs);


        Set<PropertiesList> secik = new HashSet<>();
        secik.add(propertiesList);

        workspace.setProperties(secik);


        return ResponseEntity.ok(workspace);
    }

}