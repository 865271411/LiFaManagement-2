package cn.edu.guet.dt;

import java.sql.Timestamp;

public class VipDto {
    private String vipId;
    private String vipName;
    private String phone;
    private String cardId;
    private float cardMoney;
    private float consumeMoney;
    private String empId;
    private Timestamp cardTime;

    public Timestamp getCardTime() {
        return cardTime;
    }

    public void setCardTime(Timestamp cardTime) {
        this.cardTime = cardTime;
    }

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

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
