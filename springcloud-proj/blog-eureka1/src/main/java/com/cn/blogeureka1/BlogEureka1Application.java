package com.cn.blogeureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BlogEureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogEureka1Application.class, args);
    }

}
