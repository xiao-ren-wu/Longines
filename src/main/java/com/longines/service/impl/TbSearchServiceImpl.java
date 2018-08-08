package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbSearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author weiyi
 * @since 2018-08-08 21:45
 * @version 1.0
 */
@Service
public class TbSearchServiceImpl implements TbSearchService {

    @Resource(name="dao")
    private TbGoodsInfoMapper tbGoodsInfoMapper;

    /**
     * @return java.util.List<com.longines.pojo.TbGoodsInfo>
     * @param gname 商品名称
     */
    @Override
    public List<TbGoodsInfo> Search(String gname) {

        return tbGoodsInfoMapper.selectBygName(gname);
    }


    /**
     * @return java.util.List<com.longines.pojo.TbGoodsInfo>
     * @param the_id 主题id
     */
    @Override
    public List<TbGoodsInfo> selectGoods(int the_id) {

        return tbGoodsInfoMapper.selectBythemeid(the_id);
    }

}
