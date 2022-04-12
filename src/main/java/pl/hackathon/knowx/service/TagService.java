package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.Flashcard;
import pl.hackathon.knowx.model.Tag;
import pl.hackathon.knowx.repositories.FlashcardRepository;
import pl.hackathon.knowx.repositories.TagRepository;

import java.util.Optional;

@Service
public class TagService {
    private TagRepository tagRepository;
    private FlashcardRepository flashcardRepository;
    @Autowired
    public TagService(TagRepository tagRepository,
                      FlashcardRepository flashcardRepository) {
        this.tagRepository = tagRepository;
        this.flashcardRepository = flashcardRepository;
    }
    public Tag createTag(String name, Flashcard flashcard) {
        Tag tag = tagRepository.save(new Tag(name, flashcard));
        return tag;
    }

    public Optional<Tag> getTag(Long id) {
        Optional<Tag> newTag = tagRepository.findById(id);
        return newTag;
    }

    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
}
