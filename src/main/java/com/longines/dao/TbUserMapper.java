package com.longines.dao;

import com.longines.pojo.TbUser;


public interface TbUserMapper {


    int deleteByPrimaryKey(Integer uId);

    int insert(TbUser record);

    int insertSelective(TbUser record);



    TbUser selectByPrimaryKey(Integer uId);



    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}