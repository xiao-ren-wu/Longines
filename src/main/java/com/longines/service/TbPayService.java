package com.longines.service;

import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbUser;

public interface TbPayService {

   TbUser finduIdPicacBalance(Integer pId);

   TbOrderInfo findaAmount(Integer pId);

   int updateacBalancesNum(Integer pId);

   void insertTbPay(Integer oId);

   int judgePw(Integer pId,String pw);
}

  