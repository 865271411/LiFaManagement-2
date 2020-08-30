package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Emp")
public class EmpController {
    @Autowired
    IEmpService empService;

    @RequestMapping(value = "getAllEmp",method = {RequestMethod.GET})
    public Result getAllEmp(){
        List<Emp> emp = empService.getAllEmp();
        if(emp!=null){
            return Result.succ(emp);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getAllEmpName",method = {RequestMethod.GET})
    public Result getAllEmpName(){
        List<Emp> emp = empService.getAllEmpName();
        if(emp!=null){
            return Result.succ(emp);
        }else{
            return Result.fail("请求失败");
        }
    }
}
