package com.longines.controller;

import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbGoodsInfoMapperService;
import com.longines.vo.TbGoodsInfoExt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FengTianHao
 * @since 2018/8/8 21:05
 * @version 1.0
 */
@CrossOrigin
@Controller
@RequestMapping("/TbGoods")
public class TbGoodsInfoMapperController {
    @Resource
   private TbGoodsInfoMapperService tbGoodsInfoMapperService;
    @ResponseBody
    @PostMapping("ByPriceAsc")
    public List<TbGoodsInfo> findGoodsByPriceAsc()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceAsc();

            return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ByPriceDesc")
    public List<TbGoodsInfo> findGoodsByPriceDesc()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceDesc();


            return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ByBrand")
    public   List<TbGoodsInfo> findGoodsByTheme(@RequestBody TbGoodsInfo goods)
    {

        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByTheme(goods.getBrand());


            return tbGoodsInfoList;
    }
    @ResponseBody
    @PostMapping("BysTimeAsc")
    public  List<TbGoodsInfoExt> findGoodsBysTimeAsc()
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeAsc();

            return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("BysTimeDesc")
    public  List<TbGoodsInfoExt> findGoodsBysTimeDesc()
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeDesc();


            return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ByLike")
    public  List<TbGoodsInfo> findGoodsByLike(@RequestBody TbGoodsInfo goods)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoByLike(goods.getPrice());


            return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("findAllGoods")
    public  List<TbGoodsInfo> findAllGoods()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findAllGoodsInfo();

            return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ById")
    public TbGoodsInfoExt findAllGoods(@RequestBody TbGoodsInfo goods)
    {

        TbGoodsInfoExt tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsDetailById(goods.getgId());

            return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ByBrandPriceAsc")
    public List<TbGoodsInfo> findBrandGoodsByPriceAsc(@RequestBody TbGoodsInfo goods )
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findBrandGoodsByPriceAsc(goods.getBrand());

        return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ByBrandPriceDesc")
    public List<TbGoodsInfo> findBrandGoodsByPriceDesc(@RequestBody TbGoodsInfo goods)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findBrandGoodsByPriceDesc(goods.getBrand());

        return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ByBrandsTimeAsc")
    public  List<TbGoodsInfoExt> findGoodsByBrandsTimeAsc(@RequestBody TbGoodsInfo goods)
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findBrandGoodsInfoBysTimeAsc(goods.getBrand());

        return tbGoodsInfoList;

    }
    @ResponseBody
    @PostMapping("ByBrandsTimeDesc")
    public  List<TbGoodsInfoExt> findGoodsByBrandsTimeDesc(@RequestBody TbGoodsInfo goods)
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findBrandGoodsInfoBysTimeDesc(goods.getBrand());

        return tbGoodsInfoList;

    }

}