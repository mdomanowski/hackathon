package pl.hackathon.knowx.dtos;

import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {
    private Long id;
    private String nickname;
    private Set<WorkspaceDto> ownWorkspacesDto;
    private Set<WorkspaceDto> observedWorkspacesDto;
}
