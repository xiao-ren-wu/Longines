package com.longines.dao;

import com.longines.pojo.RecInfo;
import com.longines.pojo.rec_info;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.InputStream;

/**
 * @author wangyichao
 * e-mail 742969147@qq.com
 * github https://github.com/MarryAndy
 * @version 1
 * @since 2018/8/3 00:22
 */
public class RecInfoTest {
        @Test
        public void TestDa(){
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
                RecInfo stu = new RecInfo();

                session.insert("com.longines.dao.UserMapper.insertAdd", stu);
                session.commit();
            } finally {
                session.close();
            }

        }
}