package com.hassan.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private RoleService roleService;

    public UserService() {
        System.out.println("UserService Constructor");
    }
}
