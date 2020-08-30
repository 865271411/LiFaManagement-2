package cn.edu.guet.mapper;

import cn.edu.guet.dt.ServiceTypeDto;
import cn.edu.guet.model.ServiceType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceTypeMapper {

    void saveServiceType(ServiceTypeDto serviceTypeDto) throws Exception;
    List<ServiceType> selectServiceType(String serviceName);
    List<ServiceType> getAllServiceType();
    void updateServiceType(ServiceType serviceType) throws Exception;
    void deleteServiceType(String serviceId) throws Exception;
    List<String> getAllStype();
    List<ServiceType> searchStypeService(String stype);
    List<ServiceType> getStateService(String state);
    List<String> getAllServiceName();
}
