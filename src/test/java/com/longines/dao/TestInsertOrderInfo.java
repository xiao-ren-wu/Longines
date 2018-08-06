package com.longines.dao;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.Date;

public class TestInsertOrderInfo {
    ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public void testInsertOrderInfo() {
        TbOrderInfoMapper tbOrderInfoMapper = (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        TbOrderInfo tbOrderInfo = new TbOrderInfo();
        /*tbOrderInfo.setoId(11);*/
        tbOrderInfo.setuId(222);
        tbOrderInfo.setaId(333);
        tbOrderInfo.setCreDate(new Date());
        tbOrderInfo.setDelDate(new Date());
        tbOrderInfo.setTbDate(new Date());
        tbOrderInfo.setaAmount((long) 444);
        tbOrderInfo.setFreight((long) 555);
        tbOrderInfo.setsNum(666);
        tbOrderInfo.setdMethod("飞机");
        tbOrderInfoMapper.insertSelective(tbOrderInfo);
    }

}