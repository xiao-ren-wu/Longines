package com.longines.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeleteOrderInfo {
    ApplicationContext ctx;
    @Before
    public  void  setUp()throws Exception
    {
           ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public  void  testDeleteOrderInfo()
    {
            TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
            tbOrderInfoMapper.deleteByPrimaryKey(2) ;
            System.out.println("删除成功");
    }

}
