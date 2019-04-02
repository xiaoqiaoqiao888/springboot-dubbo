package com.rails.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class ConsumerService {

	@Reference
	private ProvideService provideService;

	public String sayHello(String name) {
		return provideService.sayHello(name);
	}

}
