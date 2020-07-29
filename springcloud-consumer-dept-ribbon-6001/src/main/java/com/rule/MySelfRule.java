package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：liuxp
 * @date ：Created in 2020/7/29 16:51
 * @description ：
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {

        return new RandomRule();// Ribbon默认是轮询，我自定义为随机
        //return new RoundRobinRule();// Ribbon默认是轮询

        //return new RandomRule_ZY();// 我自定义为每台机器5次
    }
}
