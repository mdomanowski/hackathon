package pl.hackathon.knowx.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.FlashcardDto;
import pl.hackathon.knowx.model.entities.Flashcard;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FlashcardMapper {
    FlashcardMapper INSTANCE = Mappers.getMapper(FlashcardMapper.class);

    Flashcard flashcardDtoToFlashcard(FlashcardDto flashcardDto);
    FlashcardDto flashcardToFlashcardDto(Flashcard flashcard);
    List<Flashcard> flashcardListDtoToFlashcardList(List<FlashcardDto> flashcardsDto);
    List<FlashcardDto> flashcardListToFlashcardListDto(List<Flashcard> flashcards);
}
