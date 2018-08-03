package com.longines.dao;

import com.longines.pojo.shopping_cart;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class test {
    @Test
    public void Inserttest() throws Exception {
        String resource="mybatis/mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

//        shopping_cart sc=new shopping_cart();
//        sc.setUser_id(1);
//        sc.setGoods_id(4);
//        sc.setStatus(0);
//
//        sqlSession.insert("com.longines.dao.UserMapper.InsertUid",sc);
//        sqlSession.commit();

	    shopping_cart shc=sqlSession.selectOne("com.longines.dao.UserMapper.FindByUid",1);
	    System.out.println(shc);
//        shopping_cart shc=sqlSession.selectOne("com.longines.dao.UserMapper.FindByGid",4);
//        System.out.println(shc);

//        List<Object> list=sqlSession.selectList("first.findName", "ls");
//        System.out.println(list);
        sqlSession.close();
    }
}
