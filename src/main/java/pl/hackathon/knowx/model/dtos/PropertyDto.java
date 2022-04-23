package pl.hackathon.knowx.model.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropertyDto {
    private Long id;
    private String key;
    private String value;
}

