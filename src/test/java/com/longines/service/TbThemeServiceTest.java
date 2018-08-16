package com.longines.service;

import com.longines.pojo.TbGoodsThe;
import com.longines.service.impl.TbThemeServiceImpl;
import com.longines.vo.TbThemeGoodsInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TbThemeServiceTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {
        applicationContext=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml","spring/spring-longines-service.xml");
    }

    @Test
    public void Demo01(){
        TbThemeService tbThemeService=(TbThemeService)applicationContext.getBean("tbThemeServiceImpl");
        for (int i=1;i<=3;i++){
            List<TbThemeGoodsInfo> list=tbThemeService.SelectThemeGoods(i);
            System.out.println(list);
            System.out.println("+++++++++++++++++++++++++++++");
        }
    }

}