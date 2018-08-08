package com.longines.dao;

import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbPay;
import com.longines.pojo.TbUser;

public interface TbPayMapper {

    int updateByPrimaryKeySelective(TbPay record);

    TbUser selectUser(Integer pId);

    TbOrderInfo selectOrder(Integer pId);

}