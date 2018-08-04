package com.longines.dao;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(Integer oId);

    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}