package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("dao")
public interface TbGoodsInfoMapper {
    List<TbGoodsInfo> findGoodsByPriceDesc();
    List<TbGoodsInfo> findGoodsByPriceAsc();
    List<TbGoodsInfo> findGoodsByTheme(String theme);
    List<TbGoodsInfo> findGoodsInfoBysTimeDesc();
    List<TbGoodsInfo> findGoodsInfoBysTimeAsc();
    List<TbGoodsInfo> findGoodsInfoByLike(Long price);
}