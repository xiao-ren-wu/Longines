package com.longines.service;

import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;



public interface TbRecInfoService {
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