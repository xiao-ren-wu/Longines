package com.longines.service;

import com.longines.pojo.TbGoodsThe;
import com.longines.vo.TbThemeGoodsInfo;

import java.util.List;

/**
 * @author weiyi
 * @since 2018-08-08 22:21
 * @version 1.0
 */
public interface TbThemeService {

    /**
     * @return java.util.List<com.longines.vo.TbThemeGoodsInfo>
     * @param theId 主题id
     */
    List<TbThemeGoodsInfo> SelectThemeGoods(int theId);

}
