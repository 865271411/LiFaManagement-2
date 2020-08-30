package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.SerComMapper;
import cn.edu.guet.model.ServiceType;
import cn.edu.guet.service.ISerCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerComImpl implements ISerCom {

    @Autowired
    SerComMapper serComMapper;

    @Override
    public List<ServiceType> getAllSerCom() {
        return serComMapper.getAllSerCom();
    }

    @Override
    public List<ServiceType> getSerComByStype(String stype) {
        return serComMapper.getSerComByStype(stype);
    }

    @Override
    public List<ServiceType> getSerComByState(String state) {
        return serComMapper.getSerComByState(state);
    }

    @Override
    public List<ServiceType> getSerComByName(String serviceName) {
        return serComMapper.getSerComByName(serviceName);
    }

    @Override
    public void updateSerCom(ServiceType servicetype) {
        serComMapper.updateSerCom(servicetype);
    }

    @Override
    public void updateQingkong(ServiceType servicetype) {
        serComMapper.updateQingkong(servicetype);
    }

    @Override
    public List<ServiceType> getAllState() {
        return serComMapper.getAllState();
    }

    @Override
    public List<ServiceType> getAllStype() {
        return serComMapper.getAllStype();
    }

    @Override
    public List<ServiceType> getAllSerName() {
        return serComMapper.getAllSerName();
    }

    @Override
    public List<ServiceType> getAllSerName1() {
        return serComMapper.getAllSerName1();
    }

    @Override
    public void updateSerComm(Float comMoney,String serviceId) {
        serComMapper.updateSerComm(comMoney,serviceId);
    }

    @Override
    public void updateQingkongg(String serviceId) {
        serComMapper.updateQingkongg(serviceId);
    }


}
