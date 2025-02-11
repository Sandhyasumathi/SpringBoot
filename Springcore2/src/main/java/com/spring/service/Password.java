package com.spring.service;

public class Password {
	
	String algo;
	
	public Password(String algo) {
		this.algo=algo;
		System.out.println("Password Bean Has been created");
	}

	public void PasswordCreated() {
		System.out.println("Password has been created with algo " + algo);
	}
}
