package com.cn.blogcustomer1.controller;

import com.cn.blogapi.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    private static String SPRINGCLOUD_PROVIDER= "http://BLOG-PROVIDER1";


    @RequestMapping(value="/service/dept/getList")
    public List<Department> getList(){
        return restTemplate.getForObject(SPRINGCLOUD_PROVIDER+"/service/dep/qryDepartmentList",List.class);
    }

    @RequestMapping(value="/service/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(SPRINGCLOUD_PROVIDER+"/service/dept/discovery",Object.class);
    }


}
