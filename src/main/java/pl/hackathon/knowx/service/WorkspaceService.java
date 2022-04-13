package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.model.User;
import pl.hackathon.knowx.model.Workspace;
import pl.hackathon.knowx.repositories.WorkspaceRepository;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;


@Service
public class WorkspaceService {

    WorkspaceRepository workspaceRepository;
    PropertiesListService propertiesListService;

    @Autowired
    public WorkspaceService(WorkspaceRepository workspaceRepository, PropertiesListService propertiesListService) {
        this.workspaceRepository = workspaceRepository;
        this.propertiesListService = propertiesListService;
    }


    public Workspace createWorkspace(String name, String description, Map<String, Set<String>> map){

        Workspace workspace = new Workspace();
        workspace.setWorkspaceName(name);
        workspace.setDescription(description);
        /**
         * hardcoded userName
         */
        workspace.setWorkspaceOwner(new User("Michal"));

        Set<PropertiesList> insertSet = new HashSet<>();

        for (String nameProp : map.keySet()) {
            insertSet.add(propertiesListService.createPropertiesList(nameProp, map.get(nameProp), workspace));
        }
        workspace.setProperties(insertSet);

        return workspaceRepository.save(workspace);
    }

    public Optional<Workspace> getWorkspaceById(Long id) {
        Workspace wp = workspaceRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("No workspace with given id found!")
        );
        return Optional.ofNullable(wp);
    }

}