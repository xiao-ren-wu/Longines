package com.longines.service.impl;

import com.longines.service.Shopping_CartService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DiTest {
    @Test
    public void Demo() {
        //从容器中获得
        String xmlPath = "spring/spring-longines-service.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Shopping_CartService shopping_cartService = (Shopping_CartService) applicationContext.getBean("ShcSerId");
        shopping_cartService.addUser();
    }
}