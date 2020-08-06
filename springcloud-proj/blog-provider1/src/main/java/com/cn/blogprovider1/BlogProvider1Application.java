package com.cn.blogprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //启用断路器
public class BlogProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogProvider1Application.class, args);
    }

}
