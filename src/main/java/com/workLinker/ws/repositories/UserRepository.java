package com.workLinker.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workLinker.ws.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    
}
