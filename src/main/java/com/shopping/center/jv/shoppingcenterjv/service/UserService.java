package com.shopping.center.jv.shoppingcenterjv.service;

import org.springframework.stereotype.Service;

import com.shopping.center.jv.shoppingcenterjv.model.User;
import com.shopping.center.jv.shoppingcenterjv.repository.UserRepository;

@Service
public class UserService {
    //TODO Add spring session to handle the session of users
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String username, String password) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        return userRepository.save(newUser);
    }
}
