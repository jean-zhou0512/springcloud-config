package com.cn.blogapi.service;

import com.cn.blogapi.hystrix.DepartmentClientServiceFallbackFactory;
import com.cn.blogapi.pojo.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "BLOG-HYSTRIX-PROVIDER1",fallbackFactory = DepartmentClientServiceFallbackFactory.class)
public interface HystrixDepartmentService {
    @RequestMapping("/service/dep/qryDepartmentList")
    public List<Department> qryDepartmentList();

    @RequestMapping("/getDepById/{id}")
    public Department getDepById(@PathVariable String id);
}
