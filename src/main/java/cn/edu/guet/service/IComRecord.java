package cn.edu.guet.service;

import cn.edu.guet.model.ConRecord;

public interface IComRecord {
    String getVipId(String phone);//通过电话号码获取id
    String getServiceId(String serviceName);
    String getEmpId(String empName);
    void insertCom(ConRecord conRecord);
    String getVipId1(String vipName);
}
