package cn.edu.guet.service;

import cn.edu.guet.model.Emp;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICashService {
    List<Emp> getAllEmp();
    Emp getEmpById(String empId);
}
