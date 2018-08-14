package com.longines.dao;

import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbPay;
import com.longines.pojo.TbUser;

/**
         * 更新支付表
         * 对用户表中的id、余额、头像、密码进行查找
         * 对订单明细表中的总金额、状态号
         *
         *@author   leijing
         *@date   2018/8/9
         */
public interface TbPayMapper {
    /**
     * 更新支付表数据
     *
     *@param   record 支付表
     */
    void insert(TbPay record);
    /**
     * 通过支付id查找用户表中的id、余额、头像、密码进行查找
     *
     *@param   pId 支付id
     *@return   com.longines.pojo.TbUser
     */
    TbUser selectUser(Integer pId);
    /**
     * 查找订单明细表中的总金额、状态号
     *
     *@param   pId  支付id
     *@return   com.longines.pojo.TbOrderInfo
     */
    TbOrderInfo selectOrder(Integer pId);
    /**
     * 支付失败时删除支付表中新加的数据
     *
     *@param   pId  支付id
     */
    void deleteByPrimaryKey(Integer pId);
            /**
             * 通过订单ID查找用户id
             *
             *@param   oId  订单Id
             *@return   com.longines.pojo.TbUser
             */
    TbUser selectUserId(Integer oId);
}