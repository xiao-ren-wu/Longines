package com.longines.controller;

import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbGoodsInfoMapperService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FengTianHao
 * @since 2018/8/8 21:05
 * @version 1.0
 */
@Controller
@RequestMapping("/TbGoods")
public class TbGoodsInfoMapperController {
    @Resource
   private  TbGoodsInfoMapperService tbGoodsInfoMapperService;
    @RequestMapping("PriceAsc")
    public String findGoodsByPriceAsc(Model model)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceAsc();
        model.addAttribute("tbGoodsInfoList",tbGoodsInfoList);
        return "list";
    }
    @RequestMapping("PriceDesc")
    public String findGoodsByPriceDesc(Model model)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceDesc();
        model.addAttribute("tbGoodsInfoList",tbGoodsInfoList);
        return "list";
    }
    @RequestMapping("theme")
    public String findGoodsByTheme(Model model,String theme)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByTheme(theme);
        model.addAttribute("tbGoodsInfoList",tbGoodsInfoList);
        return "list";
    }
    @RequestMapping("sTimeAsc")
    public String findGoodsBysTimeAsc(Model model)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeAsc();
        model.addAttribute("tbGoodsInfoList",tbGoodsInfoList);
        return "list";
    }
    @RequestMapping("sTimeDesc")
    public String findGoodsBysTimeDesc(Model model)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeDesc();
        model.addAttribute("tbGoodsInfoList",tbGoodsInfoList);
        return "list";
    }
    @RequestMapping("ByLike")
    public String findGoodsByLike(Model model,long price)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoByLike(price);
        model.addAttribute("tbGoodsInfoList",tbGoodsInfoList);
        return "list";
    }
    @RequestMapping("findAllGoods")
    public String findAllGoods(Model model)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findAllGoodsInfo();
        model.addAttribute("tbGoodsInfoList",tbGoodsInfoList);
        return "list";
    }

}