package com.service;

public class Department {
	
	int dpNo;
	String dpName;
	public Department(int dpNo, String dpName) {
		super();
		this.dpNo = dpNo;
		this.dpName = dpName;
	}
	@Override
	public String toString() {
		return "Department [dpNo=" + dpNo + ", dpName=" + dpName + "]";
	}
	
	

}
