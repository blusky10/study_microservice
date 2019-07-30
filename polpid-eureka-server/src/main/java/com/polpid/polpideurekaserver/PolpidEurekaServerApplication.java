package com.polpid.polpideurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PolpidEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolpidEurekaServerApplication.class, args);
	}

}
