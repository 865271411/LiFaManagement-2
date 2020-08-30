package cn.edu.guet.mapper;

import cn.edu.guet.model.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardMapper {
    List<Card> getAllCardType();
    void saveCardType(Card card);
    void deleteCardType(String cardId);
    void updateCardType(Card card);
}
