import com.longines.dao.Shopping_CartMapper;
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
    @Test
    public void test() throws Exception {
        String xmlPath="spring/spring-longines-dao.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Shopping_CartMapper mapper=applicationContext.getBean(Shopping_CartMapper.class);

//        shopping_cart shc=new shopping_cart();
//        shc.setUser_id(2);
//        shc.setGoods_id(3);
//        shc.setG_num(15);
//        shc.setT_amount(10*20);
//
//        mapper.FindInfo(2);
    }
}
