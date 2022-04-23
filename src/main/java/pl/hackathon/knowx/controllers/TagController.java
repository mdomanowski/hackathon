package pl.hackathon.knowx.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.dtos.TagDto;
import pl.hackathon.knowx.model.entities.Tag;
import pl.hackathon.knowx.services.TagService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tag")
public class TagController {
    private final TagService tagService;

    @PostMapping("/create")
    public ResponseEntity<Tag> createTag(@RequestBody TagDto tagDtoDto) {
        return ResponseEntity.ok(tagService.createTag(tagDtoDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tag> getTag(@PathVariable Long id) {
        return tagService.getTag(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tag>> getAllTag() {
        return tagService.getAllTags().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
