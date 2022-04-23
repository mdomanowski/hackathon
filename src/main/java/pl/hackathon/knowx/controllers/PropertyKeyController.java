package pl.hackathon.knowx.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.dtos.PropertyKeyDto;
import pl.hackathon.knowx.model.entities.PropertyKey;
import pl.hackathon.knowx.services.PropertyKeyService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/prop-key")
public class PropertyKeyController {
    private final PropertyKeyService propertyKeyService;

    @PostMapping("/create")
    public ResponseEntity<PropertyKey> createPropertyKey(@RequestBody PropertyKeyDto propertyKeyDto) {
        return ResponseEntity.ok(propertyKeyService.createPropertyKey(propertyKeyDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropertyKey> getPropertyKey(@PathVariable Long id) {
        return propertyKeyService.getPropertyKey(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<PropertyKey>> getPropertyKey() {
        return propertyKeyService.getAllPropertyKeys().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
