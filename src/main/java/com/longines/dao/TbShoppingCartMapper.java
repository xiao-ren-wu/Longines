package com.longines.dao;

import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartExample;
import com.longines.pojo.TbShoppingCartKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/4$ 16:10$
 * @Version: 1.0
 */
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

}
