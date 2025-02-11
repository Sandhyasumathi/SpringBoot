package com.springboot.demo.SpringBoot1;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.demo.SpringBoot1.service.BeanLc;



@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringBoot1Application.class, args);

		BeanLc b = con.getBean(BeanLc.class);
	
		b.disp();
		con.close();
	}

}
