package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.EmpMapper;
import cn.edu.guet.model.Emp;
import cn.edu.guet.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }

    @Override
    public List<Emp> getAllEmpName() {
        return empMapper.getAllEmpName();
    }
}
