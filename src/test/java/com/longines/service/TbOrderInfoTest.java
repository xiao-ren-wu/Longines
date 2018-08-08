package com.longines.service;

import com.longines.pojo.TbOrderInfo;
import com.longines.service.impl.TbOrderInfoImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TbOrderInfoTest {

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
        int i=new TbOrderInfoImpl().deleteByPrimaryKey(11113);
    }

    @Test
    public void insert() {
    }

    /**
     * 生成订单
     */
    @Test
    public void insertSelective() {
         /*String xmlpath="spring/spring-longines-service.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
        TbOrderInfoImpl tbOrderInfoImpl= (TbOrderInfoImpl) applicationContext.getBean("tbOrderInfoImpl");*/
       /* TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setuId(2);
        tbOrderInfo.setaId(3);
        tbOrderInfo.setoId(111181);
        tbOrderInfo.setCreDate(new Date());
        tbOrderInfo.setDelDate(new Date());
        tbOrderInfo.setTbDate(new Date());
        tbOrderInfo.setaAmount((long) 222);
        tbOrderInfo.setFreight((long) 3333);
        tbOrderInfo.setsNum(10);
        tbOrderInfo.setdMethod("火车");
        new TbOrderInfoImpl().insertSelective(tbOrderInfo);*/
        com.longines.pojo.TbOrderInfo tbOrderInfo=new TbOrderInfo();
        new TbOrderInfoImpl().insertSelective(tbOrderInfo);
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
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo=new TbOrderInfoImpl().selectByPrimaryKey(11114);
        new TbOrderInfoImpl().updateByPrimaryKeySelective(tbOrderInfo);
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectByuId() {
    }

    @Test
    public void selectBysNum() {
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setsNum(2);
        tbOrderInfo.setuId(2);
        System.out.println(new TbOrderInfoImpl().selectBysNum(tbOrderInfo));
    }

    @Test
    public void all()
    {
       /* TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setoId(2);*/
        new TbOrderInfoImpl().countAll(2);
    }
}