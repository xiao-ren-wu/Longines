package com.longines.dao;

import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbPay;
import com.longines.pojo.TbPayExample;
import com.longines.pojo.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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


    TbUser selectUser(Integer pId);

    TbOrderInfo selectOrder(Integer pId);

}