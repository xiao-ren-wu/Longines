import com.longines.dao.TbCollectionMapper;
import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
/**
 * @author liuchanghui
 * @Title: a
 * @ProjectName Longines
 * @Description: TODO
 * @date 2018/8/3  12:15
 */

public class App {
    private ApplicationContext cxt;
    @Before
    public void bef() {

        cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
    }
    @Test
    public void cs()
    {
        TbCollectionMapper tbCollectionMapper =(TbCollectionMapper) cxt.getBean("tbCollectionMapper");

        /**
         * 联合查询并添加
         */
        TbCollection tbCollection =tbCollectionMapper.findCollection(6);
        tbCollection.setgId(1);
        tbCollection.setuId(6);
        tbCollection.setPur(0);
        tbCollection.setCollTime(new Date());
       System.out.println(tbCollection);
      tbCollectionMapper.insert(tbCollection);
        /**
         * 删除语句
         */
       /*TbCollection tbCollection = new TbCollection();
       tbCollection.setuId(2);
       tbCollection.setgId(1);
       tbCollectionMapper.deleteByPrimaryKey(tbCollection);*/
        /**
         * 查询语句
         */
      /* TbCollectionExample tbCollectionExample =new TbCollectionExample();
        TbCollectionExample.Criteria criteria = tbCollectionExample.createCriteria();
        criteria.andGIdEqualTo(1);
        List<TbCollection> users = tbCollectionMapper.selectByExample(tbCollectionExample);

        System.out.println(users);*/
    }
}
