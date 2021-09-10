package br.com.felipe.gadelha.msuser.api.controller;

import br.com.felipe.gadelha.msuser.api.dto.ResponseTemplateDTO;
import br.com.felipe.gadelha.msuser.domain.entity.User;
import br.com.felipe.gadelha.msuser.domain.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateDTO getUserWithDepartment(@PathVariable Long id) {
        return userService.getUserWithDepartment(id);
    }

}
