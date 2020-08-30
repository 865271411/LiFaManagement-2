package cn.edu.guet.model;

import lombok.Data;

public class Commission {

    private String empid;
    private String empname;
    private float vipachievement;
    private float skachievement;
    private float serviceachievement;
    private float totalachievement;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public float getVipachievement() {
        return vipachievement;
    }

    public void setVipachievement(float vipachievement) {
        this.vipachievement = vipachievement;
    }

    public float getSkachievement() {
        return skachievement;
    }

    public void setSkachievement(float skachievement) {
        this.skachievement = skachievement;
    }

    public float getServiceachievement() {
        return serviceachievement;
    }

    public void setServiceachievement(float serviceachievement) {
        this.serviceachievement = serviceachievement;
    }

    public float getTotalachievement() {
        return totalachievement;
    }

    public void setTotalachievement(float totalachievement) {
        this.totalachievement = totalachievement;
    }
}
