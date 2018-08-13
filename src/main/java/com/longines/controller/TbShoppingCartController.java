package com.longines.controller;

import com.longines.pojo.TbShoppingCart;
import com.longines.service.TbShoppingCartService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  liuyang
 * @since  2018/8/7 11:51
 * @version  1.0
 */
@Controller
@RequestMapping("/longines")
public class TbShoppingCartController {
    @Resource
    public TbShoppingCartService tbShoppingCartService;

    @RequestMapping("TbShoppingCartHomePage")
    public String  homePage()
    {
        System.out.println("homePage();");
        return "TbShoppingCartHomePage";
    }

    @RequestMapping("receiveInt")
    public String  receiveInt(int uId)
    {
        System.out.println(uId);
        return "success";
    }

    @RequestMapping("receiveArray")
    public String  receiveInt(Integer[] ids)
    {
        System.out.println(ids);
        return "success";
    }

    @RequestMapping("receiveShoppingCart")
    public String  receiveShoppingCart(TbShoppingCart tbShoppingCart)
    {
        System.out.println(tbShoppingCart);
        return "success";
    }

    @RequestMapping("list")
    public String list(Model model){
        //model	相当于application域对象

        List<TbShoppingCart> ShcList = new ArrayList<TbShoppingCart>();

        TbShoppingCart shc1 = new TbShoppingCart();
        shc1.setuId(1);
        shc1.setgId(2);
        shc1.setgNum(10);
        shc1.settAmount((long) 100);
        shc1.setStatus(1);

        TbShoppingCart shc2 = new TbShoppingCart();
        shc2.setuId(3);
        shc2.setgId(4);
        shc2.setgNum(15);
        shc2.settAmount((long) 200);
        shc2.setStatus(1);

        ShcList.add(shc1);
        ShcList.add(shc2);

        model.addAttribute("ShcList", ShcList);

        return "list";

    }

    @RequestMapping("redirect")
    public String redirect(){
        return "redirect:list";
    }

    @RequestMapping("tbShoppingCartInsert")
    public @ResponseBody TbShoppingCart tbShoppingCartInsert(@RequestBody TbShoppingCart tbShoppingCart){
        tbShoppingCartService.insertShcSelective(tbShoppingCart.getuId(),tbShoppingCart.getgId(),
                                                tbShoppingCart.getgNum(),tbShoppingCart.gettAmount(),1);
        System.out.println(tbShoppingCart);
        return  tbShoppingCart;
    }
    @RequestMapping("tbShoppingCartDelete")
    public @ResponseBody int tbShoppingCartDelete(TbShoppingCart tbShoppingCart){
        tbShoppingCartService.deleteShcByPK(tbShoppingCart.getuId(),tbShoppingCart.getgId());
        return 0;
    }

    @RequestMapping("tbShoppingCartSelect")
    public String tbShoppingCartSelect(Integer uId,Model model){
        tbShoppingCartService.selectShcByUid(uId);
        return "redirect:ShoppingCart";
    }

    @RequestMapping("List")
    public String List(Model model){
        List<TbShoppingCart> tbShoppingCartList=tbShoppingCartService.selectShcByUid(1);
        model.addAttribute("List",tbShoppingCartList);
        return "ShoppingCart";
    }
}
