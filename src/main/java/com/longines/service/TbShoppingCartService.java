package com.longines.service;

import com.longines.pojo.TbShoppingCart;

import java.util.List;

/**
 * @author    liuyang
 * @since     2018/8/8 22:21
 * @version   1.0
 */

public interface TbShoppingCartService {
    /**
     * 根据用户ID查找
     * @param     uid  用户ID
     * @return    java.util.List<com.longines.pojo.TbShoppingCart>
     */
    List<TbShoppingCart> selectShcByUid(int uid);
    /**
     * 根据商品数量更新
     * @param     amount 商品数量
     * @return    void
     */
    void updateShcByTamount(long amount);
    /**
     * 根据联合主键删除
     * @param     uid  用户ID
     * @param     gid  商品ID
     * @return    void
     */
    void deleteShcByPK(int uid, int gid);
    /**
     * 新增信息
     * @param     uid  用户ID
     * @param     gid  商品ID
     * @param     gnum 商品数量
     * @param     amount 总金额
     * @param     statu  状态号
     * @return    void
     */
    void insertShcSelective(int uid, int gid, int gnum, long amount, int statu);
}
