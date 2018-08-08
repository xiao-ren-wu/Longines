package com.longines.service;

import com.longines.pojo.TbGoodsInfo;

import java.util.List;
/**
 * @author FengTianHao
 * @since 2018/8/8 21:07
 * @version 1.0
 */
public interface TbGoodsInfoMapperService {

    /**
     * 对商品信息按照价格进行降序排序
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByPriceDesc();
    /**
     *
     *对商品信息按照价格进行升序排序
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByPriceAsc();
    /**
     * 查找同主题的商品
     *
     *@param   theme
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByTheme(String theme);
    /**
     * 按上架时间对商品进行降序排序
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsInfoBysTimeDesc();
    /**
     * 按上架时间对商品进行升序排序
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsInfoBysTimeAsc(


    );
    /**
     * 可能喜欢
     *
     *@param   price 在可能喜欢的功能中
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsInfoByLike(Long price);
    /**
     * 按照参数返回价格在参数附近的商品信息
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findAllGoodsInfo();

}
