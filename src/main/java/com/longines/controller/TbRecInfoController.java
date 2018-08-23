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

    private int aid = -1;


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

        return todoList.get(0);
    }

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

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/insertRec",method = RequestMethod.POST)
    public List<TbRecInfo> insert1(@RequestBody TbRecInfo tbRecInfo) {

        recInfoService.insert(tbRecInfo);
        List<TbRecInfo> todoList = list1(tbRecInfo);

        return todoList;

    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/getAid",method = RequestMethod.POST)
    public String add(@RequestBody TbRecInfo tbRecInfo){
        try {
            aid = tbRecInfo.getaId();
            System.out.println("aid = " + aid);
            return "getSuccess";
        } catch (Exception e) {
            return "getFail";
        }
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/sendAid",method = RequestMethod.POST)
    public TbRecInfo send(@RequestBody TbRecInfo tbRecInfo1) {

        if(aid != -1){

            tbRecInfo1.setaId(aid);
            List<TbRecInfo> todoList = list2(tbRecInfo1);

            return todoList.get(0);
        }
        else{


            List<TbRecInfo> todoList = list1(tbRecInfo1);


            if(todoList.size() == 0){

                TbRecInfo bt = new TbRecInfo();

                bt.setuId(tbRecInfo1.getuId());
                bt.setaId(-1);
                return bt;
            }
            else{

                return todoList.get(0);
            }
        }
    }
}