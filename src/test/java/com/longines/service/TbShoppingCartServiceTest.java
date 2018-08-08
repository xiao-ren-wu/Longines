package com.longines.service;

import com.longines.pojo.TbShoppingCart;
import com.longines.service.TbShoppingCartService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/5 17:51
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml"})
public class TbShoppingCartServiceTest {
    @Autowired
    private static TbShoppingCartService tbShoppingCartService ;
    @BeforeClass
    public static void init() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml","spring/spring-longines-service.xml");
        tbShoppingCartService= (TbShoppingCartService) cxt.getBean("tbShoppingCartServiceImpl");

    }
    @Test
    public void testSelectByUid() {
        //tbShoppingCartService= (TbShoppingCartService) cxt.getBean("tbShoppingCartServiceImpl");
        System.out.println(tbShoppingCartService);
        List<TbShoppingCart> list= (List<TbShoppingCart>) tbShoppingCartService.selectShcByUid(1);
        System.out.println(list);
    }

    @Test
    public void testUpdateByTamount() {
    }
    @Test
    public void test(){
        System.out.println("sadjkhakjdg");
    }
    @Test
    public void testDeleteByPrimaryKey() {
    }

    @Test
    public void testInsertSelective() {
        tbShoppingCartService.insertShcSelective(5,6,17,156,1);
    }
}