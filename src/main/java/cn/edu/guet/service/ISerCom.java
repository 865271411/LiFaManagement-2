package cn.edu.guet.service;

import cn.edu.guet.model.ServiceType;

import java.util.List;

public interface ISerCom {
    List<ServiceType> getAllSerCom();
    List<ServiceType> getSerComByStype(String stype);
    List<ServiceType> getSerComByState(String state);
    List<ServiceType> getSerComByName(String serviceName);
    void updateSerCom(ServiceType servicetype);
    void updateQingkong(ServiceType servicetype);
    List<ServiceType> getAllState();
    List<ServiceType> getAllStype();
    List<ServiceType> getAllSerName();
    List<ServiceType> getAllSerName1();
    void updateSerComm(Float comMoney, String serviceId);
    void updateQingkongg(String serviceId);
}
