package com.longines.controller;

import com.longines.pojo.TbCollectionKey;
import com.longines.service.TbCollectionService;
import com.longines.vo.TbCollectionVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author    liuchanghui
 *
 * @since     2018/8/8/008 22:41
 * @version   1.0
 */
@Controller
@RequestMapping("/tbCollection")
public class TbCollectionController {
    @Resource
    private TbCollectionService tbCollectionService;
    @CrossOrigin
    @ResponseBody
    @PostMapping("Add")
    public  int tbCollectionSave(@RequestBody TbCollectionKey tbCollectionKey)
    {
        if (tbCollectionKey.getuId()==null)
        {
            return 2;
        }
        try {
            tbCollectionService.tbCollectionSave(tbCollectionKey.getuId(), tbCollectionKey.getgId());
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("Delete")
    public int tbCollectionDelete(@RequestBody TbCollectionKey tbCollectionKey){
        try {
            tbCollectionService.tbCollectionDelete(tbCollectionKey.getuId(), tbCollectionKey.getgId());
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("Select")
    public  List<TbCollectionVo> tbCollectionSelect(@RequestBody TbCollectionKey tbCollectionKey)
    {
        if(tbCollectionKey.getuId()==null)
        {
            return null;
        }
        return tbCollectionService.tbCollectionSelect(tbCollectionKey.getuId());
    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("Find")
    public boolean tbCollectionFind(@RequestBody TbCollectionKey tbCollectionKey)
    {
        return tbCollectionService.tbCollectionFind(tbCollectionKey);
    }
}
