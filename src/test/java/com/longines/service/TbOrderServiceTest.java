package com.longines.service;

import com.longines.dao.TbOrderMapper;
import com.longines.pojo.TbOrder;
import com.longines.service.impl.TbOrderInfoServiceImpl;
import com.longines.service.impl.TbOrderServiceImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml"})
public class TbOrderServiceTest {
    private static TbOrderService service;
    private static TbOrderInfoService service2;
    @BeforeClass
    public  static void init()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml");
        service= (TbOrderService) ctx.getBean("tbOrderServiceImpl");
        service2= (TbOrderInfoService) ctx.getBean("tbOrderInfoServiceImpl");
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
        TbOrder tbOrder=new TbOrder();
        service.insertSelective(tbOrder);
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectByoId() {
        List<Integer> i=service2.selectByuid(222);
        System.out.println(service.selectByoid(i));
    }

    @Test
    public void selectgNum() {
        service.selectgNum(2);
    }
}