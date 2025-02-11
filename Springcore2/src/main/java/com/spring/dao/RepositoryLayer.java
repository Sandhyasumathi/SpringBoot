package com.spring.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.spring.service.Password;

@Repository
public class RepositoryLayer {

	public RepositoryLayer() {
		System.out.println("Repository Bean Created");
	}
	
}
