import com.longines.dao.RecInfoMapper;
import com.longines.pojo.RecInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class RecInfoTest
{
    private RecInfoMapper mapper;

    public static void main(String[] args )
    {
        String xmlPath  = "spring/spring-longines-dao.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(xmlPath);
        //RecInfoMapper mapper = appContext.getBean("recInfoMapper");
        //里面写的单词第一个字母小写，相当于自动生成RecInfoMapper的bean
        RecInfoMapper recInfoMapper= (RecInfoMapper) appContext.getBean("recInfoMapper");


        RecInfo todo = new RecInfo();
        todo.setConsignee("Andy");
        todo.setS_address("sun");
        todo.setC_tel("12132212313");
        todo.setPostcode("12131");
        todo.setAdd_id(2);
        todo.setUser_id(3);

        recInfoMapper.insert(todo);

//        System.out.println("todo's new id is " + todo.getUser_id());
//        List<RecInfo> todoes = mapper.getTodoList();
//        Iterator it = todoes.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().toString());
//        }
//         RecInfo todo1 = mapper.getTodo(1);
//
//         System.out.println("todo's setConsignee is " + todo1.getConsignee());
//
//         todo1.setPostcode("123231");
//         mapper.updateConsignee(todo1);

//        mapper.delete(1,2);
    }
}
