package com.nocol.service;

import com.nocol.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：liuxp
 * @date ：Created in 2020/7/30 11:54
 * @description ：
 */
//指定微服务
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientServiceFeign {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);


    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);


    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();


}
