package com.spring.application.conditional.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceDAO {
	
	private ConnectionFactory connectionFactory;
	
	@Autowired
	public ServiceDAO(ConnectionFactory connectionFactory){
		this.connectionFactory = connectionFactory;
		System.out.println(this.connectionFactory.toString());
	}

	
	
	
}
