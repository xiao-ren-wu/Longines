import com.longines.dao.RecInfoMapper;
import com.longines.dao.TbRecInfoMapper;
import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */

public class RecInfoTest
{
    private ApplicationContext AC;
    private TbRecInfoMapper mapper;

    @Before
    public void ref(){
        String xmlPath  = "spring/spring-longines-dao.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(xmlPath);
        //RecInfoMapper mapper = appContext.getBean("recInfoMapper");
        //里面写的单词第一个字母小写，相当于自动生成RecInfoMapper的bean
        TbRecInfoMapper recInfoMapper= (TbRecInfoMapper) appContext.getBean("tbRecInfoMapper");
        mapper = recInfoMapper;
    }

    @Test
    public void insert1(){
        TbRecInfo todo = new TbRecInfo();
        todo.setConsignee("Andy");
        todo.setsAdd("sun");
        todo.setcTel("12132212313");
        todo.setPostcode("12131");
        todo.setuId(5);
        mapper.insert(todo);
    }

    @Test
    public void delete(){
        TbRecInfoKey todo = new TbRecInfo();
        todo.setuId(5);
        todo.setaId(5);
        mapper.deleteByPrimaryKey(todo);
    }

    @Test
    public void updateCon(){
        TbRecInfo todo = new TbRecInfo();
        todo.setuId(1);
        todo.setaId(1);
        todo.setConsignee("2424");
        mapper.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void updateSad(){

        TbRecInfo todo = new TbRecInfo();
        todo.setuId(1);
        todo.setaId(1);
        todo.setsAdd("wwe");
        mapper.updateByPrimaryKeySelective(todo);
    }
    @Test
    public void updateTel(){
        TbRecInfo todo = new TbRecInfo();
        todo.setuId(1);
        todo.setaId(1);
        todo.setcTel("1313133");
        mapper.updateByPrimaryKeySelective(todo);
    }
    @Test
    public void updatePost(){

        TbRecInfo todo = new TbRecInfo();
        todo.setuId(1);
        todo.setaId(1);
        todo.setPostcode("10232300001");
        mapper.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void select(){
        TbRecInfo todo = new TbRecInfo();
        TbRecInfoExample Tb = new TbRecInfoExample();
        Tb.setDistinct(false);//取出重复:关闭
        TbRecInfoExample.Criteria criteria = Tb.createCriteria();//自定义查询构件
        criteria.andUIdEqualTo(1);
        List<TbRecInfo> Tbr = mapper.selectByExample(Tb);
        for(TbRecInfo refs: Tbr){
            System.out.println(refs.getuId() + "..." + refs.getaId() + "..." + refs.getConsignee());
        }
    }
//    public static void main(String[] args )
//    {
//        String xmlPath  = "spring/spring-longines-dao.xml";
//        ApplicationContext appContext = new ClassPathXmlApplicationContext(xmlPath);
//        //RecInfoMapper mapper = appContext.getBean("recInfoMapper");
//        //里面写的单词第一个字母小写，相当于自动生成RecInfoMapper的bean
//        RecInfoMapper recInfoMapper= (RecInfoMapper) appContext.getBean("recInfoMapper");
//
//
//    //    RecInfo todo = new RecInfo();
//
//
//
////        System.out.println("todo's new id is " + todo.getUser_id());
////        List<RecInfo> todoes = mapper.getTodoList();
////        Iterator it = todoes.iterator();
////        while(it.hasNext()){
////            System.out.println(it.next().toString());
////        }
////         RecInfo todo1 = mapper.getTodo(1);
////
////         System.out.println("todo's setConsignee is " + todo1.getConsignee());
////
////         todo1.setPostcode("123231");
////         mapper.updateConsignee(todo1);
//
////        mapper.delete(1,2);
//
}
