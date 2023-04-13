package com.workLinker.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workLinker.ws.model.User;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    User findByEmailAndPassword(String email, String password);
}
