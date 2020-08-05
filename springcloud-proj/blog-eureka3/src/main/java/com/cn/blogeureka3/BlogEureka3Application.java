package com.cn.blogeureka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BlogEureka3Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogEureka3Application.class, args);
    }

}
