package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import com.longines.vo.TbGoodsInfoExt;
import com.longines.vo.TbSearchGoodsInfoVo;
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
     *@param
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findGoodsByPriceDesc();
    /**
     * 对商品信息按照价格进行升序排序
     *
     *@param
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
     *@param
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfoExt> findGoodsInfoBysTimeDesc();
    /**
     * 对商品信息按照上架时间进行升序排序
     *
     *@param
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfoExt> findGoodsInfoBysTimeAsc();
    /**
     * 猜你喜欢
     *
     *@param   price
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */

    List<TbGoodsInfo> findGoodsInfoByLike(Long price);
    /**
     * 查找所有商品信息
     *
     *@param
     *@return   java.util.List<com.longines.pojo.TbGoodsInfo>
     */
    List<TbGoodsInfo> findAllGoodsInfo();
    /**
     * 根据商品id查找商品信息及其对应的商家及商家头像
     *
     *@param
     *@return   java.util.List<com.longines.vo.TbGoodsInfoExt>
     */
    TbGoodsInfoExt findGoodsDetailById(Integer gId);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectBygName(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectBygNamePUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectBygNamePDU(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectBygNameTUD(String gname);

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    List<TbSearchGoodsInfoVo> selectBygNameTDU(String gname);
    /**
     * 方法注解       给一个商品ID按ID大小顺序得到每个商品单价
     *
     *@param        gId
     *@return       java.util.List<java.lang.Integer>
     */
    Integer selectPrice(Integer gId);
    /**
     * 方法注解       根据商品ID查询商品表对象
     *
     *@param       gId
     *@return       TbGoodsInfo
     */
    TbGoodsInfo selectByPrimaryKey(Integer gId);

}