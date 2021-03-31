package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：liuxp
 * @date ：Created in 2021/3/30 8:56
 * @description ：
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaServer_7001_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServer_7001_App.class,args);
    }
}
