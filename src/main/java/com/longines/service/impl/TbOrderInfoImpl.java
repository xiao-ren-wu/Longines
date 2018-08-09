package com.longines.service.impl;

import com.longines.dao.TbGoodsInfoMapper;
import com.longines.dao.TbOrderInfoMapper;
import com.longines.dao.TbOrderMapper;
import com.longines.pojo.*;
import com.longines.service.TbOrderInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
* @author   yangshuai
* @description    订单详细信息接口实现类
* @since    2018/8/9 1:13
* @version  1.0
*/
public class TbOrderInfoImpl implements TbOrderInfo {
    /**
     * 方法注解     计算订单的总价钱
     *
     *@param       oId
     *@return       java.util.List<java.lang.Integer>
     */
    @Override
    public long countAll(Integer oId)
    {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        TbGoodsInfoMapper tbGoodsInfoMapper= (TbGoodsInfoMapper) ctx.getBean("tbGoodsInfoMapper");

          List<Integer> listshu=tbOrderMapper.selectgNum(oId);
          List<Integer> listgid=tbOrderMapper.selectByoId(oId);
          List<Integer> listjia=new TbGoodsInfoImpl().selectPrice(listgid);
          Integer allmoney=0;
          for (int i=0;i<listjia.size();i++)
          {
              allmoney+=(listshu.get(i))*(listjia.get(i));
          }
        System.out.println(allmoney);
           return allmoney;
    }

    @Override
    public int countByExample(TbOrderInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TbOrderInfoExample example) {
        return 0;
    }
    /**
    * 方法注解       根据主键订单ID删除订单
    *
    *@param       oId
    *@return       int
    */
    @Override
    public int deleteByPrimaryKey(Integer oId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        tbOrderInfoMapper.deleteByPrimaryKey(oId);
        return 0;
    }

    @Override
    public int insert(com.longines.pojo.TbOrderInfo record) { return 0; }

    /**
     * 方法注解       生成订单详细信息表
     *
     *@param       record
     *@return       int
     */
    @Override
    public int insertSelective(com.longines.pojo.TbOrderInfo record) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        com.longines.pojo.TbOrderInfo tbOrderInfo=record;
        TbOrder tbOrder=new TbOrder();
        //先调方法生成订单-商品表。。。返回值订单号传给x再给订单明细表作为生成的同一个订单ID
        int x=new TbOrderImpl().insertSelective(tbOrder);
        try {
            //生成订单ID
            //生成三个ID
            tbOrderInfo.setoId(x);
            tbOrderInfo.setuId(2);
            tbOrderInfo.setaId(110120);
            /*tbOrderInfo.setuId(new TbUser().getuId());
            tbOrderInfo.setaId(new TbRecInfo().getaId());*/

            //订单创建时间
            tbOrderInfo.setCreDate(new Date());
            tbOrderInfo.setDelDate(new Date());
            tbOrderInfo.setTbDate(new Date());
            //运费
            tbOrderInfo.setFreight((long) ((Math.random()*90)+10));
            //得到总价钱
            TbGoodsInfo tbGoodsInfo=new TbGoodsInfo();
            /*tbOrder.setoId(2);*/
            tbOrderInfo.setaAmount(this.countAll(tbOrder.getoId()));

            //默认设置状态号为待付款(0)
            tbOrderInfo.setsNum(0);
            //设置配送方式
            ArrayList<String> peisong=new ArrayList<String>();
            peisong.add("京东便利配送");
            peisong.add("顺丰迅捷配送");
            peisong.add("圆通亲切配送");
            peisong.add("海外海上列车配送");
            tbOrderInfo.setdMethod(peisong.get((int)(Math.random()*4)));

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
    /**
    * 方法注解        根据订单ID选择订单详细信息行
    *
    *@param       oId
    *@return       com.longines.pojo.TbOrderInfo
    */
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
    /**
    * 方法注解       根据传进来的订单获得他的状态号再根据情况改变其状态值
    *
    *@param       record
    *@return       int
    */
    @Override
    public int updateByPrimaryKeySelective(com.longines.pojo.TbOrderInfo record) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        //状态号:0待支付,1代发货,2已发货,3.交易成功,4交易取消
        if(record.getsNum()==1){

        }else if(record.getsNum()==2)
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
    * 方法注解     查询某个用户的全部订单
    *
    *@param            uId
    *@return           java.util.List<com.longines.pojo.TbOrderInfo>
    */
    @Override
    public List<com.longines.pojo.TbOrderInfo> selectByuId(Integer uId) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        return tbOrderInfoMapper.selectByuId(uId);
    }
    /**
    * 方法注解      查询某个用户的其他子订单列表
    *
    *@param          tbOrderInfo
    *@return         java.util.List<com.longines.pojo.TbOrderInfo>
    */
    @Override
    public List<com.longines.pojo.TbOrderInfo> selectBysNum(com.longines.pojo.TbOrderInfo tbOrderInfo) {
        ApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
        TbOrderInfoMapper tbOrderInfoMapper= (TbOrderInfoMapper) ctx.getBean("tbOrderInfoMapper");
        return tbOrderInfoMapper.selectBysNum(tbOrderInfo);
    }

}
