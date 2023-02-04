package com.example.recipe.web;

import com.example.recipe.entities.User;
import com.example.recipe.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> users(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("User not found"));
    }



}
