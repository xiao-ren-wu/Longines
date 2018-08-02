package com.longines.dao;

import com.longines.pojo.goods_info;

public interface GoodsMapper {
    public goods_info findGoodsById(int id);
    public void InsertGoods(goods_info goods);
}
