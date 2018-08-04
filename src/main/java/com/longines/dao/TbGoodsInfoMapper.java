package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;

import java.util.List;

public interface TbGoodsInfoMapper {
    TbGoodsInfo findGoodsById(int id);
    List<TbGoodsInfo> findGoodsByPrice();

    List<TbGoodsInfo> findGoodsByTheme(String theme);
}