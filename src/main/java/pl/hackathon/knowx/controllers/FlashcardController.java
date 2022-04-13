package pl.hackathon.knowx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hackathon.knowx.dtos.FlashcardDto;
import pl.hackathon.knowx.dtos.WorkspaceDto;
import pl.hackathon.knowx.model.Flashcard;
import pl.hackathon.knowx.model.Workspace;
import pl.hackathon.knowx.service.FlashcardService;
import pl.hackathon.knowx.service.WorkspaceService;

@RestController
@RequestMapping(path = "flashcard/")
public class FlashcardController {

    private final FlashcardService flashcardService;


    @Autowired
    public FlashcardController(FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @PostMapping("/create")
    public ResponseEntity<Flashcard> createPropertiesList(@RequestBody FlashcardDto flashcardDto) {

        Flashcard flashcard =
                flashcardService.
                        createFlashcard(flashcardDto.getTitle(), flashcardDto.getDescription(),
                                flashcardDto.getLink(), flashcardDto.getFlashcardProperties(),
                                flashcardDto.getWorkspaceDto());

        return ResponseEntity.ok(flashcard);
    }
}
