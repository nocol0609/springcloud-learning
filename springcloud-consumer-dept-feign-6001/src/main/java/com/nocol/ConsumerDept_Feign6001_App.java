package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.nocol.service"})
@ComponentScan("com.nocol.service")
public class ConsumerDept_Feign6001_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_Feign6001_App.class, args);
    }

}
