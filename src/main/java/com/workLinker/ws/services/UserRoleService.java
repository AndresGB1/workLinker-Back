package com.workLinker.ws.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workLinker.ws.model.UserRole;
import com.workLinker.ws.repositories.UserRoleRepository;

@Service
public class UserRoleService {

    @Autowired
    private UserRoleRepository UserRoleRepository;

    public List<UserRole> getAllUserRoles() {
        List<UserRole> UserRoles = new ArrayList<>();
        UserRoleRepository.findAll().forEach(UserRoles::add);
        return UserRoles;
    }

    public UserRole getUserRole(Long id) {
        return UserRoleRepository.findById(id).get();
    }

    public UserRole addUserRole(UserRole UserRole) {
        return UserRoleRepository.save(UserRole);
    }

    public UserRole updateUserRole(Long id, UserRole UserRole) {
        return UserRoleRepository.save(UserRole);
    }

    public void deleteUserRole(Long id) {
        UserRoleRepository.deleteById(id);
    }

    
    
}
