package com.springboot.demo.SpringBoot1;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.demo.SpringBoot1.service.GreetingsImpl;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBoot1Application.class, args);
		GreetingsImpl greet = con.getBean(GreetingsImpl.class);
		LocalDateTime t = con.getBean(LocalDateTime.class);
		System.out.println("Current hour is " + t.getHour());
		System.out.println(greet.greet("San"));
	}

}
