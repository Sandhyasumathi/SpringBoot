package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.Password;

public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Password password = context.getBean(Password.class);
		password.PasswordCreated();
		
	}
	
}
