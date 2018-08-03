import com.longines.dao.UserMapper;
import com.longines.pojo.CollectionA;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class App {
    private ApplicationContext cxt;
    @Before
    public void bef() {

        cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void cs()
    {
        UserMapper userMapper=(UserMapper) cxt.getBean("userMapper");
        CollectionA collectionA=userMapper.findCollection(1);
        collectionA.setUserid(28);
        collectionA.setGoodsid(1);
        collectionA.setColltime(new Date());
        collectionA.setPur(0);
        if(collectionA.getInvalid()>0)
            collectionA.setInvalid(1);
        userMapper.saveCollection(collectionA);
    }
}
