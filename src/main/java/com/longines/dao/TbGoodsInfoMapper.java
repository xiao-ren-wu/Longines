package com.longines.dao;

import java.util.List;

import com.longines.vo.TbSearchGoodsInfo;

/**
 * @author weiyi
 * @since 2018-08-08 21:40
 * @version 1.0
 */
public interface TbGoodsInfoMapper {

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectBygName(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectBygNamePUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectBygNamePDU(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectBygNameTUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfo> selectBygNameTDU(String gname);

}