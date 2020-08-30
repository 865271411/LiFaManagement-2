package cn.edu.guet.mapper;

import cn.edu.guet.dt.EmpComByDate;
import cn.edu.guet.dt.EmpCommDto;
import cn.edu.guet.model.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommissionMapper {
    List<Emp> getAllEmp();
    Emp getEmpCommById(String empId);
    EmpCommDto getCommoney(String empId);
    EmpCommDto getKaikaCommoney(String empId);
    EmpCommDto getSankeCommoney(String empId);
    EmpCommDto getCommoneyByDate(EmpComByDate empComByDate);
    EmpCommDto getKaikaCommoneyByDate(EmpComByDate empComByDate);
    EmpCommDto getSankeCommoneyByDate(EmpComByDate empComByDate);
}
