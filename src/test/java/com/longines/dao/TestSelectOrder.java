package com.longines.dao;

import com.longines.pojo.TbOrderKey;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class TestSelectOrder {

    @Test
    public void testselectOrder ()throws Exception
    {
        /*InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        TbOrderMapper tbOrderMapper=sqlSession.getMapper(TbOrderMapper.class);
        System.out.println(tbOrderMapper.selectgnumByoid(2));
        sqlSession.close();*/

    }


}