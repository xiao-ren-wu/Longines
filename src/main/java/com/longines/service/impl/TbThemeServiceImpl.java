package com.longines.service.impl;

import com.longines.dao.TbGoodsTheMapper;
import com.longines.service.TbThemeService;
import com.longines.vo.TbThemeGoodsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author weiyi
 * @since 2018-08-08 21:48
 * @version 1.0
 */
@Service
public class TbThemeServiceImpl implements TbThemeService {

    @Autowired
    @Qualifier("Themedao")
    private TbGoodsTheMapper tbGoodsTheMapper;

    /**
     * @return java.util.List<com.longines.vo.TbThemeGoodsInfo>
     * @param theId 主题id
     */
    @Override
    public List<TbThemeGoodsInfoVo> SelectThemeGoods(int theId) {
        return tbGoodsTheMapper.selectGooTheByTheId(theId);
    }
}
