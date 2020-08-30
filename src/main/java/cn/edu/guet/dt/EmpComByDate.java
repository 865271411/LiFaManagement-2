package cn.edu.guet.dt;

import lombok.Data;

import java.sql.Date;

@Data
public class EmpComByDate {
    private String empId;
    private Date startDate;
    private Date endDate;
}
