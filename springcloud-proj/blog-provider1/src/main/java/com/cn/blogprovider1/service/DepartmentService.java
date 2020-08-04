package com.cn.blogprovider1.service;

import com.cn.blogapi.pojo.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    public List<Department> getList(Map<String,Object> paramMap);

    public void addDepartment(Department department);

    public Department getDepById(Integer id);
}
