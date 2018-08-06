package com.longines.service;

import com.longines.pojo.TbGoodsInfo;
import com.longines.service.impl.TbGoodsInfoMapperServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: FengTianHao
 * @Date: 2018/8/6 0:10
 * @Version 1.0
 */
public class TbGoodsInfoMapperServiceTest {

    private ApplicationContext ctx;
    private TbGoodsInfoMapperService service;
    @Before
    public void setUp() throws Exception {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-service.xml","spring/spring-longines-dao.xml");
        service= (TbGoodsInfoMapperServiceImpl)ctx.getBean("tbGoodsInfoMapperServiceImpl");
    }

    @Test
    public void findGoodsByPriceDesc() {
        List<TbGoodsInfo> goods=service.findGoodsByPriceDesc();
        for(TbGoodsInfo g:goods)
        {

            System.out.println(g);
        }
    }

    @Test
    public void findGoodsByPriceAsc() {
        List<TbGoodsInfo> goods=service.findGoodsByPriceAsc();
        for(TbGoodsInfo g:goods)
        {

            System.out.println(g);
        }
    }

    @Test
    public void findGoodsByTheme() {
        List<TbGoodsInfo> goods=service.findGoodsByTheme("婉约");
        for(TbGoodsInfo g:goods)
        {

            System.out.println(g);
        }
    }

    @Test
    public void findGoodsInfoBysTimeDesc() {
        List<TbGoodsInfo> goods=service.findGoodsInfoBysTimeDesc();
        for(TbGoodsInfo g:goods)
        {

            System.out.println(g);
        }
    }

    @Test
    public void findGoodsInfoBysTimeAsc() {
        List<TbGoodsInfo> goods=service.findGoodsInfoBysTimeAsc();
        for(TbGoodsInfo g:goods)
        {

            System.out.println(g);
        }
    }

    @Test
    public void findGoodsInfoByLike() {
        List<TbGoodsInfo> goods=service.findGoodsInfoByLike((long)2000);
        for(TbGoodsInfo g:goods)
        {

            System.out.println(g);
        }
    }
}