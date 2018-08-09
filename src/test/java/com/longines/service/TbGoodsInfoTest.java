package com.longines.service;

import com.longines.dao.TbOrderMapper;
import com.longines.service.impl.TbGoodsInfoImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class TbGoodsInfoTest {
    ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public void selectPrice() {
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        List<Integer> gId=tbOrderMapper.selectByoId(2);
        new TbGoodsInfoImpl().selectPrice(gId);
    }
}