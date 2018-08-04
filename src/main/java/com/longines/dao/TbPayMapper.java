package com.longines.dao;

import com.longines.pojo.TbPay;
import com.longines.pojo.TbPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPayMapper {
    int countByExample(TbPayExample example);

    int deleteByExample(TbPayExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(TbPay record);

    int insertSelective(TbPay record);

    List<TbPay> selectByExample(TbPayExample example);

    TbPay selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByExample(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByPrimaryKeySelective(TbPay record);

    int updateByPrimaryKey(TbPay record);
}