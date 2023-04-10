package com.workLinker.ws.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_role")
@Getter
@Setter
/*user role id numeric not null
user_id numeric not null
role id numeric not null */
public class UserRole {
    private Long user_role_id;

    private Long user_id;

    private Long role_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    
}
