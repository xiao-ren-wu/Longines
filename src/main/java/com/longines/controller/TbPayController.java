package com.longines.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author leijing
 * @date
 */
@Controller
@RequestMapping("/Longines")
public class TbPayController {
//
//    @Resource
//    private TbPayService tbPayService;
//
//
//    @RequestMapping("OrderPay")
//    public void Order(Integer oId,Integer pId, Model model){
//
//        tbPayService.insertTbPay(oId);
//        Integer in =  tbPayService.finduIdPicacBalance(pId).getuId();
//        String st = tbPayService.finduIdPicacBalance(pId).getPic();
//        Long lo = tbPayService.findaAmount(pId).getaAmount();
//
//       model.addAttribute("OrderPay",in);
//       model.addAttribute("OrderPay",st);
//       model.addAttribute("OrderPay",lo);
//
//    }
//
//
//    @RequestMapping("success")
//    public void passWord(Integer pId, String pw,Model model) {
//        int i = tbPayService.judgePw(pId,pw);
//        if (i==1){
//            i =tbPayService.updateacBalancesNum(pId);
//            if (i==1) {
//                model.addAttribute("success",i);
//            }
//        }
//        model.addAttribute("success",i);
//    }

}
