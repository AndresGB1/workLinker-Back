package com.workLinker.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workLinker.ws.model.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    User findByEmailAndPassword(String email, String password);

    //select * from `user` u inner join user_role ur on ur.user_role_id = u.user_id WHERE ur.role_id =2;
    @Query(value = "select * from `user` u inner join user_role ur on ur.user_id = u.user_id WHERE ur.role_id = 2", nativeQuery = true)
    List<User> findByRoleId();
}
