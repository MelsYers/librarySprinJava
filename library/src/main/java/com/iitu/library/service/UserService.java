package com.iitu.library.service;

import com.iitu.library.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void createUser(User user);
    void updateUser(Long id, User user);
}
