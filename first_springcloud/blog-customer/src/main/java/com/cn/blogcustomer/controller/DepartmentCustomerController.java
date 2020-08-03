package com.cn.blogcustomer.controller;

import com.cn.blogapi.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DepartmentCustomerController {

    public static String url = "http://BLOG-PROVIDER";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/service/customer/qryDepartmentList")
    public List<Department> qryDepartmentList() {
        return restTemplate.getForObject(url + "/service/dep/qryDepartmentList", List.class);
    }

    @RequestMapping(value = "/service/customer/qryDepartmentList2")
    public Object qryDepartmentList2() {
        return restTemplate.getForObject(url + "/service/discovery/qryDepartmentList2", Object.class);
    }
}
