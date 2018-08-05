package com.longines.service;

import com.longines.pojo.TbOrderExample;
import com.longines.pojo.TbOrderKey;

import java.util.List;

public interface TbOrder {

    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(TbOrderKey key);

    int insert(com.longines.pojo.TbOrder record);

    int insertSelective(com.longines.pojo.TbOrder record);

    List<com.longines.pojo.TbOrder> selectByExample(TbOrderExample example);

    com.longines.pojo.TbOrder selectByPrimaryKey(TbOrderKey key);

    int updateByExampleSelective( com.longines.pojo.TbOrder record, TbOrderExample example);

    int updateByExample(com.longines.pojo.TbOrder record, TbOrderExample example);

    int updateByPrimaryKeySelective(com.longines.pojo.TbOrder record);

    int updateByPrimaryKey(com.longines.pojo.TbOrder record);
}
