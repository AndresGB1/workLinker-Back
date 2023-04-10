package com.workLinker.ws.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workLinker.ws.model.User;
import com.workLinker.ws.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    public List<User> getAllUsers() {
        List<User> Users = new ArrayList<>();
        UserRepository.findAll().forEach(Users::add);
        return Users;
    }

    public User getUser(Long id) {
        return UserRepository.findById(id).get();
    }

    public User addUser(User User) {
        return UserRepository.save(User);
    }

    public User updateUser(Long id, User User) {
        return UserRepository.save(User);
    }

    public void deleteUser(Long id) {
        UserRepository.deleteById(id);
    }

    
    
}
