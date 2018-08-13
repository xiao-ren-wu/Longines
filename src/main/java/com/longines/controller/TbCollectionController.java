package com.longines.controller;

import com.longines.dto.TbCollectionDto;
import com.longines.service.TbCollectionService;
import com.longines.vo.TbCollectionVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("Add")
    public  void tbCollectionSave(TbCollectionDto tbCollectionDto )
    {
        tbCollectionService.tbCollectionSave(tbCollectionDto.getuId(),tbCollectionDto.getgId());
    }
    @RequestMapping("Delete")
    public void tbCollectionDelete(TbCollectionDto tbCollectionDto){
        tbCollectionService.tbCollectionDelete(tbCollectionDto.getuId(),tbCollectionDto.getgId());
    }

    @ResponseBody
    @RequestMapping("Select")
    public  List<TbCollectionVo> tbCollectionSelect(Integer uId)
    {
        return tbCollectionService.tbCollectionSelect(uId);
    }
}
