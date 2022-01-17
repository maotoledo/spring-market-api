package com.hc.hcmarket;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class HcMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcMarketApplication.class, args);
	}
}
