package com.nocol.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.nocol.entities.Dept;
import com.nocol.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liuxp
 * @version 1.0
 * @date 2019/8/25 17:36
 */
@RestController
public class DeptController {

    @Autowired
    private IDeptService service;

    @Autowired
    private DiscoveryClient client;

    @Value("${server.port}")
    String port;


    @GetMapping(value = "/dept/get/{id}")
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = this.service.get(id);
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi liuxp,i'm from port:"+port;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }
}
