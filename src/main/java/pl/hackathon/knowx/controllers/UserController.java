package pl.hackathon.knowx.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.hackathon.knowx.model.dtos.UserDto;
import pl.hackathon.knowx.model.entities.User;
import pl.hackathon.knowx.services.UserService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDtoDto) {
        return ResponseEntity.ok(userService.createUser(userDtoDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return userService.getUser(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser() {
        return userService.getAllUsers().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
