package com.longines.controller;

import com.longines.pojo.TbGoodsInfo;
import com.longines.vo.TbGoodsInfoExt;
import com.longines.service.TbGoodsInfoMapperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public @ResponseBody List<TbGoodsInfo> findGoodsByPriceAsc()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceAsc();

        return tbGoodsInfoList;
    }
    @RequestMapping("PriceDesc")
    public @ResponseBody List<TbGoodsInfo> findGoodsByPriceDesc()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceDesc();

        return tbGoodsInfoList;
    }
    @RequestMapping("theme")
    public @ResponseBody  List<TbGoodsInfo> findGoodsByTheme(@RequestBody String theme)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByTheme(theme);

        return tbGoodsInfoList;
    }
    @RequestMapping("sTimeAsc")
    public @ResponseBody List<TbGoodsInfoExt> findGoodsBysTimeAsc()
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeAsc();
        return tbGoodsInfoList;
    }
    @RequestMapping("sTimeDesc")
    public @ResponseBody List<TbGoodsInfoExt> findGoodsBysTimeDesc()
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeDesc();

        return tbGoodsInfoList;
    }
    @RequestMapping("ByLike")
    public @ResponseBody List<TbGoodsInfo> findGoodsByLike(@RequestBody long price)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoByLike(price);

        return tbGoodsInfoList;
    }
    @RequestMapping("findAllGoods")
    public @ResponseBody List<TbGoodsInfo> findAllGoods()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findAllGoodsInfo();
        return tbGoodsInfoList;
    }

}