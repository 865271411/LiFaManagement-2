package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.ConRecord;
import cn.edu.guet.service.IComRecord;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ComRecord")
public class ComRecordController {
    @Autowired
    IComRecord comRecord;

    @Autowired
    IVipService vipService;

    ConRecord record=new ConRecord();

    @RequestMapping(value = "insertCom",method = {RequestMethod.POST})
    public Result insertCom(@RequestBody ConRecord conRecord){


        ConRecord ttt=new ConRecord();
        ttt.setId(conRecord.getId());
        ttt.setServiceId(conRecord.getServiceId());
        ttt.setEmpId(conRecord.getEmpId());
        ttt.setVipId(record.getVipId());
        ttt.setConsumeTime(conRecord.getConsumeTime());
        ttt.setOperator(conRecord.getOperator());

        if(ttt!=null){
            comRecord.insertCom(ttt);
            return Result.succ(ttt);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getVipId",method = {RequestMethod.GET})
    public Result getVipId(String phone){

        String vipId=comRecord.getVipId(phone);
        record.setVipId(vipId);
        if(vipId!=null){
            return Result.succ(vipId);
        }else{
            return Result.fail("请求失败");
        }

    }

    @RequestMapping(value = "getVipId1",method = {RequestMethod.GET})
    public Result getVipId1(String vipName){

        String vipId=comRecord.getVipId1(vipName);
        record.setVipId(vipId);
        if(vipId!=null){
            return Result.succ(vipId);
        }else{
            return Result.fail("请求失败");
        }

    }

    @RequestMapping(value = "getServiceId",method = {RequestMethod.GET})
    public Result getServiceId(String serviceName){

        String serviceId=comRecord.getServiceId(serviceName);

        if(serviceId!=null){
            return Result.succ(serviceId);
        }else{
            return Result.fail("请求失败");
        }

    }

    @RequestMapping(value = "getEmpId",method = {RequestMethod.GET})
    public Result getEmpId(String empName){

        String empId=comRecord.getEmpId(empName);
        if(empId!=null){
            return Result.succ(empId);
        }else{
            return Result.fail("请求失败");
        }

    }
}
