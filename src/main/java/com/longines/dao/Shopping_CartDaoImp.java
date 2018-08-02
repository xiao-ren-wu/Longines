package com.longines.dao;

import com.longines.pojo.shopping_cart;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Shopping_CartDaoImp extends SqlSessionDaoSupport implements Shopping_CartDao {


    @Override
    public void insertsc(shopping_cart sc) throws Exception {

//        String resource="mybatis/mybatis-config.xml";
//        InputStream inputStream=Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//
//        sc=new shopping_cart();
//        sc.setUser_id(1);
//        sc.setGoods_id(4);
//        sc.setStatus(0);
//
//        sqlSession.insert("com.longines.dao.UserMapper.InsertUid",sc);
//        sqlSession.commit();
    }

    @Override
    public void addUser() {
        System.out.println("ScDao_addUser()");   //DItest
    }

    @Override
    public shopping_cart findScByUid(int id) throws Exception {
        return this.getSqlSession().selectOne("mapper/ShoppingcartMapper.xml",id);
    }
}
