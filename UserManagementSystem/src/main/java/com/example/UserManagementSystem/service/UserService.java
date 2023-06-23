package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();

    private static int id = 0;

    static {
        users.add(new User(++id, "Zahid", "zahid123", "Kashmir", 9906612345L));
        users.add(new User(++id, "Umar", "umar001", "Kashmir", 9858123456L));
        users.add(new User(++id, "Aamir", "aamir189", "Kashmir", 7780123456L));
        users.add(new User(++id, "Zubair", "zubair00", "Kashmir", 7298123456L));
        users.add(new User(++id, "Asrar", "asrar05", "Kashmir", 9149123456L));
        users.add(new User(++id, "Bilal", "bilalb", "Kashmir", 9519123456L));
    }

    public List<User> findAllUser() {
        return users;
    }

    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getUserId() == id;
        User user = users.stream().filter(predicate).findFirst().get();
        return user;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(int id, User newUser) {
        User user = findById(id);
        user.setUserId(newUser.getUserId());
        user.setName(newUser.getName());
        user.setUserName(newUser.getUserName());
        user.setAddress(newUser.getAddress());
        user.setContact(newUser.getContact());
        System.out.println("User updated: " + user);
    }

    public void deleteUser(int id) {
        users.removeIf(user -> user.getUserId() == id);
        System.out.println("User deleted with id: " + id);
    }
}