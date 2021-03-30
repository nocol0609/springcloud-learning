package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuxp
 * @date ：Created in 2021/3/30 14:30
 * @description ：
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class ConfigDeptClient_5003_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigDeptClient_5003_App.class,args);
    }
}