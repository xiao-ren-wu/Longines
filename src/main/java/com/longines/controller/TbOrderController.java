package com.longines.controller;

import com.longines.service.TbOrder;
import com.longines.service.impl.TbOrderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;
@Controller
@RequestMapping("/order")
public class TbOrderController {
    @Resource
    private TbOrderImpl tbOrder;

    /**
     * 方法注解
     *
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("insertOrder")
    public void insertOrder() {






   /* @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("helo","你好呀!!");
        modelAndView.setViewName("index");
        return  modelAndView;*/
    }
}
