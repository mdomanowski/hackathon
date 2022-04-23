package pl.hackathon.knowx.model.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {
    private Long id;
    private String nickname;
    private Set<WorkspaceDto> ownWorkspaces = new HashSet<>();
    private Set<WorkspaceDto> observedWorkspace = new HashSet<>();
    private WorkspaceDto participatedWorkspace;
}
