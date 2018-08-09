package com.longines.service;

import com.longines.pojo.TbUser;

import java.util.List;

/**
*@author zhaoxiaokang
*@since 2018/8/8 21:09
*@version 1.0
*/

public interface TbUserService {
        /**
         *
         *@param user 用户
         *@return int
         */
        public int  regist(TbUser user);
        /**
         *
         *@param telNum, pw 电话号码  密码
         *@return java.lang.Boolean
         *@since 2018/8/8 22:12
         */
        public Boolean login(String telNum, String pw);


        /**
         *修改信息
         *@param uId, uname, sex, label, pw, pic, telNum
         *@return int
         *@since 2018/8/8 22:13
         */
        public int revise(int uId, String uname, String sex, String label, String pw, String pic, String telNum);
        /**
         *退出登录
         *@since 2018/8/8 22:13
         */
        public void logout();
        /**
         *注销用户
         *@param uId 用户
         *@return int
         *@since 2018/8/8 22:14
         */
        public int logoff(int uId);

        public TbUser select(int uId);

        /**
         *查找用户
         *@param user 用户
         *@return java.util.List<com.longines.pojo.TbUser>
         *@since 2018/8/8 22:15
         */
        public List<TbUser> select(TbUser user);


        public int updateTbUser1(TbUser user);
}
