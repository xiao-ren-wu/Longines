package com.longines.service;

import com.longines.vo.TbSearchGoodsInfoVo;

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
    List<TbSearchGoodsInfoVo> search(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectGoodsPUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectGoodsPDU(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectGoodsTUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectGoodsTDU(String gname);


}
