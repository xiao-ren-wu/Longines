package com.longines.service;

import java.util.List;

/**
* @author   yangshuai
* @description   商品商家接口
* @since    2018/8/9 1:14
* @version  1.0
*/
public interface TbMgAssociatedService {
    /**
     * 方法注解       更新商品商家表里商品库存量
     *
     *@param       tbMgAssociated
     *@return       void
     */
    void updateinv(com.longines.pojo.TbMgAssociated tbMgAssociated);
    /**
    * 方法注解      通过订单ID和商家更新商品库存量
    *
    *@param       oId
    *@return       int
    */
    int updateBygId(Integer oId, List<Integer> mId);
    /**
     * 方法注解         根据商品ID得到商家ID
     *
     *@param       gId
     *@return       List<Integer>
     */
    public List<Integer> selectBygId(List<Integer> gId);
}