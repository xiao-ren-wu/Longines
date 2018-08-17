package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbGoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
/**
* @author   yangshuai
* @description     商品详细信息接口实现类
* @since    2018/8/9 1:09
* @version  1.0
*/
@Service
public class TbGoodsInfoServiceImpl implements TbGoodsInfoService {
    @Autowired
    private TbGoodsInfoMapper tbGoodsInfoMapper;

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
