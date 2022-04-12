package pl.hackathon.knowx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.Tag;
import pl.hackathon.knowx.service.TagService;

import java.util.Optional;

/**
 *     public Tag createTag(String name, Flashcard flashcard) {
 *         Tag tag = tagRepository.save(new Tag(name, flashcard));
 *         return tag;
 *     }
 *
 *     public Optional<Tag> getTag(Long id) {
 *         Optional<Tag> newTag = tagRepository.findById(id);
 *         return newTag;
 *     }
 *
 *     public void deleteTag(Long id) {
 *         tagRepository.deleteById(id);
 *     }
 */
@RestController
@RequestMapping(path = "/tag")
public class TagController {
    private final TagService tagService;
    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @PostMapping("/create")
    public ResponseEntity<Tag> createTag(@RequestBody Tag tag) {
        Tag newTag = tagService.createTag(tag.getName(), null);
        return ResponseEntity.ok(newTag);
    }
    @GetMapping("/getTag/{id}")
    public ResponseEntity<Tag> getTag(@PathVariable Long id) {
        return tagService.getTag(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
