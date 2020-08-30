package cn.edu.guet.service;

import cn.edu.guet.dt.EmpAcheByDate;
import cn.edu.guet.dt.EmpAchievementDto;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAchievementService {
    EmpAchievementDto getKaikaAchievementByDate(EmpAcheByDate empAcheByDate);
    EmpAchievementDto getTotalAchievement(EmpAcheByDate empAcheByDate);
    List<EmpAcheByDate> getAllConsumeTime();
    List<EmpAcheByDate> getAllNextConsumeTime();
}
