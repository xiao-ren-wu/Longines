package com.longines.dao;

import com.longines.pojo.TbMgAssociated;
import com.longines.pojo.TbMgAssociatedExample;
import com.longines.pojo.TbMgAssociatedKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMgAssociatedMapper {
    int countByExample(TbMgAssociatedExample example);

    int deleteByExample(TbMgAssociatedExample example);

    int deleteByPrimaryKey(TbMgAssociatedKey key);

    int insert(TbMgAssociated record);

    int insertSelective(TbMgAssociated record);

    List<TbMgAssociated> selectByExample(TbMgAssociatedExample example);

    TbMgAssociated selectByPrimaryKey(TbMgAssociatedKey key);

    int updateByExampleSelective(@Param("record") TbMgAssociated record, @Param("example") TbMgAssociatedExample example);

    int updateByExample(@Param("record") TbMgAssociated record, @Param("example") TbMgAssociatedExample example);

    int updateByPrimaryKeySelective(TbMgAssociated record);

    int updateByPrimaryKey(TbMgAssociated record);
}