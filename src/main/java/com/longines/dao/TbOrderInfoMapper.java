package com.longines.dao;

import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbOrderInfoExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
* @author   yangshuai
* @description   订单详细信息代理接口
* @since    2018/8/9 1:06
* @version  1.0
*/
public interface TbOrderInfoMapper {
    /**
     * 方法注解     计算订单的总价钱
     *
     *@param       oId
     *@return       java.util.List<java.lang.Integer>
     */
    long countAll(Integer oId);
    int countByExample(TbOrderInfoExample example);
    int deleteByExample(TbOrderInfoExample example);
    /**
     * 方法注解       根据主键订单ID删除订单
     *
     *@param       oId
     *@return       int
     */
    int deleteByPrimaryKey(Integer oId);
    int insert(TbOrderInfo record);
    /**
     * 方法注解       生成订单详细信息表
     *
     *@param       record
     *@return       int
     */
    int insertSelective(TbOrderInfo record);
    List<TbOrderInfo> selectByExample(TbOrderInfoExample example);
    /**
     * 方法注解        根据订单ID选择订单详细信息行
     *
     *@param       oId
     *@return       com.longines.pojo.TbOrderInfo
     */
    TbOrderInfo selectByPrimaryKey(Integer oId);
    int updateByExampleSelective(@Param("record") TbOrderInfo record, @Param("example") TbOrderInfoExample example);
    int updateByExample(@Param("record") TbOrderInfo record, @Param("example") TbOrderInfoExample example);
    /**
     * 方法注解       根据传进来的订单获得他的状态号再根据情况改变其状态值
     *
     *@param       record
     *@return       int
     */
    int updateByPrimaryKeySelective(TbOrderInfo record);
    int updateByPrimaryKey(TbOrderInfo record);

    /**
     * 方法注解     查询某个用户的全部订单
     *
     *@param            uId
     *@return           java.util.List<com.longines.pojo.TbOrderInfo>
     */
    List<TbOrderInfo> selectByuId(Integer uId);
    /**
     * 方法注解      查询某个用户的其他子订单列表
     *
     *@param          tbOrderInfo
     *@return         java.util.List<com.longines.pojo.TbOrderInfo>
     */
    List<TbOrderInfo> selectBysNum(TbOrderInfo tbOrderInfo);
}