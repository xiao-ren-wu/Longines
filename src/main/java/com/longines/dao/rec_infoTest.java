package com.longines.dao;

import com.longines.pojo.rec_info;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.InputStream;

public class rec_infoTest {
        @Test
        public void Testda(){
            String resource = "mybatis/mybatis-config.xml";
            InputStream inputStream = null;
            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException e) {
                e.printStackTrace();
            }
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = sqlSessionFactory.openSession();
            try {
                rec_info stu = new rec_info();
                stu.setUser_id(2);
                stu.setAdd_id(2);
                stu.setConsignee("wwe");
                session.insert("com.longines.dao.UserMapper.insertAdd", stu);
                session.commit();
            } finally {
                session.close();
            }

        }
}