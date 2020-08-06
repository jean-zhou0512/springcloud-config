package com.cn.blogapi.service;

import com.cn.blogapi.pojo.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "BLOG-PROVIDER1")
public interface DepartmentService {

    @RequestMapping("/service/dep/qryDepartmentList")
    public List<Department> qryDepartmentList();

    @RequestMapping("/getDepById/{id}")
    public Department getDepById(@PathVariable String id);
}
