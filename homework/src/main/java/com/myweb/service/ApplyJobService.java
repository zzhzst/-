package com.myweb.service;

import com.myweb.pojo.Apply;

import java.util.List;

public interface ApplyJobService {
    //根据公司名查询所有申请
    public List<Apply> findAllByCompanyName(String companyName);

    //根据真实名字，工作地址，工作名字查询是否有申请记录
    public Apply findApplyByAll(String realname, String jobAdress, String jobName);

    //新增求职申请
    public int insertApply(Apply apply_);

    //根据真实姓名查找申请记录
    public List<Apply> findApplyRecordByRealname(String realname);
}
