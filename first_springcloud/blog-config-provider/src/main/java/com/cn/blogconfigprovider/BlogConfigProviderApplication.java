package com.cn.blogconfigprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class BlogConfigProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogConfigProviderApplication.class, args);
    }

}
