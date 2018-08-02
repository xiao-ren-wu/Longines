package com.longines.dao;



import com.longines.pojo.Order;
import com.longines.pojo.User;
import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;

public class test {
    private ApplicationContext ctx;
    @Before
    public void setup() throws Exception
    {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void test ()throws Exception
    {
        OrderMapper ordermapper=(OrderMapper) ctx.getBean("orderMapper");
        Order order=ordermapper.findOrderById(1);
        System.out.println(order);

    }
}
