package com.spring.application.profile.service;

import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
public class CacheSystemService {

	private CacheManager cacheManager;

	public CacheSystemService(CacheManager cacheManager) {
		this.cacheManager = cacheManager;
		System.out.println("========" + this.cacheManager.getCacheNames()+ "================");
	}

	
	
	
}
