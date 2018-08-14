package com.longines.dao;

import com.longines.pojo.TbUser;

/**
     * 更新用户余额
     *
     *@author   leijing
     *@date   2018/8/9
     */
    public interface TbUserMapper {

        /**
         * 方法注释
         *
         *@param   record 用户
         *@return   int
         */
        int updateByPrimaryKeySelective(TbUser record);
}