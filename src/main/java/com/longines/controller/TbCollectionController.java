package com.longines.controller;

import com.longines.dto.TbCollectionDto;
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
    public  int tbCollectionSave(@RequestBody TbCollectionDto tbCollectionDto)
    {
        try {
            tbCollectionService.tbCollectionSave(tbCollectionDto.getuId(), tbCollectionDto.getgId());
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("Delete")
    public int tbCollectionDelete(@RequestBody TbCollectionDto tbCollectionDto){
        try {
            tbCollectionService.tbCollectionDelete(tbCollectionDto.getuId(),tbCollectionDto.getgId());
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }
    @CrossOrigin
    @ResponseBody
    @PostMapping("Select")
    public  List<TbCollectionVo> tbCollectionSelect(@RequestBody TbCollectionDto tbCollectionDto)
    {
        if(tbCollectionDto.getuId()==null)
        {
            return null;
        }
        return tbCollectionService.tbCollectionSelect(tbCollectionDto.getuId());
    }
}
