package com.longines.service.impl;

import com.longines.dao.TbOrderInfoMapper;
import com.longines.dao.TbPayMapper;
import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbPay;
import com.longines.pojo.TbUser;
import com.longines.service.TbPayService;
import com.longines.utils.MD5;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

/**
 * 支付service层业务处理
 *
 *@author   leijing
 *@date   2018/8/9
 */
@Service
public class TbPayServiceImpl  implements TbPayService {

    @Resource
    private TbPayMapper tbPayMapper;
    @Resource
    private TbOrderInfoMapper tbOrderInfoMapper;

    @Override
    public Integer insertTbPay(Integer oId) {

        TbPay tbPay = new TbPay();
        Random random = new Random();
        TbUser  tbUserId = tbPayMapper.selectUserId(oId);

        tbPay.setpId(random.nextInt(10000));
        tbPay.setoId(oId);
        tbPay.setuId(tbUserId.getuId());
        tbPay.setpMethod("余额支付");
        tbPay.setPmData(new Date());
        tbPay.settNum("100");
        tbPayMapper.insert(tbPay);
        return tbPay.getpId();

    }

    @Override
    public TbUser findUidPicAcBalance(Integer pId){

        return tbPayMapper.selectUser(pId);
    }


    @Override
     public TbOrderInfo findaAmount(Integer pId){

        return tbPayMapper.selectOrder(pId);
    }

    @Override
    public  int judgePw(Integer pId,String payCod){

        String payCod1=tbPayMapper.selectUser(pId).getPayCod();

        if(payCod1==null){
            tbPayMapper.deleteByPrimaryKey(pId);
            return 3;
        }else{
            if (MD5.tomd5(payCod).equals(payCod1)){
                return 0;
            }
            else {
                tbPayMapper.deleteByPrimaryKey(pId);
                return 1;
            }

        }
    }

    @Override
    public int updateacBalancesNum(Integer pId)
    {

        TbUser tbUser = tbPayMapper.selectUser(pId);
        TbOrderInfo tbOrderInfo= tbPayMapper.selectOrder(pId);


        if (tbUser.getAcBalance()!=null&&tbUser.getAcBalance()>=tbOrderInfo.getaAmount()) {

            tbUser.setAcBalance(tbUser.getAcBalance() - tbOrderInfo.getaAmount());
            tbPayMapper.updateAcBalance(tbUser);
            if (tbOrderInfo.getsNum() == 0){

                tbOrderInfo.setsNum(1);
                tbOrderInfoMapper.updateByPrimaryKeySelective(tbOrderInfo);
            }
        }
        else
            {
            tbPayMapper.deleteByPrimaryKey(pId);
            return  2;
        }
        return 0;
    }

    @Override
    public int insertPayCod(String  payCod,Integer uId){
        TbUser tbUser =new TbUser();
        tbUser.setuId(uId);
        tbUser.setPayCod(MD5.tomd5(payCod));
        try {
            tbPayMapper.updatePayCod(tbUser);
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }

}
