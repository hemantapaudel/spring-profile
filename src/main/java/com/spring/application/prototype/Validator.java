package com.spring.application.prototype;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//@Scope( value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Validator {

	public Validator(){
		System.out.println("validator object is created");
	}
}
