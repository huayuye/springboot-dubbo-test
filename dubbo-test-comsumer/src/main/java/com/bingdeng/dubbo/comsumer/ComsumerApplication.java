package com.bingdeng.dubbo.comsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo(scanBasePackages = {"com.bingdeng.dubbo.comsumer"})
public class ComsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComsumerApplication.class,args);
    }
}
