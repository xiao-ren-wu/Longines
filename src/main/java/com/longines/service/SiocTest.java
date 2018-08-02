package com.longines.service;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SiocTest {
    @Test
    public void Demo01() {
        //获得容器
        String xmlPath = "spring/spring-longines-service.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //获得内容
        Shopping_CartService userService = (Shopping_CartService) applicationContext.getBean("ShCServiceId");
        userService.addUser();
    }
}