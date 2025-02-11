package com.springboot.demo.SpringBoot1.service;

import org.springframework.stereotype.Service;

@Service
public class Amazon {
	
	private Delivery delivery;

	public Amazon(Delivery delivery) {
		System.out.println("Ammazon bean created");
		this.delivery = delivery;
	}
	
	public boolean DeliveryStatus(double amount) {
		return delivery.deleveryStatus(amount);
	}

}
