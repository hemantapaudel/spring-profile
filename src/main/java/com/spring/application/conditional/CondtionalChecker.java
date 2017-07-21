package com.spring.application.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CondtionalChecker implements Condition{

	@Override
	public boolean matches(ConditionContext context,AnnotatedTypeMetadata metadata) {
		Environment env = context.getEnvironment();
		String []str =env.getActiveProfiles();
		
		
		
		for(String s : str){
			System.out.println("====active profile ");
			if(s.contains("qa")){
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
		
	}

}
