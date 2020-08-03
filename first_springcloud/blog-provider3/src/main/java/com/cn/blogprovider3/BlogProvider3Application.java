package com.cn.blogprovider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogProvider3Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogProvider3Application.class, args);
    }

}
