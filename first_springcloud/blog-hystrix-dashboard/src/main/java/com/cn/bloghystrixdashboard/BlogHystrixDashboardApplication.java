package com.cn.bloghystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//开启Dashboard监控
public class BlogHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogHystrixDashboardApplication.class, args);
    }

}
