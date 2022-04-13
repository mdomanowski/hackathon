package pl.hackathon.knowx.dtos;

import lombok.*;
import pl.hackathon.knowx.model.PropertyValue;
import pl.hackathon.knowx.model.Workspace;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertiesListDto {
    private Long id;
    private String name;
    private Set<PropertyValueDto> propertyValues;
    private WorkspaceDto workspace;
}
