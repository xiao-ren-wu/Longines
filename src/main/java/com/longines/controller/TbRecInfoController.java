package com.longines.controller;

import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import com.longines.service.TbRecInfoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyichao
 * @date 2018/8/9
 * @description hjj
 */

@Controller
@RequestMapping("/rec")
public class TbRecInfoController {

    @Resource
    private TbRecInfoService recInfoService;

    @RequestMapping(value = "recSelect",method = RequestMethod.GET)
    public String list1(Model model, @RequestParam(value = "uid1", required = true) Integer uid) {
        TbRecInfoExample ex = new TbRecInfoExample();
        ex.setDistinct(true);
        TbRecInfoExample.Criteria cri = ex.createCriteria();
        cri.andUIdEqualTo(uid);
        List<TbRecInfo> todoList = recInfoService.selectByExample(ex);

        model.addAttribute("recListed", todoList);

        return "successSelect";
    }

    @RequestMapping(value = "recSelect1",method = RequestMethod.GET)
    public String list2(Model model, @RequestParam(value = "aid1", required = true) Integer aid) {
        TbRecInfoExample ex = new TbRecInfoExample();
        ex.setDistinct(true);
        TbRecInfoExample.Criteria cri = ex.createCriteria();
        cri.andAIdEqualTo(aid);
        List<TbRecInfo> todoList = recInfoService.selectByExample(ex);

        model.addAttribute("recListed", todoList);

        return "successSelect";
    }

    @RequestMapping(value = "recEdit",method = RequestMethod.GET)
    public String edit(Model model, @RequestParam(value = "aid1", required = true) Integer aid, @RequestParam(value = "uid1", required = true) Integer uid) {

        TbRecInfo tbRecInfo = new TbRecInfo();
        tbRecInfo.setaId(aid);
        tbRecInfo.setuId(uid);

        //页面回显
        model.addAttribute("recode", tbRecInfo);

        return "editRec";
    }

    @RequestMapping(value = "editRec1",method = RequestMethod.POST)
    public String edit1(Model model, @RequestParam(value = "con1", required = true) String con, @RequestParam(value = "add1", required = true) String add, @RequestParam(value = "tel1", required = true) String tel, @RequestParam(value = "aid1", required = true) Integer aid, @RequestParam(value = "uid1", required = true) Integer uid) {
        TbRecInfo tbRecInfo = new TbRecInfo();
        tbRecInfo.setConsignee(con);
        tbRecInfo.setsAdd(add);
        tbRecInfo.setcTel(tel);
        tbRecInfo.setuId(uid);
        tbRecInfo.setaId(aid);
        recInfoService.updateByPrimaryKeySelective(tbRecInfo);

        model.addAttribute("recode", tbRecInfo);

        return "rec";
    }

    @RequestMapping(value = "deleteByID",method = RequestMethod.GET)
    public String deleteByID(@RequestParam(value = "uid1", required = true) Integer uid,@RequestParam(value = "aid1", required = true) Integer aid)
    {
        TbRecInfoKey tbRecInfoKey = new TbRecInfoKey();
        tbRecInfoKey.setuId(uid);
        tbRecInfoKey.setaId(aid);

        recInfoService.deleteByPrimaryKey(tbRecInfoKey);

        return "rec";
    }

    @RequestMapping(value = "recInsert1",method = RequestMethod.GET)
    public String insert0(Model model,@RequestParam(value = "uid1", required = true) Integer uid) {
        TbRecInfo tbRecInfo = new TbRecInfo();
        tbRecInfo.setuId(uid);

        //页面回显
        model.addAttribute("recode", tbRecInfo);

        return "insertRec";
    }

    @RequestMapping(value = "insertRec",method = RequestMethod.POST)
    public String insert1(Model model, @RequestParam(value = "con1", required = true) String con, @RequestParam(value = "add1", required = true) String add, @RequestParam(value = "tel1", required = true) String tel,@RequestParam(value = "uid1", required = true) Integer uid) {
        TbRecInfo tbRecInfo = new TbRecInfo();
        tbRecInfo.setuId(uid);
        tbRecInfo.setConsignee(con);
        tbRecInfo.setcTel(tel);
        tbRecInfo.setsAdd(add);
        tbRecInfo.setPostcode("00");
        recInfoService.insert(tbRecInfo);

        model.addAttribute("recode", tbRecInfo);

        return "rec";
    }
}