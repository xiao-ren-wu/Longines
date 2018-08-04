package com.longines.dao;

import com.longines.pojo.TbOrderInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;

public class TestInsertOrderInfo {
    @Test
    public  void  testinsertOrderInfo()throws Exception
    {
        InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        TbOrderInfoMapper tbOrderInfoMapper=sqlSession.getMapper(TbOrderInfoMapper.class);
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setuId(2);
        tbOrderInfo.setaId(3);
        /*tbOrderInfo.setoId(11111);*/
        tbOrderInfo.setCreDate(new Date());
        tbOrderInfo.setDelDate(new Date());
        tbOrderInfo.setTbDate(new Date());
        tbOrderInfo.setaAmount((long) 222);
        tbOrderInfo.setFreight((long) 3333);
        tbOrderInfo.setsNum(10);
        tbOrderInfo.setdMethod("火车");
        tbOrderInfoMapper.insert(tbOrderInfo);
        sqlSession.commit();
        sqlSession.close();
    }
}
