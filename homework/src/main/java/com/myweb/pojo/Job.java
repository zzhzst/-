package com.myweb.pojo;

import java.util.Date;
import java.util.Objects;

public class Job {

    //主键
    private Integer jobId;
    //职位名称
    private String jobName;
    //地址
    private String jobAddress;
    //职位薪资
    private Double jobSalary;
    //发布时间
    private String releaseTime;
    //企业id
    private String cid;

    public Job() {
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(jobId, job.jobId) && Objects.equals(jobName, job.jobName) && Objects.equals(jobAddress, job.jobAddress) && Objects.equals(jobSalary, job.jobSalary) && Objects.equals(releaseTime, job.releaseTime) && Objects.equals(cid, job.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobName, jobAddress, jobSalary, releaseTime, cid);
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                ", jobSalary=" + jobSalary +
                ", releaseTime=" + releaseTime +
                ", cid='" + cid + '\'' +
                '}';
    }
}
