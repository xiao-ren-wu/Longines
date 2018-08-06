package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbGoodsInfoMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: FengTianHao
 * @Date: 2018/8/5 21:56
 * @Version 1.0
 */
@Service
public class TbGoodsInfoMapperServiceImpl implements TbGoodsInfoMapperService {

    @Resource(name="dao")
    TbGoodsInfoMapper tbGoodsInfoMapper;

    @Override
    public List<TbGoodsInfo> findGoodsByPriceDesc()
    {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsByPriceDesc();
        return goods;
    }

    @Override
    public List<TbGoodsInfo> findGoodsByPriceAsc() {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsByPriceAsc();
        return goods;
    }

    @Override
    public List<TbGoodsInfo> findGoodsByTheme(String theme) {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsByTheme(theme);
        return goods;
    }

    @Override
    public List<TbGoodsInfo> findGoodsInfoBysTimeDesc() {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsByPriceDesc();
        return goods;
    }

    @Override
    public List<TbGoodsInfo> findGoodsInfoBysTimeAsc() {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsInfoBysTimeAsc();
        return goods;
    }

    @Override
    public List<TbGoodsInfo> findGoodsInfoByLike(Long price) {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsInfoByLike(price);
        return  goods;
    }
}
