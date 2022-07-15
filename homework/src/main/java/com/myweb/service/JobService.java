package com.myweb.service;

import com.myweb.pojo.Job;
import com.myweb.pojo.JobInfoExt;

import java.util.List;
import java.util.Map;

public interface JobService {


    //新增职位
    public int insertJob(Job job);

    //根据企业id和职位名字查找是否有重复的职位
    Job findByCidAndJobName(Integer cid, String jobName);

    //查询职位信息，这里连表查询
    public List<JobInfoExt> findAll(Map<String, Object> map);

    //查询一家公司所有的上架职位
    public List<Job> findJobByCom(Integer cid);

    //删除职位
    public int deleteJobById(Integer jobId);

    //计算发布职位的个数
    public int countJobNumber();

}
