package com.enzo.userservice.service;

import com.enzo.userservice.domain.Role;
import com.enzo.userservice.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User>getUsers();
}
