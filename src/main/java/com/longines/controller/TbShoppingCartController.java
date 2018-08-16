package com.longines.controller;

import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartKey;
import com.longines.service.TbShoppingCartService;
import com.longines.vo.TbShoppingCartVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/shopping")
public class TbShoppingCartController {
    @Resource
    public TbShoppingCartService tbShoppingCartService;

    @RequestMapping("TbShoppingCartHomePage")
    public String  homePage()
    {
        System.out.println("homePage();");
        return "TbShoppingCartHomePage";
    }
    /**
     * 根据用户ID和商品ID添加（默认数量为1）
     * @param     tbShoppingCartKey  购物车对象
     * @return    int
     */
    @ResponseBody
    @RequestMapping("Insert")
    public  int tbShoppingCartInsert(@RequestBody TbShoppingCartKey tbShoppingCartKey){
        try {
            tbShoppingCartService.insertShcSelective(tbShoppingCartKey.getuId(), tbShoppingCartKey.getgId());
        }catch (Exception e) {
            return 0;
        }
        return 1;
    }
    @CrossOrigin
    @ResponseBody
    @RequestMapping("Delete")
    public int tbShoppingCartDelete(@RequestBody TbShoppingCartKey tbShoppingCartKey){
        tbShoppingCartService.deleteShcByPK(tbShoppingCartKey.getuId(),tbShoppingCartKey.getgId());
        return 0;
    }

    @ResponseBody
    @RequestMapping("Update")
    public int tbShoppingCartUpdate(@RequestBody TbShoppingCart tbShoppingCart){
        tbShoppingCartService.updateShcBygNum(tbShoppingCart.getuId(),tbShoppingCart.getgId(),tbShoppingCart.getgNum());

        return 0;
    }

    @ResponseBody
    @RequestMapping("Select")
    public List<TbShoppingCart> tbShoppingCartSelect(Integer uid){
        if(uid==null){
            return null;
        }
        else {
            return tbShoppingCartService.selectShcByUid(uid);
        }
    }

    @ResponseBody
    @RequestMapping("SelectVo")
    public TbShoppingCartVo tbShoppingCartSelectVo(Integer uid){
        if(uid==null){
            return null;
        }
        else {
            return tbShoppingCartService.selectEchoInfo(uid);
        }
    }

}
