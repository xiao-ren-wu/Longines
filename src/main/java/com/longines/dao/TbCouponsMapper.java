package com.longines.dao;

import com.longines.pojo.TbCoupons;
import com.longines.pojo.TbCouponsExample;
import com.longines.pojo.TbCouponsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCouponsMapper {
    int countByExample(TbCouponsExample example);

    int deleteByExample(TbCouponsExample example);

    int deleteByPrimaryKey(TbCouponsKey key);

    int insert(TbCoupons record);

    int insertSelective(TbCoupons record);

    List<TbCoupons> selectByExample(TbCouponsExample example);

    TbCoupons selectByPrimaryKey(TbCouponsKey key);

    int updateByExampleSelective(@Param("record") TbCoupons record, @Param("example") TbCouponsExample example);

    int updateByExample(@Param("record") TbCoupons record, @Param("example") TbCouponsExample example);

    int updateByPrimaryKeySelective(TbCoupons record);

    int updateByPrimaryKey(TbCoupons record);
}