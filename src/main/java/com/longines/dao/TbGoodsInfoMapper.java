package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import com.longines.pojo.TbGoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsInfoMapper {
    int countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(TbGoodsInfo record);

    int insertSelective(TbGoodsInfo record);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    int updateByExampleSelective(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByExample(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByPrimaryKeySelective(TbGoodsInfo record);

    int updateByPrimaryKey(TbGoodsInfo record);
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