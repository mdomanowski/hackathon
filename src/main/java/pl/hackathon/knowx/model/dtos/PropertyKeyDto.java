package pl.hackathon.knowx.model.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertyKeyDto {
    private Long id;
    private String name;
//    @JsonProperty("property_values")
    private Set<PropertyValueDto> propertyValues = new HashSet<>();
}

