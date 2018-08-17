package com.longines.service;

import com.longines.pojo.TbOrder;
import com.longines.pojo.TbOrderInfo;
import com.longines.service.impl.TbOrderInfoServiceImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml"})
public class TbOrderServiceInfoTest {
    private static TbOrderInfoService service;
    @BeforeClass
    public  static void init()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml");
        service= (TbOrderInfoService) ctx.getBean("tbOrderInfoServiceImpl");
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
        service.deleteByPrimaryKey(4);
    }

    @Test
    public void insert() {
    }

    /**
     * 生成订单
     */
    @Test
    public void insertSelective() {
        com.longines.pojo.TbOrderInfo tbOrderInfo=new TbOrderInfo();
        service.insertSelective(tbOrderInfo);
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setsNum(666);
        tbOrderInfo.setuId(222);
        System.out.println(service.selectByuIdsNum(tbOrderInfo));
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo=new TbOrderInfoServiceImpl().selectByPrimaryKey(11114);
        new TbOrderInfoServiceImpl().updateByPrimaryKeySelective(tbOrderInfo);
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectByuId() {
        System.out.println(service.selectByuId(222));
    }

    @Test
    public void selectBysNum() {
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setsNum(2);
        tbOrderInfo.setuId(2);
        System.out.println(new TbOrderInfoServiceImpl().selectBysNum(tbOrderInfo));
    }

    @Test
    public void all()
    {
       /* TbOrderInfoService tbOrderInfo=new TbOrderInfoService();
        tbOrderInfo.setoId(2);*/
        new TbOrderInfoServiceImpl().countAll(2);
    }
}