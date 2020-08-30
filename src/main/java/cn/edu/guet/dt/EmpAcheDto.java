package cn.edu.guet.dt;

import lombok.Data;

@Data
public class EmpAcheDto {
    private String empId;
    private String empName;
    private String empLevel;
    private float sankeCommoney;
    private float KaikaCommoney;
    private float servieceCommoney;
    private float totalCommoney;
}
