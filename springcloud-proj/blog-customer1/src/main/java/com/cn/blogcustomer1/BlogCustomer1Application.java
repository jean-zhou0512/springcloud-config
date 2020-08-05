package com.cn.blogcustomer1;

import myIRule.MyIRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClients(value = {
        @RibbonClient(name = "BLOG-PROVIDER1",configuration = MyIRule.class)
})
public class BlogCustomer1Application {

    public static void main(String[] args) {
        SpringApplication.run(BlogCustomer1Application.class, args);
    }

}
