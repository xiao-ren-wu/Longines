package com.longines.service;

import com.longines.pojo.TbMgAssociatedExample;
import com.longines.pojo.TbMgAssociatedKey;


import java.util.List;

public interface TbMgAssociated {
    int countByExample(TbMgAssociatedExample example);

    int deleteByExample(TbMgAssociatedExample example);

    int deleteByPrimaryKey(TbMgAssociatedKey key);

    int insert(com.longines.pojo.TbMgAssociated record);

    int insertSelective(com.longines.pojo.TbMgAssociated record);

    List<com.longines.pojo.TbMgAssociated> selectByExample(TbMgAssociatedExample example);

    com.longines.pojo.TbMgAssociated selectByPrimaryKey(TbMgAssociatedKey key);

    int updateByExampleSelective(com.longines.pojo.TbMgAssociated record, TbMgAssociatedExample example);

    int updateByExample(com.longines.pojo.TbMgAssociated record, TbMgAssociatedExample example);

    int updateByPrimaryKeySelective(com.longines.pojo.TbMgAssociated record);

    int updateByPrimaryKey(com.longines.pojo.TbMgAssociated record);
}