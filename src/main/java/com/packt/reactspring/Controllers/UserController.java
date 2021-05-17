package com.packt.reactspring.Controllers;

import com.packt.reactspring.Entyties.User;
import com.packt.reactspring.Repositories.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserRepository repository;

    @RequestMapping("/user")
    public User createUser(int id, String username, String role, String password) {
        return repository.save(new User(id, username, role, password));
    }
}
