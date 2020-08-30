package cn.edu.guet.dt;

import lombok.Data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
public class EmpAchieveDot {
    private Date consumetime;
    private List<EmpAcheDemo> empAcheDemos=new ArrayList<EmpAcheDemo>();
}
