package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.dtos.PropertyNameValueDto;
import pl.hackathon.knowx.dtos.WorkspaceDto;
import pl.hackathon.knowx.model.Flashcard;
import pl.hackathon.knowx.model.PropertyNameValue;
import pl.hackathon.knowx.model.Tag;
import pl.hackathon.knowx.model.Workspace;
import pl.hackathon.knowx.repositories.FlashcardRepository;
import pl.hackathon.knowx.repositories.TagRepository;
import pl.hackathon.knowx.repositories.UserRepository;
import pl.hackathon.knowx.repositories.WorkspaceRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class FlashcardService {
    private TagService tagService;
    private PropertyNameValueService propertyNameValueService;
    private FlashcardRepository flashcardRepository;
    private WorkspaceRepository workspaceRepository;
    private UserService userService;

    @Autowired
    public FlashcardService(TagService tagService, PropertyNameValueService propertyNameValueService, FlashcardRepository flashcardRepository, WorkspaceRepository workspaceRepository, UserService userService) {
        this.tagService = tagService;
        this.propertyNameValueService = propertyNameValueService;
        this.flashcardRepository = flashcardRepository;
        this.workspaceRepository = workspaceRepository;
        this.userService = userService;
    }

    public Flashcard createFlashcard(String title, String description, String link,
                                     Set<PropertyNameValueDto> set, WorkspaceDto workspaceDto) {

        Flashcard flashcard = new Flashcard();
        flashcard.setTitle(title);
        flashcard.setDescription(description);
        flashcard.setLink(link);

        // convert: Set<PropertyNameValueDto> set, WorkspaceDto workspaceDto
        flashcard.setFlashcardProperties(set);
        flashcard.setWorkspace(workspaceDto);

        flashcardRepository.save(flashcard);
        return flashcard;
    }

    public Optional<Flashcard> getFlashcardById(Long id) {
        Flashcard fc = flashcardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("No flashcard with given id found!")
        );
        return Optional.ofNullable(fc);
    }

}
