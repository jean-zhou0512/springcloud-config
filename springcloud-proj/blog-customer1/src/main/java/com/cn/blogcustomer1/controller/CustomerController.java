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

    @RequestMapping(value="/service/dept/getList")
    public List<Department> getList(){
        return restTemplate.getForObject("http://localhost:9001/service/dep/qryDepartmentList",List.class);
    }
}
