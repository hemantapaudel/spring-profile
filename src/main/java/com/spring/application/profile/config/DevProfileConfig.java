package com.spring.application.profile.config;


import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 
 *Spring 3.1  @Profiles is used to write conditional checking based on Environment variables only. Profiles can be used for loading application
 *  configuration based on environments.
 * 
 * We can create bean base on spring.profiles.active like dev,qa,production etc
 *
 * We can enable spring profile active from code or vm option
 * 
 * 1. VM OPTION ARGS 
 * 
 * -Dspring.profiles.active=dev
 * 
 * 2. USING JAVA CODE
 * System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev")
 * 
 */
@Configuration
public class DevProfileConfig {

	@Bean
	@Profile("dev")
	public CacheManager cacheManager() {
		System.out.println("Cache manager is dev env");
		return new ConcurrentMapCacheManager("movieFindCache-dev");
	}

	

}
