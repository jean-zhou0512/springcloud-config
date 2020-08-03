package com.cn.blogfeign.myRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule getRule() {
        return new MySelfRoundRobinRule();//自定义轮询规则
    }
}
