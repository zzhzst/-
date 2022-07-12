package com.myweb.pojo;

import java.util.Objects;

public class Favorites {
    //主键
    private Integer fid;
    //地址
    private String jobAddress;
   //工作名称
    private String jobName;
    //薪资
    private Double jobSalary;
    //发布时间
    private String releaseTime;
    //公司名
    private String companyName;
    //真实姓名
    private String realname;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorites favorites = (Favorites) o;
        return Objects.equals(fid, favorites.fid) && Objects.equals(jobAddress, favorites.jobAddress) && Objects.equals(jobName, favorites.jobName) && Objects.equals(jobSalary, favorites.jobSalary) && Objects.equals(releaseTime, favorites.releaseTime) && Objects.equals(companyName, favorites.companyName) && Objects.equals(realname, favorites.realname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fid, jobAddress, jobName, jobSalary, releaseTime, companyName, realname);
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "fid=" + fid +
                ", jobAddress='" + jobAddress + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobSalary=" + jobSalary +
                ", releaseTime='" + releaseTime + '\'' +
                ", companyName='" + companyName + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
