package com.longines.service;

import com.longines.pojo.TbGoodsInfo;

import java.util.List;

/**
 * @Author: FengTianHao
 * @Date: 2018/8/5 22:24
 * @Version 1.0
 */
public interface TbGoodsInfoMapperService {
    List<TbGoodsInfo> findGoodsByPriceDesc();
    List<TbGoodsInfo> findGoodsByPriceAsc();
    List<TbGoodsInfo> findGoodsByTheme(String theme);
    List<TbGoodsInfo> findGoodsInfoBysTimeDesc();
    List<TbGoodsInfo> findGoodsInfoBysTimeAsc();
    List<TbGoodsInfo> findGoodsInfoByLike(Long price);

}
