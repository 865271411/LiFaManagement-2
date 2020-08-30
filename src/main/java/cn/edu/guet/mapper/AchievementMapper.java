package cn.edu.guet.mapper;

import cn.edu.guet.dt.EmpAcheByDate;
import cn.edu.guet.dt.EmpAchievementDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchievementMapper {
    EmpAchievementDto getAchievement(String empId);
    EmpAchievementDto getKaikaAchievement(String empId);
    EmpAchievementDto getSankeAchievement(String empId);
    EmpAchievementDto getKaikaAchievementByDate(EmpAcheByDate empAcheByDate);
    EmpAchievementDto getTotalAchievement(EmpAcheByDate empAcheByDate);
    List<EmpAcheByDate> getAllConsumeTime();
    List<EmpAcheByDate> getAllNextConsumeTime();
}
