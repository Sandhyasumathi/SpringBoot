package com.springboot.demo.SpringBoot1.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsImpl implements IGreetings {
	
	
	@Autowired
	private LocalDateTime time;
	
	public GreetingsImpl() {
		System.out.println("GreetingsImpl been created");
	}

	
	public String greet(String name) {
		int hour=time.getHour();
		
		if(hour<12)
			return "Good Morning! " + name;
		else if(hour>12 && hour<16)
			return "Good Afternoon! " + name;
		else 
			return "Good Evening! " + name;
	
	}

}
