package com.longines.service;

import com.longines.pojo.TbShoppingCart;
import com.longines.vo.TbShoppingCartVo;

import java.util.List;

/**
 * @author    liuyang
 * @since     2018/8/8 22:21
 * @version   1.0
 */

public interface TbShoppingCartService {
    /**
     * 新增信息
     * @param     uid  用户ID
     * @param     gid  商品ID
     * @param     gnum 商品数量
     * @param     amount 总金额
     * @param     statu  状态号
     */
    void insertShcSelective(int uid, int gid, int gnum, long amount, int statu);

    /**
     * 根据联合主键删除
     * @param     uid  用户ID
     * @param     gid  商品ID
     */
    void deleteShcByPK(int uid, int gid);

    /**
     * 根据商品数量更新
     * @param     uid   用户ID
     * @param     gid   商品ID
     * @param     gnum   商品数量
     */
    void updateShcBygNum(int uid,int gid,int gnum);

    /**
     * 根据用户ID查找
     * @param     uid  用户ID
     * @return    java.util.List<com.longines.pojo.TbShoppingCart>
     */
    List<TbShoppingCart> selectShcByUid(int uid);
    /**
     * 设置回显信息
     * @param     gid   商品ID
     * @return    com.longines.vo.TbShoppingCartVo
     */
    TbShoppingCartVo selectEchoInfo(int gid);

}
