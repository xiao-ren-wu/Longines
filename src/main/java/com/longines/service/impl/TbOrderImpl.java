package com.longines.service.impl;


import com.longines.dao.TbOrderInfoMapper;
import com.longines.dao.TbOrderMapper;
import com.longines.pojo.TbOrderExample;
import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbOrderKey;
import com.longines.service.TbOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TbOrderImpl implements TbOrder {

    @Override
    public int countByExample(TbOrderExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TbOrderExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(TbOrderKey key) {
        return 0;
    }

    @Override
    public int insert(com.longines.pojo.TbOrder record) {
        return 0;
    }

    @Override
    public int insertSelective(com.longines.pojo.TbOrder record) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-service.xml");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");

        com.longines.pojo.TbOrder tbOrder=record;
        /*tbOrder.setoId(tbOrderInfo.getoId());*/
        tbOrder.setoId(111);
        tbOrder.setgId(666);         //获取商品ID
        tbOrder.setgNum(10);          //获取商品个数

        tbOrderMapper.insertSelective(tbOrder);
         return  0;
    }

    @Override
    public List<com.longines.pojo.TbOrder> selectByExample(TbOrderExample example) {
        return null;
    }

    @Override
    public com.longines.pojo.TbOrder selectByPrimaryKey(TbOrderKey key) {return null; }

    @Override
    public int updateByExampleSelective(com.longines.pojo.TbOrder record, TbOrderExample example) {
        return 0;
    }

    @Override
    public int updateByExample(com.longines.pojo.TbOrder record, TbOrderExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(com.longines.pojo.TbOrder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(com.longines.pojo.TbOrder record) {
        return 0;
    }

    @Override
    public List<com.longines.pojo.TbOrder> selectByoId(Integer oId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-service.xml");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        /*List<com.longines.pojo.TbOrder> tbOrders=tbOrderMapper.selectByoId(oId);
        for (com.longines.pojo.TbOrder tborder:tbOrders)
        {
            System.out.println(tborder);
        }*/
        System.out.println(tbOrderMapper.selectByoId(oId));
       return null;
    }
}
