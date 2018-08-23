package com.longines.dao;

import com.longines.pojo.TbBrand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dao1")
/**
 * @author FengTianHao
 * @version 1.0
 * @since 2018/8/17 15:55
 */
public interface TbBrandMapper {
    /**
     * 查找所有的品牌名和其对应的图片
     *
     *@return   java.util.List<com.longines.pojo.TbBrand>
     */

    List<TbBrand> findAllBrand();

}
