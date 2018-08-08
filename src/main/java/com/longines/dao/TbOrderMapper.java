package com.longines.dao;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderExample;
import com.longines.pojo.TbOrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(TbOrderKey key);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(TbOrderKey key);

    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);

    //通过oId搜集同一个订单
    List<TbOrder> selectByoId(Integer oId);

}