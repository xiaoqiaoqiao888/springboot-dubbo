package com.camelot.service;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService{
    @Reference
    private ProvideService provideService;

    public String sayHello(String name) {
        return provideService.sayHello(name);
    }

}
