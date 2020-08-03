package com.cn.blogfeign;

import com.cn.blogfeign.myRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.cn.blogapi.config", "com.cn.blogfeign"})
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cn.blogapi.service"})
@RibbonClient(name = "BLOG-PROVIDER", configuration = MySelfRule.class)
public class BlogFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogFeignApplication.class, args);
    }

}
