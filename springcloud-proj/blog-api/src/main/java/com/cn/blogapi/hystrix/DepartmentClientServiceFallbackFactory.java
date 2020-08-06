package com.cn.blogapi.hystrix;

import com.cn.blogapi.pojo.Department;
import com.cn.blogapi.service.HystrixDepartmentService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentClientServiceFallbackFactory implements  FallbackFactory<HystrixDepartmentService> {

    @Override
    public HystrixDepartmentService create(Throwable throwable) {
        return new HystrixDepartmentService() {
            @Override
            public List<Department> qryDepartmentList() {
              return null;
            }

            @Override
            public Department getDepById(String id) {
               /* Department department = new Department();
                department.setId(Integer.parseInt(id));
                department.setDepartmentName("数据库没有这个数据---Hystrix");
                department.setCreatDate(new Date());*/
                Department department = new Department();
                department.setDepartmentName("服务暂时关闭，请明天再尝试");
                return department;
            }
        };
    }
}
