package com.longines.dao;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderKey;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUpdategNum {
    ApplicationContext ctx;
    @Before
    public  void setUp()throws  Exception
    {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void testUpdategNum()
    {
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        TbOrder tbOrder=new TbOrder();
        tbOrder.setoId(5);
        tbOrder.setgId(8);
        tbOrder.setgNum(2528);
        tbOrderMapper.updateByPrimaryKey(tbOrder);

    }

/*
    @Test         //这个方法不能改变'当前日期'的值,因为多了一条select语句,返回一个对象(一列数据).
    public void testUpdategNum2()
    {
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        TbOrderKey tbOrderKey=new TbOrderKey();
        tbOrderKey.setgId(2);
        tbOrderKey.setoId(2);
        TbOrder tbOrder=tbOrderMapper.selectByPrimaryKey(tbOrderKey);
        tbOrder.setgNum(123123);
        tbOrderMapper.updateByPrimaryKeySelective(tbOrder);
    }
    */
}
