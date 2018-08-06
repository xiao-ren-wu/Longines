package com.longines.service;

import com.longines.dao.TbOrderInfoMapper;
import com.longines.pojo.TbOrderInfo;
import com.longines.service.impl.TbOrderInfoImpl;
import org.junit.Test;

public class TestUpdateOrder {
    @Test
    public void demo03()
    {
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo=new TbOrderInfoImpl().selectByPrimaryKey(11114);
        new TbOrderInfoImpl().updateByPrimaryKeySelective(tbOrderInfo);
    }
}
