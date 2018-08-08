package com.test.service;

import com.longines.service.ThemeService;
import com.longines.service.impl.ThemeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml"})
public class TestTheme {

    @Autowired
    private ThemeService themeService;

    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml","spring/spring-longines-service.xml");
    }

    /**
     * 根据主题图片查找主题id
     */
    @Test
    public void Demo(){
        themeService=(ThemeServiceImpl)applicationContext.getBean("themeServiceImpl");
        int the_id=themeService.SelectThe_id("优雅");
        System.out.println(the_id);
    }
    /**
     * 根据主题图片查找主题图片URL
     */
    @Test
    public void Demo1(){
        themeService=(ThemeServiceImpl)applicationContext.getBean("themeServiceImpl");
        String the_pic=themeService.SelectThe_Pic("优雅");
        System.out.println(the_pic);
    }


}
