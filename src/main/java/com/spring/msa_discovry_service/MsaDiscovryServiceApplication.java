package com.spring.msa_discovry_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // SErvice Discovery (서비스 디스커버리)로 사용하겠다.
public class MsaDiscovryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaDiscovryServiceApplication.class, args);
	}

}
