package com.longines.dao;

import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbOrderInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
public interface TbOrderInfoMapper {
    int countByExample(TbOrderInfoExample example);

    int deleteByExample(TbOrderInfoExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(TbOrderInfo record);

    int insertSelective(TbOrderInfo record);

    List<TbOrderInfo> selectByExample(TbOrderInfoExample example);

    TbOrderInfo selectByPrimaryKey(Integer oId);

    int updateByExampleSelective(@Param("record") TbOrderInfo record, @Param("example") TbOrderInfoExample example);

    int updateByExample(@Param("record") TbOrderInfo record, @Param("example") TbOrderInfoExample example);

    int updateByPrimaryKeySelective(TbOrderInfo record);

    int updateByPrimaryKey(TbOrderInfo record);

    /**
     * 查找所有订单
     * @return
     */
    List<TbOrderInfo> selectByuId(Integer uId);

    /**
     * 查找其他状态的订单列表
     * @param
     * @return
     */
    List<TbOrderInfo> selectBysNum(TbOrderInfo tbOrderInfo);

}