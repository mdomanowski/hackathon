package pl.hackathon.knowx.dtos;

import lombok.*;
import pl.hackathon.knowx.model.PropertiesList;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertyValueDto {
    private Long id;
    private String name;
    private PropertiesListDto propertiesListDto;
}
