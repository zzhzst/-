package com.myweb.mapper;

import com.myweb.pojo.JobInfoExt;

import java.util.List;
import java.util.Map;

public interface JobInfoExtMapper {
    //查询职位信息
    public List<JobInfoExt> findAll(Map<String, Object> map);
}
