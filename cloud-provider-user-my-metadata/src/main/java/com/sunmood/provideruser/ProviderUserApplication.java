package com.sunmood.provideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//也可以使用@EnableEurekaClient替代，在springcloud中服务发现组件有多种选择，例如Zookeeper、consul等。
//该注解是spring-cloud-commons项目的注解，是一个高度的抽象，而@EnableEurekaClient是Eureka的client，
//该注解是spring-cloud-netflix项目中的注解，只能与Eureka一起工作。。
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUserApplication.class, args);
	}
}
