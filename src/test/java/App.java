import com.longines.dao.UserMapper;
import com.longines.pojo.CollectionA;
import com.longines.pojo.CollectionB;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;



public class App {
    private ApplicationContext cxt;
    @Before
    public void bef()throws Exception {

        cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void cs() throws Exception
    {
        UserMapper userMapper=(UserMapper) cxt.getBean("userMapper");
        CollectionB collection_b=userMapper.findCollection(167);
        System.out.println(collection_b);
        CollectionA collectionA=new CollectionA();
        collectionA.setUser_id(54);
        collectionA.setGoods_id(167);
        collectionA.setC_price(collection_b.getPrice());
        collectionA.setColl_time(new Date());
        collectionA.setPur(0);
        if(collection_b.getInv()>0)
            collectionA.setInvalid(1);
        userMapper.saveCollection(collectionA);
    }
}
