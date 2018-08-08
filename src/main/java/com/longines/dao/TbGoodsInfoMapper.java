package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import com.longines.pojo.TbGoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
* @author   yangshuai
* @description   商品信息代理接口
* @since    2018/8/9 1:02
* @version  1.0
*/
public interface TbGoodsInfoMapper {
    int countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(TbGoodsInfo record);

    int insertSelective(TbGoodsInfo record);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    TbGoodsInfo selectByPrimaryKey(Integer gId);
    /**
     * 方法注解       给一个订单ID按ID大小顺序得到每个商品单价
     *
     *@param        gId
     *@return       java.util.List<java.lang.Integer>
     */
    Integer selectPrice(Integer gId);

    int updateByExampleSelective(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByExample(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByPrimaryKeySelective(TbGoodsInfo record);

    int updateByPrimaryKey(TbGoodsInfo record);

}