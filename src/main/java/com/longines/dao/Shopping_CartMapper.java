package com.longines.dao;

import com.longines.pojo.shopping_cart;

import java.util.List;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/3$ 21:32$
 * @Version: 1.0
 */
public interface Shopping_CartMapper {
    /**
     * 根据用户ID查询购物车信息
     */
    public List<shopping_cart> FindInfo(int id) throws Exception;
    /**
     * 更新购物车信息（包含计算总金额）
     */
    public void update(shopping_cart example) throws Exception;
    /**
     * 删除购物车信息
     */
    public void delete(shopping_cart example);
    /**
     * 新增购物车信息
     */
}
