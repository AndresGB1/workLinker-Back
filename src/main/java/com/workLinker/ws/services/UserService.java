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
        if (UserRepository.findById(id).isPresent()) {
            User.setUser_id(id);

            return UserRepository.save(User);
        }
        return null;
    }

    public void deleteUser(Long id) {
        UserRepository.deleteById(id);
    }


    public User login(String email, String password) {
        return UserRepository.findByEmailAndPassword(email, password);
    }

    public User inactiveUser(Long id) {
        if (UserRepository.findById(id).isPresent()) {
            User user = UserRepository.findById(id).get();
            user.setIsActive(false);
            return UserRepository.save(user);
        }
        return null;
    }

    //findByRoleId
    public List<User> findByRoleId() {
        return UserRepository.findByRoleId();
    }
}
