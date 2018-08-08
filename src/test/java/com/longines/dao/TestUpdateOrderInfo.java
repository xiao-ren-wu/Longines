package com.longines.dao;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUpdateOrderInfo { ApplicationContext ctx;
    @Before
    public  void setUp()throws  Exception
    {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void testUpdateOrderInfo()
    {
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setoId(11112);
        tbOrderInfo.setsNum(10);
        tbOrderInfoMapper.updateByPrimaryKeySelective(tbOrderInfo);


    }


}
