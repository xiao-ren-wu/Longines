package com.longines.service;


import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
    @ContextConfiguration({"classpath:spring/spring-longines-dao.xml",
            "classpath:spring/spring-longines-service.xml"})

   public class TbPayServiceTest {

        @Autowired
        private  static TbPayService tbPayService;
        @BeforeClass
        public static void  init() {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-longines-dao.xml", "classpath:spring/spring-longines-service.xml");
            tbPayService = (TbPayService) ctx.getBean("tbPayServiceImpl");
        }
            @Test
            public void www(){


                tbPayService.insertTbPay(2);
                Integer in = tbPayService.findUidPicAcBalance(1).getuId();
                String st = tbPayService.findUidPicAcBalance(1).getPic();
                Long lo = tbPayService.findaAmount(1).getaAmount();
                System.out.println(in);
                System.out.println(st);
                System.out.println(lo);

                int i = tbPayService.judgePw(1, 123456);
                if (i == 1) {
                    i = tbPayService.updateacBalancesNum(1);
                    if (i == 1) {
                        System.out.println(i);
                    }
                }
                System.out.println(i);
            }

        }


