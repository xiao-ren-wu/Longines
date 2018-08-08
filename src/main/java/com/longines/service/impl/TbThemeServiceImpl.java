package com.longines.service.impl;

import com.longines.dao.TbGoodsTheMapper;
import com.longines.service.TbThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
     * @return int
     * @param the_des 主题描述
     */
    @Override
    public int SelectThe_id(String the_des) {

        return tbGoodsTheMapper.selectTheidBytheDes(the_des);
    }


    /**
     * @return java.lang.String
     * @param the_des  主题描述
     */
    @Override
    public String SelectThe_Pic(String the_des) {

        return tbGoodsTheMapper.selectThepicBythDes(the_des);
    }

}
