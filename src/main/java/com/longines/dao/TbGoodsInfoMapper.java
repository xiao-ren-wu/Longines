package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import com.longines.pojo.TbGoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsInfoMapper {
    int countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(TbGoodsInfo record);

    int insertSelective(TbGoodsInfo record);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    TbGoodsInfo selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByExample(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByPrimaryKeySelective(TbGoodsInfo record);

    int updateByPrimaryKey(TbGoodsInfo record);
}