import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shopping_cartDaoTest {
    private  ApplicationContext ctx;
    @Before
    public void setUp() throws Exception{
        ctx=new ClassPathXmlApplicationContext("spring/spring-longines-service.xml");

    }
    /*@Test
    public void testfindScByUid() throws Exception {
        //创建UserDao
        Shopping_CartDao shopping_cartDao= (Shopping_CartDao) ctx.getBean("Shopping_CartDao");
        shopping_cart shopping_cart=shopping_cartDao.findScByUid(4);
        System.out.println(shopping_cart);
    }*/
}
