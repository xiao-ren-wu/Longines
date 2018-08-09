package com.longines.dao;

import com.longines.pojo.TbGoodsInfo;
import com.longines.pojo.TbMgAssociated;
import com.longines.pojo.TbMgAssociatedExample;
import com.longines.pojo.TbMgAssociatedKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
* @author   yangshuai
* @description   商品商家代理接口
* @since    2018/8/9 1:04
* @version  1.0
*/
public interface TbMgAssociatedMapper {
    /**
    * 方法注解       更新商品商家表里商品库存量
    *
    *@param       tbMgAssociated
    *@return       void
    */
    void updateinv(TbMgAssociated tbMgAssociated);
    /**
    * 方法注解      通过商品ID查找其库存量
    *
    *@param       gid
    *@return       int
    */
    int selectinvBygId(Integer gid);
}