package cn.edu.guet.model;

public class ServiceType {
    private String serviceId;
    private String serviceName;
    private Float price;
    private Float comMoney;
    private String stype;
    private String state;

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getComMoney() {
        return comMoney;
    }

    public void setComMoney(Float comMoney) {
        this.comMoney = comMoney;
    }

}
