package com.longines.dao;

import com.longines.pojo.TbCPic;
import com.longines.pojo.TbCPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCPicMapper {
    int countByExample(TbCPicExample example);

    int deleteByExample(TbCPicExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TbCPic record);

    int insertSelective(TbCPic record);

    List<TbCPic> selectByExample(TbCPicExample example);

    TbCPic selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TbCPic record, @Param("example") TbCPicExample example);

    int updateByExample(@Param("record") TbCPic record, @Param("example") TbCPicExample example);

    int updateByPrimaryKeySelective(TbCPic record);

    int updateByPrimaryKey(TbCPic record);
}