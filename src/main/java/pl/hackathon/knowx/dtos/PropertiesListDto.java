package pl.hackathon.knowx.dtos;

import lombok.*;
import pl.hackathon.knowx.model.Workspace;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertiesListDto {
    private long id;
    private String name;
    private Set<String> propertyValues;
    private Workspace workspace;
}
