package com.longines.controller;

import com.longines.dto.Create;
import com.longines.dto.Ensure;
import com.longines.dto.HAHA;
import com.longines.dto.SNumList;
import com.longines.pojo.*;
import com.longines.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
* @author   yangshuai
* @description     订单的生成与查询
* @since    2018/8/9 18:11
* @version  1.0
*/
@Controller
@CrossOrigin
@RequestMapping("/Orders")
public class TbOrderInfoController {
    @Resource
    private TbOrderInfoService tbOrderInfoService;
    @Resource
    private TbOrderService tbOrderService;
    @Resource
    private TbMgAssociatedService tbMgAssociatedService;
   @Resource
   private TbGoodsInfoService tbGoodsInfoService;
    @Resource
    private TbMerceService tbMerceService;
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "ensure",method = RequestMethod.POST)
    public TbOrderInfo createOrder(Ensure ensure){
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        //取用户ID
        tbOrderInfo.setuId(ensure.getuId());
        //取地址id
        tbOrderInfo.setaId(1);
        //取商品id和商品数量
        TbOrder tbOrder=new TbOrder();
        int orderId=(int) System.currentTimeMillis();
        for (int i=0;i<(ensure.getgId().size());i++)
        {
            tbOrder.setoId(orderId);
            tbOrder.setgId(ensure.getgId().get(i));
            tbOrder.setgNum(ensure.getgNum().get(i));
            //调用服务生成订单并返回订单号
            tbOrderService.insertSelective(tbOrder);
        }
        //取订单id
        tbOrderInfo.setoId(orderId);
        tbOrderInfoService.insertSelective(tbOrderInfo);
        int v=tbMgAssociatedService.updateBygId(orderId,ensure.getmId());
        if (v==0){
            return null;
        }else{
        return tbOrderInfo;
        }
    }
   @ResponseBody
   @CrossOrigin
   @RequestMapping(value = "goods",method = RequestMethod.POST)
   public List<TbGoodsInfo> goods(@RequestBody List<Integer> gId)
   {
       return tbGoodsInfoService.selectBygId(gId);
   }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "merce",method = RequestMethod.POST)
    public List<TbMerce> merce(@RequestBody List<Integer> gId)
    {
        List<Integer> list1=tbMgAssociatedService.selectBygId(gId);
        List<TbMerce> list2=tbMerceService.selectBymId(list1);
        return list2;
    }
    /**
     * 方法注解      生成订单
     *
     *@param         ensure
     *@return         Create
     */
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "Create",method = RequestMethod.POST)
    public Create sNumList(@RequestBody  Ensure ensure)
    {
        List<TbGoodsInfo> tbGoodsInfo=this.goods(ensure.getgId());
        List<TbMerce> tbMerces=this.merce(ensure.getgId());
        TbOrderInfo tbOrderInfo=this.createOrder(ensure);
        Create create=new Create();
        List<HAHA> haha=new ArrayList<>();
        for (int i=0;i<tbMerces.size();i++)
        {
            HAHA haha1=new HAHA();
            haha1.setSname(tbMerces.get(i).getSname());
            haha1.setmPic(tbMerces.get(i).getmPic());
            haha1.setGname(tbGoodsInfo.get(i).getGname());
            haha1.setPrice(tbGoodsInfo.get(i).getPrice());
            haha1.setgPic(tbGoodsInfo.get(i).getgPic());
            haha1.setwBut(tbGoodsInfo.get(i).getwBut());
            haha.add(haha1);
        }
        create.setHaha(haha);
        create.setCreDate(tbOrderInfo.getCreDate());
        create.setdMethod(tbOrderInfo.getdMethod());
        create.setFreight(tbOrderInfo.getFreight());
        create.setaAmount(tbOrderInfo.getaAmount());
        create.setoId(tbOrderInfo.getoId());
        return create;
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "allGoodsList",method = RequestMethod.POST)
    public List<TbGoodsInfo> allGoodsList(@RequestBody Integer uId)
    {
         List<Integer> list1=tbOrderInfoService.selectByuid(uId);
         List<Integer> list2=tbOrderService.selectByoid(list1);
         List<TbGoodsInfo> list3=tbGoodsInfoService.selectBygId(list2);
         return list3;
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "List",method = RequestMethod.POST)
    public List<SNumList> List(@RequestBody  TbOrderInfo tbOrderInfo)
    {
        List<TbGoodsInfo> tbGoodsInfo=this.allGoodsList(tbOrderInfo.getuId());
        List<Integer> listgId=new ArrayList<>();
        for (int i=0;i<tbGoodsInfo.size();i++)
        {
            listgId.add(tbGoodsInfo.get(i).getgId());
        }
        List<TbMerce> merces=this.merce(listgId);
        List<SNumList> list=new ArrayList<SNumList>();
        for (int i=0;i<tbGoodsInfo.size();i++)
        {
            SNumList sNumList=new SNumList();
            sNumList.setSname(merces.get(i).getSname());
            sNumList.setmPic(merces.get(i).getmPic());
            sNumList.setGname(tbGoodsInfo.get(i).getGname());
            sNumList.setPrice(tbGoodsInfo.get(i).getPrice());
            sNumList.setgPic(tbGoodsInfo.get(i).getgPic());
            list.add(sNumList);
        }
        return list;
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "snumGoodsList",method = RequestMethod.POST)
    public List<TbGoodsInfo> snumGoodsList(@RequestBody Integer uId,@RequestBody Integer sNum)
    {
        TbOrderInfo tbOrderInfo=new TbOrderInfo();
        tbOrderInfo.setuId(uId);
        tbOrderInfo.setsNum(sNum);
        List<Integer> list1=tbOrderInfoService.selectByuIdsNum(tbOrderInfo);
        List<Integer> list2=tbOrderService.selectByoid(list1);
        List<TbGoodsInfo> list3=tbGoodsInfoService.selectBygId(list2);
        return list3;
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "sNumList",method = RequestMethod.POST)
    public List<SNumList> sNumList(@RequestBody TbOrderInfo tbOrderInfo)
    {
        List<TbGoodsInfo> tbGoodsInfo=this.snumGoodsList(tbOrderInfo.getuId(),tbOrderInfo.getsNum());
        List<Integer> listgId=new ArrayList<>();
        for (int i=0;i<tbGoodsInfo.size();i++)
        {
            listgId.add(tbGoodsInfo.get(i).getgId());
        }
        List<TbMerce> merces=this.merce(listgId);
        List<SNumList> list=new ArrayList<SNumList>();
        /*SNumList sNumList=new SNumList();*/
        for (int i=0;i<tbGoodsInfo.size();i++)
        {
            SNumList sNumList=new SNumList();
            sNumList.setSname(merces.get(i).getSname());
            sNumList.setmPic(merces.get(i).getmPic());
            sNumList.setGname(tbGoodsInfo.get(i).getGname());
            sNumList.setPrice(tbGoodsInfo.get(i).getPrice());
            sNumList.setgPic(tbGoodsInfo.get(i).getgPic());
            list.add(sNumList);
        }
        return list;
    }

}
