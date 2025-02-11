package com.service;

public class Employee {
	
	int id;
	String Name;
	double salary;
	String city;
	public Employee(int id, String name, double salary, String city) {
		super();
		System.out.println("Employee Bean has been created");
		this.id = id;
		Name = name;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + ", city=" + city + "]";
	}
	

}
