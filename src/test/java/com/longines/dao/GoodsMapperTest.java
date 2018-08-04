package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class GoodsMapperTest {
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    @Test
    public void findGoodsById() throws Exception{
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper) ctx.getBean("tbGoodsInfoMapper");
        TbGoodsInfo goods=mapper.findGoodsById(2);
        System.out.println(goods);
    }

    @Test
    public void TestfindGoodsByPrice ()throws Exception
    {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper) ctx.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfo> goods=mapper.findGoodsByPrice();
        for(TbGoodsInfo g:goods)
        {
            System.out.println(g);
        }

    }
    @Test
    public  void findGoodsByTheme()
    {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper)ctx.getBean("tbGoodsInfoMapper");
//        goods_info gs=new goods_info();
//        gs.setTheme("婉约");
        List<TbGoodsInfo> goods=mapper.findGoodsByTheme("婉约");
        for(TbGoodsInfo g:goods)
        {
            System.out.println(g);
        }
    }


}