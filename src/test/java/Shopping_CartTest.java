import com.longines.dao.TbShoppingCartMapper;
import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/2 15:34
 * @Version: 1.0
 */
public class Shopping_CartTest {
    private ApplicationContext cxt;
    @Before
    public void bef() {
        cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void test() throws Exception {
        TbShoppingCartMapper tbShoppingCartMapper= (TbShoppingCartMapper) cxt.getBean("tbShoppingCartMapper");

        TbShoppingCartExample tbShoppingCartExample=new TbShoppingCartExample();
        TbShoppingCartExample.Criteria criteria=tbShoppingCartExample.createCriteria();
        criteria.andUIdEqualTo(1);
        List<TbShoppingCart> ls=tbShoppingCartMapper.selectByExample(tbShoppingCartExample);

        System.out.println(ls);


    }
}
