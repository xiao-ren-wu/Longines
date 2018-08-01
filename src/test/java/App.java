import com.longines.dao.FindUserId;
import com.longines.dao.FindUserIdImpl;
import com.longines.pojo.User;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:35
 */

public class App {
   private ApplicationContext cxt;
   @Before
   public void ss()throws  Exception
   {
      cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");
   }

   @Test
   public void dw()throws Exception
   {

      FindUserId findUserId = (FindUserId) cxt.getBean("FindUserId");
      User user = findUserId.findUserById(1);
      System.out.println(user);
   }
}
