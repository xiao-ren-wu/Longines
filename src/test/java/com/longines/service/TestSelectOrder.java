package com.longines.service;

import com.longines.dao.TbOrderInfoMapper;
import com.longines.pojo.TbOrderInfo;
import com.longines.service.impl.TbOrderInfoImpl;
import org.ietf.jgss.Oid;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TestSelectOrder {

    @Test
    public void demo02()
    {
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setsNum(2);
        tbOrderInfo.setuId(2);
        System.out.println(new TbOrderInfoImpl().selectBysNum(tbOrderInfo));
    }
}
