package com.workLinker.ws.controller;

import com.workLinker.ws.model.UserRole;
import com.workLinker.ws.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.workLinker.ws.services.UserService;

import java.util.List;
import com.workLinker.ws.model.User;

@RestController
@RequestMapping("/ws/user")
public class UserController {

    @Autowired
    private UserService UserService;

    @Autowired
    private UserRoleService UserRoleService;


    @GetMapping("/all")
    public List<User> getAllUsers() {
        return UserService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id) {
        return UserService.getUser(id);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User User, @RequestParam("role_id") Long roleId) {
        User user = UserService.addUser(User);
        UserRole userRole = new UserRole();
        userRole.setRole_id(roleId);
        userRole.setUser_id(user.getUser_id());
        UserRoleService.addUserRole(userRole);
        return user;
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User User) {
        return UserService.updateUser(id, User);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        UserService.deleteUser(id);
    }

    @PostMapping("/login")
    public User login(@RequestParam("email") String email, @RequestParam("password") String password) {
        return UserService.login(email, password);
    }

    @PutMapping("/inactive/{id}")
    public User inactiveUser(@PathVariable Long id) {
        return UserService.inactiveUser(id);
    }

}