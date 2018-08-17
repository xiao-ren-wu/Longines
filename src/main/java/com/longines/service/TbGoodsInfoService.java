package com.longines.service;

import com.longines.pojo.TbGoodsInfo;

import java.util.List;
/**
* @author   yangshuai
* @description   商品详细信息接口
* @since    2018/8/9 1:14
* @version  1.0
*/
public interface TbGoodsInfoService {
    /**
     * 方法注解             给一个订单ID按ID大小顺序得到每个商品单价.
     * @param              gId
     * @return             java.util.List<java.lang.Integer>
     */
    List<Integer> selectPrice(List<Integer> gId);
    /**
    * 方法注解         通过商品ID数组搜索商品对象数组
    *
    *@param       gId
    *@return      List<TbGoodsInfo>
    */
    List<TbGoodsInfo> selectBygId(List<Integer> gId);
}
