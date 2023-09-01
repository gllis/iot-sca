package com.gllis.iot.auth.model;

import lombok.Data;

import java.util.Set;

@Data
public class UserEntity {

    private String email;
    private String password;

    private Set<RoleEntity> roles;
}
