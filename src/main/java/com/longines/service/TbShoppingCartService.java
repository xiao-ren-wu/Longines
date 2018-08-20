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
     */
    void insertShcSelective(int uid, int gid);

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
    TbShoppingCart updateShcBygNum(int uid,int gid,int gnum);

    /**
     * 根据用户ID查找
     * @param     uid  用户ID
     * @return    java.util.List<com.longines.pojo.TbShoppingCart>
     */
    List<TbShoppingCart> selectShcByUid(int uid);
    /**
     * 查询回显信息
     * @param     uid   用户ID
     * @param     gid   商品ID
     * @return    com.longines.vo.TbShoppingCartVo
     */
    TbShoppingCartVo selectEchoInfo(int uid,int gid);
    /**
     * 回显单个用户的所有商品信息
     * @param     uid   用户ID
     * @return    java.util.List<com.longines.vo.TbShoppingCartVo>
     */
    List<TbShoppingCartVo> selectEcho(int uid);

}
