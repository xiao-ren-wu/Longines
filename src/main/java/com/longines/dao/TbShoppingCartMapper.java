package com.longines.dao;

import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartExample;
import com.longines.pojo.TbShoppingCartKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author  liuyang
 * @since : 2018/8/3 16:10
 * @version 1.0
 */
//@Repository("")
public interface TbShoppingCartMapper {

/*    int countByExample(TbShoppingCartExample example);

    int deleteByExample(TbShoppingCartExample example);

    int insert(TbShoppingCart record);*/
    /**
     *新增购物车信息(不为空)
     * @param  record  购物车对象
     * @return int
     */
    int insertSelective(TbShoppingCart record);
    /**
     * 根据联合主键删除
     * @param     key  购物车对象
     * @return    int
     */
    int deleteByPrimaryKey(TbShoppingCartKey key);

 /*   List<TbShoppingCart> selectByExample(TbShoppingCartExample example);*/
    /**
     * 根据联合主键更新(不为空)
     * @param     record  购物车类对象
     * @return    int
     */
    int updateByPrimaryKeySelective(TbShoppingCart record);
    /**
     * 根据联合主键查找购物车信息
     * @param     key  用户ID商品ID的对象
     * @return    com.longines.pojo.TbShoppingCart
     */
    TbShoppingCart selectByPrimaryKey(TbShoppingCartKey key);

/*    int updateByExampleSelective(@Param("record") TbShoppingCart record, @Param("example") TbShoppingCartExample example);

    int updateByExample(@Param("record") TbShoppingCart record, @Param("example") TbShoppingCartExample example);

    int updateByPrimaryKey(TbShoppingCart record);*/
    /**
     * 根据用户ID查询购物车信息
     * @param     uid  用户ID
     * @return    com.longines.pojo.TbShoppingCart
     */
    TbShoppingCart selectByUid(int uid);
    /**
     * 根据商品数量更新
     * @param    record  购物车类对象
     * @return   void
     */
    void updateByTamount(TbShoppingCart record);


}
