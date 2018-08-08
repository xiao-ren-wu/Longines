package com.longines.controller;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/6$ 9:53$
 * @Version: 1.0
 */
public class TestAction {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-longines-web.xml");

        ShoppingCartAction shcAction = (ShoppingCartAction) applicationContext.getBean("ShcActionId");
        shcAction.add();
    }
}
