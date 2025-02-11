package com.course;

import org.springframework.stereotype.Service;

@Service
public class SpringBootCourse implements Course {

	public SpringBootCourse() {
		System.out.println("SpringBoot course bean created");
	}
	@Override
	public boolean buyACourse(double rate) {
		System.out.println("SpringBoot Course Purchased " + rate);
		return true;
	}

}
