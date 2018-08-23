package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.service.TbSearchService;
import com.longines.vo.TbSearchGoodsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author weiyi
 * @since 2018-08-08 21:45
 * @version 1.0
 */
@Service
public class TbSearchServiceImpl implements TbSearchService {

    @Autowired
    private TbGoodsInfoMapper tbGoodsInfoMapper;

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    @Override
    public List<TbSearchGoodsInfoVo> search(String gname) {
        return tbGoodsInfoMapper.selectBygName(gname);
    }

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    @Override
    public List<TbSearchGoodsInfoVo> selectGoodsPUD(String gname) {
        return tbGoodsInfoMapper.selectBygNamePUD(gname);
    }

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    @Override
    public List<TbSearchGoodsInfoVo> selectGoodsPDU(String gname) {
        return tbGoodsInfoMapper.selectBygNamePDU(gname);
    }

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    @Override
    public List<TbSearchGoodsInfoVo> selectGoodsTUD(String gname) {
        return tbGoodsInfoMapper.selectBygNameTUD(gname);
    }

    /**
     * @return java.util.List<com.longines.vo.TbSearchGoodsInfo>
     * @param gname 商品名称
     */
    @Override
    public List<TbSearchGoodsInfoVo> selectGoodsTDU(String gname) {
        return tbGoodsInfoMapper.selectBygNameTDU(gname);
    }

}
