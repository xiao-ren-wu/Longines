package com.longines.dao;

import com.longines.pojo.TbRecInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TbRecInfoMapperTest {
    private ApplicationContext AC;
    private TbRecInfoMapper mapper;
    @BeforeMethod
    public void setUp() {
        String xmlPath  = "spring/spring-longines-dao.xml";
        AC = new ClassPathXmlApplicationContext(xmlPath);
        //RecInfoMapper mapper = appContext.getBean("recInfoMapper");
        //里面写的单词第一个字母小写，相当于自动生成RecInfoMapper的bean
        mapper= (TbRecInfoMapper)AC.getBean("tbRecInfoMapper");

    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
    }

    @Test
    public void testDeleteByPrimaryKey() {
    }

    @Test
    public void testInsert(){
        TbRecInfo todo = new TbRecInfo();
        todo.setConsignee("Anddddy");
        todo.setsAdd("sun");
        todo.setcTel("12132212313");
        todo.setPostcode("12131");
        todo.setuId(7);
        mapper.insert(todo);
    }

    @Test
    public void testSelectByExample() {
    }
}