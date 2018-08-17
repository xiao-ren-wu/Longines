package com.longines.service;

import com.longines.dao.TbOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml"})
public class TbGoodsInfoServiceTest {
    private static TbGoodsInfoService service;

    @Test
    public void selectPrice() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-longines-dao.xml", "classpath:spring/spring-longines-service.xml");
        service = (TbGoodsInfoService) ctx.getBean("tbGoodsInfoServiceImpl");
        TbOrderMapper tbOrderMapper= (TbOrderMapper) ctx.getBean("tbOrderMapper");
        List<Integer> gId=tbOrderMapper.selectByoId(2);
        System.out.println(service.selectPrice(gId));
    }
}