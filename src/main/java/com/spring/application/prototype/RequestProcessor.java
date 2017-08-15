package com.spring.application.prototype;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class RequestProcessor {
	
	@Autowired
	private Validator validator;
	
	public Validator getValidator() {
		return validator;
	}

	/**
	 * by autowire object factory
	 */
	@Autowired
	private ObjectFactory<Validator> objectFactory;
	
	public Validator getValidatorByObjectFactory(){
		return this.objectFactory.getObject();
	}
	
	/**
	 * by lookup
	 * @return
	 */
	@Lookup
	public Validator getValidatorByLookUp(){
        //spring will override this method
        return null;
    }
	
	
}
