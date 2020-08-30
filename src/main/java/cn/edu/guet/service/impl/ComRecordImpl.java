package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.ComRecordMapper;
import cn.edu.guet.model.ConRecord;
import cn.edu.guet.service.IComRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComRecordImpl implements IComRecord {

    @Autowired
    ComRecordMapper comRecordMapper;

    @Override
    public String getVipId(String phone) {
        return comRecordMapper.getVipId(phone) ;
    }

    @Override
    public String getServiceId(String serviceName) {
        return comRecordMapper.getServiceId(serviceName);
    }

    @Override
    public String getEmpId(String empName) {
        return comRecordMapper.getEmpId(empName);
    }

    @Override
    public void insertCom(ConRecord conRecord) {
        comRecordMapper.insertCom(conRecord);
    }

    @Override
    public String getVipId1(String vipName) {
        return comRecordMapper.getVipId1(vipName);
    }
}
