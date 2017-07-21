package com.spring.application.profile.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class QaProfileConfig {
	@Bean
	@Profile("qa")
	public CacheManager cacheManager() {
		System.out.println("Cache manager is qa env");
		return new ConcurrentMapCacheManager("movieFindCache-qa");
	}
}
