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
         *用户注册
         *@param user 用户
         *@return int
         */
        public int  regist(TbUser user);
        /**
         *用户登录
         *@param telNum 电话号码
         *@param  pw 密码
         *@return java.lang.Boolean
         *@since 2018/8/8 22:12
         */
        public TbUser login(String telNum, String pw);

        /**
         *退出登录
         *@since 2018/8/8 22:13
         */
        public void logout();
        /**
         *注销用户
         *@param uId 用户id
         *@return int
         *@since 2018/8/8 22:14
         */
        public int logoff(int uId);

        /**
         *查找用户信息
         *@param uId 用户id
         *@return com.longines.pojo.TbUser
         *@since 2018/8/10 16:43
         */
        public TbUser select(int uId);


        /**
         *查找用户
         *@param user 用户
         *@return java.util.List<com.longines.pojo.TbUser>
         *@since 2018/8/8 22:15
         */
        public TbUser select(TbUser user);

        /**
         *更新信息
         *@param user 用户
         *@return int
         *@since 2018/8/10 16:38
         */
        public int updateTbUser(TbUser user);




}
