package com.longines.service;

import com.longines.pojo.TbOrder;
import com.longines.service.impl.TbOrderImpl;
import org.junit.Test;

public class TestInsertOrder {
    @Test
    public void demo05()
    {
        TbOrder tbOrder=new TbOrder();
        new TbOrderImpl().insertSelective(tbOrder);
    }
}
