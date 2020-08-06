package com.cn.blogconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigInfoController {

    @Value("${server.port}")
    private String port;

    @Value("${eureka.client.service-url.defaultZone}")
    private String defaultZone;

    @RequestMapping(value="/service/config/getConfigInfo")
    public String getConfigInfo(){
        return "port:"+port+"eureka配置信息:"+ defaultZone;
    }

}
