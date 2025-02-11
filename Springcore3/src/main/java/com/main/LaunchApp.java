package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.Course;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");

		CourseOrganizer c = context.getBean(CourseOrganizer.class);
		c.buyTheCourse(4500.0);
	}

}
