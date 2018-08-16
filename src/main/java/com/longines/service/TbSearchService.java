package com.longines.service;

import com.longines.vo.TbSearchGoodsInfo;

import java.util.List;
/**
 * @author weiyi
 * @since 2018-08-08 22:20
 * @version 1.0
 */
public interface TbSearchService {

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> search(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectGoodsPUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectGoodsPDU(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectGoodsTUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectGoodsTDU(String gname);


}
