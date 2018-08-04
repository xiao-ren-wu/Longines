package com.longines.dao;

import com.longines.pojo.TbGoodsThe;
import com.longines.pojo.TbGoodsTheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsTheMapper {
    int countByExample(TbGoodsTheExample example);

    int deleteByExample(TbGoodsTheExample example);

    int deleteByPrimaryKey(Integer theId);

    int insert(TbGoodsThe record);

    int insertSelective(TbGoodsThe record);

    List<TbGoodsThe> selectByExample(TbGoodsTheExample example);

    TbGoodsThe selectByPrimaryKey(Integer theId);

    int updateByExampleSelective(@Param("record") TbGoodsThe record, @Param("example") TbGoodsTheExample example);

    int updateByExample(@Param("record") TbGoodsThe record, @Param("example") TbGoodsTheExample example);

    int updateByPrimaryKeySelective(TbGoodsThe record);

    int updateByPrimaryKey(TbGoodsThe record);
}