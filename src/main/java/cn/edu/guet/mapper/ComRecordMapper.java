package cn.edu.guet.mapper;

import cn.edu.guet.model.ConRecord;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ComRecordMapper {
    String getVipId(String phone);//通过电话号码获取id
    String getServiceId(String serviceName);
    String getEmpId(String empName);
    void insertCom(@RequestBody ConRecord conRecord);
    String getVipId1(String vipName);
}
