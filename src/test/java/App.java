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
        UserMapper userMapper=(UserMapper) cxt.getBean("UserMapper");
        CollectionB collection_b=userMapper.findCollection(168);
        System.out.println(collection_b);
        CollectionA collectionA=new CollectionA();
        collectionA.setUser_id(25);
        collectionA.setGoods_id(168);
        collectionA.setC_price(collection_b.getPrice());
        collectionA.setColl_time(new Date());
        collectionA.setPur(0);
        if(collection_b.getInv()>0)
            collectionA.setInvalid(1);
        userMapper.saveCollection(collectionA);
    }
}
