package com.javadev.paresh.mongodb.integration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javadev.paresh.mongodb.integration.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    // You can add custom query methods
    User findByEmail(String email);
    
}