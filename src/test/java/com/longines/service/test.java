package com.longines.service;

import com.longines.service.TbUserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
*@author zhaoxiaokang
*@since 2018/8/8 21:09
*@version 1.0
*/


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-longines-dao.xml",
        "classpath:spring/spring-longines-service.xml"})
public class test {


        private  static TbUserService service;
       @BeforeClass
         public static void  init(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring/spring-longines-dao.xml","classpath:spring/spring-longines-service.xml");
        service= (TbUserService) ctx.getBean("tbUserServiceImpl");

    }
           @Test
            public void test6(){


            Boolean flag=service.login("123456789","1234567");
               System.out.println(flag);

           }












    // private   ApplicationContext ctx;
/*@Before
public  void  bef() {
     ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-longines-dao.xml");
}
@Test
        public void test(){
    System.out.println(ctx);
        TbUserMapper mapper= (TbUserMapper) ctx.getBean("tbUserMapper");
        TbUser user=mapper.selectByPrimaryKey(6);
        System.out.println(user);
    }*/





}


