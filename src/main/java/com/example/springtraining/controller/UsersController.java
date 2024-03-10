package com.example.springtraining.controller;


import com.example.springtraining.model.Users;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    Users user;

    @GetMapping("{userId}")
    public Users getUserDetails(String userId) {
        return user;
    }

    @PostMapping
    public String createUser(@RequestBody Users user) {
        this.user = user;
        return "User created!";
    }

    @PutMapping
    public  String updateUser(@RequestBody Users user) {
        this.user = user;
        return "User updated!";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(String userId)
    {
        this.user = null;
        return "User deleted!";
    }
}
