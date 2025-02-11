package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.service.Password;

@Configuration
public class Config {

	public Config() {
		System.out.println("Config Bean Created");
	}
	
	@Bean
	public Password createAPassword() {
		Password pass = new Password("Alorithm");
		return pass;
	}
}
