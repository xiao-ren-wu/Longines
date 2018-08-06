import com.longines.dao.TbOrderInfoMapper;
import com.longines.dao.TbPayMapper;
import com.longines.dao.TbUserMapper;
import com.longines.pojo.TbOrderInfo;
import com.longines.pojo.TbPay;
import com.longines.pojo.TbUser;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


/**
 * @author XiaoRenwu
 * e-mail 18629015421@163.com
 * github https://github.com/xiao-ren-wu
 * @version 1
 * @since 2018/7/8 23:35
 */

public class test {
    private ApplicationContext cxt;
    @Before
    public void ss()
    {
        cxt = new ClassPathXmlApplicationContext("spring/spring-longines-dao.xml");

    }

    @Test
    public void dw()  {


        TbOrderInfoMapper tbOrderInfoMapper = (TbOrderInfoMapper) cxt.getBean("tbOrderInfoMapper");
        TbOrderInfo  tbOrderInfo=new TbOrderInfo ();
        tbOrderInfo.setoId(1);
        tbOrderInfo.setsNum(1);
        tbOrderInfoMapper.updateByPrimaryKeySelective(tbOrderInfo);


        TbUserMapper tbUserMapper = (TbUserMapper) cxt.getBean("tbUserMapper");
        TbUser tbUser = new TbUser();
        tbUser.setuId(1);
        tbUser.setAcBalance((long)50);
        tbUserMapper.updateByPrimaryKeySelective(tbUser);


        TbPayMapper tbPayMapper = (TbPayMapper) cxt.getBean("tbPayMapper");
        TbPay tbPay = new TbPay();
        tbPay.setpId(1);
        tbPay.setpMethod("余额支付");
        tbPay.setCreatetime(new Date());
        tbPayMapper.updateByPrimaryKeySelective(tbPay);


        TbUser tbUser1 = tbPayMapper.selectUser(1);
        TbOrderInfo tbOrderInfo1= tbPayMapper.selectOrder(1);


        System.out.println(tbUser1);
        System.out.println(tbOrderInfo1);
        System.out.println(tbPayMapper);
        System.out.println(tbUserMapper);
        System.out.println(tbOrderInfoMapper);



    }
}
