package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.service.IWelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
@RestController
@RequestMapping("welcome")
public class WelcomeController {
    @Autowired
    IWelcomeService welcomeService;

    @RequestMapping(value = "totalVIP",method = {RequestMethod.GET})
    public Result totalVIP(){
        return Result.succ (welcomeService.totalVIP ());


    }

    @RequestMapping(value = "totalTodayConsume",method = {RequestMethod.GET})
    public Result totalTodayConsume(){
        //System.out.println ( "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+day );
         Timestamp d=new Timestamp ( System.currentTimeMillis () );
        //获取今天日期
        SimpleDateFormat df = new SimpleDateFormat( "dd-M月 -yy");//设置日期格式
        String today = df.format(d);//将日期转为字符串
        System.out.println ( "哈哈哈哈哈哈哈哈哈哈或或或或或或或或或或或或"+today );

        return Result.succ (welcomeService.totalTodayConsume (today));


    }
}
