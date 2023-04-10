package com.workLinker.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workLinker.ws.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
