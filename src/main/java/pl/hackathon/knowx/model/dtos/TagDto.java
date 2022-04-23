package pl.hackathon.knowx.model.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class TagDto {
    private Long id;
    private String name;
}

