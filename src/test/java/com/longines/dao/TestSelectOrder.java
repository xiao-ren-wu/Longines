package com.longines.dao;
import com.longines.pojo.TbOrderInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.InputStream;

public class TestSelectOrder {
    ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public void testInsertOrderInfo() {
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setsNum(2);
        tbOrderInfo.setuId(2);
        System.out.println(tbOrderInfoMapper.selectBysNum(tbOrderInfo));
    }


}
