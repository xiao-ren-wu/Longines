package com.longines.dao;

import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionExample;
import com.longines.pojo.TbCollectionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCollectionMapper {
    int countByExample(TbCollectionExample example);

    int deleteByExample(TbCollectionExample example);

    int deleteByPrimaryKey(TbCollectionKey key);

    int insert(TbCollection record);

    int insertSelective(TbCollection record);

    List<TbCollection> selectByExample(TbCollectionExample example);

    TbCollection selectByPrimaryKey(TbCollectionKey key);

    int updateByExampleSelective(@Param("record") TbCollection record, @Param("example") TbCollectionExample example);

    int updateByExample(@Param("record") TbCollection record, @Param("example") TbCollectionExample example);

    int updateByPrimaryKeySelective(TbCollection record);

    int updateByPrimaryKey(TbCollection record);
}