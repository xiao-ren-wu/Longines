package com.longines.dao;

import com.longines.pojo.goods_info;

import java.util.List;

public interface GoodsMapper {
    /**
     *
     * @param id
     * @return goods_info
     */
     goods_info findGoodsById(int id);

    /**
     *
     * @param goods
     */
     void insertGoods(goods_info goods);

    /**
     *
     * @return
     */
     List<goods_info> findGoodsByPrice();

    /**
     *
     * @param theme
     * @return List<goods_info>
     */
    List<goods_info> findGoodsByTheme(String theme);
}
