package com.longines.dao;

import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartExample;
import com.longines.pojo.TbShoppingCartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;



public interface TbShoppingCartMapper {

    int countByExample(TbShoppingCartExample example);

    int deleteByExample(TbShoppingCartExample example);

    int deleteByPrimaryKey(TbShoppingCartKey key);

    int insert(TbShoppingCart record);

    int insertSelective(TbShoppingCart record);

    List<TbShoppingCart> selectByExample(TbShoppingCartExample example);

    TbShoppingCart selectByPrimaryKey(TbShoppingCartKey key);

    int updateByExampleSelective(@Param("record") TbShoppingCart record, @Param("example") TbShoppingCartExample example);

    int updateByExample(@Param("record") TbShoppingCart record, @Param("example") TbShoppingCartExample example);

    int updateByPrimaryKeySelective(TbShoppingCart record);

    int updateByPrimaryKey(TbShoppingCart record);

    TbShoppingCart selectByUid(int uid);

    void updateByTamount(TbShoppingCart record);



}