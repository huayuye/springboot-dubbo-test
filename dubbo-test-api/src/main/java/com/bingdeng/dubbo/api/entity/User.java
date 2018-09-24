package com.bingdeng.dubbo.api.entity;

import java.io.Serializable;

public class User implements Serializable{



    private String Name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
