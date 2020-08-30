package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Vip;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Vip")
public class VipController {

    @Autowired
    IVipService vipService;

    /*
    @RequestMapping(value = "getVipByTel",method = {RequestMethod.GET})
    @ResponseBody
    public Result getVipByTel(@RequestBody VipDto vipDto){
        Vip vip = vipService.getVipByTel(vipDto.getPhone());
        if(vip!=null){
            return Result.succ(vip);
        }else{
            return Result.fail();
        }
    }
    */
    @RequestMapping(value = "getVipByTel",method = {RequestMethod.GET})
    public Result getVipByTel(String phone){
        List<Vip> vip = vipService.getVipByTel(phone);
        if(vip!=null){
            return Result.succ(vip);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getAllVip",method = {RequestMethod.GET})
    public Result getAllVip(){
        List<Vip> vip = vipService.getAllVip();
        if(vip!=null){
            return Result.succ(vip);
        }else{
            return Result.fail("请求失败");
        }
    }
}
