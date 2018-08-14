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
 * @author  liuyang
 * @since   2018/8/5 17:51
 * @version 1.0
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
    public void testSelectShcByUid() {
        List<TbShoppingCart> tbShoppingCart= (List<TbShoppingCart>) tbShoppingCartService.selectShcByUid(1);
        System.out.println(tbShoppingCart);
    }

    @Test
    public void testUpdateShcBygNum() {
        tbShoppingCartService.updateShcBygNum(1,4,20);
    }

    @Test
    public void testDeleteShcByPK() {
        tbShoppingCartService.deleteShcByPK(9,9);
    }

    @Test
    public void testInsertShcSelective() {
        tbShoppingCartService.insertShcSelective(9,9,17,156,1);
    }
}