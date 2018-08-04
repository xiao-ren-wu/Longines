import com.longines.dao.TbShoppingCartMapper;
import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/2 15:34
 * @Version: 1.0
 */
public class Shopping_CartTest {
    private ApplicationContext cxt;
    @Before
    public void before() {
        cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void test() throws Exception {
        TbShoppingCartMapper tbShoppingCartMapper= (TbShoppingCartMapper) cxt.getBean("tbShoppingCartMapper");

        TbShoppingCartExample tbShoppingCartExample=new TbShoppingCartExample();
        TbShoppingCartExample.Criteria criteria=tbShoppingCartExample.createCriteria();
        /**
         * Select
         */
/*        criteria.andUIdEqualTo(2);
        List<TbShoppingCart> ls=tbShoppingCartMapper.selectByExample(tbShoppingCartExample);
        System.out.println(ls);*/

/*        criteria.andUIdGreaterThan(1);
        List<TbShoppingCart> list=tbShoppingCartMapper.selectByExample(tbShoppingCartExample);
        System.out.println(list);*/

/*        tbShoppingCartMapper.selectByUid(1);
        System.out.println(tbShoppingCartMapper);*/
        /**
         * Insert
         */
        TbShoppingCart tbShoppingCart=new TbShoppingCart();
        tbShoppingCart.setuId(5);
        tbShoppingCart.setgId(9);
        tbShoppingCart.setgNum(2);
        tbShoppingCart.settAmount((long) 10);
        tbShoppingCart.setStatus(1);
        //tbShoppingCartMapper.insert(tbShoppingCart);
        /**
         * delete
         */
        /*TbShoppingCartKey tbShoppingCartKey=new TbShoppingCartKey();
        tbShoppingCartKey.setuId(5);
        tbShoppingCartKey.setgId(9);
        tbShoppingCartMapper.deleteByPrimaryKey(tbShoppingCartKey);*/
        // List<TbShoppingCart> ll=tbShoppingCartMapper.selectByPrimaryKey(tbShoppingCart);
        /**
         * update by Tamount
         */
        tbShoppingCartMapper.updateByTamount(tbShoppingCart);
    }
}
