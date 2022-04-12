package pl.hackathon.knowx.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;
    private String nickname;
    private Set<WorkspaceDto> ownWorkspacesDto;
    private Set<WorkspaceDto> observedWorkspacesDto;

    public UserDto(String nickname, Set<WorkspaceDto> ownWorkspacesDto, Set<WorkspaceDto> observedWorkspacesDto) {
        this.nickname = nickname;
        this.ownWorkspacesDto = ownWorkspacesDto;
        this.observedWorkspacesDto = observedWorkspacesDto;
    }
}
