package com.myweb.mapper;

import com.myweb.pojo.Job;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    //新增职位
    int insertJob(Job job);

    //根据企业id和职位名字查找是否有重复的职位
    Job findByCidAndJobName(@Param("cid") Integer cid, @Param("jobName") String jobName);
}
