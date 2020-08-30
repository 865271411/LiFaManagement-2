package cn.edu.guet.controller;


import cn.edu.guet.common.Result;
import cn.edu.guet.model.ServiceType;
import cn.edu.guet.service.ISerCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("SerCom")
public class SerComController {

    @Autowired
    ISerCom serCom;

    @RequestMapping(value = "updateSerCom",method = {RequestMethod.POST})
    public Result updateSerCom(@RequestBody ServiceType servicetype){

        serCom.updateSerCom(servicetype);
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "updateSerComm",method = {RequestMethod.POST})
    public Result updateSerComm(Float comMoney, String serviceId){
        serCom.updateSerComm(comMoney,serviceId);
        return Result.succ("修改成功！");
    }

    @RequestMapping(value = "updateQingkong",method = {RequestMethod.POST})
    public Result updateQingkong(@RequestBody ServiceType servicetype){

        serCom.updateSerCom(servicetype);
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "updateQingkongg",method = {RequestMethod.POST})
    public Result updateQingkongg(String serviceId){

        serCom.updateQingkongg(serviceId);
        return Result.succ("清空成功！");
    }

    @RequestMapping(value = "getAllSerCom",method = {RequestMethod.GET})
    public Result getAllSerCom(){

        List<ServiceType> servicetype=new ArrayList<ServiceType>();
        if(servicetype!=null){
            return Result.succ(serCom.getAllSerCom());
        }else{
            return Result.fail("请求失败");
        }

    }

    /*
    @RequestMapping(value = "getSerComByName",method = {RequestMethod.GET})
    @ResponseBody
    public Servicetype getSerComByName(String servicename){

        Servicetype servicetype=serCom.getSerComByName(servicename);
        return servicetype;
    }
    */

    @RequestMapping(value = "getSerComByStype",method = {RequestMethod.GET})
    public Result getSerComByStype(String stype){

        List<ServiceType> servicetype=serCom.getSerComByStype(stype);
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getSerComByState",method = {RequestMethod.GET})
    public Result getSerComByState(String state){

        List<ServiceType> servicetype=serCom.getSerComByState(state);
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getAllSerName",method = {RequestMethod.GET})
    public Result getAllSerName(){

        List<ServiceType> servicetype=serCom.getAllSerName();
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getAllSerName1",method = {RequestMethod.GET})
    public Result getAllSerName1(){

        List<ServiceType> servicetype=serCom.getAllSerName1();
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getSerComByName",method = {RequestMethod.GET})
    public Result getSerComByName(String serviceName){

        List<ServiceType> servicetype=serCom.getSerComByName(serviceName);
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getAllState",method = {RequestMethod.GET})
    public Result getAllState(){

        List<ServiceType> servicetype=new ArrayList<ServiceType>();
        if(servicetype!=null){
            return Result.succ(serCom.getAllState());
        }else{
            return Result.fail("请求失败");
        }

    }

    @RequestMapping(value = "getAllStype",method = {RequestMethod.GET})
    public Result getAllStype(){

        List<ServiceType> servicetype=new ArrayList<ServiceType>();
        if(servicetype!=null){
            return Result.succ(serCom.getAllStype());
        }else{
            return Result.fail("请求失败");
        }

    }

}
