package com.test;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.dao.TbGoodsTheMapper;
import com.longines.pojo.TbGoodsInfo;
import com.longines.pojo.TbGoodsThe;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class TestGoods {

    private ApplicationContext applicationContext;

    @Before
    public void setup(){
        applicationContext=new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void test(){
        TbGoodsInfoMapper tbGoodsInfoMapper=(TbGoodsInfoMapper)applicationContext.getBean("tbGoodsInfoMapper");
        TbGoodsInfo tbGoodsInfo=tbGoodsInfoMapper.selectByPrimaryKey(5);
        System.out.println(tbGoodsInfo);
    }
    @Test
    public void Demo()
    {
        TbGoodsInfoMapper tbGoodsInfoMapper=(TbGoodsInfoMapper)applicationContext.getBean("tbGoodsInfoMapper");
        List<TbGoodsInfo> list=tbGoodsInfoMapper.selectBygName("22");
        System.out.println(list);
    }



}
