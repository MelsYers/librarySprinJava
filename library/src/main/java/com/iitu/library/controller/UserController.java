package com.iitu.library.controller;


import com.iitu.library.entity.User;
import com.iitu.library.repository.UserRepository;
import com.iitu.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello everyone!";
    }


    @GetMapping("/create")
    public void createUserByUsernamePassword(String username,
                                             String password) {
        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        createUser(user);
    }
    @PostMapping("")
    public void createUser(@RequestBody User user){
        System.out.println("UserController.createUser");
        System.out.println("user = " + user);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.createUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id,
                           @RequestBody User user) {

        System.out.println("UserController.updateUser");
        System.out.println("id = " + id);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("authentication.getName() = " + authentication.getName());

        userService.updateUser(id, user);
    }

}
