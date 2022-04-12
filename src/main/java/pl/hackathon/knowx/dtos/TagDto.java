package pl.hackathon.knowx.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TagDto {
    private Long id;

    private String name;

    public TagDto(String name) {
        this.name = name;
    }
}
