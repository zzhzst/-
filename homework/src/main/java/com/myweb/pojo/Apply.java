package com.myweb.pojo;

import java.util.Date;
import java.util.Objects;

public class Apply {
    //主键
    private Integer sid;
    //申请人真实姓名
    private String realname;
    //地址
    private String jobAddress;
    //职位名称
    private String jobName;
    //薪资
    private Double jobSalary;
    //职位发布时间
    private String releaseTime;
    //申请企业名称
    private String companyName;

    public Apply() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Double getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(Double jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apply apply = (Apply) o;
        return Objects.equals(sid, apply.sid) && Objects.equals(realname, apply.realname) && Objects.equals(jobAddress, apply.jobAddress) && Objects.equals(jobName, apply.jobName) && Objects.equals(jobSalary, apply.jobSalary) && Objects.equals(releaseTime, apply.releaseTime) && Objects.equals(companyName, apply.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, realname, jobAddress, jobName, jobSalary, releaseTime, companyName);
    }

    @Override
    public String toString() {
        return "Apply{" +
                "sid=" + sid +
                ", realname='" + realname + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobSalary=" + jobSalary +
                ", releaseTime='" + releaseTime + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
