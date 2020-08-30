package cn.edu.guet.service.impl;

import cn.edu.guet.dt.EmpAcheByDate;
import cn.edu.guet.dt.EmpAchievementDto;
import cn.edu.guet.mapper.AchievementMapper;
import cn.edu.guet.service.IAchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementServiceImpl implements IAchievementService {
    @Autowired
    AchievementMapper achievementMapper;


    @Override
    public EmpAchievementDto getKaikaAchievementByDate(EmpAcheByDate empAcheByDate) {
        return achievementMapper.getKaikaAchievementByDate(empAcheByDate);
    }

    @Override
    public EmpAchievementDto getTotalAchievement(EmpAcheByDate empAcheByDate) {
        return achievementMapper.getTotalAchievement(empAcheByDate);
    }

    @Override
    public List<EmpAcheByDate> getAllConsumeTime() {
        return achievementMapper.getAllConsumeTime();
    }

    @Override
    public List<EmpAcheByDate> getAllNextConsumeTime() {
        return achievementMapper.getAllNextConsumeTime();
    }
}
