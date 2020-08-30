package cn.edu.guet.dt;

import lombok.Data;

import java.sql.Date;

@Data
public class EmpAcheByDate {
    private String empId;
    private Date consumetime;
    private Date nextConsumetime;
}
