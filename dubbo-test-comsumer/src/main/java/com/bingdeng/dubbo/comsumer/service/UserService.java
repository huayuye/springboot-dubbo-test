package com.bingdeng.dubbo.comsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bingdeng.dubbo.api.entity.User;
import com.bingdeng.dubbo.api.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Reference
    IUserService userService;

    public User queryUserByName(String name){
        return userService.queryUserByName(name);
    }

}
