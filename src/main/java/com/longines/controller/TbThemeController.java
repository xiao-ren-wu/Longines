package com.longines.controller;

import com.longines.dto.TbSearchThemeDto;
import com.longines.service.TbThemeService;
import com.longines.vo.TbThemeGoodsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author weiyi
 * @since 2018-08-15 20:17
 * @version 1.0
 */


@Controller
@CrossOrigin
@RequestMapping("longInes")
public class TbThemeController {

    @Autowired
    private TbThemeService tbThemeService;

    /**
     * @return java.util.List<com.longInes.vo.TbThemeGoodsInfo>
     * @param
     */
    @ResponseBody
    @PostMapping("themeInfo1")
//    @RequestMapping("themeinfo1")
    public List<TbThemeGoodsInfoVo> themeInfo1() {
        List<TbThemeGoodsInfoVo> list = tbThemeService.SelectThemeGoods(1);
        return list;
    }

    /**
     * @return java.util.List<com.longInes.vo.TbThemeGoodsInfo>
     * @param
     */
    @ResponseBody
    @PostMapping("themeInfo2")
//    @RequestMapping("themeinfo2")
    public List<TbThemeGoodsInfoVo> themeInfo2() {
        List<TbThemeGoodsInfoVo> list = tbThemeService.SelectThemeGoods(2);
        return list;
    }

    /**
     * @return java.util.List<com.longInes.vo.TbThemeGoodsInfo>
     * @param
     */
    @ResponseBody
    @PostMapping("themeInfo3")
//    @RequestMapping("themeinfo3")
    public List<TbThemeGoodsInfoVo> themeInfo3() {
        List<TbThemeGoodsInfoVo> list = tbThemeService.SelectThemeGoods(3);
        return list;
    }

    /**
     * @return java.util.List<com.longInes.vo.TbThemeGoodsInfo>
     * @param tbThemeGoodsInfo 主题id
     */
    @ResponseBody
    @PostMapping("themeInfo4")
//    @RequestMapping("themeinfo4")
    public List<TbThemeGoodsInfoVo> themeInfo4(@RequestBody TbSearchThemeDto tbThemeGoodsInfo) {
        List<TbThemeGoodsInfoVo> list = tbThemeService.SelectThemeGoods(tbThemeGoodsInfo.getTheId());
        return list;
    }

}
