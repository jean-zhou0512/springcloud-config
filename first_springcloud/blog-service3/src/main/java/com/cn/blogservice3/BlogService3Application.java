package com.cn.blogservice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BlogService3Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogService3Application.class, args);
    }

}
