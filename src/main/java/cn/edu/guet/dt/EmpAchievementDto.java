package cn.edu.guet.dt;

import lombok.Data;

@Data
public class EmpAchievementDto {
    private String empId;
    private String empName;
    private String empLevel;
    private float sankeAchievement;
    private float KaikaAchievement;
    private float servieceAchievement;
    private float totalAchievement;
}
