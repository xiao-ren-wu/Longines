package com.longines.controller;

import com.longines.pojo.TbRecInfo;
import com.longines.pojo.TbRecInfoExample;
import com.longines.pojo.TbRecInfoKey;
import com.longines.service.TbRecInfoService;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

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

   @CrossOrigin
   @ResponseBody
   @RequestMapping(value = "/recSelect",method = RequestMethod.POST)
   public List<TbRecInfo> list1(@RequestBody TbRecInfo tbRecInfo) {
        TbRecInfoExample ex = new TbRecInfoExample();
        ex.setDistinct(true);
        TbRecInfoExample.Criteria cri = ex.createCriteria();
        cri.andUIdEqualTo(tbRecInfo.getuId());

        List<TbRecInfo> todoList = recInfoService.selectByExample(ex);

        return todoList;
    }

   @CrossOrigin
   @ResponseBody
   @RequestMapping(value = "/recSelect1",method = RequestMethod.POST)
   public List<TbRecInfo> list2(@RequestBody TbRecInfo tbRecInfo) {
        TbRecInfoExample ex = new TbRecInfoExample();
        ex.setDistinct(true);
        TbRecInfoExample.Criteria cri = ex.createCriteria();
        cri.andAIdEqualTo(tbRecInfo.getaId());

        List<TbRecInfo> todoList = recInfoService.selectByExample(ex);


        return todoList;
   }

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/editRec",method = RequestMethod.POST)
    public TbRecInfo edit(@RequestBody TbRecInfo tbRecInfo) {
        List<TbRecInfo> todoList = list2(tbRecInfo);

        return tbRecInfo;
    }

    //@RequestParam(value = "dis1", required = true) String dis,@RequestParam(value = "city1", required = true) String city ,@RequestParam(value = "pro1", required = true) String pro, @RequestParam(value = "con1", required = true) String con, @RequestParam(value = "add1", required = true) String add, @RequestParam(value = "tel1", required = true) String tel, @RequestParam(value = "aid1", required = true) Integer aid, @RequestParam(value = "uid1", required = true) Integer uid
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/recEdit",method = RequestMethod.POST)
    public String edit1(@RequestBody TbRecInfo tbRecInfo) {

        int flag = recInfoService.updateByPrimaryKeySelective(tbRecInfo);

        if(flag == 1){
            return "successEdit";
        }else{
            return "failEdit";
        }
    }

    //@RequestParam(value = "uid1", required = true) Integer uid,@RequestParam(value = "aid1", required = true) Integer aid

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/deleteByID",method = RequestMethod.POST)
    public  String deleteByID(@RequestBody TbRecInfoKey tbRecInfoKey) {

        int flag = recInfoService.deleteByPrimaryKey(tbRecInfoKey);

        if(flag == 1){
            return "delSuccess";
        }else{
            return "delFail";
        }
    }

   //@RequestParam(value = "dis1", required = true) String dis,@RequestParam(value = "city1", required = true) String city ,@RequestParam(value = "pro1", required = true) String pro,@RequestParam(value = "con1", required = true) String con, @RequestParam(value = "add1", required = true) String add, @RequestParam(value = "tel1", required = true) String tel,@RequestParam(value = "uid1", required = true) Integer uid
    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/insertRec",method = RequestMethod.POST)
    public String insert1(@RequestBody TbRecInfo tbRecInfo) {

        int flag = recInfoService.insert(tbRecInfo);

        if(flag == 1){
            return "insertSuccess";
        }else{
            return "insertFail";
        }
    }
}