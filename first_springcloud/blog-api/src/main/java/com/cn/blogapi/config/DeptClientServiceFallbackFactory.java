package com.cn.blogapi.config;

import com.cn.blogapi.pojo.Department;
import com.cn.blogapi.service.DepeartmentService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DepeartmentService> {
    @Override
    public DepeartmentService create(Throwable throwable) {
        return new DepeartmentService() {
            @Override
            public List<Department> qryDepartmentList() {
                return null;
            }

            @Override
            public Department getDepById(String id) {
                Department department = new Department();
                department.setDepartmentName("服务暂时关闭，请明天再尝试");
                return department;
            }
        };
    }
}
