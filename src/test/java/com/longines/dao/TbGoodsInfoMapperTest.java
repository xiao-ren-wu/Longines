package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author: FengTianHao
 * @Date: 2018/8/4 11:26
 * @Version 1.0
 */
public class TbGoodsInfoMapperTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public void findGoodsById() {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper) ctx.getBean("tbGoodsInfoMapper");
        TbGoodsInfo goods=mapper.findGoodsById(1);
        System.out.println(goods);
    }

    @Test
    public void findGoodsByPrice() {
    }

    @Test
    public void findGoodsByTheme() {
    }
}