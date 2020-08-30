package cn.edu.guet.service;

import cn.edu.guet.model.CardType;

import java.util.List;

public interface ICardCom {
    List<CardType> getAllCardCom();
    List<CardType> getCardComByName(String cardName);
    void updateCardCom(CardType cardType);
    void updateQingkong(String cardId);
    List<CardType> getAllCardtype(String cardName);
}
