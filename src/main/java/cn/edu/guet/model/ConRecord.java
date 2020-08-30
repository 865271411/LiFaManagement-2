package cn.edu.guet.model;

import java.sql.Timestamp;

public class ConRecord {
    private String id;
    private String serviceId;
    private String empId;
    private String vipId;
    private Timestamp consumeTime;
    private String operator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public Timestamp getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Timestamp consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}
