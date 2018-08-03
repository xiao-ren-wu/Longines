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
import java.util.List;

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
        g.setgName("小金表");
        g.setBrand("白晓夏");
        g.setPrice(200.00);
        g.setTheme("娇小");
        g.setGpic("鞍山西安看");
        g.setApeo("女性");
        g.setDial("小胖表盘");
        g.setFunc("防水放到");
        g.setMov("机械");
        g.setStrap("金边");
        g.setWbut("表扣");
        mapper.insertGoods(g);

    }
    @Test
    public void findGoodsByPrice ()throws Exception
    {
        GoodsMapper mapper=(GoodsMapper)ctx.getBean("GoodsMapper");
        List<goods_info> goods=mapper.findGoodsByPrice();
        for(goods_info g:goods)
        {
            System.out.println(g);
        }

    }
    @Test
    public  void findGoodsByTheme()
    {
        GoodsMapper mapper=(GoodsMapper)ctx.getBean("GoodsMapper");
//        goods_info gs=new goods_info();
//        gs.setTheme("婉约");
        List<goods_info> goods=mapper.findGoodsByTheme("婉约");
        for(goods_info g:goods)
        {
            System.out.println(g);
        }
    }


}