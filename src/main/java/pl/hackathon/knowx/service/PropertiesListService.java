package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.model.PropertyValue;
import pl.hackathon.knowx.model.Workspace;
import pl.hackathon.knowx.repositories.PropertiesListRepository;
import pl.hackathon.knowx.repositories.PropertyValueRepository;
import pl.hackathon.knowx.repositories.WorkspaceRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PropertiesListService {
    PropertiesListRepository propertiesListRepository;
    PropertyValueService propertyValueService;
    WorkspaceRepository workspaceRepository;


    @Autowired
    public PropertiesListService(PropertiesListRepository propertiesListRepository,
                                 PropertyValueService propertyValueService,
                                 WorkspaceRepository workspaceRepository) {
        this.propertiesListRepository = propertiesListRepository;
        this.propertyValueService = propertyValueService;
        this.workspaceRepository = workspaceRepository;
    }

    //tworzenie nowego propertiesList w repozytorium
    public PropertiesList createPropertiesList(String name, Set<String> valuesSet, Workspace workspace) {

        PropertiesList propertiesList = new PropertiesList();
        propertiesList.setName(name);
        propertiesList.setWorkspace(workspace);

        Set<PropertyValue> insertSet = new HashSet<>();
        for (String propertyValue : valuesSet) {
            PropertyValue p = propertyValueService.createPropertyValue(propertyValue, propertiesList);
            insertSet.add(p);
        }
        propertiesList.setPropertyValues(insertSet);

        return propertiesListRepository.save(propertiesList);
    }

    // pobieranie propertiesList z repozytorium
    public Optional<PropertiesList> getPropertiesList(Long id) {
        PropertiesList p = propertiesListRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("No properties list with given id found!")
        );
        return Optional.ofNullable(p);
    }

}
