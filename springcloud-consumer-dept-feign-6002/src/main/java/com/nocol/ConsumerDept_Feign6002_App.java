package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.nocol"})
@ComponentScan("com.nocol")
public class ConsumerDept_Feign6002_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_Feign6002_App.class, args);
    }

}
