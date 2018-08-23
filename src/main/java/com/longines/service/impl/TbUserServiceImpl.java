package com.longines.service.impl;


import com.longines.dao.TbUserMapper;
import com.longines.pojo.TbUser;
import com.longines.service.TbUserService;
import com.longines.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        TbUser tbUser=new TbUser();
        tbUser.setPw(MD5.tomd5(user.getPw()));
        tbUser.setTelNum(user.getTelNum());
        tbUser.setUname(user.getUname());
        if(mapper.insertSelective(tbUser)==1) {
            return 1;
        }
        else {
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
    public TbUser login(String telNum, String pw) {


        TbUser user=new TbUser();
        user.setTelNum(telNum);
        user.setPw(pw);
       return mapper.getTbuser(user);



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
    public TbUser select(TbUser user) {
        return mapper.getTbuser(user);
    }

    /**
     *更新用户信息
     *@param user 用户
     *@return int
     *@since 2018/8/10 16:31
     */
    @Override
    public int updateTbUser(TbUser user) {


        return mapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public TbUser select(String telNum) {
        return mapper.findTbuser(telNum);
    }


}

