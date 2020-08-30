package cn.edu.guet.controller;


import cn.edu.guet.common.Result;
import cn.edu.guet.dt.EmpAchievementDto;
import cn.edu.guet.dt.EmpComByDate;
import cn.edu.guet.dt.EmpCommDto;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.ICommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("emp")
public class EmpCommController {
    @Autowired
    ICommissionService commissionService;

    /**
     * gson（慢）
     * fastjson（漏洞多，速度慢）
     * jackson
     * @param
     * @param
     * @return user的信息（json格式），我们的login方法上使用了@ResponseBody注解后，会自动返回json数据
     */
    //@RequestMapping(value = "login",method = {RequestMethod.POST})
    @RequestMapping(value ="commissionByDate",method = {RequestMethod.POST})
    public Result commissionByDate(@RequestBody EmpComByDate empComByDate1) {
        Set<EmpCommDto> empAcheDtos= new LinkedHashSet<EmpCommDto>();

        List<Emp> emp=commissionService.getAllEmp();

        EmpCommDto empAcheDtos2;
        for(int i=0;i<emp.size();i++) {
            float total=0;
            EmpCommDto empAcheDto = new EmpCommDto();
            EmpComByDate empComByDate = new EmpComByDate();
            empAcheDto.setEmpId(emp.get(i).getEmpId());
            empComByDate.setEmpId(emp.get(i).getEmpId());
            empComByDate.setStartDate(empComByDate1.getStartDate());
            empComByDate.setEndDate(empComByDate1.getEndDate());

            System.out.println("777777:"+emp.get(i).getEmpName());
            empAcheDto.setEmpName(emp.get(i).getEmpName());
            System.out.println("888888:"+emp.get(i).getEmpLevel());
            empAcheDto.setEmpLevel(emp.get(i).getEmpLevel());


            empAcheDtos2=commissionService.getCommoneyByDate(empComByDate);
            if(empAcheDtos2 != null) {
                System.out.println("会员服务提成：" + empAcheDtos2.getServieceCommoney());
                empAcheDto.setServieceCommoney(empAcheDtos2.getServieceCommoney());
            }else{
                System.out.println("会员服务提成：" + 0);
                empAcheDto.setServieceCommoney(0);
            }

            empAcheDtos2=commissionService.getSankeCommoneyByDate(empComByDate);
            if(empAcheDtos2 != null) {
                System.out.println("散客服务提成：" + empAcheDtos2.getSankeCommoney());
                empAcheDto.setSankeCommoney(empAcheDtos2.getSankeCommoney());
            }else{
                System.out.println("散客服务提成：" + 0);
                empAcheDto.setSankeCommoney(0);
            }

            empAcheDtos2=commissionService.getKaikaCommoneyByDate(empComByDate);
            if(empAcheDtos2 != null){
                System.out.println("开卡提成："+empAcheDtos2.getKaikaCommoney());
                empAcheDto.setKaikaCommoney(empAcheDtos2.getKaikaCommoney());
            }else{
                System.out.println("开卡提成："+0);
                empAcheDto.setKaikaCommoney(0);
            }

            total=empAcheDto.getServieceCommoney()+empAcheDto.getSankeCommoney()+empAcheDto.getKaikaCommoney();
            System.out.println("总提成："+ total);
            empAcheDto.setTotalCommoney(total);
            empAcheDtos.add(empAcheDto);
        }
        if(empAcheDtos!=null){
            return Result.succ(empAcheDtos);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value ="commission",method = {RequestMethod.GET})
    public Result commission() {
        Set<EmpCommDto> empAcheDtos= new HashSet<EmpCommDto>();

        List<Emp> emp=commissionService.getAllEmp();

        EmpCommDto empAcheDtos2;
        for(int i=0;i<emp.size();i++) {
            float total=0;
            EmpCommDto empAcheDto = new EmpCommDto();
            empAcheDto.setEmpId(emp.get(i).getEmpId());

            System.out.println("777777:"+emp.get(i).getEmpName());
            empAcheDto.setEmpName(emp.get(i).getEmpName());
            System.out.println("888888:"+emp.get(i).getEmpLevel());
            empAcheDto.setEmpLevel(emp.get(i).getEmpLevel());


            empAcheDtos2=commissionService.getCommoney(emp.get(i).getEmpId());
            if(empAcheDtos2 != null) {
                System.out.println("会员服务提成：" + empAcheDtos2.getServieceCommoney());
                empAcheDto.setServieceCommoney(empAcheDtos2.getServieceCommoney());
            }else{
                System.out.println("会员服务提成：" + 0);
                empAcheDto.setServieceCommoney(0);
            }

            empAcheDtos2=commissionService.getSankeCommoney(emp.get(i).getEmpId());
            if(empAcheDtos2 != null) {
                System.out.println("散客服务提成：" + empAcheDtos2.getSankeCommoney());
                empAcheDto.setSankeCommoney(empAcheDtos2.getSankeCommoney());
            }else{
                System.out.println("散客服务提成：" + 0);
                empAcheDto.setSankeCommoney(0);
            }

            empAcheDtos2=commissionService.getKaikaCommoney(emp.get(i).getEmpId());
            if(empAcheDtos2 != null){
                System.out.println("开卡提成："+empAcheDtos2.getKaikaCommoney());
                empAcheDto.setKaikaCommoney(empAcheDtos2.getKaikaCommoney());
            }else{
                System.out.println("开卡提成："+0);
                empAcheDto.setKaikaCommoney(0);
            }

            total=empAcheDto.getServieceCommoney()+empAcheDto.getSankeCommoney()+empAcheDto.getKaikaCommoney();
            System.out.println("总提成："+ total);
            empAcheDto.setTotalCommoney(total);
            empAcheDtos.add(empAcheDto);
        }
        if(empAcheDtos!=null){
            return Result.succ(empAcheDtos);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping("commissionById")
    public Result commissionById(String empId) {
        Set<EmpCommDto> empAcheDtos= new HashSet<EmpCommDto>();
        EmpCommDto empAcheDto = new EmpCommDto();
        EmpComByDate empComByDate = new EmpComByDate();

        empComByDate.setEmpId(empId);
        Emp emp = commissionService.getEmpCommById(empId);
        if(emp == null){
            return Result.fail("请求失败");
        }
        empAcheDto.setEmpId(emp.getEmpId());
        empAcheDto.setEmpName(emp.getEmpName());
        empAcheDto.setEmpLevel(emp.getEmpLevel());
        System.out.println("6666666666"+emp);
        EmpCommDto empAcheDtos2;
        float total=0;
        empAcheDtos2=commissionService.getCommoney(empId);
        if(empAcheDtos2 != null) {
            System.out.println("会员服务提成：" + empAcheDtos2.getServieceCommoney());
            empAcheDto.setServieceCommoney(empAcheDtos2.getServieceCommoney());
        }else{
            System.out.println("会员服务提成：" + 0);
            empAcheDto.setServieceCommoney(0);
        }

        empAcheDtos2=commissionService.getSankeCommoney(empId);
        if(empAcheDtos2 != null) {
            System.out.println("散客服务提成：" + empAcheDtos2.getSankeCommoney());
            empAcheDto.setSankeCommoney(empAcheDtos2.getSankeCommoney());
        }else{
            System.out.println("散客服务提成：" + 0);
            empAcheDto.setSankeCommoney(0);
        }

        empAcheDtos2=commissionService.getKaikaCommoney(empId);
        if(empAcheDtos2 != null){
            System.out.println("开卡提成："+empAcheDtos2.getKaikaCommoney());
            empAcheDto.setKaikaCommoney(empAcheDtos2.getKaikaCommoney());
        }else{
            System.out.println("开卡提成："+0);
            empAcheDto.setKaikaCommoney(0);
        }

        total=empAcheDto.getServieceCommoney()+empAcheDto.getSankeCommoney()+empAcheDto.getKaikaCommoney();
        System.out.println("总提成："+ total);
        empAcheDto.setTotalCommoney(total);
        empAcheDtos.add(empAcheDto);
        return Result.succ(empAcheDtos);
    }


//    @RequestMapping(value ="achieveById",method = {RequestMethod.GET})
//    public Result achieveById() {
//        Set<EmpAchievementDto> empAchievements= new HashSet<EmpAchievementDto>();
//
//        List<Emp> emp=commissionService.getAllEmp();
//        EmpAchievementDto empAchievement;
//        for(int i=0;i<emp.size();i++) {
//            float total1=0;
//            EmpAchievementDto empAchievement1 = new EmpAchievementDto();
//            empAchievement1.setEmpId(emp.get(i).getEmpId());
//            System.out.println("777777:"+emp.get(i).getEmpName());
//            empAchievement1.setEmpName(emp.get(i).getEmpName());
//            System.out.println("888888:"+emp.get(i).getEmpLevel());
//            empAchievement1.setEmpLevel(emp.get(i).getEmpLevel());
//
//            empAchievement=commissionService.getAchievement(emp.get(i).getEmpId());
//            if(empAchievement != null) {
//                System.out.println("会员服务业绩：" + empAchievement.getServieceAchievement());
//                empAchievement1.setServieceAchievement(empAchievement.getServieceAchievement());
//            }else{
//                System.out.println("会员服务业绩：" + 0);
//                empAchievement1.setServieceAchievement(0);
//            }
//
//            empAchievement=commissionService.getSankeAchievement(emp.get(i).getEmpId());
//            if(empAchievement != null) {
//                System.out.println("散客服务业绩：" + empAchievement.getSankeAchievement());
//                empAchievement1.setSankeAchievement(empAchievement.getSankeAchievement());
//            }else{
//                System.out.println("散客服务业绩：" + 0);
//                empAchievement1.setSankeAchievement(0);
//            }
//
//            empAchievement=commissionService.getKaikaAchievement(emp.get(i).getEmpId());
//            if(empAchievement != null){
//                System.out.println("开卡业绩："+empAchievement.getKaikaAchievement());
//                empAchievement1.setKaikaAchievement(empAchievement.getKaikaAchievement());
//            }else{
//                System.out.println("开卡业绩："+0);
//                empAchievement1.setKaikaAchievement(0);
//            }
//
//            total1=empAchievement1.getServieceAchievement()+empAchievement1.getSankeAchievement()+empAchievement1.getKaikaAchievement();
//            System.out.println("总业绩："+ total1);
//            empAchievement1.setTotalAchievement(total1);
//            empAchievements.add(empAchievement1);
//        }
//        if(empAchievements!=null){
//            return Result.succ(empAchievements);
//        }else{
//            return Result.fail("请求失败");
//        }
//    }


//    @RequestMapping(value ="achieve",method = {RequestMethod.GET})
//    @ResponseBody
//    public Result achieve() {
//        Set<EmpAchievementDto> empAchievements= new HashSet<EmpAchievementDto>();
//
//        List<Emp> emp=commissionService.getAllEmp();
//        EmpAchievementDto empAchievement;
//        for(int i=0;i<emp.size();i++) {
//            float total1=0;
//            EmpAchievementDto empAchievement1 = new EmpAchievementDto();
//            empAchievement1.setEmpId(emp.get(i).getEmpId());
//            System.out.println("777777:"+emp.get(i).getEmpName());
//            empAchievement1.setEmpName(emp.get(i).getEmpName());
//            System.out.println("888888:"+emp.get(i).getEmpLevel());
//            empAchievement1.setEmpLevel(emp.get(i).getEmpLevel());
//
//            empAchievement=commissionService.getAchievement(emp.get(i).getEmpId());
//            if(empAchievement != null) {
//                System.out.println("会员服务业绩：" + empAchievement.getServieceAchievement());
//                empAchievement1.setServieceAchievement(empAchievement.getServieceAchievement());
//            }else{
//                System.out.println("会员服务业绩：" + 0);
//                empAchievement1.setServieceAchievement(0);
//            }
//
//            empAchievement=commissionService.getSankeAchievement(emp.get(i).getEmpId());
//            if(empAchievement != null) {
//                System.out.println("散客服务业绩：" + empAchievement.getSankeAchievement());
//                empAchievement1.setSankeAchievement(empAchievement.getSankeAchievement());
//            }else{
//                System.out.println("散客服务业绩：" + 0);
//                empAchievement1.setSankeAchievement(0);
//            }
//
//            empAchievement=commissionService.getKaikaAchievement(emp.get(i).getEmpId());
//            if(empAchievement != null){
//                System.out.println("开卡业绩："+empAchievement.getKaikaAchievement());
//                empAchievement1.setKaikaAchievement(empAchievement.getKaikaAchievement());
//            }else{
//                System.out.println("开卡业绩："+0);
//                empAchievement1.setKaikaAchievement(0);
//            }
//
//            total1=empAchievement1.getServieceAchievement()+empAchievement1.getSankeAchievement()+empAchievement1.getKaikaAchievement();
//            System.out.println("总业绩："+ total1);
//            empAchievement1.setTotalAchievement(total1);
//            empAchievements.add(empAchievement1);
//        }
//        if(empAchievements!=null){
//            return Result.succ(empAchievements);
//        }else{
//            return Result.fail("请求失败");
//        }
//    }
}
