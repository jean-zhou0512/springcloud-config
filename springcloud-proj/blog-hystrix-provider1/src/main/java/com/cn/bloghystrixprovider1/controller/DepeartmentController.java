package com.cn.bloghystrixprovider1.controller;

import com.cn.blogapi.pojo.Department;
import com.cn.bloghystrixprovider1.service.DepartmentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DepeartmentController {

    @Autowired
    private DepartmentService depeartmentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/service/dep/qryDepartmentList")
    public List<Department> qryDepartmentList() {
        Map<String, Object> paramMap = new HashMap<>();
        return depeartmentService.getList(paramMap);
    }

    @RequestMapping("/getDepById/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Department getDepById(@PathVariable String id) {
        Department department = depeartmentService.getDepById(Integer.parseInt(id));
        if(department == null){
            throw new RuntimeException("数据库没有对应的信息");
        }
        return department;
    }

    public Department processHystrix_Get(@PathVariable String id){
        Department department = new Department();
        department.setId(Integer.parseInt(id));
        department.setDepartmentName("数据库没有这个数据---Hystrix");
        department.setCreatDate(new Date());
        return department;
    }

    @RequestMapping(value="/service/dept/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("***********"+list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("BLOG-PROVIDER1");
        for(ServiceInstance element : srvList){
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }
        return this.discoveryClient;
    }
}
