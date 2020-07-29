package com.nocol.controller;

import com.nocol.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：liuxp
 * @date ：Created in 2019/8/26 16:52
 * @description ：
 */
@RestController
@RequestMapping("/feign")
public class DeptController {

    /**
     * 对外暴露的服务名称
     */
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    RestTemplate restTemplate;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        //return service.add(dept);
        return Boolean.FALSE;
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        //return service.get(id);
        return null;
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list",List.class);
    }

    @GetMapping(value = "hi")
    public String hi(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/hi",String.class);
    }
}
