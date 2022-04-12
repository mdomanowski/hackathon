package pl.hackathon.knowx.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertyNameValueDto {
    private long id;
    private String name;
    private String value;
    private FlashcardDto flashcardDto;
}
