package com.longines.controller;

import com.longines.pojo.*;
import com.longines.service.impl.TbOrderImpl;
import com.longines.service.impl.TbOrderInfoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
* @author   yangshuai
* @description     订单详情
* @since    2018/8/9 18:11
* @version  1.0
*/
@Controller
@RequestMapping("/orderInfo")
public class TbOrderInfoController {
    @Resource
    private TbOrderInfoImpl tbOrderInfoImpl;
    /**
    * 方法注解      生成订单
    *
    *@param        tbOrderInfo,model,request
    *@return       String
    */
    @ResponseBody
    @RequestMapping("createOrder")
    public String createOrder(TbOrderInfo tbOrderInfo,TbOrder tbOrder,Model model, HttpServletRequest request){
        //取用户id
        TbUser tbUser= (TbUser) request.getAttribute("tbUser");
        tbOrderInfo.setuId(tbUser.getuId());
        //取地址id
        TbRecInfo tbRecInfo= (TbRecInfo) request.getAttribute("tbRecInfo");
        tbOrderInfo.setaId(tbRecInfo.getaId());
        //取商品id和商品数量
        TbGoodsInfo tbGoodsInfo= (TbGoodsInfo) request.getAttribute("tbGoodsInfo");
        tbOrder.setgId(tbGoodsInfo.getgId());
        tbOrder.setgNum((Integer) request.getAttribute("gNum"));
        //调用服务生成订单并返回订单号
        TbOrderImpl tborderImpl=new TbOrderImpl();
        Integer orderId=tborderImpl.insertSelective(tbOrder);
        //取订单id
        tbOrderInfo.setoId(orderId);
        tbOrderInfoImpl.insertSelective(tbOrderInfo);
        //取订单号,创建日期,总金额,运费,状态号,配送方式,商品数量分别传给页面
        model.addAttribute("orderId",orderId);
        model.addAttribute("credate",tbOrderInfo.getCreDate());
        model.addAttribute("getaAmount",tbOrderInfo.getaAmount());
        model.addAttribute("getFreight",tbOrderInfo.getFreight());
        model.addAttribute("getsNum",tbOrderInfo.getsNum());
        model.addAttribute("getdMethod",tbOrderInfo.getdMethod());
        model.addAttribute("getgNum",tbOrder.getgNum());
        return "success";
    }
}
