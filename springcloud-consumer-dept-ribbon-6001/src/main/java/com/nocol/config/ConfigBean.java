package com.nocol.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
 public class ConfigBean {
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}


//	/**
//	 * 变更ribbon自带的负载均衡算法
//	 * @return
//	 */
//	@Bean
//	public IRule myRule(){
//		return new RoundRobinRule();
//		//return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
//		//return new RetryRule();  //服务都正常时和轮训一样，当其中一台宕机后，使用该负载均衡算法会尝试访问几次后确认服务不可用时自动不访问
//	}
}