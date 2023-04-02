package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserRepository {
    static HashMap<String, User> userDb;

    public UserRepository() {
        userDb = new HashMap<>();
    }

    static public String createUser(String name, String mobile) throws Exception {
            if (!userDb.containsKey(mobile)) {
                User newUser = new User(name, mobile);
                userDb.put(mobile, newUser);
            } else {
                throw new Exception("User already exists");
            }
            return "SUCCESS";
    }
}