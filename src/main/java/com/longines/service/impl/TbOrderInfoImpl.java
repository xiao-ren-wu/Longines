package com.longines.service.impl;

import com.longines.dao.TbOrderInfoMapper;
import com.longines.dao.TbOrderMapper;
import com.longines.pojo.*;
import com.longines.service.TbOrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
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
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        tbOrderInfoMapper.deleteByPrimaryKey(oId);
        return 0;
    }

    @Override
    public int insert(com.longines.pojo.TbOrderInfo record) {

        return 0;
    }

    /**
     * 创建订单
     * @param record
     * @return
     */
    @Override
    public int insertSelective(com.longines.pojo.TbOrderInfo record) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");

        com.longines.pojo.TbOrderInfo tbOrderInfo=record;
        try {
            //生成订单ID
            /*int orderId= (int) System.currentTimeMillis()+tbOrderInfo.getuId()+525;*/
            int orderId= (int) System.currentTimeMillis();
            System.out.println(orderId);
            //得到三个ID
            tbOrderInfo.setoId(orderId);
            tbOrderInfo.setuId(525);
            tbOrderInfo.setaId(110);
           /* tbOrderInfo.setuId(new TbUser().getuId());
            tbOrderInfo.setaId(new TbRecInfo().getaId());*/
            //订单创建时间
            tbOrderInfo.setCreDate(new Date());
            tbOrderInfo.setDelDate(new Date());
            tbOrderInfo.setTbDate(new Date());
            //运费
            tbOrderInfo.setFreight((long) ((Math.random()*90)+10));
            //得到总价钱
            TbOrder tbOrder=new TbOrder();
            TbGoodsInfo tbGoodsInfo=new TbGoodsInfo();
            tbOrder.setoId(2);
            tbOrder.setgId(3);

            //默认设置状态号为待付款(0)
            tbOrderInfo.setsNum(0);
            //设置配送方式
            ArrayList<String> peisong=new ArrayList<String>();
            peisong.add("京东便利配送");
            peisong.add("顺丰迅捷配送");
            peisong.add("圆通亲切配送");
            peisong.add("海外海上列车配送");
            tbOrderInfo.setdMethod(peisong.get((int)(Math.random()*4)));

            /*tbOrderInfo.setaAmount((long) 8888);*/

            tbOrderInfoMapper.insertSelective(tbOrderInfo);

            System.out.println("创建订单成功!");
                return 0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("创建订单失败!");
        }
        return 1;
    }

    @Override
    public List<com.longines.pojo.TbOrderInfo> selectByExample(TbOrderInfoExample example) {
        return null;
    }

    @Override
    public com.longines.pojo.TbOrderInfo selectByPrimaryKey(Integer oId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        return tbOrderInfoMapper.selectByPrimaryKey(oId);

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
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        //状态号:0待支付,1代发货,2已发货,3.交易成功,4交易取消
        if(record.getsNum()==2)
        {
            record.setTbDate(new Date());
        }
        tbOrderInfoMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(com.longines.pojo.TbOrderInfo record) {
        return 0;
    }

    /**
     * 查询某个用户的所有订单
     * @param
     * @return
     */
    @Override
    public List<com.longines.pojo.TbOrderInfo> selectByuId(Integer uId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        return tbOrderInfoMapper.selectByuId(uId);
    }

    /**
     * 查询某个用户其他状态子订单列表
     * @param
     * @return
     */
    @Override
    public List<com.longines.pojo.TbOrderInfo> selectBysNum(com.longines.pojo.TbOrderInfo tbOrderInfo) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        return tbOrderInfoMapper.selectBysNum(tbOrderInfo);
    }

}
