package com.longines.dao;

import com.longines.pojo.TbMerce;
import com.longines.pojo.TbMerceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMerceMapper {
    int countByExample(TbMerceExample example);

    int deleteByExample(TbMerceExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(TbMerce record);

    int insertSelective(TbMerce record);

    List<TbMerce> selectByExample(TbMerceExample example);

    TbMerce selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") TbMerce record, @Param("example") TbMerceExample example);

    int updateByExample(@Param("record") TbMerce record, @Param("example") TbMerceExample example);

    int updateByPrimaryKeySelective(TbMerce record);

    int updateByPrimaryKey(TbMerce record);
}