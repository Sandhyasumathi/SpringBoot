package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.course.Course;

@Service
public class CourseOrganizer 
{
	
	@Autowired
	@Qualifier("springBootCourse")
	private Course course;

	public CourseOrganizer() {
		System.out.println("Bean Created for CourseOrganizer");
	}

	public CourseOrganizer(Course course) {
		super();
		System.out.println("Constructor injection called");
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		System.out.println("Setter injection called");
		this.course = course;
	}
	
	public boolean buyTheCourse(double amount) {
		return course.buyACourse(amount);
	}
}
