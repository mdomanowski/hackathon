package pl.hackathon.knowx.model.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class FlashcardDto {
    private Long id;
    private String title;
    private String description;
    private String link;
    private UserDto author;
//    private String author;
    private Set<PropertyDto> properties = new HashSet<>();

//    TODO
//    private List<FlashcardDto> backlinks = new ArrayList<>();

    private Set<TagDto> tags = new HashSet<>();
}
