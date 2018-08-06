package com.longines.controller;

import com.longines.pojo.TbCollection;
import com.longines.pojo.TbCollectionKey;
import com.longines.service.TbcollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/*
 * @author liuchanghui
 * @Title: TbCollectionController
 * @ProjectName Longines
 * @Description: TODO
 * @date 2018/8/6/006  9:29
 */

@Controller
@RequestMapping("/longines")
public class TbCollectionController {
    @Resource
    private TbcollectionService tbcollectionService;

  @RequestMapping("tbCollectionsave")
    public  String tbCollectionsave(Integer uId,Integer gId,Model model)
    {
        tbcollectionService.tbCollectionsave(uId,gId);
        model.addAttribute("uId",uId);
        return "redirect:tbCollectionWeb";
    }

    @RequestMapping("tbCollectiondelete")
    public String tbCollectiondelete(Integer uId,Integer gId,Model model){
        tbcollectionService.tbCollectiondelete(uId,gId);
        model.addAttribute("uId",uId);
        return "redirect:tbCollectionWeb";
    }

    @RequestMapping("tbCollection")
    public String   tbcCollection()
    {
        return "tbCollection";
    }

    @RequestMapping("tbCollectionWeb")
    public String tbCollectionSelect(@ModelAttribute("uId") Integer uId, Model model)
    {
        List<TbCollection> tbCollectionList = tbcollectionService.tbCollectionSelect(uId);
        model.addAttribute("tbCollectionList",tbCollectionList);
        return "tbCollectionWeb";
    }


}
