package com.longines.controller;

import com.longines.service.TbPayService;
import com.longines.vo.TbPayVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    TbPayVo  tbPayVo = new TbPayVo();
    @Resource
    private TbPayService tbPayService;

    /**
     * 添加支付订单数据，给页面返回数据
     *
     *@param   oId  订单Id
     *@return   com.longines.vo.TbPayVo
     */
    @ResponseBody
    @PostMapping("OrderPay")
    public TbPayVo orderPay(Integer oId){

        Integer pId=tbPayService.insertTbPay(oId);
        tbPayVo.setpId(pId);
        tbPayVo.setuId(tbPayService.findUidPicAcBalance(pId).getuId());
        tbPayVo.setPic(tbPayService.findUidPicAcBalance(pId).getPic());
        tbPayVo.setaAmount(tbPayService.findaAmount(pId).getaAmount());
        return tbPayVo;
    }

    /**
     * 判断是否支付成功
     *
     *@param   pId 支付Id
     *@param  pw  支付密码
     *@return   com.longines.vo.TbPayVo
     */
    @ResponseBody
    @PostMapping("IfSuccess")
    public TbPayVo success(Integer pId, Integer pw) {


        int i = tbPayService.judgePw(pId,pw);
        /**
         * i用来判断密码是否正确
         * */
        if (i==1){
            /**
             * i返回的是是否成功更新余额、状态号
             * */
            i =tbPayService.updateacBalancesNum(pId);
            if (i==1) {
                tbPayVo.setstate(i);
                return tbPayVo;
            }
        }
        tbPayVo.setstate(i);
        return tbPayVo;

    }

}
