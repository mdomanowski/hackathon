package pl.hackathon.knowx.model.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertyDto {
    private Long id;
    private String name;
    private String value;
    private FlashcardDto flashcard;
}

