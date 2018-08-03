package com.longines.service;

import com.longines.pojo.shopping_cart;

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
    public void add(shopping_cart example);


    //User find(Integer id);
    public abstract void addUser();//DITest
   // public abstract void addShC() throws IOException;
}