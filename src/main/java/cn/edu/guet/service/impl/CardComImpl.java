package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.CardComMapper;
import cn.edu.guet.model.CardType;
import cn.edu.guet.service.ICardCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardComImpl implements ICardCom {

    @Autowired
    CardComMapper cardComMapper;

    @Override
    public List<CardType> getAllCardCom() {
        return cardComMapper.getAllCardCom();
    }

    @Override
    public List<CardType> getCardComByName(String cardName) {
        return  cardComMapper.getCardComByName(cardName);
    }

    @Override
    public void updateCardCom(CardType cardType) {
        cardComMapper.updateCardCom(cardType);
    }

    @Override
    public void updateQingkong(String cardId) {
        cardComMapper.updateQingkong(cardId);
    }

    @Override
    public List<CardType> getAllCardtype(String cardName) {
        return cardComMapper.getAllCardtype(cardName);
    }
}
