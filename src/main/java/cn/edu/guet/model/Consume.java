package cn.edu.guet.model;

import java.sql.Timestamp;

public class Consume {
    private String id;
    private String vipName;
    private String price;
    private String serviceName;
    private Timestamp consumeTime;
    private String operAtor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Timestamp getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Timestamp consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getOperAtor() {
        return operAtor;
    }

    public void setOperAtor(String operAtor) {
        this.operAtor = operAtor;
    }




}
