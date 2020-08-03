package com.nocol.controller;

import com.nocol.entities.Dept;
import com.nocol.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：liuxp
 * @date ：Created in 2019/8/26 16:52
 * @description ：
 */
@RestController
@RequestMapping("/feign")
public class DeptController {

    @Autowired
    private DeptClientService service;

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
}
