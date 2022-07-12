package com.myweb.pojo;

import java.util.Objects;

public class User {
    //id
    private Integer uid;
    //登录名
    private String loginName;
    //登录密码
    private String loginPwd;
    //性别
    private String gender;
    //电话
    private String telephone;
    //邮箱
    private String email;
    //个人描述
    private String descripte;
    //真实姓名
    private String realname;
    //地址
    private String address;
    //工作状态
    private String jobStatus;
    //期望薪资
    private Double salary;
    //毕业学校
    private String school;

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripte() {
        return descripte;
    }

    public void setDescripte(String descripte) {
        this.descripte = descripte;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(uid, user.uid) && Objects.equals(loginName, user.loginName) && Objects.equals(loginPwd, user.loginPwd) && Objects.equals(gender, user.gender) && Objects.equals(telephone, user.telephone) && Objects.equals(email, user.email) && Objects.equals(descripte, user.descripte) && Objects.equals(realname, user.realname) && Objects.equals(address, user.address) && Objects.equals(jobStatus, user.jobStatus) && Objects.equals(salary, user.salary) && Objects.equals(school, user.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, loginName, loginPwd, gender, telephone, email, descripte, realname, address, jobStatus, salary, school);
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", descripte='" + descripte + '\'' +
                ", realname='" + realname + '\'' +
                ", address='" + address + '\'' +
                ", jobStatus='" + jobStatus + '\'' +
                ", salary=" + salary +
                ", school='" + school + '\'' +
                '}';
    }
}
