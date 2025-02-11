package com.springboot.demo.SpringBoot1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.demo.SpringBoot1.service.Amazon;




@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringBoot1Application.class, args);

		Amazon amazon  = con.getBean(Amazon.class);
		if (amazon.DeliveryStatus(55.5)) {
			System.out.println("Delivered");
		}else {
			System.out.println("Not Delivered");
		}
		con.close();
	}

}
