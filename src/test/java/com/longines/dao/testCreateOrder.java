package com.longines.dao;

import com.longines.pojo.Order;
import com.longines.pojo.Order_info;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.Date;

public class testCreateOrder {

    @Test
    public void testCreateOrder ()throws Exception
    {
        InputStream inputStream= Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Order_info order_info=new Order_info();
        /*order_info.setOrder_id(1);*/
        order_info.setUser_id(3);
        order_info.setCre_date(new Date());
        order_info.setDel_date(new Date());
        order_info.setTd_date(new Date());
        order_info.setDisp_method("飞机配送");

        sqlSession.insert("com.longines.dao.CreateOrder.save",order_info);
        sqlSession.commit();
        sqlSession.close();

    }



}
