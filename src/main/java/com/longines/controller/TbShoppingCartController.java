package com.longines.controller;

import com.longines.dto.TbShoppingCartDto;
import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartKey;
import com.longines.service.TbShoppingCartService;
import com.longines.vo.TbShoppingCartVo;
import com.longines.vo.TbShoppingSumVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @RequestMapping("HomePage")
    public String  homePage()
    {
        System.out.println("homePage();");
        return "HomePage";
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
    /**
     * 批量删除
     * @param     tbShoppingCartDto  DTO对象
     * @return    int
     */
    @ResponseBody
    @RequestMapping("Delete")
    public int tbShoppingCartDelete(@RequestBody TbShoppingCartDto tbShoppingCartDto){
        int tnum=0;
        List<Integer> gid=tbShoppingCartDto.getgId();
        for(int GID:gid) {
            tbShoppingCartService.deleteShcByPK(tbShoppingCartDto.getuId(), GID);
            TbShoppingCartVo tbShoppingCartVo=new TbShoppingCartVo();
            tbShoppingCartVo.setgId(GID);
            tnum+=tbShoppingCartVo.getgNum();
        }
        return tnum;
    }

    /**
     * 根据数量更新 （并返回总数总价）
     * @param     tbShoppingCart  购物车对象
     * @return    com.longines.vo.TbShoppingSumVo
     */
    @ResponseBody
    @RequestMapping("Update")
    public TbShoppingSumVo tbShoppingCartUpdate(@RequestBody TbShoppingCart tbShoppingCart){
        tbShoppingCartService.updateShcBygNum(tbShoppingCart.getuId(),tbShoppingCart.getgId(),tbShoppingCart.getgNum());

        int gNum=0,Tamount=0;
        TbShoppingSumVo tbShoppingSumVo=new TbShoppingSumVo();
        gNum+=tbShoppingCartService.sumShcgNum(tbShoppingCart.getuId(),tbShoppingCart.getgId());
        Tamount+=tbShoppingCartService.sumShctAmount(tbShoppingCart.getuId(),tbShoppingCart.getgId());

        tbShoppingSumVo.settNum(gNum);
        tbShoppingSumVo.settAmount((long) Tamount);
        return tbShoppingSumVo;


    }

    @ResponseBody
    @RequestMapping(value = "Select",method = RequestMethod.POST)
    public List<TbShoppingCartVo> tbShoppingCartSelect(@RequestBody TbShoppingCartKey tbShoppingCartKey){
        if(tbShoppingCartKey.getuId()==null){
            return null;
        }
        else {
            return tbShoppingCartService.selectEcho(tbShoppingCartKey.getuId());
        }
    }
    @ResponseBody
    @RequestMapping("SelectVo")
    public TbShoppingCartVo tbShoppingCartSelectVo(Integer uid){
        if(uid==null){
            return null;
        }
        else {
            return tbShoppingCartService.selectEchoInfo(uid,9);
        }
    }

    @ResponseBody
    @RequestMapping("Sum")
    public TbShoppingSumVo tbShoppingCartSum(@RequestBody TbShoppingCartDto tbShoppingCartDto){
        int gNum=0,Tamount=0;
        List<Integer> gid=tbShoppingCartDto.getgId();
        TbShoppingSumVo tbShoppingSumVo=new TbShoppingSumVo();
        for(int GID:gid) {
            gNum+=tbShoppingCartService.sumShcgNum(tbShoppingCartDto.getuId(),GID);
            Tamount+=tbShoppingCartService.sumShctAmount(tbShoppingCartDto.getuId(),GID);
        }
        tbShoppingSumVo.settNum(gNum);
        tbShoppingSumVo.settAmount((long) Tamount);
        return tbShoppingSumVo;
    }


}
