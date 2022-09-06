package com.example.itWeb.contoller;

import com.example.itWeb.model.User;
import com.example.itWeb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/get-all-users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/save-user")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "SUCCESS";
    }

    @PutMapping(value = "/edit-user")
    public String editUser(@RequestParam(name = "id") Integer id,
                           @RequestBody User user) {
        user.setId(id);
        userService.editUser(user);
        return "SUCCESS";
    }

    @DeleteMapping(value = "/delete-user")
    public String deleteUser(@RequestParam(name = "id") Integer id) {
        userService.deleteUser(id);
        return "SUCCESS";
    }

    @GetMapping(value = "/get-user")
    public User getUser(@RequestParam(name = "id") Integer id) {
        return userService.getUser(id);
    }
}
