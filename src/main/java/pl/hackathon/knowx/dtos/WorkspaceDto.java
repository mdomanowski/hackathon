package pl.hackathon.knowx.dtos;

import lombok.*;
import pl.hackathon.knowx.model.Flashcard;
import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceDto {
    private Long id;
    private String workspaceName;
    private String description;
    private Set<PropertiesList> properties;
    private List<Flashcard> flashcardsList = new ArrayList<>();
    private User workspaceOwner;
    private List<User> participants = new ArrayList<>();
}
