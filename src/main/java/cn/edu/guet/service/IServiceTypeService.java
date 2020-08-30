package cn.edu.guet.service;

import cn.edu.guet.dt.ServiceTypeDto;
import cn.edu.guet.model.ServiceType;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> selectServiceType(String serviceName);
    void saveServiceType(ServiceTypeDto serviceTypeDto) throws Exception;
    List<ServiceType> getAllServiceType();
    void updateServiceType(ServiceType serviceType) throws Exception;
    void deleteServiceType(String serviceId) throws Exception;
    List<String> getAllStype();
    List<ServiceType> searchStypeService(String stype);
    List<ServiceType> getStateService(String state);
    List<String> getAllServiceName();
}
