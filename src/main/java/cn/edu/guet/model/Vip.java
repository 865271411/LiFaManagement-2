package cn.edu.guet.model;

import java.sql.Timestamp;

public class Vip {
    private String vipId;
    private String vipName;
    private String phone;
    private String cardId;
    private float cardMoney;
    private float consumeMoney;
    private String empId;
    private Timestamp cardTime;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public float getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(float cardMoney) {
        this.cardMoney = cardMoney;
    }

    public float getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(float consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Timestamp getCardTime() {
        return cardTime;
    }

    public void setCardTime(Timestamp cardTime) {
        this.cardTime = cardTime;
    }
}
