package com.longines.service;

import com.longines.pojo.TbOrderExample;
import com.longines.pojo.TbOrderKey;
import java.util.List;
/**
* @author   yangshuai
* @description    订单商品接口
* @since    2018/8/9 1:15
* @version  1.0
*/
public interface TbOrderService {
    /**
     * 方法注解    生成订单-商品表
     *
     *@param       record
     *@return       int
     */
    void insertSelective(com.longines.pojo.TbOrder record);
    /**
     * 方法注解      通过订单ID得到这个表里所有此订单ID的集合
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
    /**
     * 方法注解      通过所有订单ID得到所有商品ID的集合
     *
     *@param       oId
     *@return       java.util.List<java.lang.Integer>
     */
    List<Integer> selectByoid(List<Integer> oId);

}
