package com.cn.blogfeign.controller;

import com.cn.blogapi.pojo.Department;
import com.cn.blogapi.service.DepeartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentCustomerController {

    @Autowired
    DepeartmentService depeartmentService;

    @RequestMapping(value = "/service/customer/qryDepartmentList")
    public List<Department> qryDepartmentList() {
        return depeartmentService.qryDepartmentList();
    }

    @RequestMapping("/service/customer/getDepById/{id}")
    public Department getDepById(@PathVariable String id) {
        return depeartmentService.getDepById(id);
    }
}
