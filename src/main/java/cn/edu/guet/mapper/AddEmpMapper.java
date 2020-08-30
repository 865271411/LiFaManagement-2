package cn.edu.guet.mapper;

import cn.edu.guet.model.AddEmp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddEmpMapper {
    List<AddEmp> getAllEmp();
    List<AddEmp> getSoloEmp(String empId);
    void insertEmp(AddEmp emp) throws Exception;
    void deleteEmp(String empId) throws Exception;
    void updateEmp(AddEmp emp) throws Exception;
 }
