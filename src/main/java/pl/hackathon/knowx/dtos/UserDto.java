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

    public UserDto(String nickname) {
        this.nickname = nickname;
    }
}
