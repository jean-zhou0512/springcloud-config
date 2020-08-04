package com.cn.blogprovider1.dao;

import com.cn.blogapi.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DepartmentDao {
    public List<Department> getList(Map<String,Object> paramMap);

    public void addDepartment(Department department);

    public Department getDepById(Integer id);
}
