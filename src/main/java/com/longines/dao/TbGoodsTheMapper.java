package com.longines.dao;

import com.longines.vo.TbThemeGoodsInfoVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author weiyi
 * @since 2018-08-08 21:41
 * @version 1.0
 */
@Repository("Themedao")
public interface TbGoodsTheMapper {

    /**
     * @return java.util.List<com.longines.vo.TbThemeGoodsInfo>
     * @param theId 主题id
     */
    List<TbThemeGoodsInfoVo> selectGooTheByTheId(int theId);

}