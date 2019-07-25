package com.polpid.polpidconfigserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableConfigServer
@Slf4j
@RefreshScope
public class PolpidConfigServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PolpidConfigServerApplication.class, args);
	}

	@Value("${spring.application.name}")
	String application;

	@Override
	public void run(String... args) throws Exception {
		log.info("Application : " + application);
	}

}
