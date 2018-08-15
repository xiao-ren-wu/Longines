package com.longines.controller;

import com.longines.pojo.TbShoppingCart;
import com.longines.service.TbShoppingCartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author  liuyang
 * @since  2018/8/7 11:51
 * @version  1.0
 */
@Controller
@RequestMapping("/TbShoppingCart")
public class TbShoppingCartController {
    @Resource
    public TbShoppingCartService tbShoppingCartService;

    @RequestMapping("TbShoppingCartHomePage")
    public String  homePage()
    {
        System.out.println("homePage();");
        return "TbShoppingCartHomePage";
    }

    @ResponseBody
    @RequestMapping("Insert")
    public  int tbShoppingCartInsert(TbShoppingCart tbShoppingCart){
        try {
            tbShoppingCartService.insertShcSelective(tbShoppingCart.getuId(), tbShoppingCart.getgId(),
                    tbShoppingCart.getgNum(), tbShoppingCart.gettAmount());
        }catch (Exception e) {
            return 0;
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping("Delete")
    public int tbShoppingCartDelete(TbShoppingCart tbShoppingCart){
        tbShoppingCartService.deleteShcByPK(tbShoppingCart.getuId(),tbShoppingCart.getgId());
        return 0;
    }

    @RequestMapping("Update")
    public int tbShoppingCartUpdate(TbShoppingCart tbShoppingCart){
        List<TbShoppingCart> tbShoppingCartList=tbShoppingCartService.selectShcByUid(1);
        return 0;
    }

    @ResponseBody
    @RequestMapping("Select")
    public List<TbShoppingCart> tbShoppingCartSelect(int uid){
        return tbShoppingCartService.selectShcByUid(uid);
    }

}
