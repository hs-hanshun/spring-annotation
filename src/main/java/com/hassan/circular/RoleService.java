package com.hassan.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleService {

    @Autowired
    private UserService userService;

    public RoleService() {
        System.out.println("RoleService Constructor");
    }
}
