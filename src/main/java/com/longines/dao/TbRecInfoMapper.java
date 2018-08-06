package com.longines.dao;

import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface TbRecInfoMapper {
    int countByExample(TbRecInfoExample example);

    int deleteByExample(TbRecInfoExample example);

    int deleteByPrimaryKey(TbRecInfoKey key);

    int insert(TbRecInfo record);

    int insertSelective(TbRecInfo record);

    List<TbRecInfo> selectByExample(TbRecInfoExample example);

    TbRecInfo selectByPrimaryKey(TbRecInfoKey key);

    int updateByExampleSelective(@Param("record") TbRecInfo record, @Param("example") TbRecInfoExample example);

    int updateByExample(@Param("record") TbRecInfo record, @Param("example") TbRecInfoExample example);

    int updateByPrimaryKeySelective(TbRecInfo record);

    int updateByPrimaryKey(TbRecInfo record);
}