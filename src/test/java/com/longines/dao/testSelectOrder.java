package com.longines.dao;

import com.longines.pojo.TbOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;

public class testSelectOrder {

    @Test
    public void testCreateOrder ()throws Exception
    {
        InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        TbOrderMapper tbOrderMapper=sqlSession.getMapper(TbOrderMapper.class);
        /*sqlSession.selectOne("com.longines.dao.TbOrderMapper.selectByPrimaryKey",1);*/
        /*System.out.println(tbOrder);*/
        System.out.println(tbOrderMapper.selectByPrimaryKey(1));
        sqlSession.close();
    }



}
