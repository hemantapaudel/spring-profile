package com.spring.application.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.spring.application.conditional.CondtionalBean;
import com.spring.application.conditional.CondtionalChecker;


@Configuration
public class ConditionalBeanConfig {
	
	@Bean
	@Conditional(CondtionalChecker.class)
	public CondtionalBean magicBean() {
		return new CondtionalBean();
	}

}
