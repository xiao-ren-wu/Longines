package com.longines.controller;

import com.longines.pojo.TbGoodsInfo;
import com.longines.vo.TbGoodsInfoExt;
import com.longines.service.TbGoodsInfoMapperService;
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
   private  TbGoodsInfoMapperService tbGoodsInfoMapperService;
    @ResponseBody
    @PostMapping("ByPriceAsc")
    public List<TbGoodsInfo> findGoodsByPriceAsc()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceAsc();
        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }

    }
    @ResponseBody
    @PostMapping("ByPriceDesc")
    public List<TbGoodsInfo> findGoodsByPriceDesc()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByPriceDesc();

        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }
    }
    @ResponseBody
    @PostMapping("ByBrand")
    public   List<TbGoodsInfo> findGoodsByTheme( String brand)
    {

        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsByTheme(brand);
        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }
    }
    @ResponseBody
    @PostMapping("BysTimeAsc")
    public  List<TbGoodsInfoExt> findGoodsBysTimeAsc()
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeAsc();
        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }
    }
    @ResponseBody
    @PostMapping("BysTimeDesc")
    public  List<TbGoodsInfoExt> findGoodsBysTimeDesc()
    {
        List<TbGoodsInfoExt> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoBysTimeDesc();

        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }
    }
    @ResponseBody
    @PostMapping("ByLike")
    public  List<TbGoodsInfo> findGoodsByLike( long price)
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsInfoByLike(price);

        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }
    }
    @ResponseBody
    @PostMapping("findAllGoods")
    public  List<TbGoodsInfo> findAllGoods()
    {
        List<TbGoodsInfo> tbGoodsInfoList=tbGoodsInfoMapperService.findAllGoodsInfo();
        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }
    }
    @ResponseBody
    @PostMapping("ById")
    public  TbGoodsInfoExt findAllGoods( @RequestBody TbGoodsInfo goods)
    {

        TbGoodsInfoExt tbGoodsInfoList=tbGoodsInfoMapperService.findGoodsDetailById(goods.getgId());
        if(tbGoodsInfoList==null)
        {
            return null;
        }
        else
        {
            return tbGoodsInfoList;
        }
    }

}