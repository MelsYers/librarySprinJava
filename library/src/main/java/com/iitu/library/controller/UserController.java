package com.iitu.library.controller;


import com.iitu.library.entity.User;
import com.iitu.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userRepository.findById(id).get();
    }

    @GetMapping("/find")
    public List<User> getByUsernameContainingAndEmailContaining(@RequestParam String username, @RequestParam String email){
        return userRepository.findAllByUsernameContainsAndEmailContains(username, email);
    }

    @PostMapping("")
    public User createUser(@RequestBody User user){
        return userRepository.saveAndFlush(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        user.setId(id);
        return userRepository.save(user);
    }

}
