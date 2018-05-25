package com.camelot.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.camelot.service.ProvideService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Reference
    private ProvideService provideService;

    @Test
    public void getMessage() {
        String sayHello = provideService.sayHello(" John-------");
        System.out.println(sayHello);
    }
}
