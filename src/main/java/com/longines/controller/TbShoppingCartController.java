package com.longines.controller;

import com.longines.dto.TbShoppingCartDto;
import com.longines.pojo.TbShoppingCart;
import com.longines.pojo.TbShoppingCartKey;
import com.longines.service.TbShoppingCartService;
import com.longines.vo.TbShoppingCartVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        List<Integer> gid=tbShoppingCartDto.getgId();
        for(int GID:gid) {
            tbShoppingCartService.deleteShcByPK(tbShoppingCartDto.getuId(), GID);
        }
        return 0;
    }

    @ResponseBody
    @RequestMapping("Update")
    public int tbShoppingCartUpdate(@RequestBody TbShoppingCart tbShoppingCart){
        tbShoppingCartService.updateShcBygNum(tbShoppingCart.getuId(),tbShoppingCart.getgId(),tbShoppingCart.getgNum());
        return 1;
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
            return tbShoppingCartService.selectEchoInfo(6,9);
        }
    }

}
