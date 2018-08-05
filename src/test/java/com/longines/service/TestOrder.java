package com.longines.service;

import com.longines.service.impl.TbOrderImpl;
import org.junit.Test;
import org.springframework.beans.MethodInvocationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestOrder {
    @Test
    public void demo01()throws MethodInvocationException
    {
       /* String xmlpath="spring/spring-longines-service.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
        TbOrder tbOrder= (TbOrder) applicationContext.getBean("tbOrderId");*/
        System.out.println((long) ((Math.random()*90)+10));
    }
}
