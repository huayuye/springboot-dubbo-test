package com.bingdeng.dubbo.comsumer.controller;

import com.bingdeng.dubbo.comsumer.service.UserService;
import com.bingdeng.dubbo.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public User queryUserByName(String name){
        return userService.queryUserByName(name);
    }

}
