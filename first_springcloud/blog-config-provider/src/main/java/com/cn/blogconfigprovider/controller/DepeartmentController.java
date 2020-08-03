package com.cn.blogconfigprovider.controller;

import com.cn.blogapi.pojo.Department;
import com.cn.blogconfigprovider.service.depeartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DepeartmentController {

    @Autowired
    private depeartmentService depeartmentService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/service/dep/qryDepartmentList")
    public List<Department> qryDepartmentList() {
        Map<String, Object> paramMap = new HashMap<>();
        return depeartmentService.getList(paramMap);
    }

    @RequestMapping(value = "/service/discovery/qryDepartmentList2")
    public Object qryDepartmentList2() {
        List<String> list = client.getServices();
        System.out.println("***********" + list);

        List<ServiceInstance> srvList = client.getInstances("BLOG-PROVIDER");

        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t"
                    + element.getPort() + "\t" + element.getUri());
        }
        return client;
    }

    @RequestMapping("/getDepById/{id}")
    public Department getDepById(@PathVariable String id) {
        Department department = depeartmentService.getDepById(Integer.parseInt(id));
        return department;
    }
}
