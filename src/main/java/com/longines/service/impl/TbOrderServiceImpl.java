package com.longines.service.impl;


import com.longines.dao.TbOrderMapper;
import com.longines.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author   yangshuai
* @description    订单商品接口实现类
* @since    2018/8/9 1:13
* @version  1.0
*/
@Service
public class TbOrderServiceImpl implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;
    /**
    * 方法注解    生成订单-商品表
    *
    *@param       record
    *@return       int
    */
    @Override
    public void insertSelective(com.longines.pojo.TbOrder record) {
        tbOrderMapper.insertSelective(record);
    }
    /**
    * 方法注解      通过订单ID得到这个表里所有此订单ID的商品集合
    *
    *@param       oId
    *@return       java.util.List<java.lang.Integer>
    */
    @Override
    public List<Integer> selectByoId(Integer oId)
    {
        return tbOrderMapper.selectByoId(oId);
    }
    /**
     * 方法注解      通过所有订单ID得到所有商品ID的集合
     *
     *@param       oId
     *@return       java.util.List<java.lang.Integer>
     */
    @Override
    public List<Integer> selectByoid(List<Integer> oId)
    {
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<oId.size();i++) {
            list.addAll(tbOrderMapper.selectByoId(oId.get(i)));
        }
        return list;
    }
    /**
    * 方法注解        通过订单ID得到此ID的每个商品的数量集合
    *
    *@param       oId
    *@return       java.util.List<java.lang.Integer>
    */
    @Override
    public List<Integer> selectgNum(Integer oId) {
        return tbOrderMapper.selectgNum(oId);
    }



}
