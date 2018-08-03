package com.longines.service.impl;

<<<<<<< HEAD
public class Shopping_CartServiceImp  {
    /*private Shopping_CartDao ScDao;
=======
import com.longines.dao.Shopping_CartDao;
import com.longines.service.Shopping_CartService;

public class Shopping_CartServiceImp implements Shopping_CartService {
    private Shopping_CartDao ScDao;
>>>>>>> 0fd1e24d83ff183679af25f965a3a6455e88cddf
    public void setScDao(Shopping_CartDao scDao){
        this.ScDao=scDao;
    }

    @Override
    public void addUser() {
        //System.out.println("Shopping_CartServiceImp.addUser()");
        this.ScDao.addUser();
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> 0fd1e24d83ff183679af25f965a3a6455e88cddf

    /*@Override
    public void addShC() throws IOException {
//        String resource="mybatis/mybatis-config.xml";
//        InputStream inputStream=Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//
//        shopping_cart sc=new shopping_cart();
//        sc.setUser_id(1);
//        sc.setGoods_id(4);
//        sc.setStatus(0);
//
//        sqlSession.insert("com.longines.dao.UserMapper.InsertUid",sc);
//        sqlSession.commit();

        System.out.println("Ioc_addUser()");
    }*/
}
