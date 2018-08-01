package com.longines.dao;

import com.longines.pojo.goods_info;
import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import tk.mybatis.mapper.common.Mapper;

import java.io.InputStream;

import static org.junit.Assert.*;

public class GoodsMapperTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws Exception {
        String resources="mybatis/mybatis-config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resources);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findGoodsById() throws Exception{
        SqlSession sqlSession=sqlSessionFactory.openSession();
        GoodsMapper mapper=sqlSession.getMapper(GoodsMapper.class);
        goods_info goods=mapper.findGoodsById(1);
        System.out.println(goods.getGname());
    }
    @Test
    public void InsertGoods()
    {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        GoodsMapper mapper=sqlSession.getMapper(GoodsMapper.class);
        goods_info g=new goods_info();
        g.setGname("爱情表");
        g.setBrand("浪琴");
        g.setPrice(3000.00);
        g.setTheme("欧美");
        g.setG_pic("羞羞的图");
        mapper.InsertGoods(g);
        sqlSession.commit();
        sqlSession.close();

    }
}