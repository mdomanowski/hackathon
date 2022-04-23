package pl.hackathon.knowx.services;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.dtos.UserDto;
import pl.hackathon.knowx.model.entities.User;
import pl.hackathon.knowx.model.mappers.UserMapper;
import pl.hackathon.knowx.model.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User createUser(UserDto userDto) {
        return userRepository.save(UserMapper.INSTANCE.userDtoToUser(userDto));
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public Optional<List<User>> getAllUsers(){
        return Optional.of(userRepository.findAll());
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
