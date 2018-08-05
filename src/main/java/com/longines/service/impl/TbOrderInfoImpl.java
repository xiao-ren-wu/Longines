package com.longines.service.impl;

import com.longines.pojo.*;
import com.longines.service.TbOrderInfo;

import java.util.Date;
import java.util.List;

public class TbOrderInfoImpl implements TbOrderInfo {
    @Override
    public int countByExample(TbOrderInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TbOrderInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer oId) {
        return 0;
    }

    @Override
    public int insert(com.longines.pojo.TbOrderInfo record) {
        com.longines.pojo.TbOrderInfo tbOrderInfo=null;
        try {
            //生成订单ID
            int orderId= (int) System.currentTimeMillis()+tbOrderInfo.getuId()+525;
            //得到三个ID
            tbOrderInfo.setoId(orderId);
            tbOrderInfo.setuId(new TbUser().getuId());
            tbOrderInfo.setaId(new TbRecInfo().getaId());
            //订单创建时间
            tbOrderInfo.setCreDate(new Date());
            tbOrderInfo.setDelDate(null);
            tbOrderInfo.setTbDate(null);
            //运费
            tbOrderInfo.setFreight((long) ((Math.random()*90)+10));
            //得到总价钱
            TbOrder tbOrder=new TbOrder();
            TbGoodsInfo tbGoodsInfo=new TbGoodsInfo();
            tbOrder.setoId(tbOrderInfo.getoId());
            tbOrder.setgId(tbGoodsInfo.getgId());
            /*tbOrderInfo.setaAmount();*/


        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int insertSelective(com.longines.pojo.TbOrderInfo record) {
        return 0;
    }

    @Override
    public List<com.longines.pojo.TbOrderInfo> selectByExample(TbOrderInfoExample example) {
        return null;
    }

    @Override
    public com.longines.pojo.TbOrderInfo selectByPrimaryKey(Integer oId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(com.longines.pojo.TbOrderInfo record, TbOrderInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(com.longines.pojo.TbOrderInfo record, TbOrderInfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(com.longines.pojo.TbOrderInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(com.longines.pojo.TbOrderInfo record) {
        return 0;
    }
}
