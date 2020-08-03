package com.cn.blogprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogProvider2Application.class, args);
    }

}
