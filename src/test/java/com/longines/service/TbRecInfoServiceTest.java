package com.longines.service;

import com.longines.pojo.TbRecInfo;

import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
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
    public void testUpdateCon() {
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(14);
        todo.setuId(0);
        todo.setConsignee("垃圾王良");
        infoService.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void testDelete() {
        TbRecInfoKey todo = new TbRecInfoKey();
        todo.setaId(3);
        todo.setuId(2);
        infoService.deleteByPrimaryKey(todo);
    }

    @Test
    public void testUpdateAdd() {
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(3);
        todo.setuId(2);
        todo.setsAdd("sa555555555d");
        infoService.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void testUpdatePro() {
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(3);
        todo.setuId(2);
        todo.setProvince("河南");
        infoService.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void testUpdateCity() {
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(3);
        todo.setuId(2);
        todo.setCity("洛阳");
        infoService.updateByPrimaryKeySelective(todo);
    }

    @Test
    public void testUpdateDis() {
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(3);
        todo.setuId(2);
        todo.setDistrict("洛龙区");
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
    public void testUpdatePos(){
        TbRecInfo todo = new TbRecInfo();
        todo.setaId(3);
        todo.setuId(2);
        todo.setPostcode("0825");
        infoService.updateByPrimaryKeySelective(todo);
    }


    @Test
    public void testInsert() {
        TbRecInfo todo = new TbRecInfo();
        todo.setConsignee("777777");
        todo.setsAdd("2222222222");
        todo.setcTel("111111111111");
        todo.setuId(8);
        todo.setPostcode("ddddd");
        todo.setProvince("甘肃");
        todo.setCity("兰州");
        todo.setDistrict("金阳");
        infoService.insert(todo);
    }

    @Test
    public void testSelectByExample() {
        TbRecInfoExample ex = new TbRecInfoExample();
        ex.setDistinct(true);
        TbRecInfoExample.Criteria cri = ex.createCriteria();//自定义查询方法
        cri.andUIdEqualTo(2);
        List<TbRecInfo> todoList = infoService.selectByExample(ex);
        for(TbRecInfo rec:todoList){
            System.out.println(rec.getuId() + ""+ rec.getaId() + "" + rec.getConsignee() + rec.getProvince() + rec.getCity() + rec.getDistrict());
        }
    }
}