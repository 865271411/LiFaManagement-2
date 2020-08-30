package cn.edu.guet.mapper;

import cn.edu.guet.model.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {
    List<Emp> getAllEmp();
    List<Emp> getAllEmpName();
}
