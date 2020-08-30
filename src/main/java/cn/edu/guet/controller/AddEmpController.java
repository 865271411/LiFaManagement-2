package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.AddEmp;
import cn.edu.guet.service.AddIEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("AddEmp")
public class AddEmpController {

    @Autowired
    AddIEmpService addEmpService;

    @RequestMapping(value="getAllEmp",method = RequestMethod.GET)
    public Result getAllEmp(){
        return  Result.succ ( addEmpService.getAllEmp() );
    }

    @RequestMapping(value="getSoloEmp",method = RequestMethod.GET)
    public Result getSoloEmp(String empId){
        return Result.succ ( addEmpService.getSoloEmp(empId) );
    }

    @PostMapping("insertEmp")
    public Result insertEmp(@Validated @RequestBody AddEmp emp){
        try {
            addEmpService.insertEmp(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail( "添加员工失败，请联系管理员");
        }
        return Result.succ( "添加成功");
    }

    @RequestMapping(value="deleteEmp",method = RequestMethod.GET)
    public Result deleteEmp(String empId){
        try {
            addEmpService.deleteEmp(empId);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail( "删除员工失败，请联系管理员");
        }
        return Result.succ( "删除成功");
    }
    @RequestMapping(value="updateEmp",method = RequestMethod.POST)
    public Result updateEmp(@RequestBody AddEmp emp){
        try {
            addEmpService.updateEmp(emp);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail( "修改员工失败，请联系管理员");
        }
        return Result.succ( "修改成功");
    }
}
