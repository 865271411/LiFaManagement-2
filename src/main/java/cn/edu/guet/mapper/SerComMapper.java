package cn.edu.guet.mapper;

import cn.edu.guet.model.ServiceType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface SerComMapper {
    List<ServiceType> getAllSerCom();
    List<ServiceType> getSerComByStype(@RequestBody String stype);
    List<ServiceType> getSerComByState(@RequestBody String state);
    List<ServiceType> getSerComByName(String serviceName);
    void updateSerCom(@RequestBody ServiceType servicetype);
    void updateQingkong(ServiceType servicetype);
    List<ServiceType> getAllState();
    List<ServiceType> getAllStype();
    List<ServiceType> getAllSerName();
    List<ServiceType> getAllSerName1();
    void updateSerComm(Float comMoney, String serviceId);
    void updateQingkongg(String serviceId);
}
