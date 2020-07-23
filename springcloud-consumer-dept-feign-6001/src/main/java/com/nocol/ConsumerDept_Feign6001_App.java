package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient  //向服务中心注册
public class ConsumerDept_Feign6001_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_Feign6001_App.class, args);
    }

}
