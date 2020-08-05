package com.cn.blogcustomer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogCustomer1Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogCustomer1Application.class, args);
    }

}
