package com.longines.dao;

import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository("dao")
public interface TbRecInfoMapper {
    int updateByPrimaryKeySelective(TbRecInfo record);

    int deleteByPrimaryKey(TbRecInfoKey key);

    int insert(TbRecInfo record);

    List<TbRecInfo> selectByExample(TbRecInfoExample example);
    //    int insertSelective(TbRecInfo record);
    //    TbRecInfo selectByPrimaryKey(TbRecInfoKey key);

    //    int updateByExampleSelective(@Param("record") TbRecInfo record, @Param("example") TbRecInfoExample example);

    //    int updateByExample(@Param("record") TbRecInfo record, @Param("example") TbRecInfoExample example);

    //   int updateByPrimaryKey(TbRecInfo record);
    //    int countByExample(TbRecInfoExample example);
    //    int deleteByExample(TbRecInfoExample example);
}