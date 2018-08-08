package com.longines.controller;

import com.longines.service.TbShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author  liuyang
 * @since  2018/8/7 11:51
 * @version  1.0
 */
@Controller
@RequestMapping("/shoppingcart")
public class TbShoppingCartController {
    @Autowired
    public TbShoppingCartService tbShoppingCartService;
    @RequestMapping("info")
    @ResponseBody
    public List ShoppingCartInfo(){
        System.out.println("------------------");
        System.out.println(tbShoppingCartService.selectShcByUid(1).toString());
        return (List) tbShoppingCartService.selectShcByUid(1);
    }
}
