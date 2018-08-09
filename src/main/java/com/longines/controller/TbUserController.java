package com.longines.controller;

import com.longines.pojo.TbUser;

import com.longines.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



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

    @RequestMapping(value="/login")
    public String login(HttpServletRequest request){
        String telNum=request.getParameter("telNum");
        String pw=request.getParameter("pw");
       if(telNum!=null&&pw!=null){
           if(service.login(telNum,pw)) {
               return "redirect:success";
           }
           else {
               return "/login";
           }
       }else{
           return "/login";
        }
    }



    @RequestMapping(value="/select")
        public String  select(Model model,@ModelAttribute TbUser user){
            List<TbUser> li=service.select(user);
            int userId=li.get(0).getuId();
            user=service.select(userId);
            model.addAttribute("tbuser",user);
        return "/showuser";
    }



    @RequestMapping(value="/revise")
    public String handler4(HttpServletRequest request,TbUser user){
        int uId= Integer.parseInt(request.getParameter("uId"));
        String uname=request.getParameter("uname");
        String sex=request.getParameter("sex");
        String label=request.getParameter("label");
        String pw=request.getParameter("pw");
        String pic=request.getParameter("pic");
        String telNum=request.getParameter("telNum");
        service.revise(uId,uname,sex,label,pw,pic,telNum);

        return "/success";

    }









    @RequestMapping("/delete")
    public String delete(int userId){
        service.logoff(userId);
        return "/success";
    }


    @RequestMapping(value = "/logout")
    public String handler5(){
        return "/logout";
    }


    @RequestMapping(value="/register")
    public String register(HttpServletRequest request,
                           @ModelAttribute TbUser user,
                           Model model)throws Exception{
        System.out.println(user.getUname());
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
