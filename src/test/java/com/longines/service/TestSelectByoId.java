package com.longines.service;

import com.longines.pojo.TbOrder;
import com.longines.service.impl.TbOrderImpl;
import org.junit.Test;

public class TestSelectByoId {
    @Test
    public void demo06(){
        TbOrder tbOrder=new TbOrder();
        tbOrder.setoId(2);
        new TbOrderImpl().selectByPrimaryKey(tbOrder);
    }
}
