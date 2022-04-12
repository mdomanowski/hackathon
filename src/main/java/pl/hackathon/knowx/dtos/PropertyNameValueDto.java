package pl.hackathon.knowx.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertyNameValueDto {
    private Long id;
    private String name;
    private String value;
    private FlashcardDto flashcardDto;
}
