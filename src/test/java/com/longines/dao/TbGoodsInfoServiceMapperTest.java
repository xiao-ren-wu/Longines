package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import com.longines.vo.TbGoodsInfoExt;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author FengTianHao
 * @since 2018/8/8 22:12
 * @version 1.0
 */
public class TbGoodsInfoMapperTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() {
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void findGoodsByPriceDesc() {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper)ctx.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfo> goods=mapper.findGoodsByPriceDesc();
        for(TbGoodsInfo g:goods)
        {
            System.out.println(g);
        }

    }
    @Test
    public void findGoodsByPriceAsc() {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper)ctx.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfo> goods=mapper.findGoodsByPriceAsc();
        for(TbGoodsInfo g:goods)
        {
            System.out.println(g);
        }

    }
    @Test
    public void findGoodsByTheme() {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper)ctx.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfo> goods=mapper.findGoodsByTheme("婉约");
        for(TbGoodsInfo g: goods)
        {
            System.out.println(g);
        }
    }
    @Test
    public void findGoodsInfoBysTimeDesc() {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper)ctx.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfoExt> goods=mapper.findGoodsInfoBysTimeDesc();
        for (TbGoodsInfoExt g:goods)
        {
            System.out.println(g);
        }
    }
    @Test
    public void findGoodsInfoBysTimeAsc() {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper)ctx.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfoExt> goods=mapper.findGoodsInfoBysTimeAsc();
        for (TbGoodsInfoExt g:goods)
        {
            System.out.println(g);
        }
    }
    @Test
    public void findGoodsInfoByLike()
    {
        TbGoodsInfoMapper mapper=(TbGoodsInfoMapper)ctx.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfo> goods=mapper.findGoodsInfoByLike((long)2000);
        for (TbGoodsInfo g:goods)
        {
            System.out.println(g);
        }
    }

}