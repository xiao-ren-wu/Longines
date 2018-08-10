package com.longines.controller;

import com.longines.pojo.TbGoodsInfo;
import com.longines.service.TbSearchService;
import com.longines.service.TbThemeService;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
import java.util.ListIterator;

/**
 * @author weiyi
 * @since 2018-08-08 21:33
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/longines",produces = "text/html;charset=UTF-8")
public class TbController {

    public static String decode(String str){
        String[] tmp = str.split(";&#|&#|;");
        StringBuffer sb = new StringBuffer("");
        for (int i=0; i<tmp.length;i++ ){
            if (tmp[i].matches("\\d{5}")){
                sb.append((char)Integer.parseInt(tmp[i]));
            } else {
                sb.append(tmp[i]);
            }
        }
        return sb.toString();
    }

    @Autowired
    private TbSearchService tbSearchService;
    @Autowired
    private TbThemeService tbThemeService;

    @RequestMapping("homePage")
    public String Search(){
        return "homePage";
    }

    @RequestMapping("searchController")
    public String searchController(Model model, String gname){
        String nameGoods=decode(gname);
        List<Word> words=WordSegmenter.segWithStopWords(nameGoods);
        ListIterator listIterator=words.listIterator();
        while (listIterator.hasNext()){
            String watchName=listIterator.next().toString();
            List<TbGoodsInfo> list=tbSearchService.Search(watchName);
            if(list==null||list.size()==0) {
                return "null";
            }else{
                model.addAttribute("list",list);
                return "goodsInfo";
            }

        }
        return null;

    }



    @RequestMapping("backPic")
    public String backPic(Model model, String the_des) {
        String th_des=tbThemeService.SelectThe_Pic(the_des);
        model.addAttribute("theme",th_des);
        return "theme";
    }



    @RequestMapping("backPicToGoods")
    public String backPicToGoods(Model model,String the_des){
        int the_id=tbThemeService.SelectThe_id(the_des);
        List<TbGoodsInfo> list=tbSearchService.selectGoods(the_id);
        model.addAttribute("list",list);
        return "goodsInfo";
    }
}
