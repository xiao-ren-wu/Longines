package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;

import java.util.List;

public interface TbGoodsInfoMapper {
    List<TbGoodsInfo> findGoodsByPriceDesc();
    List<TbGoodsInfo> findGoodsByPriceAsc();
    List<TbGoodsInfo> findGoodsByTheme(String theme);
    List<TbGoodsInfo> findGoodsInfoBysTimeDesc();
    List<TbGoodsInfo> findGoodsInfoBysTimeAsc();
}