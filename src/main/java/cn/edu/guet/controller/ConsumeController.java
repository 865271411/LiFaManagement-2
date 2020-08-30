package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.Consume;
import cn.edu.guet.service.IConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("host")
public class ConsumeController {
    @Autowired
    IConsumeService iConsumeService;

    @RequestMapping("Consume")
    public Result getAllConsume(){
        List<Consume> Consume=iConsumeService.getAllConsume();
        return Result.succ(Consume);
    }


    @RequestMapping("deleteConsume")
    public Result deleteConsume(String id){
        iConsumeService.deleteConsume(id);
        return Result.succ("删除成功");
    }

    @RequestMapping("getConsumeByDay")
    public Result getConsumeByDay(int day){
        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD："+day);
        List<Consume> consumeList;
        Date d = new Date();
        //获取今天日期
        SimpleDateFormat df = new SimpleDateFormat("dd-M月 -yy");//设置日期格式
        String today = df.format(d);//将日期转为字符串
        System.out.println("today:"+today);

        //获取昨天日期
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        d=cal.getTime();
        SimpleDateFormat sp=new SimpleDateFormat("dd-M月 -yy");
        String yesterday=sp.format(d);

        if (day==0){
            consumeList = iConsumeService.getAllConsume();
        } else if (day==1){
            consumeList = iConsumeService.getConsumeByDay(today+"%");
            //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA："+today);
        }else if(day==2) {
            consumeList = iConsumeService.getConsumeByDay(yesterday+"%");
            //System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB："+yesterday);
        }else{

            consumeList = iConsumeService.getConsumeByDay(yesterday+"%");
        }
        for(int i=0;i<consumeList.size();i++){
            System.out.println("hhh:"+consumeList.get(i).getConsumeTime());
        }
        return Result.succ(consumeList);
    }

}
