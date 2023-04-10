package com.workLinker.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workLinker.ws.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.workLinker.ws.model.User;

@RestController
@RequestMapping("/ws/user")
public class UserController {

    @Autowired
    private UserService UserService;
    

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return UserService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id) {
        return UserService.getUser(id);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User User) {
        return UserService.addUser(User);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User User) {
        return UserService.updateUser(id, User);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        UserService.deleteUser(id);
    }
    
}
