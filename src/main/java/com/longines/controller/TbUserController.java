package com.longines.controller;


import com.longines.pojo.TbUser;
import com.longines.service.TbUserService;
import com.longines.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;


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
     * 验证用户登录
     *
     * @param user 用户
     * @return java.lang.String
     * @since 2018/8/9 22:30
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public int login( @RequestBody TbUser user,HttpSession session) {

        String telNum = user.getTelNum();
        String pw=MD5.tomd5(user.getPw());
        if (telNum!=null&&pw!=null) {
            user = service.login(telNum,pw);
            if (user != null) {
                session.setAttribute("uId", user.getuId());
                session.setAttribute("tbuser", user);

                return user.getuId();
            } else {
                return 100;
            }
        } else {
            return 1000;
        }
    }


    /**
     *用户信息展示
     *@param user 用户
     *@return com.longines.pojo.TbUser
     *@since 2018/8/14 10:10
     */
    @RequestMapping(value = "/select",method = RequestMethod.POST)
    @ResponseBody
    public TbUser select( @RequestBody TbUser user) {
         TbUser tbuser = service.select(user.getuId());
         return tbuser;
    }



    /**
     *更新用户信息
     *@param user 用户
     *@return java.lang.String
     *@since 2018/8/17 1:09
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody TbUser user) {
        if (service.updateTbUser(user) == 1) {
            return "success";
        } else {
            return "fail";
        }

    }









    /**
     * 注册用户
     *
     * @param user    用户
     * @return java.lang.String
     * @since 2018/8/9 22:34
     */

    @RequestMapping(value="/register",method =RequestMethod.POST)
    @ResponseBody
    public HashMap<String, Object> register( @RequestBody TbUser user)throws Exception{
            String status;
            String message;
            String success;
            user.setPw(MD5.tomd5(user.getPw()));
            if(service.regist(user)==1) {
                status="1";
                message="注册成功";
                success="success";
            }else{
                status="0";
                message="注册失败";
                success="failed";
            }
        HashMap<String,Object> map=new HashMap<>();
        map.put("status",status);
        map.put("message",message);
        map.put("success",success);
        return map;
    }



    /**
     *修改密码
     *@param telNum 电话号码
     *@param valQu 问题答案
     *@return java.lang.String
     *@since 2018/8/14 10:46
     */
    @RequestMapping(value="revisePw")
    @ResponseBody
    public String  revisePw(String telNum,String valQu) {
        TbUser user = service.select(telNum);
        if (valQu.equals(user.getValQu())) {
            return "success";
        }else{
            return "error";
        }

    }

    @RequestMapping(value="updatePic")
    @ResponseBody
    public String updatePic(TbUser user,HttpServletRequest request) throws IOException {
        // 如果文件不为空，写入上传路径
        if (!user.getImage().isEmpty()) {
            // 上传文件路径
            String path = request.getServletContext().getRealPath(
                    "/images/");
            // 上传文件名
            String filename = user.getImage().getOriginalFilename();
            File filepath = new File(path, filename);
            // 判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            // 将上传文件保存到一个目标文件当中
            user.getImage().transferTo(new File(path + File.separator + filename));
            user.setPic("/images/"+filename);
            service.updateTbUser(user);
            return "成功success";

        }else {
            return "fail失败";
        }
    }


}
