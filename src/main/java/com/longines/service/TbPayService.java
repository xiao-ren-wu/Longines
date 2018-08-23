package com.longines.service;

import com.longines.dto.TbPayDto;
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
    *@param   pId 支付id
    *@return   com.longines.pojo.TbUser
    */
   TbUser findUidPicAcBalance(Integer pId);
   /**
    * 查找订单总金额
    *
    *@param   pId 支付Id
    *@return   com.longines.pojo.TbOrderInfo
    */
   TbOrderInfo findaAmount(Integer pId);
   /**
    * 更新余额和订单状态号
    *
    *@param   pId 支付Id
    *@return   int
    */
   int updateacBalancesNum(Integer pId);
   /**
    * 增加订单支付表信息
    *
    *@param   oId 订单Id
    * @return Integer
    */
   Integer insertTbPay(Integer oId);
   /**
    * 判断密码是否正确
    *
    *@param  pId 用户Id
    *@param  payCod  支付密码
    *@return   int
    */
   int judgePw(Integer pId, Integer payCod, Integer num);
   /**
    * 增加支付密码
    *
    *@param   payCod  支付密码
    *@param   uId  用户Id
    *@return   int
    */
   int insertPayCod(Integer payCod, Integer uId);
   /**
    * Demo class
    *
    * @author wangyichao
    * @date 2018/8/23
    */
   boolean bance(TbPayDto tbPayDto);
}




  