package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.pojo.TbGoodsInfo;
import com.longines.vo.TbGoodsInfoExt;
import com.longines.service.TbGoodsInfoMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FengTianHao
 * @since 2018/8/8 21:06
 * @version 1.0
 */
@Service
public class TbGoodsInfoMapperServiceImpl implements TbGoodsInfoMapperService {

    @Resource(name="dao")
    private TbGoodsInfoMapper tbGoodsInfoMapper;

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
    public List<TbGoodsInfoExt> findGoodsInfoBysTimeDesc() {
        List<TbGoodsInfoExt> goods=tbGoodsInfoMapper.findGoodsInfoBysTimeDesc();
        return goods;
    }

    @Override
    public List<TbGoodsInfoExt> findGoodsInfoBysTimeAsc() {
        List<TbGoodsInfoExt> goods=tbGoodsInfoMapper.findGoodsInfoBysTimeAsc();
        return goods;
    }

    @Override
    public List<TbGoodsInfo> findGoodsInfoByLike(Long price) {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsInfoByLike(price);
        return  goods;
    }

    @Override
    public List<TbGoodsInfo> findAllGoodsInfo() {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findAllGoodsInfo();
        return goods;
    }
}
