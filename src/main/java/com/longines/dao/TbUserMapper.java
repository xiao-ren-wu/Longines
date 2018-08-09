package com.longines.dao;

import com.longines.pojo.TbUser;

import java.util.List;


/**
*@author zhaoxiaokang
*@since 2018/8/8 21:09
*@version 1.0
*/
public interface TbUserMapper {


    /**
     *删除用户
     *@param uId 用户id
     *@return int
     *@since 2018/8/8 22:18
     */
    int deleteByPrimaryKey(Integer uId);
    /**
     *添加用户
     *@param user  用户
     *@return int
     *@since 2018/8/8 22:18
     */
    int insert(TbUser user);

    /**
     *查找用户
     *@param uId 用户id
     *@return com.longines.pojo.TbUser
     *@since 2018/8/8 22:19
     */
    TbUser selectByPrimaryKey(Integer uId);

    /**
     *更新信息
     *@param user 用户
     *@return int
     *@since 2018/8/8 22:19
     */
    int updateByPrimaryKey(TbUser user);

    /**
     *查找用户
     *@param user 用户
     *@return java.util.List<com.longines.pojo.TbUser>
     *@since 2018/8/8 22:19
     */
    List<TbUser> getTbuserList(TbUser user);
    /**
     *@description
     *@param user
     *@return int
     *@since 2018/8/9 11:23
     */
    /**
     *动态sql更新信息
     *@param user  用户
     *@return int
     *@since 2018/8/9 22:27
     */
    int updateByPrimaryKeySelective(TbUser user);


}