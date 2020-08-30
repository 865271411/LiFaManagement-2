package cn.edu.guet.service;

import cn.edu.guet.model.Card;

import java.util.List;

public interface ICardService {
    List<Card> getAllCardType();
    void saveCardType(Card card);
    void deleteCardType(String cardId) throws Exception;
    void updateCardType(Card card) throws Exception;
}
