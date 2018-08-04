package com.longines.dao;

import com.longines.pojo.TbShoppingCart;

import java.util.List;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/2 15:32
 * @Version: 1.0
 */
public interface Shopping_CartMapper {
    /**
     * 根据用户ID查询购物车信息
     */
    public List<TbShoppingCart> FindInfo(int id) throws Exception;
    /**
     * 更新购物车信息（包含计算总金额）
     */
    public void update(TbShoppingCart example) throws Exception;
    /**
     * 删除购物车信息
     */
    public void delete(TbShoppingCart example);
    /**
     * 新增购物车信息
     */
}
