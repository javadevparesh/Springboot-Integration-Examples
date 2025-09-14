package com.javadev.paresh.mongodb.integration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javadev.paresh.mongodb.integration.model.User;
import com.javadev.paresh.mongodb.integration.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

