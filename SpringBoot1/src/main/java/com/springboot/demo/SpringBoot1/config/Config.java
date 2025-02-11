package com.springboot.demo.SpringBoot1.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	public Config() {
		System.out.println("Config bean created");
	}
	
	@Bean
	public LocalDateTime createTime() {
		return LocalDateTime.now();
	}
}
