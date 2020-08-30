package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.CardMapper;
import cn.edu.guet.model.Card;
import cn.edu.guet.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements ICardService {

    @Autowired
    CardMapper cardMapper;

    @Override
    public List<Card> getAllCardType() {
        return cardMapper.getAllCardType();
    }

    @Override
    public void saveCardType(Card card){
        cardMapper.saveCardType(card);
    }

    @Override
    public void deleteCardType(String cardId) {
        cardMapper.deleteCardType(cardId);
    }

    @Override
    public void updateCardType(Card card) {
        cardMapper.updateCardType(card);
    }

}
