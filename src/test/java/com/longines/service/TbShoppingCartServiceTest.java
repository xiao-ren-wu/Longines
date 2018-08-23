package com.longines.service;

import com.longines.pojo.TbMgAssociated;
import com.longines.pojo.TbShoppingCart;
import com.longines.service.TbShoppingCartService;
import com.longines.vo.TbShoppingCartVo;
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
        List<TbShoppingCart> tbShoppingCartlist= tbShoppingCartService.selectShcByUid(6);
        System.out.println(tbShoppingCartlist);
    }

    @Test
    public void testUpdateShcBygNum() {
        tbShoppingCartService.updateShcBygNum(1,3,1);
        System.out.println(tbShoppingCartService.selectEchoInfo(1,3));
    }

    @Test
    public void testDeleteShcByPK() {
        tbShoppingCartService.deleteShcByPK(1,4);
    }

    @Test
    public void testInsertShcSelective() {
        tbShoppingCartService.insertShcSelective(1,4);
    }

    @Test
    public void testSelectEchoInfo(){
        TbShoppingCartVo tbShoppingCartVo=tbShoppingCartService.selectEchoInfo(6,9);
        System.out.println(tbShoppingCartVo);
    }
    @Test
    public void testSelectEcho(){
        List<TbShoppingCartVo> tbShoppingCartVo=tbShoppingCartService.selectEcho(6);
        for(TbShoppingCartVo tbShoppingCartVo1:tbShoppingCartVo){
            System.out.println(tbShoppingCartVo1);
        }
    }

}