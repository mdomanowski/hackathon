package pl.hackathon.knowx.model.dtos;

import lombok.*;
import pl.hackathon.knowx.model.entities.PropertyKey;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceDto {
    private Long id;
    private String workspaceName;
    private String description;
    private Set<PropertyKey> propertyKeys = new HashSet<>();
    private List<FlashcardDto> flashcards = new ArrayList<>();
    private UserDto workspaceOwner;
    private List<UserDto> participants = new ArrayList<>();
//    private List<String> participants = new ArrayList<>();
}
