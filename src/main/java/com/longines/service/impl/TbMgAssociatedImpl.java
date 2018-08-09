package com.longines.service.impl;

import com.longines.dao.TbMgAssociatedMapper;
import com.longines.dao.TbOrderMapper;
import com.longines.pojo.TbMgAssociatedExample;
import com.longines.pojo.TbMgAssociatedKey;
import com.longines.service.TbMgAssociated;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
/**
* @author   yangshuai
* @description    商品商家接口实现类
* @since    2018/8/9 1:12
* @version  1.0
*/
public class TbMgAssociatedImpl implements TbMgAssociated {
    /**
     * 方法注解       更新商品商家表里商品库存量
     *
     *@param       tbMgAssociated
     *@return       void
     */
    @Override
    public void updateinv(com.longines.pojo.TbMgAssociated tbMgAssociated) {

    }

    /**
     * 方法注解      通过订单ID更新商品库存量
     *
     *@param       oId
     *@return       void
     */
    @Override
    public void updateBygId(Integer oId){
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        TbMgAssociatedMapper tbMgAssociatedMapper= (TbMgAssociatedMapper)ctx.getBean("tbMgAssociatedMapper");
        com.longines.pojo.TbMgAssociated tbMgAssociated=new com.longines.pojo.TbMgAssociated();
        tbMgAssociated.setmId(2);
        List<Integer> listgnums=new TbOrderImpl().selectgNum(oId);
        List<Integer> listgid=new TbOrderImpl().selectByoId(oId);
        for (int i=0;i<listgnums.size();i++)
        {
            Integer x=listgnums.get(i);
            Integer y=tbMgAssociatedMapper.selectinvBygId(listgid.get(i));
            Integer z=y-x;
            if (z>=0)
            {
                tbMgAssociated.setInv(z);
                tbMgAssociated.setgId(listgid.get(i));
                tbMgAssociatedMapper.updateinv(tbMgAssociated);
            }else {
                System.out.println("商品库存不足");
                break;
            }
        }
    }
}
