package com.longines.controller;


import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/TbGoodsInfo")
public class TbSearchController {

    @Autowired
    private TbSearchService tbSearchService;

    @RequestMapping("SearchController")
    public String SearchController(Model model,String gname){
        List<TbGoodsInfo> list=tbSearchService.Search(gname);
        model.addAttribute("list",list);
        return "goodsinfo";
    }
}
