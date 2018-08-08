package com.longines.service;

import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbUser;

/**
 * 支付service层业务处理
 *
 *@author   leijing
 *@date   2018/8/8
 */
public interface TbPayService {


   /**
    * 查找用户id、头像、余额
    *
    *@param   oId 订单Id
    *@return   com.longines.pojo.TbUser
    */
   TbUser finduIdPicacBalance(Integer oId);
   /**
    * 查找订单总金额
    *
    *@param   oId 订单Id
    *@return   com.longines.pojo.TbOrderInfo
    */
   TbOrderInfo findaAmount(Integer oId);
   /**
    * 更新余额和订单状态号
    *
    *@param   oId 订单Id
    *@return   int
    */
   int updateacBalancesNum(Integer oId);
   /**
    * 增加订单支付表信息
    *
    *@param   oId 订单Id
    */
   void insertTbPay(Integer oId);
   /**
    * 判断密码是否正确
    *
    *@param  oId 订单Id
    *@param  pw  用户密码
    *@return   int
    */
   int judgePw(Integer oId,String pw);
}

  