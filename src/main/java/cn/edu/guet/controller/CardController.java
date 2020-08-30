package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Card;
import cn.edu.guet.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.List;

/*
Controller把普通的pojo标记为一个控制器（就能接收请求、返回数据）
 */
@RestController
@RequestMapping("card")
public class CardController {


    @Autowired
    ICardService cardService;


    @RequestMapping(value = "saveCardType", method = {RequestMethod.POST})
    public Result saveCardType(@RequestBody Card card) {
//        System.out.println("dddddddddddd:"+card.getDiscount() * 10);
//        System.out.println("hhhhhhhhhhhh:"+String.valueOf(card.getDiscount() * 10));
        if(card.getComMoney().equals("") || card.getRecharMoney().equals("")){
            return Result.fail("插入的会员卡提成或充值金额不能为空");
        }
        DecimalFormat decimalFormat = new DecimalFormat("###################.###########");
        if (card.getCardName().replace("折", "").equals(decimalFormat.format(card.getDiscount() * 10))) {
            cardService.saveCardType(card);
            return Result.succ("添加成功");
        } else {
            return Result.fail("折扣与会员卡类别不符，添加失败（例如会员卡类别5折对应折扣0.5，不可写成五折）");
        }
    }

    @RequestMapping(value = "getAllCardType", method = {RequestMethod.GET})
    public Result getAllCardType() {
        return Result.succ(cardService.getAllCardType());
    }

    @RequestMapping(value = "deleteCardType", method = {RequestMethod.GET})
    public Result deleteCardType(String cardId) {
        try {
            cardService.deleteCardType(cardId);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("信息填入有误，删除失败");
        }
        return Result.succ("删除成功");
    }

    @RequestMapping(value = "updateCardType", method = {RequestMethod.POST})
    public Result updateCardType(@RequestBody Card card) {
        DecimalFormat decimalFormat = new DecimalFormat("###################.###########");
        if (card.getCardName().replace("折", "").equals(decimalFormat.format(card.getDiscount() * 10))) {
            try {
                cardService.updateCardType(card);
                return Result.succ("更改成功");
            } catch (Exception e) {
                e.printStackTrace();
                return Result.fail("信息填入有误，更改失败");
            }
        } else {
            return Result.fail("折扣与会员卡类型不符，更改失败");
        }
    }
}