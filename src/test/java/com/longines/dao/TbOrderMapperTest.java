package com.longines.dao;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderInfo;
import com.sun.org.apache.bcel.internal.generic.DDIV;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.junit.Assert.*;

public class TbOrderMapperTest {
    ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
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
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        TbOrder tbOrder=new TbOrder();
        tbOrder.setoId(5);
        tbOrder.setgId(8);
        tbOrder.setgNum(2528);
        tbOrderMapper.updateByPrimaryKey(tbOrder);

    }

    @Test
    public void selectByoId() {
    }

    @Test
    public void selectgNum() {
       /*Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("d");
        String s=simpleDateFormat.format(date);
        System.out.println(Integer.parseInt(s));
        SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("d");
        new Date()=simpleDateFormat2.parse(s);
*/
    }
}