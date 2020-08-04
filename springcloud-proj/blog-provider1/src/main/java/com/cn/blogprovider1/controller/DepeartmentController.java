package com.cn.blogprovider1.controller;

import com.cn.blogapi.pojo.Department;
import com.cn.blogprovider1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DepeartmentController {

    @Autowired
    private DepartmentService depeartmentService;


    @RequestMapping(value = "/service/dep/qryDepartmentList")
    public List<Department> qryDepartmentList() {
        Map<String, Object> paramMap = new HashMap<>();
        return depeartmentService.getList(paramMap);
    }

    @RequestMapping("/getDepById/{id}")
    public Department getDepById(@PathVariable String id) {
        Department department = depeartmentService.getDepById(Integer.parseInt(id));
        return department;
    }
}
