package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.model.PropertyValue;
import pl.hackathon.knowx.model.Workspace;
import pl.hackathon.knowx.repositories.PropertiesListRepository;
import pl.hackathon.knowx.repositories.PropertyValueRepository;
import pl.hackathon.knowx.repositories.WorkspaceRepository;

import java.util.Set;

@Service
public class PropertiesListService {
    PropertiesListRepository propertiesListRepository;
    PropertyValueRepository propertyValueRepository;
    WorkspaceRepository workspaceRepository;

    @Autowired
    public PropertiesListService(PropertiesListRepository propertiesListRepository,
                                 PropertyValueRepository propertyValueRepository,
                                 WorkspaceRepository workspaceRepository) {
        this.propertiesListRepository = propertiesListRepository;
        this.propertyValueRepository = propertyValueRepository;
        this.workspaceRepository = workspaceRepository;
    }

    //tworzenie nowego propertieslist w repozytorium
    public PropertiesList createPropertiesList(String name, Set<PropertyValue> valuesSet, Workspace workspace) {
        return propertiesListRepository.save(new PropertiesList(name, valuesSet, workspace));
    }
    // pobieranie propertiesList z repozytorium
    public PropertiesList getPropertiesList(Long id)

}
