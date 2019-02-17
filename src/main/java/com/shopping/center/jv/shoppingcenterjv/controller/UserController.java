package com.shopping.center.jv.shoppingcenterjv.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.center.jv.shoppingcenterjv.model.User;
import com.shopping.center.jv.shoppingcenterjv.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="user-controller", description="All operation allowed")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "createUser")
    @ApiOperation(value = "Create user")
    public User createUser(@RequestParam String username, @RequestParam String password) {

        return userService.createUser(username, password);
    }
}
