package com.longines.dao;

import com.longines.pojo.TbOrderInfo;

    /**
     * 更新订单明细表中的状态号
     *
     *@author   leijing
     *@date   2018/8/9
     */
    public interface TbOrderInfoMapper {

        /**
         * 更新订单状态号
         *
         *@param   record 订单明细表
         *@return   int
         */
        int updateByPrimaryKeySelective(TbOrderInfo record);

}