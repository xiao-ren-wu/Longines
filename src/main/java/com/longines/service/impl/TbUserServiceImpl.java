package com.longines.service.impl;


import com.longines.dao.TbUserMapper;
import com.longines.pojo.TbUser;


import com.longines.service.TbUserService;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
*@author zhaoxiaokang
*@since 2018/8/8 21:09
*@version 1.0
*/
@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private TbUserMapper mapper;

    /**
     *用户注册
     *@param user 用户
     *@return int
     *@since 2018/8/8 21:32
     */
    @Override
    public int regist(TbUser user)
    {

        if((mapper.insert(user))==1){
            return 1;
        }else{
            return 0;
        }

    }


    /**
     * 用户登录
     *@param telNum, pw  电话号码  密码
     *@return java.lang.Boolean
     *@since 2018/8/8 21:31
     */
    @Override
    public Boolean login(String telNum,String pw) {


        boolean flag=false;
        TbUser user=new TbUser();
        user.setTelNum(telNum);
        user.setPw(pw);

        List<TbUser> tbUserList=this.mapper.getTbuserList(user);
        if(tbUserList.size()>0) {
            flag = true;
        }
        return flag;


    }

    /**
     *修改信息
     *@param uId, uname, sex, lable, pw, pic, telNum
     *@return int
     *@since 2018/8/8 21:33
     */
    @Override
    public int revise(int uId,String uname,String sex, String lable, String pw, String pic, String telNum) {

        TbUser user=new TbUser();

        user.setuId(uId);

        user.setUname(uname);
        user.setSex(sex);
        user.setLabel(lable);
        user.setPw(pw);
        user.setPic(pic);
        user.setTelNum(telNum);
       if( mapper.updateByPrimaryKey(user)==1){
           return 1;
       }else {
           return 0;
        }
    }


    /**
     * 退出登录
     *@since 2018/8/8 21:35
     */
    @Override
    public void logout() {

    }

    /**
     *注销用户
     *@param uId 用户id
     *@return int
     *@since 2018/8/8 21:35
     */
    @Override
    public int logoff(int uId) {

        if( mapper.deleteByPrimaryKey(uId)==1){
                    return 1;
            }else{
                return 0;
        }
    }
    /**
     * 根据用户id查找用户
     *@param uId 用户id
     *@return com.longines.pojo.TbUser
     *@since 2018/8/8 21:36
     */
    @Override
    public TbUser select(int uId) {

        return mapper.selectByPrimaryKey(uId);
    }
    /**
     *查找用户
     *@param user 用户
     *@return java.util.List<com.longines.pojo.TbUser>
     *@since 2018/8/8 21:36
     */
    @Override
    public List<TbUser> select(TbUser user) {

        return ( mapper.getTbuserList(user));
    }


    @Override
    public int updateTbUser1(TbUser user) {
        return mapper.updateByPrimaryKeySelective(user);
    }


}

