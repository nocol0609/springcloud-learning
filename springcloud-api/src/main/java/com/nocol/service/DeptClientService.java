package com.nocol.service;

import com.nocol.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author ：liuxp
 * @date ：Created in 2020/7/30 11:54
 * @description ：
 */
//指定微服务
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
//@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept);


    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);


    @GetMapping(value = "/dept/list")
    public List<Dept> list();


}
