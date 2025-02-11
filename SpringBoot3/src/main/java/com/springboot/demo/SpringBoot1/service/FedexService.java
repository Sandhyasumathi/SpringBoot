package com.springboot.demo.SpringBoot1.service;

import org.springframework.stereotype.Service;

@Service
public class FedexService implements Delivery {

	public FedexService() {
		System.out.println("FedexService Bean created");
	}
	@Override
	public boolean deleveryStatus(double amount) {
		
		return true;
	}

}
