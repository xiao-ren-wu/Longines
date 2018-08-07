package com.longines.service.impl;

import com.longines.dao.TbPayMapper;
import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbPay;
import com.longines.pojo.TbUser;
import com.longines.service.TbPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

/**
 * @author leijing
 * @date
 */
@Service
public class TbPayServiceImpl  implements TbPayService {

    @Autowired
    private TbPayMapper tbPayMapper;


    @Override
    public void insertTbPay(Integer oId) {
        TbPay tbPay = new TbPay();
        Random random = new Random();

        tbPay.setpId(random.nextInt(10000));
        tbPay.setoId(2);
        tbPay.setuId(2);
        tbPay.setpMethod("余额支付");
        tbPay.setPmData(new Date());
        tbPay.settNum("100");
        tbPayMapper.updateByPrimaryKeySelective(tbPay);


    }
    @Override
    public TbUser finduIdPicacBalance(Integer pId){

        return tbPayMapper.selectUser(pId);
    }
    @Override
     public  TbOrderInfo findaAmount(Integer pId){

        return tbPayMapper.selectOrder(pId);
    }

    @Override
    public  int judgePw(Integer pId,String pw){

        if (pw.equals(tbPayMapper.selectUser(1).getPw())){
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
        TbOrderInfo tbOrderInfo1= tbPayMapper.selectOrder(pId);


        if (tbUser.getAcBalance()>=tbOrderInfo1.getaAmount()) {
            tbUser.setAcBalance(tbUser.getAcBalance() - tbOrderInfo1.getaAmount());
        }
        else if (tbUser.getAcBalance()==null||tbUser.getAcBalance()<tbOrderInfo1.getaAmount()){
            return  0;
        }
        if (tbOrderInfo1.getsNum() == 0){

        tbOrderInfo1.setsNum(1);
        }
        return 1;
    }

}
