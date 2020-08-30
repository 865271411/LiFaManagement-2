package cn.edu.guet.mapper;

import cn.edu.guet.model.CardType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface CardComMapper {
    List<CardType> getAllCardCom();
    List<CardType> getCardComByName(String cardName);
    void updateCardCom(@RequestBody CardType cardType);
    void updateQingkong(String cardId);
    List<CardType> getAllCardtype(String cardName);
}
