package cn.edu.guet.service;

import cn.edu.guet.dt.EmpAchievementDto;
import cn.edu.guet.dt.EmpComByDate;
import cn.edu.guet.dt.EmpCommDto;
import cn.edu.guet.model.Emp;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICommissionService {
    List<Emp> getAllEmp();
    Emp getEmpCommById(String empId);
    EmpCommDto getCommoney(String empId);
    EmpCommDto getKaikaCommoney(String empId);
    EmpCommDto getSankeCommoney(String empId);
    EmpCommDto getCommoneyByDate(EmpComByDate empComByDate);
    EmpCommDto getKaikaCommoneyByDate(EmpComByDate empComByDate);
    EmpCommDto getSankeCommoneyByDate(EmpComByDate empComByDate);
    EmpAchievementDto getAchievement(String empId);
    EmpAchievementDto getKaikaAchievement(String empId);
    EmpAchievementDto getSankeAchievement(String empId);
}
