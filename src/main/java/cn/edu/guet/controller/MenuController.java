package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Menus;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @RequestMapping(value = "getAllmenu" , method= {RequestMethod.GET})
    public Result getAllMenu(){
        List<Menus> menus =new ArrayList<Menus>();
        menus=menuService.getAllMenus();
        if(menus!=null){
            return Result.succ(menus);
        }else{
            return Result.fail("请求失败");
       }

    }
}
