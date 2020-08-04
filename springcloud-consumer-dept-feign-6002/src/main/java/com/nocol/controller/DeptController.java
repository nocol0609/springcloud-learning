package com.nocol.controller;

import com.nocol.entities.Dept;
import com.nocol.service.DeptClientServiceFeign;
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
    private DeptClientServiceFeign serviceFeign;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return this.serviceFeign.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return this.serviceFeign.get(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list() {
        return this.serviceFeign.list();
    }
}
