package com.longines.dao;

import com.longines.pojo.TbOrderInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.*;

public class TbOrderInfoMapperTest {
    ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        tbOrderInfoMapper.deleteByPrimaryKey(11113) ;
        System.out.println("删除成功");
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
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
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setoId(11112);
        tbOrderInfo.setsNum(10);
        tbOrderInfoMapper.updateByPrimaryKeySelective(tbOrderInfo);
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectByuId() {
    }

    @Test
    public void selectBysNum() {
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setsNum(2);
        tbOrderInfo.setuId(2);
        System.out.println(tbOrderInfoMapper.selectBysNum(tbOrderInfo));
    }
}