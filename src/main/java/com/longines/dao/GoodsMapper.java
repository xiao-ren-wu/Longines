package com.longines.dao;

import com.longines.pojo.goods_info;

public interface GoodsMapper {
    goods_info findGoodsById(int id);
    void InsertGoods(goods_info goods);
}
