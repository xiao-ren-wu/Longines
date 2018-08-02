package com.longines.dao;

import com.longines.pojo.goods_info;
import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.mybatis.mapper.common.Mapper;

import java.io.InputStream;

import static org.junit.Assert.*;

public class GoodsMapperTest {
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public void findGoodsById() throws Exception{
        GoodsMapper mapper=(GoodsMapper)ctx.getBean("GoodsMapper");
        goods_info goods=mapper.findGoodsById(2);
        System.out.println(goods);
    }
    @Test
    public void InsertGoods()
    {

        GoodsMapper mapper=(GoodsMapper)ctx.getBean("GoodsMapper");
        goods_info g=new goods_info();
        g.setGname("表");
        g.setBrand("浪");
        g.setPrice(5000.00);
        g.setTheme("婉约");
        g.setG_pic("妈卖批");
        g.setA_peo("情侣");
        g.setDial("表盘");
        g.setFunc("防水");
        g.setMov("机械");
        g.setStrap("金边");
        g.setW_but("表扣");
        mapper.InsertGoods(g);

    }
}