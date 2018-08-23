package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbGoodsInfoMapperService;
import com.longines.vo.TbGoodsInfoExt;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author FengTianHao
 * @since 2018/8/8 21:06
 * @version 1.0
 */
@Service
public class TbGoodsInfoMapperServiceImpl implements TbGoodsInfoMapperService {

    @Resource(name="dao2")
    private TbGoodsInfoMapper tbGoodsInfoMapper;

    @Override
    public List<TbGoodsInfo> findBrandGoodsByPriceDesc(String brand) {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findBrandGoodsByPriceDesc(brand);
            return goods;

    }

    @Override
    public List<TbGoodsInfo> findBrandGoodsByPriceAsc(String brand) {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findBrandGoodsByPriceAsc(brand);
        return goods;
    }

    @Override
    public List<TbGoodsInfoExt> findBrandGoodsInfoBysTimeDesc(String brand) {
        List<TbGoodsInfoExt> goods=tbGoodsInfoMapper.findBrandGoodsInfoBysTimeDesc(brand);
        return goods;
    }

    @Override
    public List<TbGoodsInfoExt> findBrandGoodsInfoBysTimeAsc(String brand) {
        List<TbGoodsInfoExt> goods=tbGoodsInfoMapper.findBrandGoodsInfoBysTimeAsc(brand);
        return goods;
    }

    @Override
    public List<TbGoodsInfo> findGoodsByPriceDesc()
    {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsByPriceDesc();
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }

    }

    @Override
    public List<TbGoodsInfo> findGoodsByPriceAsc() {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsByPriceAsc();
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }
    }

    @Override
    public List<TbGoodsInfo> findGoodsByTheme(String theme) {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsByTheme(theme);
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }
    }

    @Override
    public List<TbGoodsInfoExt> findGoodsInfoBysTimeDesc() {
        List<TbGoodsInfoExt> goods=tbGoodsInfoMapper.findGoodsInfoBysTimeDesc();
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }
    }
    @Override
    public List<TbGoodsInfoExt> findGoodsInfoBysTimeAsc() {
        List<TbGoodsInfoExt> goods=tbGoodsInfoMapper.findGoodsInfoBysTimeAsc();
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }
    }

    @Override
    public List<TbGoodsInfo> findGoodsInfoByLike(Long price) {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findGoodsInfoByLike(price);
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }
    }

    @Override
    public List<TbGoodsInfo> findAllGoodsInfo() {
        List<TbGoodsInfo> goods=tbGoodsInfoMapper.findAllGoodsInfo();
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }
    }

    @Override
    public TbGoodsInfoExt findGoodsDetailById(Integer gId) {
        TbGoodsInfoExt goods=tbGoodsInfoMapper.findGoodsDetailById(gId);
        if(goods==null)
        {
            return null;
        }
        else
        {
            return goods;
        }
    }
    /**
     * 方法注解     给一个订单ID按商品ID大小顺序得到每个商品单价.
     * @param            gId
     * @return           java.util.List<java.lang.Integer>
     */
    @Override
    public List<Integer> selectPrice(List<Integer> gId) {
        List<Integer> prices=new ArrayList<>();
        for (int i=0;i<gId.size();i++)
        {
            prices.add(tbGoodsInfoMapper.selectPrice(gId.get(i)));
        }
        return prices;
    }
    /**
     * 方法注解         通过商品ID数组搜索商品对象数组
     *
     *@param       gId
     *@return      List<TbGoodsInfo>
     */
    @Override
    public List<TbGoodsInfo> selectBygId(List<Integer> gId) {
        List<TbGoodsInfo> list=new ArrayList<TbGoodsInfo>();
        for(int i=0;i<gId.size();i++){
            list.add(tbGoodsInfoMapper.selectByPrimaryKey(gId.get(i)));
        }
        return list;
    }

}
