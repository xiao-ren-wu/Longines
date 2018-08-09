package com.longines.controller;

import com.longines.pojo.TbCollection;
import com.longines.service.TbCollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author    liuchanghui
 *
 * @since     2018/8/8/008 22:41
 * @version   1.0
 */
@Controller
@RequestMapping("/longines")
public class TbCollectionController {
    @Resource
    private TbCollectionService tbCollectionService;

  @RequestMapping("tbCollectionSave")
    public  String tbCollectionSave(Integer uId,Integer gId,Model model)
    {
        tbCollectionService.tbCollectionSave(uId,gId);
        model.addAttribute("uId",uId);
        return "redirect:tbCollectionWeb";
    }
    
    @RequestMapping("tbCollectionDelete")
    public String tbCollectionSelect(Integer uId,Integer gId,Model model){

        tbCollectionService.tbCollectionDelete(uId,gId);
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
        List<TbCollection> tbCollectionList = tbCollectionService.tbCollectionSelect(uId);
        List<String> tbCollectionPic = tbCollectionService.tbCollectionSelectPic(uId);
        model.addAttribute("tbCollectionList",tbCollectionList);
        model.addAttribute("tbCollectionPic",tbCollectionPic);
        return "tbCollectionWeb";
    }


}
