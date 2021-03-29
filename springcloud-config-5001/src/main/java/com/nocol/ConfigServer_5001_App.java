package com.nocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：liuxp
 * @date ：Created in 2021/3/26 9:57
 * @description ：
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer_5001_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001_App.class, args);
    }
}
