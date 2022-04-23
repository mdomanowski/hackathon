package pl.hackathon.knowx.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.WorkspaceDto;
import pl.hackathon.knowx.model.entities.Flashcard;
import pl.hackathon.knowx.model.entities.Workspace;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WorkspaceMapper {
    WorkspaceMapper INSTANCE = Mappers.getMapper(WorkspaceMapper.class);

    Workspace workspaceDtoToWorkspace(WorkspaceDto workspaceDto);
    WorkspaceDto workspaceToWorkspaceDto(Workspace workspace);
    List<Workspace> workspaceListDtoToWorkspaceList(List<WorkspaceDto> workspacesDto);
    List<WorkspaceDto> workspaceListToWorkspaceListDto(List<Workspace> workspaces);
}
