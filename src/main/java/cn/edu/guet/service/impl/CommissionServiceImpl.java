package cn.edu.guet.service.impl;

import cn.edu.guet.dt.EmpAchievementDto;
import cn.edu.guet.dt.EmpComByDate;
import cn.edu.guet.dt.EmpCommDto;
import cn.edu.guet.mapper.AchievementMapper;
import cn.edu.guet.mapper.CommissionMapper;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.ICommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionServiceImpl implements ICommissionService {

    @Autowired
    CommissionMapper consumeMapper;
    @Autowired
    AchievementMapper achievementMapper;

    @Override
    public List<Emp> getAllEmp() {
        return consumeMapper.getAllEmp();
    }

    @Override
    public Emp getEmpCommById(String empId) {
        Emp emp=consumeMapper.getEmpCommById(empId);
        return emp;
    }

    @Override
    public EmpCommDto getCommoney(String empId) {
        EmpCommDto empAcheDto = consumeMapper.getCommoney(empId);
        return empAcheDto;
    }

    @Override
    public EmpCommDto getKaikaCommoney(String empId) {
        EmpCommDto empAcheDto = consumeMapper.getKaikaCommoney(empId);
        return empAcheDto;
    }

    @Override
    public EmpCommDto getSankeCommoney(String empId) {
        EmpCommDto empAcheDto = consumeMapper.getSankeCommoney(empId);
        return empAcheDto;
    }

//    @Override
//    public Servicetype getServicetypeById(String id) {
//        Servicetype servicetype = servicetypeMapper.getServicetypeById(id);
//        return servicetype;
//    }

    @Override
    public EmpCommDto getCommoneyByDate(EmpComByDate empComByDate) {
        EmpCommDto empAcheDto = consumeMapper.getCommoneyByDate(empComByDate);
        return empAcheDto;
    }

    @Override
    public EmpCommDto getKaikaCommoneyByDate(EmpComByDate empComByDate) {
        EmpCommDto empAcheDto = consumeMapper.getKaikaCommoneyByDate(empComByDate);
        return empAcheDto;
    }

    @Override
    public EmpCommDto getSankeCommoneyByDate(EmpComByDate empComByDate) {
        EmpCommDto empAcheDto = consumeMapper.getSankeCommoneyByDate(empComByDate);
        return empAcheDto;
    }

    @Override
    public EmpAchievementDto getAchievement(String empId) {
        return achievementMapper.getAchievement(empId);
    }

    @Override
    public EmpAchievementDto getKaikaAchievement(String empId) {
        return achievementMapper.getKaikaAchievement(empId);
    }

    @Override
    public EmpAchievementDto getSankeAchievement(String empId) {
        return achievementMapper.getSankeAchievement(empId);
    }

}
