package pl.hackathon.knowx.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.dtos.PropertiesListDto;
import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.service.PropertiesListService;

@RestController
@RequestMapping(path = "/proplist")
@Slf4j
public class PropertiesListController {
    private final PropertiesListService propertiesListService;
    @Autowired
    public PropertiesListController(PropertiesListService propertiesListService) {
        this.propertiesListService = propertiesListService;
    }

    @PostMapping("/create")
    public ResponseEntity<PropertiesList> createPropertiesList(@RequestBody PropertiesListDto p) {

        PropertiesList propertiesList = propertiesListService.createPropertiesList(p.getName(),
                p.getPropertyValues(),
                p.getWorkspace());
        return ResponseEntity.ok(propertiesList);
    }

    /**
     * return tagService.getTag(id).map(ResponseEntity::ok)
     *                 .orElse(ResponseEntity.notFound().build());
     */

    @GetMapping("/get/{id}")
    public ResponseEntity<PropertiesList> getPropertiesList(@PathVariable Long id) {
        return propertiesListService.getPropertiesList(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
