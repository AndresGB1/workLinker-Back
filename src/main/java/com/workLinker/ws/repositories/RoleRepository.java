package com.workLinker.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workLinker.ws.model.Role;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Long> {

    //select r.* from user_role ur inner join `role` r on r.role_id = ur.role_id  where ur.user_id = 2;
    @Query(value = "select r.* from user_role ur inner join `role` r on r.role_id = ur.role_id  where ur.user_id = ?1 limit 1", nativeQuery = true)
    Role findByUserId(Long userId);
    
}
