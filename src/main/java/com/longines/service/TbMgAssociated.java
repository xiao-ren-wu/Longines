package com.longines.service;

import com.longines.pojo.TbMgAssociatedExample;
import com.longines.pojo.TbMgAssociatedKey;
import java.util.List;
/**
* @author   yangshuai
* @description   商品商家接口
* @since    2018/8/9 1:14
* @version  1.0
*/
public interface TbMgAssociated {
    /**
     * 方法注解       更新商品商家表里商品库存量
     *
     *@param       tbMgAssociated
     *@return       void
     */
    void updateinv(com.longines.pojo.TbMgAssociated tbMgAssociated);
    /**
    * 方法注解      通过订单ID更新商品库存量
    *
    *@param       oId
    *@return       void
    */
    void updateBygId(Integer oId);
}