package com.longines.service;

import com.longines.pojo.TbGoodsInfo;
import com.longines.vo.TbGoodsInfoExt;

import java.util.List;

/**
 * @author FengTianHao
 * @since 2018/8/8 21:07
 * @version 1.0
 */
public interface TbGoodsInfoMapperService {
    /**
     * 对商品信息按照价格进行降序排序
     *@param    brand 品牌
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findBrandGoodsByPriceDesc(String brand);
    /**
     * 对商品信息按照价格进行升序排序
     *@param    brand 品牌
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfo> findBrandGoodsByPriceAsc(String brand);
    /**
     * 对商品信息按照上架时间进行降序排序
     *@param    brand 品牌
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfoExt> findBrandGoodsInfoBysTimeDesc(String brand);
    /**
     * 对商品信息按照上架时间进行升序排序
     *@param    brand 品牌
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfoExt> findBrandGoodsInfoBysTimeAsc(String brand);

    /**
     * 对商品信息按照价格进行降序排序
     *
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByPriceDesc();
    /**
     *
     *对商品信息按照价格进行升序排序
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByPriceAsc();
    /**
     * 查找同主题的商品
     *
     *@param   brand  品牌
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByTheme(String brand);
    /**
     * 按上架时间对商品进行降序排序
     *
     *@param
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfoExt> findGoodsInfoBysTimeDesc();
    /**
     * 按上架时间对商品进行升序排序
     *
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfoExt> findGoodsInfoBysTimeAsc(


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
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findAllGoodsInfo();
    /**
     * 根据商品id查找商品信息及其对应的商家及商家头像
     *
     *@param   gId 商品id
     *@return   java.util.List<com.longines.vo.TbGoodsInfoExt>
     */
    TbGoodsInfoExt findGoodsDetailById(Integer gId);
    /**
     * 方法注解             给一个订单ID按ID大小顺序得到每个商品单价.
     * @param              gId
     * @return             java.util.List<java.lang.Integer>
     */
    List<Integer> selectPrice(List<Integer> gId);
    /**
     * 方法注解         通过商品ID数组搜索商品对象数组
     *
     *@param       gId
     *@return      List<TbGoodsInfo>
     */
    List<TbGoodsInfo> selectBygId(List<Integer> gId);
}
