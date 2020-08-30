package cn.edu.guet.service;

import cn.edu.guet.model.AddEmp;

import java.util.List;

public interface AddIEmpService {
    List<AddEmp> getAllEmp();
    List<AddEmp> getSoloEmp(String empId);
    void insertEmp(AddEmp emp) throws Exception;
    void deleteEmp(String empId) throws Exception;
    void updateEmp(AddEmp emp) throws Exception;
}
