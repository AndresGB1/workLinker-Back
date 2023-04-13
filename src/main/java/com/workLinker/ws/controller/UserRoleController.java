package com.workLinker.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workLinker.ws.services.UserRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.workLinker.ws.model.UserRole;

@RestController
@RequestMapping("/ws/UserRole")
public class    UserRoleController {

    @Autowired
    private UserRoleService UserRoleService;
    

    @GetMapping("/all")
    public List<UserRole> getAllUserRoles() {
        return UserRoleService.getAllUserRoles();
    }

    @GetMapping("/get/{id}")
    public UserRole getUserRole(@PathVariable Long id) {
        return UserRoleService.getUserRole(id);
    }

    @PostMapping("/add")
    public UserRole addUserRole(@RequestBody UserRole UserRole) {
        return UserRoleService.addUserRole(UserRole);
    }

    @PutMapping("/update/{id}")
    public UserRole updateUserRole(@PathVariable Long id, @RequestBody UserRole UserRole) {
        return UserRoleService.updateUserRole(id, UserRole);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserRole(@PathVariable Long id) {
        UserRoleService.deleteUserRole(id);
    }
    
}
