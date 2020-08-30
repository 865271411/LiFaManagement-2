package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.CardType;
import cn.edu.guet.service.ICardCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("CardCom")
public class CardComController {

    @Autowired
    ICardCom cardCom;

    @RequestMapping(value = "getAllCardCom",method = {RequestMethod.GET})
    public Result getAllCardCom(){

        List<CardType> cardTypes=new ArrayList<CardType>();
        if(cardTypes!=null){
            return Result.succ(cardCom.getAllCardCom());
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getCardComByName",method = {RequestMethod.GET})
    public Result getCardComByName(String cardName){

        List<CardType> cardType=cardCom.getCardComByName(cardName);
        if(cardType!=null){
            return Result.succ(cardType);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "getAllCardtype",method = {RequestMethod.GET})
    public Result getAllCardtype(String cardName){

        List<CardType> cardType=cardCom.getAllCardtype(cardName);
        if(cardType!=null){
            return Result.succ(cardType);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "updateCardCom",method = {RequestMethod.POST})
    public Result updateCardCom(@RequestBody CardType cardType){

        cardCom.updateCardCom(cardType);
        if(cardType!=null){
            return Result.succ(cardType);
        }else{
            return Result.fail("请求失败");
        }
    }

    @RequestMapping(value = "updateQingkong",method = {RequestMethod.POST})
    public Result updateQingkong(String cardId){

        cardCom.updateQingkong(cardId);
        return Result.succ("清空成功！");
    }
}
