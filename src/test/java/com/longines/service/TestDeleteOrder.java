package com.longines.service;

import com.longines.service.impl.TbOrderInfoImpl;
import org.junit.Test;

public class TestDeleteOrder {
    @Test
    public void demo04()
    {
        int i=new TbOrderInfoImpl().deleteByPrimaryKey(11113);
        System.out.println(i);
    }
}
