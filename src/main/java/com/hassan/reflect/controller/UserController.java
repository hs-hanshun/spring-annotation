package com.hassan.reflect.controller;

import com.hassan.reflect.AutoWired;
import com.hassan.reflect.service.UserService;

public class UserController {

    @AutoWired
    private UserService userService;


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
