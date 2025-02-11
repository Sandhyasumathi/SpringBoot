package com.springboot.demo.SpringBoot1.service;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BeanLc 
{

	static {
		System.out.println("Static block of BeanLc");
	}
	
	{
		System.out.println("Java init block of BeanLc");
	}
	
	public BeanLc() {
		System.out.println("Constructor of BeanLc");
	}
	
	public void disp() {
		System.out.println("disp method of BeanLc");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method of BeanLc");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method of BeanLc");
	}
}
