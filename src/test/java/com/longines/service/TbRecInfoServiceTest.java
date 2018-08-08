package com.longines.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.longines.dao.TbRecInfoMapper;
import com.longines.pojo.TbRecInfo;

import com.longines.pojo.TbRecInfoExample;
import com.longines.service.impl.TbRecInfoServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class TbRecInfoServiceTest {
    private TbRecInfoService infoService;
    private ApplicationContext appContext;

    @Before
    public void setUp() {
        String xmlPathDao  = "spring/spring-longines-dao.xml";
        String xmlPathService = "spring/spring-longines-service.xml";
        appContext = new ClassPathXmlApplicationContext(xmlPathService,xmlPathDao);
        //RecInfoMapper mapper = appContext.getBean("recInfoMapper");
        //里面写的单词第一个字母小写，相当于自动生成RecInfoMapper的bean
        infoService = (TbRecInfoServiceImpl) appContext.getBean("tbRecInfoServiceImpl");
        /**
         * 只能在实现类上加，因为Dao层是mappar代理实现的，所以可以直接在接口上加注解，Sercvice层是实现类处理，所以，
         * 要在实现类上加注解，在哪个类上面加注解，就意味着创建该类的bean
         */


    }

    @Test
    public void testUpdateCon(int uid,int aid,String con) {
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(aid);
        todo.setuId(uid);
        todo.setConsignee(con);
        infoService.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void testUpdateAdd(int uid,int aid,String add) {
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(aid);
        todo.setuId(uid);
        todo.setsAdd(add);
        infoService.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void testUpdateTel(int uid,int aid,String tel){
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(aid);
        todo.setuId(uid);
        todo.setcTel(tel);
        infoService.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void testUpdatePos(int uid,int aid,String pos){
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(aid);
        todo.setuId(uid);
        todo.setPostcode(pos);
        infoService.updateByPrimaryKeySelective(todo);
    }


    @Test
    public void testInsert(int uid,String con,String tel,String pos,String add) {
        TbRecInfo todo = new TbRecInfo();
        todo.setConsignee(con);
        todo.setsAdd(add);
        todo.setcTel(tel);
        todo.setPostcode(pos);
        todo.setuId(uid);
        infoService.insert(todo);
    }

    @Test
    public void testSelectByExample(int uid) {
        TbRecInfoExample ex = new TbRecInfoExample();
        ex.setDistinct(true);
        TbRecInfoExample.Criteria cri = ex.createCriteria();//自定义查询方法
        cri.andUIdEqualTo(uid);
        List<TbRecInfo> todoList = infoService.selectByExample(ex);
        for(TbRecInfo rec:todoList){
            System.out.println(rec.getuId() + ""+ rec.getaId() + "" + rec.getConsignee());
        }
    }
}