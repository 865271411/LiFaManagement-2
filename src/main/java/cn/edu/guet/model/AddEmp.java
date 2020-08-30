package cn.edu.guet.model;


import javax.validation.constraints.NotBlank;
import java.sql.Date;

public class AddEmp {
    @NotBlank(message = "员工ID不能为空")
    private String empId;
    private String empName;
    private String sex;
    private String empLevel;
    private String phone;
    private String birth;
    private String hireDate;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
