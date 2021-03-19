package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuxp
 * @date ：Created in 2021/3/19 15:47
 * @description ：
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ProviderDept8001_Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001_Hystrix_App.class,args);
    }

}
