package com.nocol;

import com.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //向服务中心注册
//在启动该微服务时,就能加载自定义的ribbon配置类，使自定义的配置生效
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelfRule.class)
public class ConsumerDept_Ribbon6001_App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_Ribbon6001_App.class, args);
    }

}
