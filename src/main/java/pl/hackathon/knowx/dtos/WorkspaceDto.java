package pl.hackathon.knowx.dtos;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
    private Map<String, Set<String>> properties;
    private List<FlashcardDto> flashcardsList = new ArrayList<>();
    private UserDto workspaceOwner;
    private List<UserDto> participants = new ArrayList<>();

}
