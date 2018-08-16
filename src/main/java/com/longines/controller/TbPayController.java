package com.longines.controller;

import com.longines.dto.TbPayDto;
import com.longines.service.TbPayService;
import com.longines.vo.TbPayVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
     * 生成支付订单数据，回显页面所需信息
     *
     *@param   tbPayDto  从页面接收的数据对象
     *@return   com.longines.vo.TbPayVo
     */
    @CrossOrigin
    @ResponseBody
    @PostMapping("OrderPay")
    public TbPayVo orderPay(@RequestBody TbPayDto tbPayDto){

        Integer pId=tbPayService.insertTbPay(tbPayDto.getoId());
        tbPayVo.setState(4);
        tbPayVo.setpId(pId);
        tbPayVo.setuId(tbPayService.findUidPicAcBalance(pId).getuId());
        tbPayVo.setPic(tbPayService.findUidPicAcBalance(pId).getPic());
        tbPayVo.setaAmount(tbPayService.findaAmount(pId).getaAmount());
        return tbPayVo;
    }
    /**
     * 判断支付是否成功
     *
     *@param   tbPayDto 从页面接收的数据对象
     *@return   com.longines.vo.TbPayVo
     */
    @CrossOrigin
    @ResponseBody
    @PostMapping("IfSuccess")
    public TbPayVo success(@RequestBody TbPayDto tbPayDto) {

        int i = tbPayService.judgePw(tbPayDto.getpId(),tbPayDto.getpayCod());
        /**
         * i用来判断密码是否正确
         * 0:密码正确
         * 1:密码不正确
         * 3：未设置密码
         * */
        if (i==0){
            /**
             * i返回的是是否成功更新余额、状态号
             * 0:修改成功
             * 2:余额不足
             * */
            i =tbPayService.updateacBalancesNum(tbPayDto.getpId());
            if (i==0) {
                tbPayVo.setState(i);
                return tbPayVo;
            }else{
                tbPayVo.setState(i);
                return tbPayVo;
            }
        }else {
            tbPayVo.setState(i);
            return tbPayVo;
        }
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("InsertPayCod")
    public TbPayVo insertPw (@RequestBody TbPayDto tbPayDto) {
        int i = tbPayService.insertPayCod(tbPayDto.getpayCod(),tbPayDto.getuId());
        if (i == 1) {
            tbPayVo.setMsg("设置密码成功");
            return tbPayVo;
        } else {
            tbPayVo.setMsg("设置密码失败");
            return tbPayVo;
        }
    }
}
