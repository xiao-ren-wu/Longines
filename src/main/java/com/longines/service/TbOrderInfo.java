package com.longines.service;

import com.longines.pojo.TbOrderInfoExample;


import java.util.List;

public interface TbOrderInfo {
    int countByExample(TbOrderInfoExample example);

    int deleteByExample(TbOrderInfoExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(com.longines.pojo.TbOrderInfo record);

    int insertSelective(com.longines.pojo.TbOrderInfo record);

    List<com.longines.pojo.TbOrderInfo> selectByExample(TbOrderInfoExample example);

    com.longines.pojo.TbOrderInfo selectByPrimaryKey(Integer oId);

    int updateByExampleSelective(com.longines.pojo.TbOrderInfo record, TbOrderInfoExample example);

    int updateByExample(com.longines.pojo.TbOrderInfo record,TbOrderInfoExample example);

    int updateByPrimaryKeySelective(com.longines.pojo.TbOrderInfo record);

    int updateByPrimaryKey(com.longines.pojo.TbOrderInfo record);
}