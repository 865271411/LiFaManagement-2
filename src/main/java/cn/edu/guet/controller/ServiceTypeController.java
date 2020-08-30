package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.ServiceTypeDto;
import cn.edu.guet.model.ServiceType;
import cn.edu.guet.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("serviceType")
public class ServiceTypeController {

    @Autowired
    IServiceTypeService serviceTypeService;


    @RequestMapping(value = "saveServiceType",method = {RequestMethod.POST})
    public Result saveServiceType(@RequestBody ServiceTypeDto serviceTypeDto){

        if(serviceTypeDto.getServiceName ().equals ("") || serviceTypeDto.getStype ().equals ("")){
            return Result.fail ("服务名称或类别不能为空");
        }
        try {
            serviceTypeService.saveServiceType (serviceTypeDto);
        } catch (Exception e) {
            e.printStackTrace ();
            return Result.fail ( "添加失败，请联系管理员" );
        }
        return Result.succ ( "添加成功" );

    }

    @RequestMapping(value = "getAllServiceType",method = {RequestMethod.GET})
    public Result getAllServiceType(){
        return Result.succ (serviceTypeService.getAllServiceType ());


    }

    @RequestMapping(value = "selectServiceType",method = {RequestMethod.GET})
    public Result selectServiceType(String serviceName){
        return Result.succ ( serviceTypeService.selectServiceType ( serviceName ) );

    }

    @RequestMapping(value = "updateServiceType",method = {RequestMethod.POST})
    public Result updateServiceType(@RequestBody ServiceType serviceType){
        try {
            serviceTypeService.updateServiceType (serviceType);
        } catch (Exception e) {
            e.printStackTrace ();
            return Result.fail ( "修改失败，请联系管理员" );
        }
        return Result.succ ( "修改成功" );
    }

    @RequestMapping(value = "deleteServiceType",method = {RequestMethod.POST})
    public Result deleteServiceType(String serviceId ){
        try {
            serviceTypeService.deleteServiceType ( serviceId);
        } catch (Exception e) {
            e.printStackTrace ();
            return Result.fail ( "删除失败，请联系管理员" );
        }
        return Result.succ ( "删除成功" );
    }

    @RequestMapping(value = "getAllStype",method = {RequestMethod.GET})
    @ResponseBody
    public Result getAllSetype(){
        return Result.succ ( serviceTypeService.getAllStype () );

    }

    @RequestMapping(value = "searchStypeService",method = {RequestMethod.GET})
    public Result searchStypeService(String stype){
        return Result.succ ( serviceTypeService.searchStypeService ( stype ) );

    }

    @RequestMapping(value = "getStateService",method = {RequestMethod.GET})
    public Result getStateService(String state){
        return Result.succ (serviceTypeService.getStateService (state));


    }

    @RequestMapping(value = "getAllServiceName",method = {RequestMethod.GET})
    public Result getAllServiceName(){
        return Result.succ ( serviceTypeService.getAllServiceName () );

    }

}
