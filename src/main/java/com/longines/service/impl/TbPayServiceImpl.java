package com.longines.service.impl;

import com.longines.dao.TbOrderInfoMapper;
import com.longines.dao.TbPayMapper;
import com.longines.dao.TbUserMapper;
import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbPay;
import com.longines.pojo.TbUser;
import com.longines.service.TbPayService;
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
    private  TbUserMapper tbUserMapper;
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
    public  int judgePw(Integer pId,Integer pw){

        if (pw.equals(tbPayMapper.selectUser(pId).getPayCod())){
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int updateacBalancesNum(Integer pId)
    {

        TbUser tbUser = tbPayMapper.selectUser(pId);
        TbOrderInfo tbOrderInfo= tbPayMapper.selectOrder(pId);


        if (tbUser.getAcBalance()>=tbOrderInfo.getaAmount()) {

            tbUser.setAcBalance(tbUser.getAcBalance() - tbOrderInfo.getaAmount());
            tbUserMapper.updateByPrimaryKeySelective(tbUser);

        }
        else if (tbUser.getAcBalance()==null||tbUser.getAcBalance()<tbOrderInfo.getaAmount()){
            tbPayMapper.deleteByPrimaryKey(pId);
            return  0;
        }
        if (tbOrderInfo.getsNum() == 0){

            tbOrderInfo.setsNum(1);
            tbOrderInfoMapper.updateByPrimaryKeySelective(tbOrderInfo);
        }
        return 1;
    }

}
