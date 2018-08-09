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
    /**
     * 方法注解       给一个订单ID按ID大小顺序得到每个商品单价
     *
     *@param        gId
     *@return       java.util.List<java.lang.Integer>
     */
    Integer selectPrice(Integer gId);
}