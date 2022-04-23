package pl.hackathon.knowx.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.dtos.FlashcardDto;
import pl.hackathon.knowx.model.entities.Flashcard;
import pl.hackathon.knowx.services.FlashcardService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/flashcard")
public class FlashcardController {
    private final FlashcardService flashcardService;

    @PostMapping("/create")
    public ResponseEntity<Flashcard> createFlashcard(@RequestBody FlashcardDto flashcardDtoDto) {
        return ResponseEntity.ok(flashcardService.createFlashcard(flashcardDtoDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flashcard> getFlashcard(@PathVariable Long id) {
        return flashcardService.getFlashcard(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Flashcard>> getAllFlashcard() {
        return flashcardService.getAllFlashcards().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
