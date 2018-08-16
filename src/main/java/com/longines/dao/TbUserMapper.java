package com.longines.dao;

import com.longines.pojo.TbUser;
import com.longines.pojo.TbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
*@author zhaoxiaokang
*@since 2018/8/13 22:28
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
     *@description
     *@param user 用户
     *@return int
     *@since 2018/8/13 22:33
     */
    int insertSelective(TbUser user);


    /**
     *查找用户
     *@param uId 用户id
     *@return com.longines.pojo.TbUser
     *@since 2018/8/8 22:19
     */
    TbUser selectByPrimaryKey(Integer uId);

    /**
     *查找用户
     *@param user 用户
     *@return java.util.List<com.longines.pojo.TbUser>
     *@since 2018/8/8 22:19
     */
    TbUser getTbuser(TbUser user);


    /**
     *动态sql更新信息
     *@param user  用户
     *@return int
     *@since 2018/8/9 22:27
     */
    int updateByPrimaryKeySelective (TbUser user);

    TbUser findTbuser(String telNum);


}