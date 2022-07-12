package com.myweb.pojo;

import java.util.Objects;

public class Company {
    //主键
    private Integer cid;
    //企业名称
    private String companyName;
    //企业类型
    private String companyType;
    //企业登录名
    private String companyLoginName;
    //企业登录密码
    private String companyPwd;
    //企业地址
    private String companyAddress;
    //企业网站
    private String companyWebsite;
    //企业描述
    private String companyDesc;
    //员工人数
    private String empNum;

    public Company() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyLoginName() {
        return companyLoginName;
    }

    public void setCompanyLoginName(String companyLoginName) {
        this.companyLoginName = companyLoginName;
    }

    public String getCompanyPwd() {
        return companyPwd;
    }

    public void setCompanyPwd(String companyPwd) {
        this.companyPwd = companyPwd;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(cid, company.cid) && Objects.equals(companyName, company.companyName) && Objects.equals(companyType, company.companyType) && Objects.equals(companyLoginName, company.companyLoginName) && Objects.equals(companyPwd, company.companyPwd) && Objects.equals(companyAddress, company.companyAddress) && Objects.equals(companyWebsite, company.companyWebsite) && Objects.equals(companyDesc, company.companyDesc) && Objects.equals(empNum, company.empNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, companyName, companyType, companyLoginName, companyPwd, companyAddress, companyWebsite, companyDesc, empNum);
    }

    @Override
    public String toString() {
        return "Company{" +
                "cid=" + cid +
                ", companyName='" + companyName + '\'' +
                ", companyType='" + companyType + '\'' +
                ", companyLoginName='" + companyLoginName + '\'' +
                ", companyPwd='" + companyPwd + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyWebsite='" + companyWebsite + '\'' +
                ", companyDesc='" + companyDesc + '\'' +
                ", empNum='" + empNum + '\'' +
                '}';
    }
}
