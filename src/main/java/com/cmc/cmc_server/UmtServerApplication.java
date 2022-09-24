package com.cmc.cmc_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class UmtServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmtServerApplication.class, args);
	}


}
