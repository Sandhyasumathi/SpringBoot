package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");

		System.out.println(context.getBean("emp1",Employee.class));
		System.out.println(context.getBean("emp2",Employee.class));
	}

}
