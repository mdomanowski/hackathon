package pl.hackathon.knowx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.PropertyValue;
import pl.hackathon.knowx.service.PropertyValueService;

@RestController
@RequestMapping(path = "/propval")
public class PropertyValueController {

    private final PropertyValueService propertyValueService;

    @Autowired
    public PropertyValueController(PropertyValueService propertyValueService) {
        this.propertyValueService = propertyValueService;
    }

    @PostMapping("/create")
    public ResponseEntity<PropertyValue> createTag(@RequestBody PropertyValue propertyValue) {
        PropertyValue pv = propertyValueService.createPropertyValue(propertyValue.getName(), null);
        return ResponseEntity.ok(pv);
    }
    @GetMapping("/getPropVal/{id}")
    public ResponseEntity<PropertyValue> getTag(@PathVariable Long id) {
        return propertyValueService.getPropertyValue(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}