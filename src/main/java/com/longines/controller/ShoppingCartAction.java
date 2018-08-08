package com.longines.controller;

import com.longines.service.TbShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: liuyang
 * @Description:
 * @CreateDate: 2018/8/6$ 16:36$
 * @Version: 1.0
 */
@Controller("ShcActionId")
public class ShoppingCartAction {
    @Autowired
    private TbShoppingCartService tbShoppingCartService;
    public void add(){
        //tbShoppingCartService.selectByUid(1);
        System.out.println("Action:add()");
    }
}
