package com.spring.application;

import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.application.prototype.RequestProcessor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =	SpringApplication.run(Application.class, args);
		
		
		RequestProcessor requestProcessor = context.getBean(RequestProcessor.class);
		System.out.println(requestProcessor.hashCode());
		IntStream.range(0, 5).forEach(i->{
			System.out.println(requestProcessor.getValidatorByObjectFactory().hashCode());
			System.out.println(requestProcessor.getValidatorByLookUp().hashCode());
			System.out.println(requestProcessor.getValidator().hashCode());
		});
		
		
		System.exit(0);
		
	}
}
