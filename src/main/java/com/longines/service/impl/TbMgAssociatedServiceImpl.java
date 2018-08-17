package com.longines.service.impl;

import com.longines.dao.TbMgAssociatedMapper;
import com.longines.dao.TbOrderMapper;
import com.longines.service.TbMgAssociatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
* @author   yangshuai
* @description    商品商家接口实现类
* @since    2018/8/9 1:12
* @version  1.0
*/
@Service
public class TbMgAssociatedServiceImpl implements TbMgAssociatedService {
    @Autowired
    private TbOrderMapper tbOrderMapper;
    @Autowired
    private TbMgAssociatedMapper tbMgAssociatedMapper;
    /**
     * 方法注解       更新商品商家表里商品库存量
     *
     *@param       tbMgAssociated
     *@return       void
     */
    @Override
    public void updateinv(com.longines.pojo.TbMgAssociated tbMgAssociated) { }
    /**
     * 方法注解         根据商品ID得到商家ID
     *
     *@param       gId
     *@return       List<Integer>
     */
    @Override
    public List<Integer> selectBygId(List<Integer> gId){
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<gId.size();i++){
            list.add(tbMgAssociatedMapper.selectBygId(gId.get(i)));
        }
          return  list;
    }

    /**
     * 方法注解      通过订单ID和商家更新商品库存量
     *
     *@return       int
     * @param       oId,mId .
     */
    @Override
    public int updateBygId(Integer oId, List<Integer> mId){
        com.longines.pojo.TbMgAssociated tbMgAssociated=new com.longines.pojo.TbMgAssociated();
        int v=1;
        for (int j=0;j<mId.size();j++) {
            tbMgAssociated.setmId(mId.get(j));
            List<Integer> listgnums = tbOrderMapper.selectgNum(oId);
            List<Integer> listgid = tbOrderMapper.selectByoId(oId);
            for (int i = 0; i < listgnums.size(); i++) {
                Integer x = listgnums.get(i);
                Integer y = tbMgAssociatedMapper.selectinvBygId(listgid.get(i));
                Integer z = y - x;
                if (z >= 0) {
                    tbMgAssociated.setInv(z);
                    tbMgAssociated.setgId(listgid.get(i));
                    tbMgAssociatedMapper.updateinv(tbMgAssociated);
                } else {
                    System.out.println("商品库存不足");
                    v=0;
                    break;
                }
            }
        }
        return v;
    }
}
