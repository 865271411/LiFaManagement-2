package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.EmpAcheByDate;
import cn.edu.guet.dt.EmpAcheDemo;
import cn.edu.guet.dt.EmpAchieveDot;
import cn.edu.guet.dt.EmpAchievementDto;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.IAchievementService;
import cn.edu.guet.service.ICommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("empAchieve")
public class EmpAchieveController {
    @Autowired
    IAchievementService achievementService;

    @Autowired
    ICommissionService commissionService;

    @RequestMapping(value ="achieve",method = {RequestMethod.GET})
    public Result achieve() {
        Set<EmpAchieveDot> empAchieveDots = new LinkedHashSet<EmpAchieveDot>();
        List<Emp> emps = commissionService.getAllEmp();
        List<EmpAcheByDate> empAcheByDates = achievementService.getAllConsumeTime();
        System.out.println("时间："+empAcheByDates);
        //List<EmpAcheByDate> empAcheByDates1 = achievementService.getAllNextConsumeTime();
        for(int i=0;i<empAcheByDates.size();i++){
            List<EmpAcheDemo> empAcheDemos = new ArrayList<EmpAcheDemo>();
            EmpAchieveDot empAchieveDot = new EmpAchieveDot();
            for(int j=0;j<emps.size();j++){
                float total=0;
                float service=0;
                float kaika=0;
                EmpAcheByDate empAcheByDate= new EmpAcheByDate();
//                EmpAchieveDot empAchieveDot = new EmpAchieveDot();
                EmpAchievementDto empAchievementDto,empAchievementDto1;
                empAcheByDate.setEmpId(emps.get(j).getEmpId());

                EmpAcheDemo empAcheDemo = new EmpAcheDemo();
//              empAchieveDot.setEmpId(emps.get(i).getEmpId());
//              empAchieveDot.setEmpName(emps.get(i).getEmpName());
                empAcheDemo.setEmpId(emps.get(j).getEmpId());
                empAcheDemo.setEmpName(emps.get(j).getEmpName());


               // System.out.println("6666666:"+empAcheByDates);
                empAcheByDate.setConsumetime(empAcheByDates.get(i).getConsumetime());
                empAchieveDot.setConsumetime(empAcheByDates.get(i).getConsumetime());
//                System.out.println("6666666:"+empAcheByDates1);
                empAcheByDate.setNextConsumetime(empAcheByDates.get(i).getNextConsumetime());
                //System.out.println("888888888888888888888:"+empAcheByDate);
                empAchievementDto=achievementService.getTotalAchievement(empAcheByDate);
                //System.out.println("555555:"+empAchievementDto);
                if(empAchievementDto==null){
                    service=0;
                }else{
                    service=empAchievementDto.getTotalAchievement();
                }
                empAchievementDto1=achievementService.getKaikaAchievementByDate(empAcheByDate);
                if(empAchievementDto1==null){
                    kaika=0;
                }else{
                    kaika=empAchievementDto1.getKaikaAchievement();
                }
                total=service+kaika;

//                empAchieveDot.setTotalAche(total);
                empAcheDemo.setTotalAche(total);
                empAcheDemos.add(empAcheDemo);

            }
            empAchieveDot.setEmpAcheDemos(empAcheDemos);
            empAchieveDots.add(empAchieveDot);
        }
        if(empAchieveDots==null){
            return Result.fail("请求失败！");
        }else{
            return Result.succ(empAchieveDots);
        }
    }
}
