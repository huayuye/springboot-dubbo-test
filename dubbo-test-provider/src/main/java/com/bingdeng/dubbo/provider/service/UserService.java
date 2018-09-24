package com.bingdeng.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bingdeng.dubbo.api.entity.User;
import com.bingdeng.dubbo.api.service.IUserService;
import org.springframework.stereotype.Component;

import java.util.Random;

//注意这个service使用的阿里的dubbo注解，表示这是注册的服务
@Service
public class UserService implements IUserService{
    @Override
    public User queryUserByName(String name) {
        return new User(name, new Random().nextInt(30));
    }
}
