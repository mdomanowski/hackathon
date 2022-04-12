package pl.hackathon.knowx.dtos;

import lombok.*;
import pl.hackathon.knowx.model.Tag;
import pl.hackathon.knowx.model.User;
import pl.hackathon.knowx.model.Workspace;

import java.util.List;
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
    private User author;
    private Set<PropertyNameValueDto> flashcardProperties;
    private List<FlashcardDto> backlinks;
    private Set<Tag> tags;
    private Workspace workspace;
}
