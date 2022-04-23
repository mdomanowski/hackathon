package pl.hackathon.knowx.services;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.dtos.FlashcardDto;
import pl.hackathon.knowx.model.entities.Flashcard;
import pl.hackathon.knowx.model.mappers.FlashcardMapper;
import pl.hackathon.knowx.model.repositories.FlashcardRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FlashcardService {
    private final FlashcardRepository flashcardRepository;

    public Flashcard createFlashcard(FlashcardDto flashcardDto) {
        return flashcardRepository.save(FlashcardMapper.INSTANCE.flashcardDtoToFlashcard(flashcardDto));
    }

    public Optional<Flashcard> getFlashcard(Long id) {
        return flashcardRepository.findById(id);
    }

    public Optional<List<Flashcard>> getAllFlashcards(){
        return Optional.of(flashcardRepository.findAll());
    }

    public void deleteFlashcard(Long id) {
        flashcardRepository.deleteById(id);
    }
}
