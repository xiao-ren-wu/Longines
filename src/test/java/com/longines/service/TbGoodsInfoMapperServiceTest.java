package com.longines.service;

import com.longines.pojo.TbGoodsInfo;
import com.longines.vo.TbGoodsInfoExt;
import com.longines.service.impl.TbGoodsInfoMapperServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author FengTianHao
 * @since 2018/8/8 22:22
 * @version 1.0
 */
public class TbGoodsInfoMapperServiceTest {

    private ApplicationContext ctx;
    private TbGoodsInfoMapperService service;
    @Before
    public void setUp()  {
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
        List<TbGoodsInfoExt> goods=service.findGoodsInfoBysTimeDesc();
        for(TbGoodsInfoExt g:goods)
        {

            System.out.println(g);
        }
    }

    @Test
    public void findGoodsInfoBysTimeAsc() {
        List<TbGoodsInfoExt> goods=service.findGoodsInfoBysTimeAsc();
        for(TbGoodsInfoExt g:goods)
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