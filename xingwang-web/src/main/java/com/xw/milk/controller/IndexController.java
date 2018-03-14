package com.xw.milk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xw.milk.common.Paginator;
import com.xw.milk.controller.base.BaseController;
import com.xw.milk.service.BasProductService;
import com.xw.milk.service.BasUserService;
import com.xw.milk.util.IpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ChoviWu on 2018/02/02
 * Description:
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController {

    @Reference
    private BasProductService productService;
    @Reference
    private BasUserService userService;

    @ResponseBody
    @RequestMapping("")
    public Object index( Model model,HttpServletRequest request,Paginator p){
        String ip = IpUtils.get();
        Map map = new HashMap();
        Object productList = productService.getListForPage(p);//产品分页
        map.put("productList",productList);
        String openId = getStringAttribute(OPEN_ID);
        map.put("user",userService.getUserByOpenId(openId));
        return success(map);
    }
}