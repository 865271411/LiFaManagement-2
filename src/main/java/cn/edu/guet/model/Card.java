package cn.edu.guet.model;

public class Card {
    private String cardId;
    private String cardName;
    private String comMoney;
    private String recharMoney;
    private float discount;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getComMoney() {
        return comMoney;
    }

    public void setComMoney(String comMoney) {
        this.comMoney = comMoney;
    }

    public String getRecharMoney() {
        return recharMoney;
    }

    public void setRecharMoney(String recharMoney) {
        this.recharMoney = recharMoney;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}