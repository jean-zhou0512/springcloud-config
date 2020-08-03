package com.cn.blogprovider.dao;

import com.cn.blogapi.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface depeartmentDao {
    public List<Department> getList(Map<String, Object> paramMap);

    public void addDepeartment(Department department);

    public Department getDepById(Integer id);

}
