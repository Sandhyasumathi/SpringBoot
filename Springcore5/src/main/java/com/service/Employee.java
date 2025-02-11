package com.service;

public class Employee {
	
	int id;
	String Name;
	double salary;
	String city;
	Department depart;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setDepart(Department depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + ", city=" + city + ", depart=" + depart
				+ "]";
	}
	
}
