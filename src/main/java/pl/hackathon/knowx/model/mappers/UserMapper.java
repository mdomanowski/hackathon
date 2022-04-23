package pl.hackathon.knowx.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.UserDto;
import pl.hackathon.knowx.model.entities.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);
    List<User> userListDtoToUserList(List<UserDto> usersDto);
    List<UserDto> userListToUserListDto(List<User> users);
}
