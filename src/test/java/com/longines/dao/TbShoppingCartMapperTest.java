package com.longines.dao;

import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartKey;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author  liuyang
 * @since    2018/8/5 2:04
 * @version  1.0
 */
public class TbShoppingCartMapperTest {
    private ApplicationContext cxt;
    @Before
    public void setUp() {
        cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }

    /**
     * 不为空时新增
     */
    @Test
    public void testInsertSelective() {
        TbShoppingCartMapper tbShoppingCartMapper= (TbShoppingCartMapper) cxt.getBean("tbShoppingCartMapper");
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(1);
        tbShoppingCart.setgId(1);
        tbShoppingCart.setgNum(10);
        tbShoppingCart.settAmount((long) 10);
        tbShoppingCart.setStatus(1);
        tbShoppingCartMapper.insertSelective(tbShoppingCart);
    }

    @Test
    public void testDeleteByPrimaryKey() {
        TbShoppingCartMapper tbShoppingCartMapper= (TbShoppingCartMapper) cxt.getBean("tbShoppingCartMapper");
        TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(1);
        tbShoppingCartKey.setgId(1);
        tbShoppingCartMapper.deleteByPrimaryKey(tbShoppingCartKey);
    }

    @Test
    public void testUpdateByTamount() {
        TbShoppingCartMapper tbShoppingCartMapper= (TbShoppingCartMapper) cxt.getBean("tbShoppingCartMapper");
        System.out.println(tbShoppingCartMapper.selectByUid(1));
    }

    @Test
    public void testSelectByUid() {
        TbShoppingCartMapper tbShoppingCartMapper= (TbShoppingCartMapper) cxt.getBean("tbShoppingCartMapper");
        System.out.println(tbShoppingCartMapper.selectByUid(1));
    }
}