package com.cn.blogprovider3.serviceImpl;

import com.cn.blogapi.pojo.Department;
import com.cn.blogprovider3.dao.DepartmentDao;
import com.cn.blogprovider3.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    @Override
    public List<Department> getList(Map<String, Object> paramMap) {
        List<Department> getList = departmentDao.getList(paramMap);
        return getList;
    }

    @Override
    public void addDepartment(Department department) {
        departmentDao.addDepartment(department);
    }

    @Override
    public Department getDepById(Integer id) {
        return departmentDao.getDepById(id);
    }
}
