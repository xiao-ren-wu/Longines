package com.longines.dao;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderExample;
import com.longines.pojo.TbOrderKey;

import java.util.List;

/**
* @author   yangshuai
* @description    订单商品代理接口
* @since    2018/8/9 1:08
* @version  1.0
*/
public interface TbOrderMapper {
    int countByExample(TbOrderExample example);
    int deleteByExample(TbOrderExample example);
    int deleteByPrimaryKey(TbOrderKey key);
    int insert(TbOrder record);
    /**
     * 方法注解    生成订单-商品表
     *
     *@param       record
     *@return       int
     */
    int insertSelective(TbOrder record);
    /**
     * 方法注解      通过订单ID得到此订单的所有商品gId集合
     *
     *@param         oId
     *@return       java.util.List<java.lang.Integer>
     */
    List<Integer> selectByoId(Integer oId);
    /**
     * 方法注解        通过订单ID得到此ID的每个商品的数量集合
     *
     *@param        oId
     *@return       java.util.List<java.lang.Integer>
     */
    List<Integer> selectgNum(Integer oId);

    void updateByPrimaryKey(TbOrder tbOrder);
}