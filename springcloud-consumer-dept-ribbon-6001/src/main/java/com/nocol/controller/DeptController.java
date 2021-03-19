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
@RequestMapping("/ribbon")
public class DeptController {

    /**
     * 对外暴露的服务名称
     */
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    RestTemplate restTemplate;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
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
