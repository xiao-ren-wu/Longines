package com.longines.dao;

import com.longines.pojo.Search;

import java.util.List;


public interface SearchMapper {


    Search getGoodsss(int id);

    //根据商品名称获取商品信息
    List<Search> getGoods(String name);

    //根据商品主题获取商品信息
    List<Search> getGoodss(String theme);

}
