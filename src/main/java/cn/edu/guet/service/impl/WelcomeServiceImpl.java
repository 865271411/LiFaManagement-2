package cn.edu.guet.service.impl;


import cn.edu.guet.mapper.WelcomeMapper;
import cn.edu.guet.service.IWelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements IWelcomeService {
    @Autowired
    WelcomeMapper welcomeMapper;

    @Override
    public int totalVIP() {
        return welcomeMapper.totalVIP ();
    }

    @Override
    public int totalTodayConsume(String day) {
        return welcomeMapper.totalTodayConsume (day);
    }


}
