package com.longines.controller;

import com.longines.service.TbPayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/**
 * 支付功能
 *
 *@author   leijing
 *@date   2018/8/8
 */
@Controller
@RequestMapping("/Longines")

public class TbPayController {

    @Resource
    private TbPayService tbPayService;
    /**
     * 返回支付页面所需信息
     *
     *@param   oId 商品Id
     *@param model 用户Id、头像、余额
     *@return   java.lang.String
     */
    @RequestMapping("OrderPay")
    public String OrderPay(Integer oId, Model model){

        tbPayService.insertTbPay(oId);
        Integer in =  tbPayService.finduIdPicacBalance(oId).getuId();
        String st = tbPayService.finduIdPicacBalance(oId).getPic();
        Long lo = tbPayService.findaAmount(oId).getaAmount();

       model.addAttribute("uId",in);
       model.addAttribute("Pic",st);
       model.addAttribute("aAmount",lo);
        return "OrderP";
    }

    /**
     * 判断支付是否成功
     *
     *@param   oId 用户Id
     *@param  pw  用户密码
     *@param model 支付状态0、1
     */
    @RequestMapping("IfSuccess")
    public String success(Integer oId, String pw,Model model) {

        int i = tbPayService.judgePw(oId,pw);
        if (i==1){
            i =tbPayService.updateacBalancesNum(oId);
            if (i==1) {
                model.addAttribute("state",i);
            }
        }
        model.addAttribute("state",i);
        return "Ifsuccess";
    }

        @RequestMapping("OP")
        public String OP(){
            return "OrderP";
        }
        @RequestMapping("IS")
        public String IS(){
            return "Ifsuccess";
        }

}
