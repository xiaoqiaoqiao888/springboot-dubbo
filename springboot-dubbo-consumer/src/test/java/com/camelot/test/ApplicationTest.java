package com.camelot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.camelot.service.ConsumerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    private ConsumerService consumerService;

    @Test
    public void getMessage() {
        String sayHello = consumerService.sayHello(" John-------");
        System.out.println(sayHello);
    }
}
