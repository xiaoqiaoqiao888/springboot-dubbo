package com.camelot.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.camelot.service.ConsumerService;
import com.camelot.service.ProvideService;

import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Reference
    private ProvideService provideService;

    public String sayHello(String name) {
        return provideService.sayHello(name);
    }

}
