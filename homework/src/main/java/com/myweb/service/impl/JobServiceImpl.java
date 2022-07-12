package com.myweb.service.impl;

import com.myweb.mapper.JobInfoExtMapper;
import com.myweb.mapper.JobMapper;
import com.myweb.pojo.Job;
import com.myweb.pojo.JobInfoExt;
import com.myweb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    JobMapper jobMapper;

    @Autowired
    JobInfoExtMapper jobInfoExtMapper;

    public int insertJob(Job job) {
        return jobMapper.insertJob(job);
    }

    @Override
    public Job findByCidAndJobName(Integer cid, String jobName) {
        return jobMapper.findByCidAndJobName(cid, jobName);
    }

    @Override
    public List<JobInfoExt> findAll(Map<String, Object> map) {
        return jobInfoExtMapper.findAll(map);
    }


}
