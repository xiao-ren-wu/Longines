package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.pojo.TbOrder;
import com.longines.service.TbGoodsInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;
/**
* @author   yangshuai
* @description     商品详细信息接口实现类
* @since    2018/8/9 1:09
* @version  1.0
*/
public class TbGoodsInfoImpl implements TbGoodsInfo {
    /**
     * 方法注解     给一个订单ID按ID大小顺序得到每个商品单价.
     * @param            gId
     * @return           java.util.List<java.lang.Integer>
     */
    @Override
    public List<Integer> selectPrice(List<Integer> gId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbGoodsInfoMapper tbGoodsInfoMapper= (TbGoodsInfoMapper) ctx.getBean("tbGoodsInfoMapper");
        TbOrder tbOrder=new TbOrder();

        List<Integer> prices=new ArrayList<>();
        for (int i=0;i<gId.size();i++)
        {
            prices.add(tbGoodsInfoMapper.selectPrice(gId.get(i)));
            System.out.println(prices);
        }
        return prices;
    }
}
