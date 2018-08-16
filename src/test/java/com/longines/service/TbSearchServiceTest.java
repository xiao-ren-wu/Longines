package com.longines.service;

import com.longines.service.impl.TbSearchServiceImpl;
import com.longines.vo.TbSearchGoodsInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TbSearchServiceTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext=new ClassPathXmlApplicationContext("spring/spring-longines-service.xml","spring/spring-longines-dao.xml");
    }

    @Test
    public void Test(){

        TbSearchService tbSearchService =(TbSearchServiceImpl) applicationContext.getBean("tbSearchServiceImpl");
        List<TbSearchGoodsInfo> list= tbSearchService.search("22");

        if(list==null||list.size()==0){
            System.out.println("NULL!!!");
        }else{
            System.out.println(list);
        }
    }

    /**
     * 此测试类可以测试四个排序
     */
    @Test
    public void Demo(){
        TbSearchService tbSearchService=(TbSearchServiceImpl)applicationContext.getBean("tbSearchServiceImpl");
        List<TbSearchGoodsInfo> list=tbSearchService.selectGoodsPUD("手表");
        System.out.println(list);
    }

}
