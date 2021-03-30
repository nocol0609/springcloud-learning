package com.nocol.controller;

import com.nocol.entities.Dept;
import com.nocol.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liuxp
 * @version 1.0
 * @date 2021/3/25 17:36
 */
@RestController
public class DeptController {

    @Autowired
    private IDeptService service;

    @Autowired
    private DiscoveryClient client;

    @Value("${server.port}")
    String port;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi liuxp,i'm from port:"+port;
    }



}
