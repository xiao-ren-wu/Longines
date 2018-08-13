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
     * @param request http请求
     * @return java.lang.String
     * @since 2018/8/9 22:30
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(HttpServletRequest request, HttpSession session) {

        String telNum = request.getParameter("telNum");
        String pw = request.getParameter("pw");
        TbUser user = service.login(telNum, pw);
        if (telNum != null && pw != null) {
            if (user != null) {
                session.setAttribute("uId", user.getuId());
                session.setAttribute("tbuser", user);
                return "登陆成功";
            } else {
                return "密码或电话错误";
            }
        } else {
            return "请输入密码和电话";
        }
    }


    @RequestMapping(value = "/select")
    @ResponseBody
    public TbUser select(@RequestBody int uId) {
        TbUser user = service.select(uId);
        return user;
    }


    @RequestMapping(value = "revise")
    @ResponseBody
    public TbUser revise(@RequestBody int uId) {
        return service.select(uId);
    }


    @RequestMapping(value = "update")
    public String update(TbUser user) {
        if (service.updateTbUser(user) == 1) {
            return "更改成功";
        } else {
            return "更改失败";
        }
    }


    @RequestMapping("/delete")
    public int delete(int userId) {
        return service.logoff(userId);
    }

    /**
     * 注册用户
     *
     * @param request http请求
     * @param user    用户
     * @return java.lang.String
     * @since 2018/8/9 22:34
     */
    @RequestMapping(value = "/register")
    @ResponseBody
    public int register(HttpServletRequest request, @RequestBody TbUser user) throws Exception {

        // 如果文件不为空，写入上传路径
        if (!user.getImage().isEmpty()) {
            // 上传文件路径
            String path = request.getServletContext().getRealPath("/image");
            // 上传文件名
            String filename = user.getImage().getOriginalFilename();
            File filepath = new File(path, filename);
            // 判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            // 将上传文件保存到一个目标文件当中
            user.getImage().transferTo(new File(path + File.separator + filename));
            user.setPic(path);
            String pw = MD5.tomd5(request.getParameter("pw"));
            user.setPw(pw);
            System.out.println(user);

            service.regist(user);
            return 1;
        } else {
            return 0;
        }
    }

    @RequestMapping()
    public int updatePayment(int uId, Integer payCod) {

        TbUser user = service.select(uId);
        if (user.getPayCod() == null) {
            user.setPayCod(payCod);
            service.updateTbUser(user);
        }
        if (user.getPayCod().equals(payCod)){
            return 1;
        }else{
            return 0;
        }
    }
}
