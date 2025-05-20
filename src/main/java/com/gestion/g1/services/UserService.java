package com.gestion.g1.services;

import com.gestion.g1.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByUsername(String username);
    List<User> getAllUsers();
    void deleteUserById(Long id);
}
