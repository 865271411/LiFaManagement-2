package cn.edu.guet.model;

public class CardType {
    private String cardId;
    private String cardName;
    private Float comMoney;
    private Float recharMoney;
    private Float discount;

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getRecharMoney() {
        return recharMoney;
    }

    public void setRecharMoney(Float recharMoney) {
        this.recharMoney = recharMoney;
    }

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

    public Float getComMoney() {
        return comMoney;
    }

    public void setComMoney(Float comMoney) {
        this.comMoney = comMoney;
    }
}
