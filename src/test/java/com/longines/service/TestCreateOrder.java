package com.longines.service;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderInfo;
import com.longines.service.impl.TbOrderImpl;
import com.longines.service.impl.TbOrderInfoImpl;
import org.junit.Test;
import org.springframework.beans.MethodInvocationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestCreateOrder {
    @Test
    public void demo01()
    {
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
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        new TbOrderInfoImpl().insertSelective(tbOrderInfo);
    }
}
