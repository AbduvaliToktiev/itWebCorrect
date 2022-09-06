package com.example.itWeb.service;

import com.example.itWeb.dao.UserRepository;
import com.example.itWeb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public void editUser(User user) {
        userRepository.editUser(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }

    public User getUser(Integer id) {
        return userRepository.getUser(id);
    }
}
