package com.cn.blogprovider2.service;


import com.cn.blogapi.pojo.Department;

import java.util.List;
import java.util.Map;

public interface depeartmentService {
    public List<Department> getList(Map<String, Object> paramMap);

    public void addDepeartment(Department department);

    public Department getDepById(Integer id);


}
