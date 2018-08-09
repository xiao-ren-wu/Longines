package com.longines.controller;

import com.longines.pojo.TbUser;


import com.longines.service.TbUserService;
import com.longines.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.util.List;


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

    @RequestMapping("/regist")
    public  String handler0(){
        return "/regist";
    }



    @RequestMapping("/denglu")
    public  String handler10(){
        return "/login";
    }
    /**
     *验证用户登录
     *@param request  http请求
     *@return java.lang.String
     *@since 2018/8/9 22:30
     */
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(HttpServletRequest request){

        String telNum=request.getParameter("telNum");
        String pw=request.getParameter("pw");
        if(telNum!=null&&pw!=null){
            if(service.login(telNum, MD5.tomd5(pw))){
                System.out.println("登录成功");
                return "redirect:/longines/select";

            }else{
                System.out.println("电话号码或密码错误");
                return "login";
            }
        }else{
            System.out.println("请输入电话号码和密码");
            return "login";
        }
    }




    @RequestMapping(value="/select")
        public String  select(Model model,@ModelAttribute TbUser user){

          List<TbUser> li=service.select(user);
            int userId=li.get(0).getuId();
            user=service.select(233);
            model.addAttribute("tbuser",user);
        return "/showuser";
    }



    @RequestMapping(value="reviseLabel")
    public String reviseLabel(Model model,int uId){
        TbUser user=service.select(uId);
        model.addAttribute("tbuser",user);
        return "reviseLabel";
    }
    @RequestMapping(value="update")
    public String  update(TbUser user){
        if(service.updateTbUser1(user)==1) {
            return "redirect:/longines/select";
        }else{
            return "welcome";
        }

    }







    @RequestMapping("/delete")
    public String delete(int userId){
        service.logoff(userId);
        return "/success";
    }

    /**
     *退出登录
     *@return java.lang.String
     *@since 2018/8/9 22:31
     */
    @RequestMapping(value = "/logout")
    public String handler5(){

        return "/logout";
    }

    /**
     *注册用户
     *@param request, user, model  http请求 用户 model
     *@return java.lang.String
     *@since 2018/8/9 22:34
     */
    @RequestMapping(value="/register")
    public String register(HttpServletRequest request,
                           @ModelAttribute TbUser user,
                           Model model)throws Exception{

        // 如果文件不为空，写入上传路径
        if(!user.getImage().isEmpty()){
            // 上传文件路径
            String path = request.getServletContext().getRealPath("/image");
            // 上传文件名
            String filename = user.getImage().getOriginalFilename();
            File filepath = new File(path,filename);
            // 判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            // 将上传文件保存到一个目标文件当中
            user.getImage().transferTo(new File(path+File.separator+ filename));
            user.setPic(path);
            String pw=MD5.tomd5(request.getParameter("pw"));
            user.setPw(pw);
            // 将用户添加到model
            model.addAttribute("user", user);
           if(service.regist(user)==1){
               System.out.println("注册成功");
           }else{
               System.out.println("注册失败");
           }
            return "login";
        }else{
            return "error";
        }
    }



}
