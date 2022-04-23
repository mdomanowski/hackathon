package pl.hackathon.knowx.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.dtos.PropertyDto;
import pl.hackathon.knowx.model.entities.Property;
import pl.hackathon.knowx.services.PropertyService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/property")
public class PropertyController {
    private final PropertyService propertyService;

    @PostMapping("/create")
    public ResponseEntity<Property> createProperty(@RequestBody PropertyDto propertyDtoDto) {
        return ResponseEntity.ok(propertyService.createProperty(propertyDtoDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Property> getProperty(@PathVariable Long id) {
        return propertyService.getProperty(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Property>> getAllProperty() {
        return propertyService.getAllProperties().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
