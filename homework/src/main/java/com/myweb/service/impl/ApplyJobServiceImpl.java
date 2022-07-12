package com.myweb.service.impl;

import com.myweb.mapper.ApplyJobMapper;
import com.myweb.pojo.Apply;
import com.myweb.service.ApplyJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyJobServiceImpl implements ApplyJobService {

    @Autowired
    ApplyJobMapper applyJobMapper;

    @Override
    public List<Apply> findAllByCompanyName(String companyName) {
        return applyJobMapper.findAllByCompanyName(companyName);
    }

    @Override
    public Apply findApplyByAll(String realname, String jobAdress, String jobName) {
        return applyJobMapper.findApplyByAll(realname, jobAdress, jobName);
    }

    @Override
    public int insertApply(Apply apply_) {
        return applyJobMapper.insertApply(apply_);
    }

    @Override
    public List<Apply> findApplyRecordByRealname(String realname) {
        return applyJobMapper.findApplyRecordByRealname(realname);
    }
}
