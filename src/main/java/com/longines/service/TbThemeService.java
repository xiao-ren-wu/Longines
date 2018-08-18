package com.longines.service;

import com.longines.vo.TbThemeGoodsInfoVo;

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
    List<TbThemeGoodsInfoVo> SelectThemeGoods(int theId);

}
