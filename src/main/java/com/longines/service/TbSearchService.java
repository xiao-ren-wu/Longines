package com.longines.service;

import com.longines.pojo.TbGoodsInfo;

import java.util.List;
/**
 * @author weiyi
 * @since 2018-08-08 22:20
 * @version 1.0
 */
public interface TbSearchService {

    /**
     * @return java.util.List<com.longines.pojo.TbGoodsInfo>
     * @param gname 商品名称
     */
    List<TbGoodsInfo> Search(String gname);

    /**
     * @return java.util.List<com.longines.pojo.TbGoodsInfo>
     * @param the_id 主题id
     */
    List<TbGoodsInfo> selectGoods(int the_id);

}
