package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中，该注解表示自己是 eureka client
@EnableDiscoveryClient //服务发现
public class ProviderDept8001_App {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001_App.class, args);
    }
}
