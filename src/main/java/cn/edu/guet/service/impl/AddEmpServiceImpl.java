package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.AddEmpMapper;
import cn.edu.guet.model.AddEmp;
import cn.edu.guet.service.AddIEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddEmpServiceImpl implements AddIEmpService {

    @Autowired
    AddEmpMapper addEmpMapper;

    @Override
    public List<AddEmp> getAllEmp() {
        return addEmpMapper.getAllEmp();
    }

    @Override
    public List<AddEmp> getSoloEmp(String empId) {
        return addEmpMapper.getSoloEmp(empId);
    }

    @Override
    public void insertEmp(AddEmp emp) throws Exception{
        addEmpMapper.insertEmp(emp);
    }

    @Override
    public void deleteEmp(String empId) throws Exception {
        addEmpMapper.deleteEmp(empId);
    }

    @Override
    public void updateEmp(AddEmp emp) throws Exception {
        addEmpMapper.updateEmp(emp);
    }


}
