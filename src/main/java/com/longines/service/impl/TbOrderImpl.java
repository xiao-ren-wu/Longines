package com.longines.service.impl;


import com.longines.dao.TbOrderMapper;
import com.longines.pojo.TbOrderExample;
import com.longines.pojo.TbOrderKey;
import com.longines.service.TbOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
/**
* @author   yangshuai
* @description    订单商品接口实现类
* @since    2018/8/9 1:13
* @version  1.0
*/
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
    /**
    * 方法注解    生成订单-商品表
    *
    *@param       record
    *@return       int
    */
    @Override
    public int insertSelective(com.longines.pojo.TbOrder record) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        com.longines.pojo.TbOrder tbOrder=record;
        int orderId=(int) System.currentTimeMillis();
        tbOrder.setoId(orderId);
        //获取商品ID
        tbOrder.setgId(2);
        //获取商品个数
        tbOrder.setgNum(10);      
        tbOrderMapper.insertSelective(tbOrder);
        //返回订单号
         return  orderId;
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
    /**
    * 方法注解      通过订单ID得到这个表里所有此订单ID的集合
    *
    *@param       oId
    *@return       java.util.List<java.lang.Integer>
    */
    @Override
    public List<Integer> selectByoId(Integer oId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        return tbOrderMapper.selectByoId(oId);
    }
    /**
    * 方法注解        通过订单ID得到此ID的每个商品的数量集合
    *
    *@param       oId
    *@return       java.util.List<java.lang.Integer>
    */
    @Override
    public List<Integer> selectgNum(Integer oId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        return tbOrderMapper.selectgNum(oId);
    }
}
