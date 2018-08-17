package com.longines.service;

import com.longines.pojo.TbMerce;

import java.util.List;

/**
 * @author   yangshuai
 * @description   商家详细信息接口
 * @since    2018/8/9 1:14
 * @version  1.0
 */
public interface TbMerceService {
    /**
    * 方法注解       根据商家ID查找商家对象
    *
    *@param       mId
    *@return       List<TbMerce>
    */
    List<TbMerce> selectBymId(List<Integer> mId);
}
