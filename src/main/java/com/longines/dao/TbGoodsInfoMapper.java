package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository("dao")
/**
 * @author FengTianHao
 * @since 2018/8/8 21:06
 * @version 1.0
 */
public interface TbGoodsInfoMapper {
    /**
     * 对商品信息按照价格进行降序排序
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByPriceDesc();
    /**
     * 对商品信息按照价格进行升序排序
     *
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
     * 对商品信息按照上架时间进行降序排序
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfo> findGoodsInfoBysTimeDesc();
    /**
     * 对商品信息按照上架时间进行升序排序
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfo> findGoodsInfoBysTimeAsc();
    /**
     * 对商品信息按照价格进行升序排序
     *
     *@param   price
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfo> findGoodsInfoByLike(Long price);
    /**
     * 查找所有商品信息
     *
     *@param   []
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findAllGoodsInfo();
}