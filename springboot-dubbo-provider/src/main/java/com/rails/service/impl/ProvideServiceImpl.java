package com.rails.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rails.service.ProvideService;

import org.springframework.stereotype.Component;

@Component
@Service
public class ProvideServiceImpl implements ProvideService {

	public String sayHello(String name) {
		return "-------hello" + name;
	}

}
