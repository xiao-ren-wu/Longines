package com.test.service;

import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbThemeService;
import com.longines.service.TbTheme_GoodsService;
import com.longines.service.impl.ThemeServiceImpl;
import com.longines.service.impl.TbTheme_GoodsServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml"})
public class TestThemeGoods{
    @Autowired
    private TbTheme_GoodsService theme_goodsService;
    private TbThemeService tbThemeService;

    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext=new ClassPathXmlApplicationContext("spring/spring-longines-service.xml","spring/spring-longines-dao.xml");
    }
    /**
     * 根据商品名字搜索商品信息
     */
    @Test
    public void Test(){
        theme_goodsService=(TbTheme_GoodsServiceImpl) applicationContext.getBean("tbTheme_GoodsServiceImpl");
        tbThemeService =(ThemeServiceImpl)applicationContext.getBean("themeServiceImpl");
        int the_id= tbThemeService.SelectThe_id("知性");
        List<TbGoodsInfo> list=theme_goodsService.selectGoods(the_id);
        System.out.println(list);
    }

}
