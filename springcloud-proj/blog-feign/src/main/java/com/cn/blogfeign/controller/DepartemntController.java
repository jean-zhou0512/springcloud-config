package com.cn.blogfeign.controller;

import com.cn.blogapi.pojo.Department;
import com.cn.blogapi.service.DepartmentService;
import com.cn.blogapi.service.HystrixDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartemntController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private HystrixDepartmentService hystrixDepartmentService;

    @RequestMapping(value="/service/dep/qryDepartmentList")
    public List<Department> qryDepartmentList(){
       return departmentService.qryDepartmentList();
    }

    @RequestMapping(value="/getDepById/{id}")
    public Department getDepById(@PathVariable String id){
        return departmentService.getDepById(id);
    }

    @RequestMapping(value="/service/dept/hystrix_qryDepartmentList")
    public List<Department> hystrix_qryDepartmentList(){
        return hystrixDepartmentService.qryDepartmentList();
    }

    @RequestMapping(value="/hystrix/getDepById2/{id}")
    public Department getDepById2(@PathVariable String id){
        return hystrixDepartmentService.getDepById(id);
    }
}
