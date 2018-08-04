package com.longines.service;

import com.longines.pojo.TbShoppingCart;

import java.util.List;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/9 8:56
 */

public interface Shopping_CartService {
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
    public void add(TbShoppingCart example);
}
