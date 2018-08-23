package com.longines.service.impl;

import com.longines.dao.*;
import com.longines.pojo.*;
import com.longines.service.TbOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author   yangshuai
* @description    订单详细信息接口实现类
* @since    2018/8/9 1:13
* @version  1.0
*/
@Service
public class TbOrderInfoServiceImpl implements TbOrderInfoService {
    @Autowired
    private TbOrderInfoMapper tbOrderInfoMapper;
    @Autowired
    private TbMgAssociatedMapper tbMgAssociatedMapper;
    @Autowired
    private TbOrderMapper tbOrderMapper;
    @Autowired
    private TbGoodsInfoMapper tbGoodsInfoMapper;
    @Autowired
    private TbRecInfoMapper tbRecInfoMapper;
    @Autowired
    private TbMerceMapper tbMerceMapper;

    /**
     * 方法注解     计算订单的总价钱
     *
     *@param       oId
     *@return       java.util.List<java.lang.Integer>
     */
    @Override
    public long countAll(Integer oId)
    {
          List<Integer> listshu=tbOrderMapper.selectgNum(oId);
          List<Integer> listgid=tbOrderMapper.selectByoId(oId);
          List<Integer> prices=new ArrayList<>();
          for (int i=0;i<listgid.size();i++)
          {
            prices.add(tbGoodsInfoMapper.selectPrice(listgid.get(i)));
          }
          List<Integer> listjia=prices;
          Integer allmoney=0;
          for (int i=0;i<listjia.size();i++)
          {
              allmoney+=(listshu.get(i))*(listjia.get(i));
          }
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
        tbOrderInfoMapper.deleteByPrimaryKey(oId);
        return 0;
    }

    @Override
    public int insert(TbOrderInfo record) { return 0; }

    /**
     * 方法注解       生成订单详细信息表
     *
     *@param       record
     *@return       int
     */
    @Override
    public int insertSelective(TbOrderInfo record) {
        TbOrderInfo tbOrderInfo=record;
        try {
            tbOrderInfo.setoId(tbOrderInfo.getoId());
            tbOrderInfo.setuId(tbOrderInfo.getuId());
            tbOrderInfo.setaId(tbOrderInfo.getaId());
            tbOrderInfo.setCreDate(new Date());
            tbOrderInfo.setDelDate(new Date());
            tbOrderInfo.setTbDate(new Date());
            long qian=this.countAll(tbOrderInfo.getoId());
            //折扣
            int zhekou=0;
            if (qian>=4000){
                zhekou= (int) (qian*0.2);
            }else if(qian>=3000){
                zhekou= (int) (qian*0.1);
            }else  if (qian>=2000){
                zhekou= (int) (qian*0.05);
            }
            tbOrderInfo.setFreight((long) (zhekou));
            tbOrderInfo.setaAmount(qian-zhekou);
            tbOrderInfo.setsNum(0);
            ArrayList<String> peisong=new ArrayList<String>();
            peisong.add("京东便利配送");
            peisong.add("顺丰迅捷配送");
            peisong.add("圆通亲切配送");
            peisong.add("海外海上列车配送");
            tbOrderInfo.setdMethod(peisong.get((int)(Math.random()*4)));
            tbOrderInfoMapper.insertSelective(tbOrderInfo);
            System.out.println("创建订单成功!");
                return tbOrderInfo.getoId();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("创建订单失败!");
        }
        return tbOrderInfo.getoId();
    }

    @Override
    public List<TbOrderInfo> selectByExample(TbOrderInfoExample example) {
        return null;
    }
    /**
    * 方法注解        根据订单ID选择订单详细信息行
    *
    *@param       oId
    *@return       com.longines.pojo.TbOrderInfoService
    */
    @Override
    public TbOrderInfo selectByPrimaryKey(Integer oId) {
        return tbOrderInfoMapper.selectByPrimaryKey(oId);

    }

    @Override
    public int updateByExampleSelective(TbOrderInfo record, TbOrderInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TbOrderInfo record, TbOrderInfoExample example) {
        return 0;
    }
    /**
    * 方法注解       根据传进来的订单获得他的状态号再根据情况改变其状态值
    *
    *@param       record
    *@return       int
    */
    @Override
    public int updateByPrimaryKeySelective(TbOrderInfo record){
        //状态号:0待支付,1代发货,2已发货,3.交易成功,4交易取消
    /*   if(record.getsNum()==2)
        {
            record.setTbDate(new Date());
        }
        tbOrderInfoMapper.updateByPrimaryKeySelective(record);
      */  return 0;
    }

    @Override
    public int updateByPrimaryKey(TbOrderInfo record) {
        return 0;
    }

    /**
    * 方法注解     查询某个用户的全部订单
    *
    *@param            uId
    *@return           java.util.List<com.longines.pojo.TbOrderInfoService>
    */
    @Override
    public List<TbOrderInfo> selectByuId(Integer uId) {
        return tbOrderInfoMapper.selectByuId(uId);
    }
    /**
    * 方法注解      查询某个用户的其他子订单列表
    *
    *@param          tbOrderInfo
    *@return         java.util.List<com.longines.pojo.TbOrderInfoService>
    */
    @Override
    public List<TbOrderInfo> selectBysNum(TbOrderInfo tbOrderInfo) {
        return tbOrderInfoMapper.selectBysNum(tbOrderInfo);
    }
    /**
     * 方法注解       根据地址ID查询地址表对象
     *
     *@param       aId
     *@return       TbRecInfo
     */
    @Override
    public TbRecInfo selectByAid(Integer aId) {
        /*return tbRecInfoMapper.selectByPrimaryKey();*/
        return null;
    }
    /**
     * 方法注解        根据商品ID查询商品表对象
     *
     *@param       gId
     *@return       TbGoodsInfo
     */
    @Override
    public TbGoodsInfo selectByGid(Integer gId) {
        return tbGoodsInfoMapper.selectByPrimaryKey(gId);
    }
    /**
     * 方法注解       根据商家ID查询商家信息
     *
     *@param       mId
     *@return       TbMerce
     */
    @Override
    public TbMerce selectBymId(Integer mId) {
        return tbMerceMapper.selectByPrimaryKey(mId);
    }
    /**
     * 方法注解       根据用户ID查询所有订单ID
     *
     *@param       uId
     *@return       List<Integer>
     */
    @Override
    public List<Integer> selectByuid(Integer uId) {
        List<Integer> list=tbOrderInfoMapper.selectByuid(uId);
        return list;
    }
    /**
     * 方法注解       根据用户ID和状态号查询其所有订单ID
     *
     *@param       tbOrderInfo
     *@return       List<Integer>
     */
    @Override
    public List<Integer> selectByuIdsNum(TbOrderInfo tbOrderInfo) {
        List<Integer> list=tbOrderInfoMapper.selectByuIdsNum(tbOrderInfo);
        return list;
    }

}
