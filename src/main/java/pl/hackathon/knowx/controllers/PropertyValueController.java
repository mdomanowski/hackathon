package pl.hackathon.knowx.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.dtos.PropertyValueDto;
import pl.hackathon.knowx.model.entities.PropertyValue;
import pl.hackathon.knowx.services.PropertyValueService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/prop-value")
public class PropertyValueController {
    private final PropertyValueService propertyValueService;

    @PostMapping("/create")
    public ResponseEntity<PropertyValue> createPropertyValue(@RequestBody PropertyValueDto propertyValueDto) {
        return ResponseEntity.ok(propertyValueService.createPropertyValue(propertyValueDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropertyValue> getPropertyValue(@PathVariable Long id) {
        return propertyValueService.getPropertyValue(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<PropertyValue>> getAllPropertyValue() {
        return propertyValueService.getAllPropertyValues().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
