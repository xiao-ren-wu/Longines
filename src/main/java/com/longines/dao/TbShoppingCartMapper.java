package com.longines.dao;

import com.longines.pojo.*;
import com.longines.vo.TbShoppingCartVo;

import java.util.List;

/**
 * @author  liuyang
 * @since : 2018/8/3 16:10
 * @version 1.0
 */

public interface TbShoppingCartMapper {

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

    List<TbShoppingCart> selectByExample(TbShoppingCartExample example);

    /**
     * 根据商品数量更新
     * @param    record  购物车类对象
     * @return   int
     */
    int  updateBygNum(TbShoppingCart record);
    /**
     * 根据用户ID查询购物车信息
     * @param     uid  用户ID
     * @return    com.longines.pojo.TbShoppingCart
     */
    TbShoppingCart selectByUid(int uid);

    TbMerce selectMerceInfo(int gid);

    TbGoodsInfo selectGoodsInfo(int gid);
    /**
     * 查询单价
     * @param     record 购物车对象
     * @return    int
     */
    int updateTamount(TbShoppingCart record);

    void updateStatus(TbShoppingCart record);
    /**
     * 查询状态号
     * @param     record 购物车对象
     * @return    int
     */
    int selectStatus(TbShoppingCartKey record);

    int selectgNum(TbShoppingCartKey record);

    int selectInv(int gid);

}
