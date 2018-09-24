package com.bingdeng.dubbo.api.service;

import com.bingdeng.dubbo.api.entity.User;

public interface IUserService {

    User queryUserByName(String name);

}
