package com.workLinker.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workLinker.ws.model.UserRole;


public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    
}
