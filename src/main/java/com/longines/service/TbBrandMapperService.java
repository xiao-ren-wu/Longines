package com.longines.service;

import com.longines.pojo.TbBrand;

import java.util.List;

/**
 * @author FengTianHao
 * @version 1.0
 * @since 2018/8/17 16:00
 */
public interface TbBrandMapperService {
    /**
     * 查找所有的品牌名及其对应的图片
     *
     *@param
     *@return   java.util.List<com.longines.pojo.TbBrand>
     */

    List<TbBrand> findAllBrand();
}
