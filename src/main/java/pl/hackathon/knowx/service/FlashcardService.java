package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.Flashcard;
import pl.hackathon.knowx.model.Tag;
import pl.hackathon.knowx.repositories.FlashcardRepository;
import pl.hackathon.knowx.repositories.TagRepository;
import pl.hackathon.knowx.repositories.UserRepository;
import pl.hackathon.knowx.repositories.WorkspaceRepository;

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

//    public Flashcard createFlashcard(String , Flashcard flashcard) {
//        Tag tag = tagRepository.save(new Tag(name, flashcard));
//        return tag;
//    }

}
