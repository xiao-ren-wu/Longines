package com.longines.controller;

import com.longines.pojo.TbUser;
import com.longines.service.TbUserService;
import com.longines.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


/**
*@author zhaoxiaokang
*@since 2018/8/8 22:38
*@version 1.0
*/



@Controller
@RequestMapping(value="/longines")
public class TbUserController {


    @Autowired
    private TbUserService service;



    /**
     * 注册用户
     *
     * @param user    用户
     * @return java.lang.String
     * @since 2018/8/9 22:34
     */

    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    public int register(@RequestBody TbUser user, HttpServletRequest request)throws Exception {

        TbUser tbUser=service.select(user.getTelNum());
        if(tbUser==null) {
            if (service.regist(user) == 1) {
                return 1;
            } else {
                return 0;
            }
        }else{
            return 0;
        }
}







    /**
     * 验证用户登录
     *
     * @param user 用户
     * @return java.lang.String
     * @since 2018/8/9 22:30
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public int login( @RequestBody TbUser user) {

        String telNum = user.getTelNum();
        String pw=MD5.tomd5(user.getPw());
        if (telNum!=null&&pw!=null) {
            user = service.login(telNum,pw);
            if (user != null) {
                return user.getuId();
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }


    /**
     *用户信息展示
     *@param user 用户
     *@return com.longines.pojo.TbUser
     *@since 2018/8/14 10:10
     */
    @RequestMapping(value = "/select",method=RequestMethod.POST)
    @ResponseBody
    public TbUser select(@RequestBody TbUser user) {

        return service.select(user.getuId());
    }

    /**
     *更新用户信息
     *@param user 用户
     *@return java.lang.String
     *@since 2018/8/17 1:09
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public int update(@RequestBody TbUser user) {
        if (service.updateTbUser(user) == 1) {
            return 1;
        } else {
            return 0;
        }

    }
    /**
     *修改密码
     *@param user 用户
     *@return java.lang.String
     *@since 2018/8/14 10:46
     */
    @RequestMapping(value="revisePw",method=RequestMethod.POST)
    @ResponseBody
    public int   revisePw(@RequestBody TbUser user) {
        TbUser tbuser = service.select(user.getTelNum());
        System.out.println(tbuser.getAntoqu());
        System.out.println(user.getAntoqu());
        if ((tbuser.getAntoqu()==null)||tbuser.getAntoqu().equals(user.getAntoqu()))
        {
            tbuser.setPw(MD5.tomd5(user.getPw()));
            service.updateTbUser(tbuser);
            return 1;
        }else{
            return 0;
        }
    }

    /**
     *更改图像
     *@param user 用户
     *@return java.lang.String
     *@since 2018/8/19 14:50
     */
    @RequestMapping(value="updatePic",method=RequestMethod.POST)
    @ResponseBody
    public String updatePic(TbUser user, HttpServletRequest request) throws IOException {


        // 如果文件不为空，写入上传路径
        if (!user.getImage().isEmpty()) {
            // 上传文件名
            String filename = user.getImage().getOriginalFilename();
            // 上传文件路径
            String path = request.getServletContext().getRealPath("/images/");
            File filepath = new File(path, filename);
            // 判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            // 将上传文件保存到一个目标文件当中
            user.getImage().transferTo(new File(path + File.separator + filename));
            String relativePath="images/"+filename;
            user.setPic(relativePath);
            service.updateTbUser(user);


            String fullPath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+relativePath;
            System.out.println(fullPath);
            return fullPath;

        }
        return null;

    }





    }
