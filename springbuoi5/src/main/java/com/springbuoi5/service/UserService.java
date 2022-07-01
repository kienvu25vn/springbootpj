package com.springbuoi5.service;

import com.springbuoi5.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    List<User> getUserContainUserName(String username);

    void save(User user);

    void delete(Long id);
}
