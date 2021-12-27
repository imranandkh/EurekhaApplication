package com.incedo.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaRegistryClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistryClientTwoApplication.class, args);
	}

}
